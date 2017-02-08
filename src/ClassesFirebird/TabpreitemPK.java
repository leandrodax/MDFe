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

public class TabpreitemPK implements Serializable {
    
    private int codpreco;
    
    private String codprod;

    public TabpreitemPK() {
    }

    public TabpreitemPK(int codpreco, String codprod) {
        this.codpreco = codpreco;
        this.codprod = codprod;
    }

    public int getCodpreco() {
        return codpreco;
    }

    public void setCodpreco(int codpreco) {
        this.codpreco = codpreco;
    }

    public String getCodprod() {
        return codprod;
    }

    public void setCodprod(String codprod) {
        this.codprod = codprod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codpreco;
        hash += (codprod != null ? codprod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabpreitemPK)) {
            return false;
        }
        TabpreitemPK other = (TabpreitemPK) object;
        if (this.codpreco != other.codpreco) {
            return false;
        }
        if ((this.codprod == null && other.codprod != null) || (this.codprod != null && !this.codprod.equals(other.codprod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabpreitemPK[ codpreco=" + codpreco + ", codprod=" + codprod + " ]";
    }
    
}
