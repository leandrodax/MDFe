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
public class Tabproplan implements Serializable {
    private static final long serialVersionUID = 1L;
   
    protected TabproplanPK tabproplanPK;
    private String descpro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double prvapro;
    private Double pratpro;
    private Double marglucva;
    private Double marglucat;
    private Double marlucsugat;
    private Double marlucsugva;
    private Double prvaprosug;
    private Double pratprosug;
    private Character status;
    private Tabplanpag tabplanpag;
    private Tabpro tabpro;

    public Tabproplan() {
    }

    public Tabproplan(TabproplanPK tabproplanPK) {
        this.tabproplanPK = tabproplanPK;
    }

    public Tabproplan(String codpro, int codplan) {
        this.tabproplanPK = new TabproplanPK(codpro, codplan);
    }

    public TabproplanPK getTabproplanPK() {
        return tabproplanPK;
    }

    public void setTabproplanPK(TabproplanPK tabproplanPK) {
        this.tabproplanPK = tabproplanPK;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Double getPrvapro() {
        return prvapro;
    }

    public void setPrvapro(Double prvapro) {
        this.prvapro = prvapro;
    }

    public Double getPratpro() {
        return pratpro;
    }

    public void setPratpro(Double pratpro) {
        this.pratpro = pratpro;
    }

    public Double getMarglucva() {
        return marglucva;
    }

    public void setMarglucva(Double marglucva) {
        this.marglucva = marglucva;
    }

    public Double getMarglucat() {
        return marglucat;
    }

    public void setMarglucat(Double marglucat) {
        this.marglucat = marglucat;
    }

    public Double getMarlucsugat() {
        return marlucsugat;
    }

    public void setMarlucsugat(Double marlucsugat) {
        this.marlucsugat = marlucsugat;
    }

    public Double getMarlucsugva() {
        return marlucsugva;
    }

    public void setMarlucsugva(Double marlucsugva) {
        this.marlucsugva = marlucsugva;
    }

    public Double getPrvaprosug() {
        return prvaprosug;
    }

    public void setPrvaprosug(Double prvaprosug) {
        this.prvaprosug = prvaprosug;
    }

    public Double getPratprosug() {
        return pratprosug;
    }

    public void setPratprosug(Double pratprosug) {
        this.pratprosug = pratprosug;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Tabplanpag getTabplanpag() {
        return tabplanpag;
    }

    public void setTabplanpag(Tabplanpag tabplanpag) {
        this.tabplanpag = tabplanpag;
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
        hash += (tabproplanPK != null ? tabproplanPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabproplan)) {
            return false;
        }
        Tabproplan other = (Tabproplan) object;
        if ((this.tabproplanPK == null && other.tabproplanPK != null) || (this.tabproplanPK != null && !this.tabproplanPK.equals(other.tabproplanPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabproplan[ tabproplanPK=" + tabproplanPK + " ]";
    }
    
}
