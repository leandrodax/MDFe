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
public class Tabmenu implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabmenuPK tabmenuPK;
    private String descop;
    private String habilita;

    public Tabmenu() {
    }

    public Tabmenu(TabmenuPK tabmenuPK) {
        this.tabmenuPK = tabmenuPK;
    }

    public Tabmenu(int codsis, String codop) {
        this.tabmenuPK = new TabmenuPK(codsis, codop);
    }

    public TabmenuPK getTabmenuPK() {
        return tabmenuPK;
    }

    public void setTabmenuPK(TabmenuPK tabmenuPK) {
        this.tabmenuPK = tabmenuPK;
    }

    public String getDescop() {
        return descop;
    }

    public void setDescop(String descop) {
        this.descop = descop;
    }

    public String getHabilita() {
        return habilita;
    }

    public void setHabilita(String habilita) {
        this.habilita = habilita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabmenuPK != null ? tabmenuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabmenu)) {
            return false;
        }
        Tabmenu other = (Tabmenu) object;
        if ((this.tabmenuPK == null && other.tabmenuPK != null) || (this.tabmenuPK != null && !this.tabmenuPK.equals(other.tabmenuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabmenu[ tabmenuPK=" + tabmenuPK + " ]";
    }
    
}
