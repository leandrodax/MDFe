/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author vplayer
 */

public class TabobscliPK implements Serializable {
    
    private String codcli;
    
    
    private Date dtagenda;
    
    private String hragenda;

    public TabobscliPK() {
    }

    public TabobscliPK(String codcli, Date dtagenda, String hragenda) {
        this.codcli = codcli;
        this.dtagenda = dtagenda;
        this.hragenda = hragenda;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public Date getDtagenda() {
        return dtagenda;
    }

    public void setDtagenda(Date dtagenda) {
        this.dtagenda = dtagenda;
    }

    public String getHragenda() {
        return hragenda;
    }

    public void setHragenda(String hragenda) {
        this.hragenda = hragenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcli != null ? codcli.hashCode() : 0);
        hash += (dtagenda != null ? dtagenda.hashCode() : 0);
        hash += (hragenda != null ? hragenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabobscliPK)) {
            return false;
        }
        TabobscliPK other = (TabobscliPK) object;
        if ((this.codcli == null && other.codcli != null) || (this.codcli != null && !this.codcli.equals(other.codcli))) {
            return false;
        }
        if ((this.dtagenda == null && other.dtagenda != null) || (this.dtagenda != null && !this.dtagenda.equals(other.dtagenda))) {
            return false;
        }
        if ((this.hragenda == null && other.hragenda != null) || (this.hragenda != null && !this.hragenda.equals(other.hragenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabobscliPK[ codcli=" + codcli + ", dtagenda=" + dtagenda + ", hragenda=" + hragenda + " ]";
    }
    
}
