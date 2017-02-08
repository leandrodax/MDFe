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
public class Tabpreitem implements Serializable {
    private static final long serialVersionUID = 1L;

    protected TabpreitemPK tabpreitemPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double prvapro;
    private Double pratpro;
    private Integer rgcodusu;
    private String rgusuario;    
    private Date rgdata;
    private String rgevento;
    private String tipoajuste;
    private String precobase;    
    private Tabpreco tabpreco;    
    private Tabpro tabpro;

    public Tabpreitem() {
    }

    public Tabpreitem(TabpreitemPK tabpreitemPK) {
        this.tabpreitemPK = tabpreitemPK;
    }

    public Tabpreitem(int codpreco, String codprod) {
        this.tabpreitemPK = new TabpreitemPK(codpreco, codprod);
    }

    public TabpreitemPK getTabpreitemPK() {
        return tabpreitemPK;
    }

    public void setTabpreitemPK(TabpreitemPK tabpreitemPK) {
        this.tabpreitemPK = tabpreitemPK;
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

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }

    public String getTipoajuste() {
        return tipoajuste;
    }

    public void setTipoajuste(String tipoajuste) {
        this.tipoajuste = tipoajuste;
    }

    public String getPrecobase() {
        return precobase;
    }

    public void setPrecobase(String precobase) {
        this.precobase = precobase;
    }

    public Tabpreco getTabpreco() {
        return tabpreco;
    }

    public void setTabpreco(Tabpreco tabpreco) {
        this.tabpreco = tabpreco;
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
        hash += (tabpreitemPK != null ? tabpreitemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabpreitem)) {
            return false;
        }
        Tabpreitem other = (Tabpreitem) object;
        if ((this.tabpreitemPK == null && other.tabpreitemPK != null) || (this.tabpreitemPK != null && !this.tabpreitemPK.equals(other.tabpreitemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabpreitem[ tabpreitemPK=" + tabpreitemPK + " ]";
    }
    
}
