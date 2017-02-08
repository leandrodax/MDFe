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

public class TabplanparcPK implements Serializable {
    
    private int codplan;
    
    private int codparc;

    public TabplanparcPK() {
    }

    public TabplanparcPK(int codplan, int codparc) {
        this.codplan = codplan;
        this.codparc = codparc;
    }

    public int getCodplan() {
        return codplan;
    }

    public void setCodplan(int codplan) {
        this.codplan = codplan;
    }

    public int getCodparc() {
        return codparc;
    }

    public void setCodparc(int codparc) {
        this.codparc = codparc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codplan;
        hash += (int) codparc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabplanparcPK)) {
            return false;
        }
        TabplanparcPK other = (TabplanparcPK) object;
        if (this.codplan != other.codplan) {
            return false;
        }
        if (this.codparc != other.codparc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabplanparcPK[ codplan=" + codplan + ", codparc=" + codparc + " ]";
    }
    
}
