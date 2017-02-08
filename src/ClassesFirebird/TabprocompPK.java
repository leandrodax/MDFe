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

public class TabprocompPK implements Serializable {
    
    private String refpro;
    
    private String codpro;

    public TabprocompPK() {
    }

    public TabprocompPK(String refpro, String codpro) {
        this.refpro = refpro;
        this.codpro = codpro;
    }

    public String getRefpro() {
        return refpro;
    }

    public void setRefpro(String refpro) {
        this.refpro = refpro;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refpro != null ? refpro.hashCode() : 0);
        hash += (codpro != null ? codpro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabprocompPK)) {
            return false;
        }
        TabprocompPK other = (TabprocompPK) object;
        if ((this.refpro == null && other.refpro != null) || (this.refpro != null && !this.refpro.equals(other.refpro))) {
            return false;
        }
        if ((this.codpro == null && other.codpro != null) || (this.codpro != null && !this.codpro.equals(other.codpro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabprocompPK[ refpro=" + refpro + ", codpro=" + codpro + " ]";
    }
    
}
