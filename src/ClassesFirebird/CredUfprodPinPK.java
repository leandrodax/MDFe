/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;

/**
 *
 * @author vplayer
 */
public class CredUfprodPinPK implements Serializable {
    private String codigoProdutoPin;
    private String nomeEstadoPin;

    public CredUfprodPinPK() {
    }

    public CredUfprodPinPK(String codigoProdutoPin, String nomeEstadoPin) {
        this.codigoProdutoPin = codigoProdutoPin;
        this.nomeEstadoPin = nomeEstadoPin;
    }

    public String getCodigoProdutoPin() {
        return codigoProdutoPin;
    }

    public void setCodigoProdutoPin(String codigoProdutoPin) {
        this.codigoProdutoPin = codigoProdutoPin;
    }

    public String getNomeEstadoPin() {
        return nomeEstadoPin;
    }

    public void setNomeEstadoPin(String nomeEstadoPin) {
        this.nomeEstadoPin = nomeEstadoPin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoProdutoPin != null ? codigoProdutoPin.hashCode() : 0);
        hash += (nomeEstadoPin != null ? nomeEstadoPin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredUfprodPinPK)) {
            return false;
        }
        CredUfprodPinPK other = (CredUfprodPinPK) object;
        if ((this.codigoProdutoPin == null && other.codigoProdutoPin != null) || (this.codigoProdutoPin != null && !this.codigoProdutoPin.equals(other.codigoProdutoPin))) {
            return false;
        }
        if ((this.nomeEstadoPin == null && other.nomeEstadoPin != null) || (this.nomeEstadoPin != null && !this.nomeEstadoPin.equals(other.nomeEstadoPin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredUfprodPinPK[ codigoProdutoPin=" + codigoProdutoPin + ", nomeEstadoPin=" + nomeEstadoPin + " ]";
    }
    
}
