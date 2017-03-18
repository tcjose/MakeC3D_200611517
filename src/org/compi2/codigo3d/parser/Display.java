/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.compi2.codigo3d.parser;

import java.util.*;

/**
 *
 * @author DM
 */
public class Display {
    private static int index = 0;
 //   AbstractMap<String, NodoC3DRel> pila = new HashMap<String, NodoC3DRel>();
    private static Stack<NodoC3DRel> pila = new Stack<>();
    public static void  agregar(NodoC3DRel nodo){
        pila.add(nodo);
    }
    public static void agregar(int indice,NodoC3DRel nodo){
        pila.add(indice,nodo);
    }
    
    
    public static NodoC3DRel mirar(){
        return pila.peek();
        
    }
    public static NodoC3DRel sacar(){
        return pila.pop();
        
    } 
    
    public static NodoC3DRel obtener(int indice){
        return pila.get(indice);
    }
    public static void reiniciar(){
        pila.clear();
    } 
    
    private void prueba(){
                   /*     NodoC3DRel nodo = new NodoC3DRel("");
                        nodo.setEtiquetaVerdadera(ControlC3D.generaETQ());
                        nodo.setEtiquetaFalsa(ControlC3D.generaETQ());                       
                        String c3d = " if ( " + izq.getCad() +" " +op.getCad() +" "+ der.getCad() + ") goto " + nodo.getEtiquetaVerdadera()+ " ;\n  goto "+ nodo.getEtiquetaFalsa() +" ;\n" ;
                        ControlC3D.agregarC3D(c3d); 
                        RESULT = nodo; */
    }
}
