/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Natoper {

    private static final long serialVersionUID = 1L;
    private String cfops;
    private String natops;
    private String natope;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private String cfope;
    private String tpcfop;
    private String situacao;
    private String calcaproimp;
    private String substecf;
    private String calcipi;
    private String ipibsicms;

    public Natoper() {
    }

    public Natoper(String cfops) {
        this.cfops = cfops;
    }

    public String getCfops() {
        return cfops;
    }

    public void setCfops(String cfops) {
        this.cfops = cfops;
    }

    public String getNatops() {
        return natops;
    }

    public void setNatops(String natops) {
        this.natops = natops;
    }

    public String getNatope() {
        return natope;
    }

    public void setNatope(String natope) {
        this.natope = natope;
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

    public String getCfope() {
        return cfope;
    }

    public void setCfope(String cfope) {
        this.cfope = cfope;
    }

    public String getTpcfop() {
        return tpcfop;
    }

    public void setTpcfop(String tpcfop) {
        this.tpcfop = tpcfop;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCalcaproimp() {
        return calcaproimp;
    }

    public void setCalcaproimp(String calcaproimp) {
        this.calcaproimp = calcaproimp;
    }

    public String getSubstecf() {
        return substecf;
    }

    public void setSubstecf(String substecf) {
        this.substecf = substecf;
    }

    public String getCalcipi() {
        return calcipi;
    }

    public void setCalcipi(String calcipi) {
        this.calcipi = calcipi;
    }

    public String getIpibsicms() {
        return ipibsicms;
    }

    public void setIpibsicms(String ipibsicms) {
        this.ipibsicms = ipibsicms;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cfops != null ? cfops.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Natoper)) {
            return false;
        }
        Natoper other = (Natoper) object;
        if ((this.cfops == null && other.cfops != null) || (this.cfops != null && !this.cfops.equals(other.cfops))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Natoper[ cfops=" + cfops + " ]";
    }
    
}
