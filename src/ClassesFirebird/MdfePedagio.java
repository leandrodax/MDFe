/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;


public class MdfePedagio implements Serializable {

    
    private String numero;
    
    private String razSocEmpForPed;
    
    private String cnpjEmpForPed;
    
    private String razSocRespPagPed;
    
    private String cnpjRespPagPed;
    
    private String nrComprovante;

    public MdfePedagio() {
    }

    public MdfePedagio(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRazSocEmpForPed() {
        return razSocEmpForPed;
    }

    public void setRazSocEmpForPed(String razSocEmpForPed) {
        this.razSocEmpForPed = razSocEmpForPed;
    }

    public String getCnpjEmpForPed() {
        return cnpjEmpForPed;
    }

    public void setCnpjEmpForPed(String cnpjEmpForPed) {
        this.cnpjEmpForPed = cnpjEmpForPed;
    }

    public String getRazSocRespPagPed() {
        return razSocRespPagPed;
    }

    public void setRazSocRespPagPed(String razSocRespPagPed) {
        this.razSocRespPagPed = razSocRespPagPed;
    }

    public String getCnpjRespPagPed() {
        return cnpjRespPagPed;
    }

    public void setCnpjRespPagPed(String cnpjRespPagPed) {
        this.cnpjRespPagPed = cnpjRespPagPed;
    }

    public String getNrComprovante() {
        return nrComprovante;
    }

    public void setNrComprovante(String nrComprovante) {
        this.nrComprovante = nrComprovante;
    }

    
    
}
