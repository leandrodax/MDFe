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

public class TabproforPK implements Serializable {
    
    private int codfor;
    
    private String codigo;

    public TabproforPK() {
    }

    public TabproforPK(int codfor, String codigo) {
        this.codfor = codfor;
        this.codigo = codigo;
    }

    public int getCodfor() {
        return codfor;
    }

    public void setCodfor(int codfor) {
        this.codfor = codfor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codfor;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabproforPK)) {
            return false;
        }
        TabproforPK other = (TabproforPK) object;
        if (this.codfor != other.codfor) {
            return false;
        }
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabproforPK[ codfor=" + codfor + ", codigo=" + codigo + " ]";
    }
    
}
