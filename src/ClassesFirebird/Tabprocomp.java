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
public class Tabprocomp implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabprocompPK tabprocompPK;
    private String unid;
    private String descpro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdun;
    private Double prvenun;
    private Double vltotal;
    private Tabpro tabpro;
    private Tabpro tabpro1;

    public Tabprocomp() {
    }

    public Tabprocomp(TabprocompPK tabprocompPK) {
        this.tabprocompPK = tabprocompPK;
    }

    public Tabprocomp(String refpro, String codpro) {
        this.tabprocompPK = new TabprocompPK(refpro, codpro);
    }

    public TabprocompPK getTabprocompPK() {
        return tabprocompPK;
    }

    public void setTabprocompPK(TabprocompPK tabprocompPK) {
        this.tabprocompPK = tabprocompPK;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Double getQtdun() {
        return qtdun;
    }

    public void setQtdun(Double qtdun) {
        this.qtdun = qtdun;
    }

    public Double getPrvenun() {
        return prvenun;
    }

    public void setPrvenun(Double prvenun) {
        this.prvenun = prvenun;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
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
        hash += (tabprocompPK != null ? tabprocompPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabprocomp)) {
            return false;
        }
        Tabprocomp other = (Tabprocomp) object;
        if ((this.tabprocompPK == null && other.tabprocompPK != null) || (this.tabprocompPK != null && !this.tabprocompPK.equals(other.tabprocompPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabprocomp[ tabprocompPK=" + tabprocompPK + " ]";
    }
    
}
