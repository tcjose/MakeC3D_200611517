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
public class NodoC3DRel extends NodoC3D{
    
    private String etiquetaVerdadera;
    private String etiquetaFalsa;
    
    public NodoC3DRel(String cad) {
        super(cad);
    }

    public String getEtiquetaVerdadera() {
        return etiquetaVerdadera;
    }

    public void setEtiquetaVerdadera(String etiquetaVerdadera) {
        this.etiquetaVerdadera = etiquetaVerdadera;
    }

    public String getEtiquetaFalsa() {
        return etiquetaFalsa;
    }

    public void setEtiquetaFalsa(String etiquetaFalsa) {
        this.etiquetaFalsa = etiquetaFalsa;
    }
    
    public String getResultadoFinal(){
        return "//Etiqueta(S)de verdadero: " + getEtiquetaVerdadera() + "\n //Etiqueta(S)de falso: " + getEtiquetaFalsa();
    }
    
}
