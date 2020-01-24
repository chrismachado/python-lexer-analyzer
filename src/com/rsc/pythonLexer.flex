package com.rsc;
import static com.bin.PyTokens.*;
import com.bin.PyTokens;
import com.bin.Token;
import java.util.Hashtable;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.util.Stack;


%%
%public
%class LexerAnal
%type PyTokens
%line
%column
%state NORMAL
%state INDENTATION
%unicode


%{
    private Hashtable pyTokensTable = new Hashtable<PyTokens, Integer>();
    private ArrayList<Token> tokens = new ArrayList<Token>();
    private int indentCounter = 0;
    private int indentLevel = 0;
    private boolean validBlock = false;
    private Stack<Integer> lineStack = new Stack<Integer>();

    public LexerAnal(java.io.Reader in, boolean init) {
        this.zzReader = in;
        initHashtable();
    }
%}



%{
    public Hashtable getPyTokensTable() {
        return this.pyTokensTable;
    }
    public String getReviewString() {
        String result = "";
        for (Token token : this.tokens)
           result += token.toString();
        return result;
    }

    public void printReview() {
         for (Token token : this.tokens)
                    System.out.print(token);
         System.out.println();
    }

    private PyTokens pyToken(String value, PyTokens token) {
        try {
            tokens.add(new Token(value, token.toString(), yyline));
            this.pyTokensTable.put(token, new Integer((int) this.pyTokensTable.get(token) + 1));
            return token;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return PyTokens.INVALID;
        }
    }

    private PyTokens verifyIndentation(String value, int line, int column) {
        for(char c : value.toCharArray()) {
            System.out.print(c);
             if (c == '\n') {
                this.indentCounter = 0;
                this.indentLevel++;
                validBlock = true;
                lineStack.push(this.indentCounter + 4);
            } else if (c == ' ' || c == 32) {
                this.indentCounter++;
            } else if (c == '\t') {
                this.indentCounter+=4;
            } else {
                validBlock = false;
            }

            try {
                if (validBlock && indentLevel != 0) {
                    if (this.indentCounter >= (lineStack.lastElement())) {
                        this.pyTokensTable.put(PyTokens.INDENT, new Integer((int) this.pyTokensTable.get(PyTokens.INDENT) + 1));
                        tokens.add(new Token("", PyTokens.INDENT.toString(), line));
                        lineStack.push(this.indentCounter + 3);
                        System.out.print(" I ");
                        return PyTokens.INDENT;
                    }
                }
            } catch (IllegalArgumentException e) {
                        return PyTokens.INVALID;
            }

        }

        return null;
    }

    private void initHashtable() {
        for(PyTokens token : PyTokens.values())
            this.pyTokensTable.put(token, new Integer(0));
    }
%}

/* -------- Delimiters ----------- */
/* -------- Invalid Tokens ------- */
INVALID_CHARACTER       = "á"|"é"|"í"|"ó"|"ú"|"Á"|"É"|"Í"|"Ó"|"Ú"|"ñ"|"Ñ"|"¿"|"ä"|"ë"|"ï"|"ö"|"ü"|"à"|"è"|"ì"|"ò"|"ù"|\\

/* --------- Comments   ---------- */
COMMENT                 =  {LINE_COMMENT}|{BLOCK_COMMENT}
LINE_COMMENT            = \#[^\n\r]*
BLOCK_COMMENT           = \"\"\"([^\"])* ~ \"\"\"

/* --------- Whitespaces --------- */
SPACE                   = " "
LINE_FEED               = \n|\r|\r\n
WHITESPACE              = {SPACE}|{LINE_FEED}| [\t\n]


/* -------- Identifier ---------- */
EXP_ALPHA               = [a-zA-Z]
IDENTIFIER              = ({EXP_ALPHA}|"_")({EXP_ALPHA}|{INT}|"_")*
INVALID_IDENTIFIER      = {IDENTIFIER}*{INVALID_CHARACTER}+({IDENTIFIER}|{INVALID_CHARACTER})*

/* -------- Operators  -----------*/
ARITH_OP                = "+"|"-"|"*"|"/"|"%"|"**"|"//"
COMP_OP                 = "=="|"!="|"<>"|">"|"<"|">="|"<="
ASSIG_OP                = "="|"+="|"-="|"*="|"/="|"//="|"%="|"**="
BIT_OP                  = "&"|"|"|"^"|"~"|"<<"|">>"
LOGICAL_OP              = "AND"|"OR"|"NOT"|"and"|"or"|"not"
MEMBERSHIP_OP           = "in"|"not in"
IDENTITY_OP             = "is"|"is not"|"isn't"
DELIMITER_OP            = "@"|">>="|"<<="|"&="|"|="
L_PARENTHESIS_OP        = "("
R_PARENTHESIS_OP        = ")"
L_BRACKET_OP            = "["
R_BRACKET_OP            = "]"
L_CURLY_BRACKET_OP      = "{"
R_CURLY_BRACKET_OP      = "}"
COLON_OP                = ":"
COMMA                   = ","
PROPERTY_OP             = "."
SEMICOLON_OP            = ";"


/* Token */
OPERATOR                = {ARITH_OP}|{COMP_OP}|{ASSIG_OP}|{BIT_OP}|{LOGICAL_OP}|{MEMBERSHIP_OP}|
                        {IDENTITY_OP}|{DELIMITER_OP}|{L_PARENTHESIS_OP}|{R_PARENTHESIS_OP}|{L_BRACKET_OP}|{R_BRACKET_OP}
                        |{L_CURLY_BRACKET_OP}|{R_CURLY_BRACKET_OP}|{COLON_OP}|{COMMA}|{PROPERTY_OP}|{SEMICOLON_OP}

/* -------- Keywords  -----------*/
KEYWORD                 = "and"|"del"|"from"|"not"|"while"|"as"|"elif"|"global"|"or"|"with"|"assert"|"else"|"if"|"pass"|"yield"|"break"|"except"|"import"|"print"|"class"|"exec"|"in"|"raise"|"continue"|"finally"|"is"|"return"|"def"|"for"|"lambda"|"try"|"end"|"input"

/* -------- Literals  -----------*/
LONG_INT                = {INT}("l"|"L")

INT                     = {DECIMAL_INT}|{OCT_INT}|{HEX_INT}|{BIN_INT}
DECIMAL_INT             = {NON_ZERO_DIGIT}{DIGIT}*|"0"
OCT_INT                 = "0"("o" | "O"){OCT_DIGIT}+ |  "0"{OCT_DIGIT}+
HEX_INT                 = "0"("x" | "X"){HEX_DIGIT}+
BIN_INT                 = "0"("b" | "B") {BIN_DIGIT}+
DIGIT                   = [0-9]
NON_ZERO_DIGIT          = [1-9]
BIN_DIGIT               = "0"|"1"
OCT_DIGIT               = [0-7]
HEX_DIGIT               = {DIGIT}|[a-f]|[A-F]

FLOAT_NUM               = {POINT_FLOAT}|{EXP_FLOAT}
POINT_FLOAT             = {INT_PART}?{FRACTION_PART}|{INT_PART}"."
EXP_FLOAT               = ({INT_PART}|{POINT_FLOAT}){EXP}
INT_PART                = {DIGIT}+
FRACTION_PART           = "."{DIGIT}+
EXP                     = ("e" | "E")("+" | "-") {DIGIT}+
IMAG_NUM                = ({FLOAT_NUM}|{INT_PART})("j" | "J")

NUM_LIT                 = {LONG_INT}|{INT}|{FLOAT_NUM}|{IMAG_NUM}

STRING_PREFIX           = "r" | "u" | "ur" | "R" | "U" | "UR" | "Ur" | "uR"| "b" | "B" | "br" | "Br" | "bR" | "BR"
STRING_LIT              = \"[^\n\r\"]*\"
INVALID_STR_LIT         = \"+{STRING_LIT} | {STRING_LIT}\"+ | \"[^\n\r\"]*\
CHAR_LIT                = \'[^\']\'
INVALID_CHAR_LIT        = \'[^\']+\' | \'+\'[^\']+\' | \'[^\']+\'\'+
BOOLEAN_LIT             = "True"|"False"


LITERAL                 = {NUM_LIT}|{STRING_PREFIX}?({STRING_LIT}|{CHAR_LIT})|{BOOLEAN_LIT}
INVALID_LITERAL         = {INVALID_STR_LIT} | {INVALID_CHAR_LIT} |{NUM_LIT}({EXP_ALPHA} | {INVALID_CHARACTER} | "_"| (({EXP_ALPHA}|{INVALID_CHARACTER}|"_"){NUM_LIT}))+

INDENT_MACRO = \t
%%

<YYINITIAL> {

    {COMMENT}               { /*         IGNORE        */                                 }
    {WHITESPACE}            { verifyIndentation(yytext(), yyline, yycolumn);              }
    {INVALID_CHARACTER}     { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.INVALID_CHARACTER);       }
    {OPERATOR}              { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.OPERATOR);                }
    {KEYWORD}               { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.KEYWORD);                 }
    {LITERAL}               { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.LITERAL);             }
    {INVALID_LITERAL}       { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.ERROR_LITERAL);           }
    {INVALID_IDENTIFIER}    { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.ERROR_IDENTIFIER);        }
    {IDENTIFIER}            { verifyIndentation(yytext(), yyline, yycolumn); return pyToken(yytext(), PyTokens.IDENTIFIER);              }


}

[^]                         { verifyIndentation(yytext(), yyline, yycolumn); return pyToken("", PyTokens.BAD_ERROR);                     }

