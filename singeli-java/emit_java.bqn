#!/usr/bin/env bqn
Split ← ((⊢-˜+`×¬)∘=⊔⊢)
Join ← {(≠𝕨)↓∾ 𝕨⊸∾¨ 𝕩}
SW ← ⊢ ≡ ≠⊸↑˜

lns ← •FLines"/dev/stdin"

prims ← •HashMap´ <˘⍉[
  ⟨"u1", "boolean"⟩
  ⟨"u8", "byte"⟩, ⟨"u16", "short"⟩, ⟨"u32", "int"⟩, ⟨"u64", "long"⟩
  ⟨"i8", "byte"⟩, ⟨"i16", "short"⟩, ⟨"i32", "int"⟩, ⟨"i64", "long"⟩
  ⟨"void", "void"⟩
]
boxed ← •HashMap´ <˘⍉[
  ⟨"u1", "Boolean"⟩
  ⟨"u8", "Byte"⟩, ⟨"u16", "Short"⟩, ⟨"u32", "Integer"⟩, ⟨"u64", "Long"⟩
  ⟨"i8", "Byte"⟩, ⟨"i16", "Short"⟩, ⟨"i32", "Integer"⟩, ⟨"i64", "Long"⟩
]
vectors ← •HashMap´ <˘⍉[
  ⟨"u8", "ByteVector"⟩
  ⟨"i8", "ByteVector"⟩
  ⟨"u16", "ShortVector"⟩
  ⟨"i16", "ShortVector"⟩
  ⟨"u32", "IntVector"⟩
  ⟨"i32", "IntVector"⟩
  ⟨"u64", "LongVector"⟩
  ⟨"i64", "LongVector"⟩
  ⟨"u1", "VectorMask<?>"⟩ # extremely wrong; maybe VectorMask<?> works?
]
Type ← {
  ⊑(⊑𝕩)∊"uifv"? prims.Get 𝕩;
  '*'≡⊑𝕩? "[]"∾˜Type 1↓𝕩;
  𝕩 SW "[1]["? ∾⟨"VectorShuffle<", boxed.Get (1+·⊑⊐⟜']')⊸↓ 4↓𝕩, ">"⟩;
  '['≡⊑𝕩? vectors.Get (1+⊑𝕩⊐']')↓𝕩;
  ! "unknown type "∾𝕩
}
Arg ← {
  '''≡⊑𝕩? ¯1↓1↓𝕩;
  "!0:u1": "false";
  "!1:u1": "true";
  '!'≡⊑𝕩?
    𝕩 1⊸↓↩
    i ← ⊑𝕩⊐':'
    n ← i↑𝕩
    # n ∾⟜"L"⍟((|•ParseFloat n)≥2⋆31)↩
    {
      
      "int": n;
      "long": n∾'L';
      ⊑𝕩<⊸∊"byte"‿"short"? ∾⟨'(',𝕩,')',n⟩;
      !𝕩
    } Type (1+i)↓𝕩
    ;
  𝕩}
Args ← {'('∾')'∾˜ ¯2↓ ∾ ∾⟜", "¨ Arg¨ 𝕩}
Lbl ← {•Repr 1+•ParseFloat 1↓𝕩}

resGlobal ← ⟨⟩
AddGlobal ← {resGlobal∾↩<𝕩⋄@}
staticDefs ← ⟨⟩
caseIndent ← "  "

globalCtr ← 0
EmitFn ← { 𝕊:
  mainLns ← ⟨⟩
  
  fnDefs ← ⟨⟩ ⋄ Add ← {mainLns∾↩<𝕩 ⋄ @}
  beginLns ← ⟨⟩ ⋄ AddBegin ← {beginLns∾↩<𝕩 ⋄ @}
  
  # find variables local to this label block
  lnum ← +`("lbl"≡⊑)¨ 𝕩
  vdef ← (("new"⊸≡∨"mut"⊸≡)⊑)¨ 𝕩
  names ← 1⊑¨vdef/𝕩
  blocal ← •HashMap⟜(1¨) {((1=+´∘∊)¨ (⊐𝕨)⊔𝕩) / ⍷𝕨}´ (∊⟜names ∾𝕩)⊸/¨ ⟨∾𝕩, (≠¨𝕩)/lnum⟩
  
  codeIndent ← "    "
  
  _makeIf ← { # cond "name[FT]?" _makeIf "body;"
    cond ← 𝕨
    ∾⟨codeIndent, "if (", {'F': "!"∾cond; 'T': cond; "1==1"}¯1⊑𝕗, ") ", 𝕩⟩
  }
  
  prevGoes ← 0
  {𝕊ps:{
    ("new"≡𝕩) ∨ "mut"≡𝕩?
      new ← 𝕩≡"new"
      retty ← {4≤≠ps? Type 3⊑ps; @}
      void ← {new? "void"≡retty; 0}
      
      name ← 1⊑ps
      local ← blocal.Has name
      
      {𝕊: fnDefs∾↩< ∾⟨retty, ' ', name, '=', {"u1":"false"; ⊑(⊑𝕩)∊"iuf"?"0";"null"}3⊑ps, ';'⟩}⍟⊢ (¬void ∨ ¬new) ∧ ¬local
      
      atBegin ← "new"‿"emit"‿"'^atbegin'" ≡ (1‿0‿1‿0‿1↑˜≠)⊸/ ps
      {atBegin? ps (4⊸↑∾5⊸↓)↩; @}
      
      ArrInit ← {∾⟨"new ", retty, "{", ','Join Arg¨ 𝕩, "}"⟩}
      body ← {
        3≡≠ps? Arg 2⊑ps;
        "array": ArrInit 4↓ps;
        "val": {
          𝕩 SW "!tup{"? ArrInit Arg¨ ','Split {𝕩↓˜¯1-⊑'}'⊐˜⌽𝕩} 5↓𝕩;
          '?'≡⊑𝕩? ∾⟨"new ", Type 1↓3⊑ps, '[', ⊑':'Split 1↓𝕩, ']'⟩;
          Arg 𝕩
        } 4⊑ps;
        "emit": {
          𝕩 SW "castmethod "? ∾⟨'(', Type 5⊑ps, ") ", Arg 6⊑ps, '.', 11↓𝕩, Args 7↓ps⟩;
          𝕩 SW "method "? ∾⟨Arg 5⊑ps, '.', 7↓𝕩, Args 6↓ps⟩;
          𝕩 SW "op "? ∾⟨Arg 5⊑ps, ' ', 3↓𝕩, ' ', Arg 6⊑ps⟩;
          "^arr":
            name ← "arr_"∾•Repr globalCtr+↩1
            AddGlobal ∾⟨"private final ", ("'static'"≡5⊑ps)/"static ", retty, " ", name, " = ",  ("'init'"≡6⊑ps)◶⟨{𝕊: ∾⟨"new ",Type 1↓3⊑ps,'[',⋈⁼𝕩,']'⟩}, ArrInit⟩ 7↓ps, ';'⟩
            name;
          "^newarray": ∾⟨"new ", Type 1↓3⊑ps, '[', 5⊑ps, ']'⟩;
          "^load": ∾⟨5⊑ps, '[', 6⊑ps, ']'⟩;
          "^store": ∾⟨5⊑ps, '[', 6⊑ps, "] = ", Arg 7⊑ps⟩;
          # "^promote": ∾⟨'(', Type 5⊑ps, ") ", 6⊑ps⟩;
          "^cast": ∾⟨'(', retty, ") ", Arg 5⊑ps⟩;
          ∾⟨𝕩, Args 5↓ps⟩
        } ¯1↓1↓4⊑ps;
        !𝕩
      } 2⊑ps
      
      asgn ← {void? ""; local∧new? ∾⟨retty,' ',name," = "⟩; name∾" = "}
      
      {
        atbegin? AddBegin ∾⟨"  ", asgn, body, ';'⟩;
        Add ∾⟨codeIndent, asgn, body, ';'⟩
      }
      ;
    "ret": Add {"void": codeIndent∾"return;"; ∾⟨codeIndent, "return ", Arg 𝕩, ';'⟩} 1⊑ps;
    
    "lbl": Add ∾⟨caseIndent, "case ", Lbl 1⊑ps, ':'⟩;
    
    𝕩 SW "goto"?     Add (¯2⊑ps) 𝕩 _makeIf ∾⟨"{ switch_num = ", Lbl ¯1⊑ps, "; continue switch_loop; }"⟩;
    𝕩 SW "break"?    Add (¯2⊑ps) 𝕩 _makeIf ∾⟨"break ",    ¯1⊑ps, ';'⟩;
    𝕩 SW "continue"? Add (¯2⊑ps) 𝕩 _makeIf ∾⟨"continue ", ¯1⊑ps, ';'⟩;
    
    "beginBlock": Add ∾⟨codeIndent, 1⊑ps, ": {"⟩ ⋄ codeIndent∾↩ "  ";
    "beginLoop":  Add ∾⟨codeIndent, 1⊑ps, ": while(true) {"⟩ ⋄ codeIndent∾↩ "  ";
    "endBlock":                                 codeIndent↓˜↩ 2 ⋄ Add ∾⟨codeIndent, "}"⟩;
    "endLoop":    Add ∾⟨codeIndent, "break;"⟩ ⋄ codeIndent↓˜↩ 2 ⋄ Add ∾⟨codeIndent, "}"⟩;
    
    ! 𝕩
  }⊑ps ⋄ prevGoes ↩ ⊑(<⊑ps)∊"ret"‿"goto" ⋄ @}¨ 𝕩
  
  Add⍟(¬prevGoes) codeIndent ∾ "return;"
  
  ⟨fnDefs, beginLns, mainLns⟩
}



fnIR ← @
fnLine ← @
firstFn ← 1
{
  ⟨⟩: 𝕩;
  ps ← {' '¨⌾((𝕩=@+160)⊸/) 𝕩}¨ ' ' Split all←𝕩
  {
    "beginFn":
      fnIR ↩ ⟨⟩
      { 𝕊:
        AddGlobal "public class Gen {"(⊢∾∾)@+10
        AddGlobal¨ staticDefs
        staticDefs ↩ @
        firstFn ↩ 0
      }⍟⊢ firstFn
      fnLine ↩ ∾⟨"public ", Type 2⊑ps, " ", {𝕩↓˜1+⊑𝕩⊐'_'} 1⊑ps, "(", ¯2↓∾{n‿t: ∾⟨Type t, ' ', n, ", "⟩}¨ <˘ ∘‿2⥊ 4↓ps, ") {"⟩
      ;
    "endFn":
      defs‿begin‿main ← EmitFn fnIR
      
      AddGlobal fnLine
      resGlobal∾↩ begin
      AddGlobal "  int switch_num = 0;"
      AddGlobal "  "∾' 'Join defs
      AddGlobal "  switch_loop: while(true) switch(switch_num) {"
      AddGlobal ∾⟨caseIndent, "case 0:"⟩
      resGlobal∾↩ main
      AddGlobal¨ "  }"‿"}"
      
      fnIR↩@
      ;
    "require": {
      "'staticline"≡1⊑ps? !staticDefs≢@ ⋄ staticDefs∾↩< ¯1↓20↓all;
      "'package"≡1⊑ps? resGlobal ∾˜↩ <∾⟨"package ", ¯1↓2⊑ps, ';'⟩;
      "'import" ≡1⊑ps?      AddGlobal ∾⟨"import ",  ¯1↓2⊑ps, ';'⟩;
      @
    };
    
    "export": AddGlobal ∾⟨"// todo export"⟩;
    
    {fnIR≡@? AddGlobal ' 'Join ps; fnIR∾↩<ps}
    # ! "idk "∾⊑ps
  } ⊑ps
}¨ lns

AddGlobal¨⍟(¬firstFn) ""‿"}"

(•wdpath•file.At ⊑•args) •FLines resGlobal