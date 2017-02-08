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

public class TabproplanPK implements Serializable {
    
    private String codpro;
    
    private int codplan;

    public TabproplanPK() {
    }

    public TabproplanPK(String codpro, int codplan) {
        this.codpro = codpro;
        this.codplan = codplan;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public int getCodplan() {
        return codplan;
    }

    public void setCodplan(int codplan) {
        this.codplan = codplan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpro != null ? codpro.hashCode() : 0);
        hash += (int) codplan;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabproplanPK)) {
            return false;
        }
        TabproplanPK other = (TabproplanPK) object;
        if ((this.codpro == null && other.codpro != null) || (this.codpro != null && !this.codpro.equals(other.codpro))) {
            return false;
        }
        if (this.codplan != other.codplan) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabproplanPK[ codpro=" + codpro + ", codplan=" + codplan + " ]";
    }
    
}
