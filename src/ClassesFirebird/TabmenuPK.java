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

public class TabmenuPK implements Serializable {
    
    private int codsis;
    
    private String codop;

    public TabmenuPK() {
    }

    public TabmenuPK(int codsis, String codop) {
        this.codsis = codsis;
        this.codop = codop;
    }

    public int getCodsis() {
        return codsis;
    }

    public void setCodsis(int codsis) {
        this.codsis = codsis;
    }

    public String getCodop() {
        return codop;
    }

    public void setCodop(String codop) {
        this.codop = codop;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codsis;
        hash += (codop != null ? codop.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabmenuPK)) {
            return false;
        }
        TabmenuPK other = (TabmenuPK) object;
        if (this.codsis != other.codsis) {
            return false;
        }
        if ((this.codop == null && other.codop != null) || (this.codop != null && !this.codop.equals(other.codop))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabmenuPK[ codsis=" + codsis + ", codop=" + codop + " ]";
    }
    
}
