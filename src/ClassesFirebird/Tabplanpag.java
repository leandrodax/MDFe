/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vplayer
 */
public class Tabplanpag implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Integer codplan;
    
    private String descplan;
    
    private int codforma;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    private Character entrada;
    private Integer nrparcelas;
    private Character vencplano;
    
    private Date datavenc;
    private Character tpparcel;
    private String mascara;
    private Character planopalm;
    private Character libalttit;
    
    private Collection<Tabplanparc> tabplanparcCollection;
    private Collection<Tabppagfil> tabppagfilCollection;
    private Collection<Tabproplan> tabproplanCollection;

    public Tabplanpag() {
    }

    public Tabplanpag(Integer codplan) {
        this.codplan = codplan;
    }

    public Tabplanpag(Integer codplan, String descplan, int codforma) {
        this.codplan = codplan;
        this.descplan = descplan;
        this.codforma = codforma;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public String getDescplan() {
        return descplan;
    }

    public void setDescplan(String descplan) {
        this.descplan = descplan;
    }

    public int getCodforma() {
        return codforma;
    }

    public void setCodforma(int codforma) {
        this.codforma = codforma;
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

    public Character getEntrada() {
        return entrada;
    }

    public void setEntrada(Character entrada) {
        this.entrada = entrada;
    }

    public Integer getNrparcelas() {
        return nrparcelas;
    }

    public void setNrparcelas(Integer nrparcelas) {
        this.nrparcelas = nrparcelas;
    }

    public Character getVencplano() {
        return vencplano;
    }

    public void setVencplano(Character vencplano) {
        this.vencplano = vencplano;
    }

    public Date getDatavenc() {
        return datavenc;
    }

    public void setDatavenc(Date datavenc) {
        this.datavenc = datavenc;
    }

    public Character getTpparcel() {
        return tpparcel;
    }

    public void setTpparcel(Character tpparcel) {
        this.tpparcel = tpparcel;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Character getPlanopalm() {
        return planopalm;
    }

    public void setPlanopalm(Character planopalm) {
        this.planopalm = planopalm;
    }

    public Character getLibalttit() {
        return libalttit;
    }

    public void setLibalttit(Character libalttit) {
        this.libalttit = libalttit;
    }

    @XmlTransient
    public Collection<Tabplanparc> getTabplanparcCollection() {
        return tabplanparcCollection;
    }

    public void setTabplanparcCollection(Collection<Tabplanparc> tabplanparcCollection) {
        this.tabplanparcCollection = tabplanparcCollection;
    }

    @XmlTransient
    public Collection<Tabppagfil> getTabppagfilCollection() {
        return tabppagfilCollection;
    }

    public void setTabppagfilCollection(Collection<Tabppagfil> tabppagfilCollection) {
        this.tabppagfilCollection = tabppagfilCollection;
    }

    @XmlTransient
    public Collection<Tabproplan> getTabproplanCollection() {
        return tabproplanCollection;
    }

    public void setTabproplanCollection(Collection<Tabproplan> tabproplanCollection) {
        this.tabproplanCollection = tabproplanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codplan != null ? codplan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabplanpag)) {
            return false;
        }
        Tabplanpag other = (Tabplanpag) object;
        if ((this.codplan == null && other.codplan != null) || (this.codplan != null && !this.codplan.equals(other.codplan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabplanpag[ codplan=" + codplan + " ]";
    }
    
}
