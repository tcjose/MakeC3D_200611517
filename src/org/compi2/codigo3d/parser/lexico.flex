package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

//Scanner para generar C3D
%%
%{
    //Código de usuario
    

%}

%cup
%class scanner
%public
%line
%char
%column
%full

MAS		= "+"
MENOS		= "-"
MULT       	= "*"
DIV             = "/"
POT             = "^"
PAR_IZQ         = "("
PAR_DER         = ")"

IGUAL           = "=="
DIFERENTE       = "!="    
MENORQ         = "<"
MAYORQ          = ">"
MENORIGUALQ     = "<="
MAYORIGUALQ     = ">="

OR              = "||"
AND             = "&&"
NOT             = "!"


ID              = [A-Za-z][_0-9A-Za-z]*
ENTERO          = [0-9]+
DECIMAL         = [0-9]+"."[0-9]+

SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]

%%

<YYINITIAL> {ID}            { return new Symbol(sym.ID, yyline, yycolumn, yytext()); }
<YYINITIAL> {ENTERO}        { return new Symbol(sym.ENTERO, yyline, yycolumn, yytext()); }
<YYINITIAL> {DECIMAL}       { return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext()); }
<YYINITIAL> {MAS}           { return new Symbol(sym.MAS, yyline, yycolumn, null); }
<YYINITIAL> {MENOS}	    { return new Symbol(sym.MENOS, yyline, yycolumn, null); }
<YYINITIAL> {MULT}          { return new Symbol(sym.MULT, yyline, yycolumn, null); }
<YYINITIAL> {DIV}	    { return new Symbol(sym.DIV, yyline, yycolumn, null); }
<YYINITIAL> {POT}	    { return new Symbol(sym.POT, yyline, yycolumn, null); }
<YYINITIAL> {PAR_IZQ}	    { return new Symbol(sym.PAR_IZQ, yyline, yycolumn, null); }
<YYINITIAL> {PAR_DER}	    { return new Symbol(sym.PAR_DER, yyline, yycolumn, null); }

<YYINITIAL> {IGUAL}	    { return new Symbol(sym.IGUAL, yyline, yycolumn, null); }
<YYINITIAL> {DIFERENTE}	    { return new Symbol(sym.DIFERENTE, yyline, yycolumn, null); }
<YYINITIAL> {MENORQ}	    { return new Symbol(sym.MENORQ, yyline, yycolumn, null); }
<YYINITIAL> {MAYORQ}	    { return new Symbol(sym.MAYORQ, yyline, yycolumn, null); }
<YYINITIAL> {MENORIGUALQ}	    { return new Symbol(sym.MENORIGUALQ, yyline, yycolumn, null); }
<YYINITIAL> {MAYORIGUALQ}	    { return new Symbol(sym.MAYORIGUALQ, yyline, yycolumn, null); }

<YYINITIAL> {OR}	    { return new Symbol(sym.OR, yyline, yycolumn, yytext()); }
<YYINITIAL> {AND}	    { return new Symbol(sym.AND, yyline, yycolumn, yytext()); }
<YYINITIAL> {NOT}	    { return new Symbol(sym.NOT, yyline, yycolumn, yytext()); }

<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}     { /*Saltos de linea, ignorados*/}

<YYINITIAL>. {
        String errLex = "Error léxico, caracter irreconocible: '"+yytext()+"' en la línea: "+(yyline+1)+" y columna: "+yycolumn;
        System.err.println(errLex);
}