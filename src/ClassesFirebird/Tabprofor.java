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
public class Tabprofor implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabproforPK tabproforPK;
    private Tabfor tabfor;
    private Tabpro codpro;

    public Tabprofor() {
    }

    public Tabprofor(TabproforPK tabproforPK) {
        this.tabproforPK = tabproforPK;
    }

    public Tabprofor(int codfor, String codigo) {
        this.tabproforPK = new TabproforPK(codfor, codigo);
    }

    public TabproforPK getTabproforPK() {
        return tabproforPK;
    }

    public void setTabproforPK(TabproforPK tabproforPK) {
        this.tabproforPK = tabproforPK;
    }

    public Tabfor getTabfor() {
        return tabfor;
    }

    public void setTabfor(Tabfor tabfor) {
        this.tabfor = tabfor;
    }

    public Tabpro getCodpro() {
        return codpro;
    }

    public void setCodpro(Tabpro codpro) {
        this.codpro = codpro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabproforPK != null ? tabproforPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabprofor)) {
            return false;
        }
        Tabprofor other = (Tabprofor) object;
        if ((this.tabproforPK == null && other.tabproforPK != null) || (this.tabproforPK != null && !this.tabproforPK.equals(other.tabproforPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabprofor[ tabproforPK=" + tabproforPK + " ]";
    }
    
}
