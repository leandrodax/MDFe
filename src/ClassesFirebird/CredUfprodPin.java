/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class CredUfprodPin implements Serializable {
    private static final long serialVersionUID = 1L;
    protected CredUfprodPinPK credUfprodPinPK;

    public CredUfprodPin() {
    }

    public CredUfprodPin(CredUfprodPinPK credUfprodPinPK) {
        this.credUfprodPinPK = credUfprodPinPK;
    }

    public CredUfprodPin(String codigoProdutoPin, String nomeEstadoPin) {
        this.credUfprodPinPK = new CredUfprodPinPK(codigoProdutoPin, nomeEstadoPin);
    }

    public CredUfprodPinPK getCredUfprodPinPK() {
        return credUfprodPinPK;
    }

    public void setCredUfprodPinPK(CredUfprodPinPK credUfprodPinPK) {
        this.credUfprodPinPK = credUfprodPinPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (credUfprodPinPK != null ? credUfprodPinPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredUfprodPin)) {
            return false;
        }
        CredUfprodPin other = (CredUfprodPin) object;
        if ((this.credUfprodPinPK == null && other.credUfprodPinPK != null) || (this.credUfprodPinPK != null && !this.credUfprodPinPK.equals(other.credUfprodPinPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredUfprodPin[ credUfprodPinPK=" + credUfprodPinPK + " ]";
    }
    
}
