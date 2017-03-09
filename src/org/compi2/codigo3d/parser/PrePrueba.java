/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.compi2.codigo3d.parser;

/**
 *
 * @author DM
 */
public class PrePrueba {
    
        private void aux(){
        NodoC3DRel nodo = new NodoC3DRel("");
        nodo.setEtiquetaVerdadera(ControlC3D.generaETQ());
        nodo.setEtiquetaFalsa(ControlC3D.generaETQ());
 /*       
                                String c3d =  izq.getEtiquetaFalsa()+ ": \n  "  + der.getCad() + ";\n";
                        NodoC3DRel nodo = new NodoC3DRel("COND_OR");
if (nodo.getCad().equalsIgnoreCase("OR")){
                        nodo.setEtiquetaVerdadera(izq.getEtiquetaVerdadera()+","+der.getEtiquetaVerdadera());
                        nodo.setEtiquetaFalsa(der.getEtiquetaFalsa());
} else {
                        nodo.setEtiquetaVerdadera(der.getEtiquetaVerdadera());
                        nodo.setEtiquetaFalsa(izq.getEtiquetaFalsa()+","+der.getEtiquetaFalsa());
}*/
    }
}
