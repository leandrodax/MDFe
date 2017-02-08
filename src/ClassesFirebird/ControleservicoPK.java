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
public class ControleservicoPK implements Serializable {
    private int cscod;
    private int codos;

    public ControleservicoPK() {
    }

    public ControleservicoPK(int cscod, int codos) {
        this.cscod = cscod;
        this.codos = codos;
    }

    public int getCscod() {
        return cscod;
    }

    public void setCscod(int cscod) {
        this.cscod = cscod;
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
        hash += (int) cscod;
        hash += (int) codos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControleservicoPK)) {
            return false;
        }
        ControleservicoPK other = (ControleservicoPK) object;
        if (this.cscod != other.cscod) {
            return false;
        }
        if (this.codos != other.codos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.ControleservicoPK[ cscod=" + cscod + ", codos=" + codos + " ]";
    }
    
}
