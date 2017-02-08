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
public class Tabplacon implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer codplan;
    
    private String mascplan;
    
    private String descplan;
    private Character tpplan0;
    private Character tpgrupo;
    private Character analsint;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    private Character tpregis;
    private String gruplan;
    private String sgruplan;
    private String itemplan;
    private String gruponome;
    private String sgruponome;
    private Character habfrente;
    private Character claplano;
    private String gruplan1;
    private String sgruplan1;
    private String sgruplan2;
    private String sgruplan3;
    private Integer codplandre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double cotamensal;
    private String corconsul;

    public Tabplacon() {
    }

    public Tabplacon(Integer codplan) {
        this.codplan = codplan;
    }

    public Tabplacon(Integer codplan, String mascplan, String descplan) {
        this.codplan = codplan;
        this.mascplan = mascplan;
        this.descplan = descplan;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public String getMascplan() {
        return mascplan;
    }

    public void setMascplan(String mascplan) {
        this.mascplan = mascplan;
    }

    public String getDescplan() {
        return descplan;
    }

    public void setDescplan(String descplan) {
        this.descplan = descplan;
    }

    public Character getTpplan0() {
        return tpplan0;
    }

    public void setTpplan0(Character tpplan0) {
        this.tpplan0 = tpplan0;
    }

    public Character getTpgrupo() {
        return tpgrupo;
    }

    public void setTpgrupo(Character tpgrupo) {
        this.tpgrupo = tpgrupo;
    }

    public Character getAnalsint() {
        return analsint;
    }

    public void setAnalsint(Character analsint) {
        this.analsint = analsint;
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

    public Character getTpregis() {
        return tpregis;
    }

    public void setTpregis(Character tpregis) {
        this.tpregis = tpregis;
    }

    public String getGruplan() {
        return gruplan;
    }

    public void setGruplan(String gruplan) {
        this.gruplan = gruplan;
    }

    public String getSgruplan() {
        return sgruplan;
    }

    public void setSgruplan(String sgruplan) {
        this.sgruplan = sgruplan;
    }

    public String getItemplan() {
        return itemplan;
    }

    public void setItemplan(String itemplan) {
        this.itemplan = itemplan;
    }

    public String getGruponome() {
        return gruponome;
    }

    public void setGruponome(String gruponome) {
        this.gruponome = gruponome;
    }

    public String getSgruponome() {
        return sgruponome;
    }

    public void setSgruponome(String sgruponome) {
        this.sgruponome = sgruponome;
    }

    public Character getHabfrente() {
        return habfrente;
    }

    public void setHabfrente(Character habfrente) {
        this.habfrente = habfrente;
    }

    public Character getClaplano() {
        return claplano;
    }

    public void setClaplano(Character claplano) {
        this.claplano = claplano;
    }

    public String getGruplan1() {
        return gruplan1;
    }

    public void setGruplan1(String gruplan1) {
        this.gruplan1 = gruplan1;
    }

    public String getSgruplan1() {
        return sgruplan1;
    }

    public void setSgruplan1(String sgruplan1) {
        this.sgruplan1 = sgruplan1;
    }

    public String getSgruplan2() {
        return sgruplan2;
    }

    public void setSgruplan2(String sgruplan2) {
        this.sgruplan2 = sgruplan2;
    }

    public String getSgruplan3() {
        return sgruplan3;
    }

    public void setSgruplan3(String sgruplan3) {
        this.sgruplan3 = sgruplan3;
    }

    public Integer getCodplandre() {
        return codplandre;
    }

    public void setCodplandre(Integer codplandre) {
        this.codplandre = codplandre;
    }

    public Double getCotamensal() {
        return cotamensal;
    }

    public void setCotamensal(Double cotamensal) {
        this.cotamensal = cotamensal;
    }

    public String getCorconsul() {
        return corconsul;
    }

    public void setCorconsul(String corconsul) {
        this.corconsul = corconsul;
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
        if (!(object instanceof Tabplacon)) {
            return false;
        }
        Tabplacon other = (Tabplacon) object;
        if ((this.codplan == null && other.codplan != null) || (this.codplan != null && !this.codplan.equals(other.codplan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabplacon[ codplan=" + codplan + " ]";
    }
    
}
