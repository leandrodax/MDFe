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
public class CredUfoperadora implements Serializable {
    private static final long serialVersionUID = 1L;
    protected CredUfoperadoraPK credUfoperadoraPK;

    public CredUfoperadora() {
    }

    public CredUfoperadora(CredUfoperadoraPK credUfoperadoraPK) {
        this.credUfoperadoraPK = credUfoperadoraPK;
    }

    public CredUfoperadora(String codigoOperadora, String nomeEstado) {
        this.credUfoperadoraPK = new CredUfoperadoraPK(codigoOperadora, nomeEstado);
    }

    public CredUfoperadoraPK getCredUfoperadoraPK() {
        return credUfoperadoraPK;
    }

    public void setCredUfoperadoraPK(CredUfoperadoraPK credUfoperadoraPK) {
        this.credUfoperadoraPK = credUfoperadoraPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (credUfoperadoraPK != null ? credUfoperadoraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredUfoperadora)) {
            return false;
        }
        CredUfoperadora other = (CredUfoperadora) object;
        if ((this.credUfoperadoraPK == null && other.credUfoperadoraPK != null) || (this.credUfoperadoraPK != null && !this.credUfoperadoraPK.equals(other.credUfoperadoraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredUfoperadora[ credUfoperadoraPK=" + credUfoperadoraPK + " ]";
    }
    
}
