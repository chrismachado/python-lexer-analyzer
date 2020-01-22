package src;
import static src.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
space=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
int |
if |
else |
while {lexeme=yytext(); return Reserve;}
{space} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Equal;}
"+" {return Plus;}
"-" {return Minus;}
"*" {return Multiply;}
"/" {return Division;}
{L}({L}|{D})* {lexeme=yytext(); return Identify;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Number;}
 . {return ERROR;}