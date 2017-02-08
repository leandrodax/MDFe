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

public class TabhodiaservicoPK implements Serializable {
    
    private int codhds;
    
    private int cscod;
    
    private int codos;

    public TabhodiaservicoPK() {
    }

    public TabhodiaservicoPK(int codhds, int cscod, int codos) {
        this.codhds = codhds;
        this.cscod = cscod;
        this.codos = codos;
    }

    public int getCodhds() {
        return codhds;
    }

    public void setCodhds(int codhds) {
        this.codhds = codhds;
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
        hash += (int) codhds;
        hash += (int) cscod;
        hash += (int) codos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabhodiaservicoPK)) {
            return false;
        }
        TabhodiaservicoPK other = (TabhodiaservicoPK) object;
        if (this.codhds != other.codhds) {
            return false;
        }
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
        return "ClassesFirebird.TabhodiaservicoPK[ codhds=" + codhds + ", cscod=" + cscod + ", codos=" + codos + " ]";
    }
    
}
