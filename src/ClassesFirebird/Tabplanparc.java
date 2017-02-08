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
public class Tabplanparc implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabplanparcPK tabplanparcPK;
    
    private int prazo;
    
    private int percparc;
    private Character centavos;
  
    private Tabplanpag tabplanpag;

    public Tabplanparc() {
    }

    public Tabplanparc(TabplanparcPK tabplanparcPK) {
        this.tabplanparcPK = tabplanparcPK;
    }

    public Tabplanparc(TabplanparcPK tabplanparcPK, int prazo, int percparc) {
        this.tabplanparcPK = tabplanparcPK;
        this.prazo = prazo;
        this.percparc = percparc;
    }

    public Tabplanparc(int codplan, int codparc) {
        this.tabplanparcPK = new TabplanparcPK(codplan, codparc);
    }

    public TabplanparcPK getTabplanparcPK() {
        return tabplanparcPK;
    }

    public void setTabplanparcPK(TabplanparcPK tabplanparcPK) {
        this.tabplanparcPK = tabplanparcPK;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public int getPercparc() {
        return percparc;
    }

    public void setPercparc(int percparc) {
        this.percparc = percparc;
    }

    public Character getCentavos() {
        return centavos;
    }

    public void setCentavos(Character centavos) {
        this.centavos = centavos;
    }

    public Tabplanpag getTabplanpag() {
        return tabplanpag;
    }

    public void setTabplanpag(Tabplanpag tabplanpag) {
        this.tabplanpag = tabplanpag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabplanparcPK != null ? tabplanparcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabplanparc)) {
            return false;
        }
        Tabplanparc other = (Tabplanparc) object;
        if ((this.tabplanparcPK == null && other.tabplanparcPK != null) || (this.tabplanparcPK != null && !this.tabplanparcPK.equals(other.tabplanparcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabplanparc[ tabplanparcPK=" + tabplanparcPK + " ]";
    }
    
}
