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

public class TabservfilPK implements Serializable {
    
    private int codserv;
    
    private int codfil;

    public TabservfilPK() {
    }

    public TabservfilPK(int codserv, int codfil) {
        this.codserv = codserv;
        this.codfil = codfil;
    }

    public int getCodserv() {
        return codserv;
    }

    public void setCodserv(int codserv) {
        this.codserv = codserv;
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
        hash += (int) codserv;
        hash += (int) codfil;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabservfilPK)) {
            return false;
        }
        TabservfilPK other = (TabservfilPK) object;
        if (this.codserv != other.codserv) {
            return false;
        }
        if (this.codfil != other.codfil) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabservfilPK[ codserv=" + codserv + ", codfil=" + codfil + " ]";
    }
    
}
