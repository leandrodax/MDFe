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

public class TabpecaproblemaPK implements Serializable {
    
    private int codpeca;
    
    private int codos;

    public TabpecaproblemaPK() {
    }

    public TabpecaproblemaPK(int codpeca, int codos) {
        this.codpeca = codpeca;
        this.codos = codos;
    }

    public int getCodpeca() {
        return codpeca;
    }

    public void setCodpeca(int codpeca) {
        this.codpeca = codpeca;
    }

    public int getCodos() {
        return codos;
    }

    public void setCodos(int codos) {
        this.codos = codos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codpeca;
        hash += (int) codos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabpecaproblemaPK)) {
            return false;
        }
        TabpecaproblemaPK other = (TabpecaproblemaPK) object;
        if (this.codpeca != other.codpeca) {
            return false;
        }
        if (this.codos != other.codos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabpecaproblemaPK[ codpeca=" + codpeca + ", codos=" + codos + " ]";
    }
    
}
