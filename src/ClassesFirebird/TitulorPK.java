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

public class TitulorPK implements Serializable {
   
    private String codtit;
   
    private String codcli;

    public TitulorPK() {
    }

    public TitulorPK(String codtit, String codcli) {
        this.codtit = codtit;
        this.codcli = codcli;
    }

    public String getCodtit() {
        return codtit;
    }

    public void setCodtit(String codtit) {
        this.codtit = codtit;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codtit != null ? codtit.hashCode() : 0);
        hash += (codcli != null ? codcli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TitulorPK)) {
            return false;
        }
        TitulorPK other = (TitulorPK) object;
        if ((this.codtit == null && other.codtit != null) || (this.codtit != null && !this.codtit.equals(other.codtit))) {
            return false;
        }
        if ((this.codcli == null && other.codcli != null) || (this.codcli != null && !this.codcli.equals(other.codcli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TitulorPK[ codtit=" + codtit + ", codcli=" + codcli + " ]";
    }
    
}
