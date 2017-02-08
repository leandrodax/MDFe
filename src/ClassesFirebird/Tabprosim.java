/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Tabprosim implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabprosimPK tabprosimPK;
    private String descpro;
    private Tabpro tabpro;
    private Tabpro tabpro1;

    public Tabprosim() {
    }

    public Tabprosim(TabprosimPK tabprosimPK) {
        this.tabprosimPK = tabprosimPK;
    }

    public Tabprosim(String refpro, String codpro) {
        this.tabprosimPK = new TabprosimPK(refpro, codpro);
    }

    public TabprosimPK getTabprosimPK() {
        return tabprosimPK;
    }

    public void setTabprosimPK(TabprosimPK tabprosimPK) {
        this.tabprosimPK = tabprosimPK;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Tabpro getTabpro() {
        return tabpro;
    }

    public void setTabpro(Tabpro tabpro) {
        this.tabpro = tabpro;
    }

    public Tabpro getTabpro1() {
        return tabpro1;
    }

    public void setTabpro1(Tabpro tabpro1) {
        this.tabpro1 = tabpro1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabprosimPK != null ? tabprosimPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabprosim)) {
            return false;
        }
        Tabprosim other = (Tabprosim) object;
        if ((this.tabprosimPK == null && other.tabprosimPK != null) || (this.tabprosimPK != null && !this.tabprosimPK.equals(other.tabprosimPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabprosim[ tabprosimPK=" + tabprosimPK + " ]";
    }
    
}
