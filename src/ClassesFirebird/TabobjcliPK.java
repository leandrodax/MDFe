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

public class TabobjcliPK implements Serializable {
    
    private String codcli;
    
    private int codobj;

    public TabobjcliPK() {
    }

    public TabobjcliPK(String codcli, int codobj) {
        this.codcli = codcli;
        this.codobj = codobj;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public int getCodobj() {
        return codobj;
    }

    public void setCodobj(int codobj) {
        this.codobj = codobj;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcli != null ? codcli.hashCode() : 0);
        hash += (int) codobj;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabobjcliPK)) {
            return false;
        }
        TabobjcliPK other = (TabobjcliPK) object;
        if ((this.codcli == null && other.codcli != null) || (this.codcli != null && !this.codcli.equals(other.codcli))) {
            return false;
        }
        if (this.codobj != other.codobj) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabobjcliPK[ codcli=" + codcli + ", codobj=" + codobj + " ]";
    }
    
}
