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

public class TitulopPK implements Serializable {
   
    private String codtit;
   
    private int codfor;

    public TitulopPK() {
    }

    public TitulopPK(String codtit, int codfor) {
        this.codtit = codtit;
        this.codfor = codfor;
    }

    public String getCodtit() {
        return codtit;
    }

    public void setCodtit(String codtit) {
        this.codtit = codtit;
    }

    public int getCodfor() {
        return codfor;
    }

    public void setCodfor(int codfor) {
        this.codfor = codfor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtit != null ? codtit.hashCode() : 0);
        hash += (int) codfor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitulopPK)) {
            return false;
        }
        TitulopPK other = (TitulopPK) object;
        if ((this.codtit == null && other.codtit != null) || (this.codtit != null && !this.codtit.equals(other.codtit))) {
            return false;
        }
        if (this.codfor != other.codfor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TitulopPK[ codtit=" + codtit + ", codfor=" + codfor + " ]";
    }
    
}
