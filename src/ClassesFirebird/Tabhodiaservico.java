/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Tabhodiaservico implements Serializable {
    private static final long serialVersionUID = 1L;
   
    protected TabhodiaservicoPK tabhodiaservicoPK;
    
    private Date hotrabin;
    
    private Date hotrabfin;
    
    private Date dtrg;
   
    private Controleservico controleservico;

    public Tabhodiaservico() {
    }

    public Tabhodiaservico(TabhodiaservicoPK tabhodiaservicoPK) {
        this.tabhodiaservicoPK = tabhodiaservicoPK;
    }

    public Tabhodiaservico(int codhds, int cscod, int codos) {
        this.tabhodiaservicoPK = new TabhodiaservicoPK(codhds, cscod, codos);
    }

    public TabhodiaservicoPK getTabhodiaservicoPK() {
        return tabhodiaservicoPK;
    }

    public void setTabhodiaservicoPK(TabhodiaservicoPK tabhodiaservicoPK) {
        this.tabhodiaservicoPK = tabhodiaservicoPK;
    }

    public Date getHotrabin() {
        return hotrabin;
    }

    public void setHotrabin(Date hotrabin) {
        this.hotrabin = hotrabin;
    }

    public Date getHotrabfin() {
        return hotrabfin;
    }

    public void setHotrabfin(Date hotrabfin) {
        this.hotrabfin = hotrabfin;
    }

    public Date getDtrg() {
        return dtrg;
    }

    public void setDtrg(Date dtrg) {
        this.dtrg = dtrg;
    }

    public Controleservico getControleservico() {
        return controleservico;
    }

    public void setControleservico(Controleservico controleservico) {
        this.controleservico = controleservico;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabhodiaservicoPK != null ? tabhodiaservicoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabhodiaservico)) {
            return false;
        }
        Tabhodiaservico other = (Tabhodiaservico) object;
        if ((this.tabhodiaservicoPK == null && other.tabhodiaservicoPK != null) || (this.tabhodiaservicoPK != null && !this.tabhodiaservicoPK.equals(other.tabhodiaservicoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabhodiaservico[ tabhodiaservicoPK=" + tabhodiaservicoPK + " ]";
    }
    
}
