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

public class TabppagfilPK implements Serializable {
    
    private int codplan;
    
    private int codfil;

    public TabppagfilPK() {
    }

    public TabppagfilPK(int codplan, int codfil) {
        this.codplan = codplan;
        this.codfil = codfil;
    }

    public int getCodplan() {
        return codplan;
    }

    public void setCodplan(int codplan) {
        this.codplan = codplan;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codplan;
        hash += (int) codfil;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabppagfilPK)) {
            return false;
        }
        TabppagfilPK other = (TabppagfilPK) object;
        if (this.codplan != other.codplan) {
            return false;
        }
        if (this.codfil != other.codfil) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabppagfilPK[ codplan=" + codplan + ", codfil=" + codfil + " ]";
    }
    
}
