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
public class Tabprosub implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabprosubPK tabprosubPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdpro;
    
    private Date dtvenc;
    private Double qtdrespro;
    private Double qtddevpro;
    private String codigo;
    private Double prvapro;

    private Tabfil tabfil;

    private Tabpro tabpro;

    public Tabprosub() {
    }

    public Tabprosub(TabprosubPK tabprosubPK) {
        this.tabprosubPK = tabprosubPK;
    }

    public Tabprosub(String codpro, int codfil, String referencia, String modelo, String cor, String tamanho) {
        this.tabprosubPK = new TabprosubPK(codpro, codfil, referencia, modelo, cor, tamanho);
    }

    public TabprosubPK getTabprosubPK() {
        return tabprosubPK;
    }

    public void setTabprosubPK(TabprosubPK tabprosubPK) {
        this.tabprosubPK = tabprosubPK;
    }

    public Double getQtdpro() {
        return qtdpro;
    }

    public void setQtdpro(Double qtdpro) {
        this.qtdpro = qtdpro;
    }

    public Date getDtvenc() {
        return dtvenc;
    }

    public void setDtvenc(Date dtvenc) {
        this.dtvenc = dtvenc;
    }

    public Double getQtdrespro() {
        return qtdrespro;
    }

    public void setQtdrespro(Double qtdrespro) {
        this.qtdrespro = qtdrespro;
    }

    public Double getQtddevpro() {
        return qtddevpro;
    }

    public void setQtddevpro(Double qtddevpro) {
        this.qtddevpro = qtddevpro;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrvapro() {
        return prvapro;
    }

    public void setPrvapro(Double prvapro) {
        this.prvapro = prvapro;
    }

    public Tabfil getTabfil() {
        return tabfil;
    }

    public void setTabfil(Tabfil tabfil) {
        this.tabfil = tabfil;
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
        hash += (tabprosubPK != null ? tabprosubPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabprosub)) {
            return false;
        }
        Tabprosub other = (Tabprosub) object;
        if ((this.tabprosubPK == null && other.tabprosubPK != null) || (this.tabprosubPK != null && !this.tabprosubPK.equals(other.tabprosubPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabprosub[ tabprosubPK=" + tabprosubPK + " ]";
    }
    
}
