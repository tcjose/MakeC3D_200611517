
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Mar 17 22:28:00 CST 2017
//----------------------------------------------------

package org.compi2.codigo3d.parser;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Mar 17 22:28:00 CST 2017
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\011\002\000\002\002" +
    "\004\000\002\003\003\000\002\003\003\000\002\012\002" +
    "\000\002\006\006\000\002\013\002\000\002\006\006\000" +
    "\002\006\004\000\002\006\005\000\002\006\005\000\002" +
    "\004\003\000\002\004\003\000\002\004\003\000\002\004" +
    "\003\000\002\004\003\000\002\004\003\000\002\005\005" +
    "\000\002\005\005\000\002\005\005\000\002\005\005\000" +
    "\002\005\005\000\002\005\004\000\002\005\005\000\002" +
    "\005\003\000\002\005\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\016\004\000\005\000\006\000\010\000\014" +
    "\000\026\000\001\002\000\016\004\015\005\013\006\007" +
    "\010\010\014\012\026\017\001\002\000\004\002\006\001" +
    "\002\000\004\002\001\001\002\000\040\002\uffe6\007\uffe6" +
    "\010\uffe6\011\uffe6\012\uffe6\013\uffe6\015\uffe6\016\uffe6\017" +
    "\uffe6\020\uffe6\021\uffe6\022\uffe6\023\uffe6\024\uffe6\025\uffe6" +
    "\001\002\000\014\004\015\005\013\006\007\010\010\014" +
    "\036\001\002\000\004\002\uffff\001\002\000\016\004\015" +
    "\005\013\006\007\010\010\014\012\026\017\001\002\000" +
    "\040\002\uffe7\007\uffe7\010\uffe7\011\uffe7\012\uffe7\013\uffe7" +
    "\015\uffe7\016\uffe7\017\uffe7\020\uffe7\021\uffe7\022\uffe7\023" +
    "\uffe7\024\uffe7\025\uffe7\001\002\000\032\002\ufffd\007\031" +
    "\010\023\011\025\012\032\013\024\016\033\017\034\020" +
    "\030\021\035\022\027\023\026\001\002\000\040\002\uffe8" +
    "\007\uffe8\010\uffe8\011\uffe8\012\uffe8\013\uffe8\015\uffe8\016" +
    "\uffe8\017\uffe8\020\uffe8\021\uffe8\022\uffe8\023\uffe8\024\uffe8" +
    "\025\uffe8\001\002\000\010\002\ufffe\024\047\025\050\001" +
    "\002\000\016\004\015\005\013\006\007\010\010\014\012" +
    "\026\017\001\002\000\012\002\ufff8\015\ufff8\024\ufff8\025" +
    "\ufff8\001\002\000\030\007\031\010\023\011\025\012\032" +
    "\013\024\016\033\017\034\020\030\021\035\022\027\023" +
    "\026\001\002\000\014\004\015\005\013\006\007\010\010" +
    "\014\036\001\002\000\014\004\015\005\013\006\007\010" +
    "\010\014\036\001\002\000\014\004\015\005\013\006\007" +
    "\010\010\014\036\001\002\000\014\004\015\005\013\006" +
    "\007\010\010\014\036\001\002\000\014\004\ufff1\005\ufff1" +
    "\006\ufff1\010\ufff1\014\ufff1\001\002\000\014\004\ufff0\005" +
    "\ufff0\006\ufff0\010\ufff0\014\ufff0\001\002\000\014\004\ufff3" +
    "\005\ufff3\006\ufff3\010\ufff3\014\ufff3\001\002\000\014\004" +
    "\015\005\013\006\007\010\010\014\036\001\002\000\014" +
    "\004\015\005\013\006\007\010\010\014\036\001\002\000" +
    "\014\004\ufff5\005\ufff5\006\ufff5\010\ufff5\014\ufff5\001\002" +
    "\000\014\004\ufff4\005\ufff4\006\ufff4\010\ufff4\014\ufff4\001" +
    "\002\000\014\004\ufff2\005\ufff2\006\ufff2\010\ufff2\014\ufff2" +
    "\001\002\000\014\004\015\005\013\006\007\010\010\014" +
    "\036\001\002\000\040\002\uffec\007\uffec\010\uffec\011\uffec" +
    "\012\uffec\013\024\015\uffec\016\uffec\017\uffec\020\uffec\021" +
    "\uffec\022\uffec\023\uffec\024\uffec\025\uffec\001\002\000\016" +
    "\007\031\010\023\011\025\012\032\013\024\015\041\001" +
    "\002\000\040\002\uffe9\007\uffe9\010\uffe9\011\uffe9\012\uffe9" +
    "\013\uffe9\015\uffe9\016\uffe9\017\uffe9\020\uffe9\021\uffe9\022" +
    "\uffe9\023\uffe9\024\uffe9\025\uffe9\001\002\000\040\002\uffef" +
    "\007\uffef\010\uffef\011\025\012\032\013\024\015\uffef\016" +
    "\uffef\017\uffef\020\uffef\021\uffef\022\uffef\023\uffef\024\uffef" +
    "\025\uffef\001\002\000\040\002\uffed\007\uffed\010\uffed\011" +
    "\uffed\012\uffed\013\024\015\uffed\016\uffed\017\uffed\020\uffed" +
    "\021\uffed\022\uffed\023\uffed\024\uffed\025\uffed\001\002\000" +
    "\040\002\uffeb\007\uffeb\010\uffeb\011\uffeb\012\uffeb\013\024" +
    "\015\uffeb\016\uffeb\017\uffeb\020\uffeb\021\uffeb\022\uffeb\023" +
    "\uffeb\024\uffeb\025\uffeb\001\002\000\040\002\uffee\007\uffee" +
    "\010\uffee\011\025\012\032\013\024\015\uffee\016\uffee\017" +
    "\uffee\020\uffee\021\uffee\022\uffee\023\uffee\024\uffee\025\uffee" +
    "\001\002\000\024\002\ufff6\007\031\010\023\011\025\012" +
    "\032\013\024\015\ufff6\024\ufff6\025\ufff6\001\002\000\016" +
    "\004\ufffa\005\ufffa\006\ufffa\010\ufffa\014\ufffa\026\ufffa\001" +
    "\002\000\016\004\ufffc\005\ufffc\006\ufffc\010\ufffc\014\ufffc" +
    "\026\ufffc\001\002\000\016\004\015\005\013\006\007\010" +
    "\010\014\012\026\017\001\002\000\012\002\ufffb\015\ufffb" +
    "\024\047\025\ufffb\001\002\000\016\004\015\005\013\006" +
    "\007\010\010\014\012\026\017\001\002\000\012\002\ufff9" +
    "\015\ufff9\024\ufff9\025\ufff9\001\002\000\010\015\057\024" +
    "\047\025\050\001\002\000\032\007\031\010\023\011\025" +
    "\012\032\013\024\015\041\016\033\017\034\020\030\021" +
    "\035\022\027\023\026\001\002\000\012\002\ufff7\015\ufff7" +
    "\024\ufff7\025\ufff7\001\002\000\040\002\uffea\007\uffea\010" +
    "\uffea\011\025\012\032\013\024\015\uffea\016\uffea\017\uffea" +
    "\020\uffea\021\uffea\022\uffea\023\uffea\024\uffea\025\uffea\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\056\000\006\002\004\011\003\001\001\000\010\003" +
    "\010\005\013\006\015\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\005\057\001\001\000" +
    "\002\001\001\000\006\005\055\006\054\001\001\000\002" +
    "\001\001\000\004\004\021\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\005\020\006\017\001\001\000\002" +
    "\001\001\000\004\004\021\001\001\000\004\005\045\001" +
    "\001\000\004\005\044\001\001\000\004\005\043\001\001" +
    "\000\004\005\042\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\041\001\001\000\004" +
    "\005\036\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\005\037\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\013\052\001\001\000\004\012\050\001" +
    "\001\000\006\005\020\006\051\001\001\000\002\001\001" +
    "\000\006\005\020\006\053\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\021\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


//Codigo visible

    public void syntax_error(Symbol s){
        System.err.println(s);
    }

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.err.println("T.T");
        System.err.println(s);
    }


}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

//Codigo de acciones
      

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // expresion ::= DECIMAL 
            {
              NodoC3D RESULT =null;
		int decimalleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int decimalright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String decimal = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(decimal); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // expresion ::= ENTERO 
            {
              NodoC3D RESULT =null;
		int enteroleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int enteroright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String entero = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(entero); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // expresion ::= ID 
            {
              NodoC3D RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new NodoC3D(id); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // expresion ::= PAR_IZQ expresion PAR_DER 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = exp; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= MENOS expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = - " + exp.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= expresion POT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " ^ " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= expresion DIV expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " / " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= expresion MULT expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " * " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= expresion MENOS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " - " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= expresion MAS expresion 
            {
              NodoC3D RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String temp = ControlC3D.generaTemp();
                        String c3d = temp + " = " + izq.getCad() + " + " + der.getCad() + ";\n";
                        ControlC3D.agregarC3D(c3d);
                        RESULT = new NodoC3D(temp); 
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expresion",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // oprel ::= MAYORIGUALQ 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D(">="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("oprel",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // oprel ::= MENORIGUALQ 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("<="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("oprel",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // oprel ::= MAYORQ 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D(">"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("oprel",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // oprel ::= MENORQ 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("<"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("oprel",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // oprel ::= DIFERENTE 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("!="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("oprel",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // oprel ::= IGUAL 
            {
              NodoC3D RESULT =null;
		 RESULT = new NodoC3D("=="); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("oprel",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // condicion ::= expresion oprel expresion 
            {
              NodoC3DRel RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		NodoC3D izq = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D op = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D der = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        NodoC3DRel nodo = new NodoC3DRel("");
                        nodo.setEtiquetaVerdadera(ControlC3D.generaETQ());
                        nodo.setEtiquetaFalsa(ControlC3D.generaETQ());                       
                        String c3d = " if ( " + izq.getCad() +" " +op.getCad() +" "+ der.getCad() + ") goto " + nodo.getEtiquetaVerdadera()+ " ;\n  goto "+ nodo.getEtiquetaFalsa() +" ;\n" ;
                        ControlC3D.agregarC3D(c3d); 
                        RESULT = nodo;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // condicion ::= PAR_IZQ condicion PAR_DER 
            {
              NodoC3DRel RESULT =null;
		int nodatleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nodatright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3DRel nodat = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                        RESULT =nodat; 
                     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // condicion ::= NOT condicion 
            {
              NodoC3DRel RESULT =null;
		int notleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int notright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String not = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int nodatleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nodatright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3DRel nodat = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        String eti = nodat.getEtiquetaVerdadera();
                        nodat.setEtiquetaVerdadera(nodat.getEtiquetaFalsa());
                        nodat.setEtiquetaFalsa(eti);
                        RESULT = nodat;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // condicion ::= condicion AND NT$2 condicion 
            {
              NodoC3DRel RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (NodoC3DRel) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoC3DRel izq = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int andleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int andright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String and = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3DRel der = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        NodoC3DRel nodo = new NodoC3DRel("COND_AND");
                        nodo.setEtiquetaVerdadera(der.getEtiquetaVerdadera());
                        nodo.setEtiquetaFalsa(izq.getEtiquetaFalsa()+","+der.getEtiquetaFalsa());
                        RESULT = nodo;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$2 ::= 
            {
              NodoC3DRel RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3DRel izq = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int andleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int andright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String and = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 
                                        ControlC3D.agregarC3D(izq.getEtiquetaVerdadera()+" : \n"); 
                                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // condicion ::= condicion OR NT$1 condicion 
            {
              NodoC3DRel RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (NodoC3DRel) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		NodoC3DRel izq = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int orleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int orright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String or = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int derleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int derright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3DRel der = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        NodoC3DRel nodo = new NodoC3DRel("COND_OR");
                        nodo.setEtiquetaVerdadera(izq.getEtiquetaVerdadera()+","+ der.getEtiquetaVerdadera() );
                        nodo.setEtiquetaFalsa(der.getEtiquetaFalsa());
                        RESULT = nodo;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicion",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$1 ::= 
            {
              NodoC3DRel RESULT =null;
		int izqleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int izqright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3DRel izq = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int orleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int orright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String or = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
 
                                         ControlC3D.agregarC3D(izq.getEtiquetaFalsa()+" : \n" ); 
                                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // sentencia ::= expresion 
            {
              NodoC3D RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D exp = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = exp;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // sentencia ::= condicion 
            {
              NodoC3D RESULT =null;
		int nodatleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nodatright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3DRel nodat = (NodoC3DRel)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        RESULT = nodat;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("sentencia",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicial ::= NT$0 sentencia 
            {
              NodoC3D RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (NodoC3D) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sentleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sentright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		NodoC3D sent = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 
                        ControlC3D.agregarC3D( sent.getResultadoFinal());
                        RESULT = sent;
                    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicial",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              NodoC3D RESULT =null;
 ControlC3D.reiniciar(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicial EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		NodoC3D start_val = (NodoC3D)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

