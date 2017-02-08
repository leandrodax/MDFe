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
public class Tabgru implements Serializable {
    private static final long serialVersionUID = 1L;
    private String codgru;
    private String codgrc;
    private String nomgru;
    private Character remcontr;
    private Character medicamento;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    private String portaimp;
    private String cfopd;
    private String cfopf;
    private String cfope;

    public Tabgru() {
    }

    public Tabgru(String codgru) {
        this.codgru = codgru;
    }

    public String getCodgru() {
        return codgru;
    }

    public void setCodgru(String codgru) {
        this.codgru = codgru;
    }

    public String getCodgrc() {
        return codgrc;
    }

    public void setCodgrc(String codgrc) {
        this.codgrc = codgrc;
    }

    public String getNomgru() {
        return nomgru;
    }

    public void setNomgru(String nomgru) {
        this.nomgru = nomgru;
    }

    public Character getRemcontr() {
        return remcontr;
    }

    public void setRemcontr(Character remcontr) {
        this.remcontr = remcontr;
    }

    public Character getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Character medicamento) {
        this.medicamento = medicamento;
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

    public String getPortaimp() {
        return portaimp;
    }

    public void setPortaimp(String portaimp) {
        this.portaimp = portaimp;
    }

    public String getCfopd() {
        return cfopd;
    }

    public void setCfopd(String cfopd) {
        this.cfopd = cfopd;
    }

    public String getCfopf() {
        return cfopf;
    }

    public void setCfopf(String cfopf) {
        this.cfopf = cfopf;
    }

    public String getCfope() {
        return cfope;
    }

    public void setCfope(String cfope) {
        this.cfope = cfope;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codgru != null ? codgru.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabgru)) {
            return false;
        }
        Tabgru other = (Tabgru) object;
        if ((this.codgru == null && other.codgru != null) || (this.codgru != null && !this.codgru.equals(other.codgru))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabgru[ codgru=" + codgru + " ]";
    }
    
}
