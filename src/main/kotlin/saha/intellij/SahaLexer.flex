package saha.intellij.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static saha.intellij.language.psi.SahaTypes.*;

%%

%{
public _SahaLexer() {
    this((java.io.Reader)null);
}
%}

%public
%class _SahaLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

%state StringSQ
%state StringDQ
%state CODE
%state RegexRange

EOL=\R
WHITE_SPACE=\s+

COMMENT_DOC=("///")[^\r\n]*
COMMENT_LINE=("//")[^\r\n]*
COMMENT_BLOCK=[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]
BOOLEAN=true|false|null
SYMBOL=[\p{XID_Start}_][\p{XID_Continue}_]*
BYTE=(0[bBoOxXfF][0-9A-Fa-f][0-9A-Fa-f_]*)
INTEGER=(0|[1-9][0-9_]*)
DECIMAL=([0-9]+\.[0-9]*([*][*][0-9]+)?)|(\.[0-9]+([Ee][0-9]+)?)
SIGN=[+-]
REGEX_RANGE = \[(\\[^\x{00}]|[^\]])*\]
ESCAPE_SPECIAL = \\[^xuU]
ESCAPE_UNICODE = \\(x{HEX}{2}|u{HEX}{4}|U\{{HEX}+\})
HEX = [0-9a-fA-F]

COMMENT_L = \{#(=-_\!)?
COMMENT_R = (=-_\!)?#\}

SLOT_L = \{%(=-_\!)?
SLOT_R = (=-_\!)?%\}

SAHA_TEXT = (!({COMMENT_L}|{SLOT_L}) .)+

%%
<YYINITIAL> {
    {SAHA_TEXT} { return SAHA_TEXT; }
    {SLOT_L}    {
        yybegin(CODE);
        return SLOT_L;
    }
}

<CODE> {
    {WHITE_SPACE} { return WHITE_SPACE; }
    {SLOT_R}      {
        yybegin(YYINITIAL);
        return SLOT_R;
    }
}

<CODE> {
    //

    "("  { return PARENTHESIS_L; }
    ")"  { return PARENTHESIS_R; }
    "["  { return BRACKET_L; }
    "]"  { return BRACKET_R; }
    "{"  { return BRACE_L; }
    "}"  { return BRACE_R; }
    "->" { return ARROW; }
    "<"  { return ANGLE_L; }
    ">"  { return ANGLE_R; }
    //
    ::   { return DOUBLE_COLON; }
    :    { return COLON; }
    ;    { return SEMICOLON; }
    ,    { return COMMA; }
    @    { return AT; }
    #    { return HASH; }
    \^   { return ACCENT; }
    \~   { return SOFT_CONNECT;}
    \|   { return CHOOSE;}
    \!   { return NOT;}
    \\   { return ESCAPE; }
    \$   { return DOLLAR; }
    \.   { return DOT; }

    \?   { return OPTIONAL;}
    \+   { return MANY1; }
    \-   { return HYPHEN; }
    \*   { return MANY; }
}
<CODE> [\^\]$@]*= {
    return EQ;
}
<CODE> {
    // literal
    {BOOLEAN}     { return BOOLEAN; }
    {SYMBOL}      { return SYMBOL; }
    {BYTE}        { return BYTE; }
    {INTEGER}     { return INTEGER; }
    {DECIMAL}     { return DECIMAL; }
    {SIGN}        { return SIGN; }
}
// String Mode =========================================================================================================
<CODE> {
    \' {yybegin(StringSQ);return STRING_SQ;}
    \" {yybegin(StringDQ);return STRING_DQ;}
}
<StringSQ, StringDQ, CODE> {ESCAPE_SPECIAL} {
    return ESCAPE_SPECIAL;
}
<StringSQ, StringDQ, CODE> {ESCAPE_UNICODE} {
    return ESCAPE_UNICODE;
}
<StringSQ> {
    [^\\\'] {return CHARACTER;}
    \' {yybegin(YYINITIAL);return STRING_SQ;}
}
<StringDQ> {
    [^\\\"] {return CHARACTER;}
    \" {yybegin(YYINITIAL);return STRING_DQ;}
}
// Regex Mode ==========================================================================================================
//<YYINITIAL> \/ {
//    yybegin(Regex);
//    return REGEX_QUOTE;
//}
//<Regex> {
//    [^\\\/] {return CHARACTER;}
//    \/ {yybegin(YYINITIAL);return REGEX_QUOTE;}
//}
//<YYINITIAL> \[ {
//    yybegin(RegexRange);
//    return REGEX_RANGE_L;
//}
//<RegexRange> {
//    [^\\\[\]] {return REGEX_CHARACTER;}
//    \] {yybegin(YYINITIAL);return REGEX_RANGE_R;}
//}
// Otherwisw ===========================================================================================================
[^] { return BAD_CHARACTER; }
