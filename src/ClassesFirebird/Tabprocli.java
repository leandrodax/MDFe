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
public class Tabprocli implements Serializable {
    private static final long serialVersionUID = 1L;

    protected TabprocliPK tabprocliPK;
    private Integer quantpro;
    private Tabcli tabcli;
    private Tabpro tabpro;

    public Tabprocli() {
    }

    public Tabprocli(TabprocliPK tabprocliPK) {
        this.tabprocliPK = tabprocliPK;
    }

    public Tabprocli(String codcli, String codpro) {
        this.tabprocliPK = new TabprocliPK(codcli, codpro);
    }

    public TabprocliPK getTabprocliPK() {
        return tabprocliPK;
    }

    public void setTabprocliPK(TabprocliPK tabprocliPK) {
        this.tabprocliPK = tabprocliPK;
    }

    public Integer getQuantpro() {
        return quantpro;
    }

    public void setQuantpro(Integer quantpro) {
        this.quantpro = quantpro;
    }

    public Tabcli getTabcli() {
        return tabcli;
    }

    public void setTabcli(Tabcli tabcli) {
        this.tabcli = tabcli;
    }

    public Tabpro getTabpro() {
        return tabpro;
    }

    public void setTabpro(Tabpro tabpro) {
        this.tabpro = tabpro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabprocliPK != null ? tabprocliPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabprocli)) {
            return false;
        }
        Tabprocli other = (Tabprocli) object;
        if ((this.tabprocliPK == null && other.tabprocliPK != null) || (this.tabprocliPK != null && !this.tabprocliPK.equals(other.tabprocliPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabprocli[ tabprocliPK=" + tabprocliPK + " ]";
    }
    
}
