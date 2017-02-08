/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;


public class MdfeLacresTotalizador implements Serializable {

    private String numero;
   
    private Integer nrLacre;

    public MdfeLacresTotalizador() {
    }

    public MdfeLacresTotalizador(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getNrLacre() {
        return nrLacre;
    }

    public void setNrLacre(Integer nrLacre) {
        this.nrLacre = nrLacre;
    }

}
