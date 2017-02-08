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
public class Tabplaven implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer codplve;
    
    private String descplv;
    private Integer codplan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlentrada;
    private Integer nrprestac;
    private Double vlprestac;
    private Double vltotpres;
    private Integer nrdiascarade;
    private Integer nrdiascarpag;
    private Double percvalman;
    private Integer nrmaxdep;
    private String obsplano;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabplaven() {
    }

    public Tabplaven(Integer codplve) {
        this.codplve = codplve;
    }

    public Tabplaven(Integer codplve, String descplv) {
        this.codplve = codplve;
        this.descplv = descplv;
    }

    public Integer getCodplve() {
        return codplve;
    }

    public void setCodplve(Integer codplve) {
        this.codplve = codplve;
    }

    public String getDescplv() {
        return descplv;
    }

    public void setDescplv(String descplv) {
        this.descplv = descplv;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public Double getVlentrada() {
        return vlentrada;
    }

    public void setVlentrada(Double vlentrada) {
        this.vlentrada = vlentrada;
    }

    public Integer getNrprestac() {
        return nrprestac;
    }

    public void setNrprestac(Integer nrprestac) {
        this.nrprestac = nrprestac;
    }

    public Double getVlprestac() {
        return vlprestac;
    }

    public void setVlprestac(Double vlprestac) {
        this.vlprestac = vlprestac;
    }

    public Double getVltotpres() {
        return vltotpres;
    }

    public void setVltotpres(Double vltotpres) {
        this.vltotpres = vltotpres;
    }

    public Integer getNrdiascarade() {
        return nrdiascarade;
    }

    public void setNrdiascarade(Integer nrdiascarade) {
        this.nrdiascarade = nrdiascarade;
    }

    public Integer getNrdiascarpag() {
        return nrdiascarpag;
    }

    public void setNrdiascarpag(Integer nrdiascarpag) {
        this.nrdiascarpag = nrdiascarpag;
    }

    public Double getPercvalman() {
        return percvalman;
    }

    public void setPercvalman(Double percvalman) {
        this.percvalman = percvalman;
    }

    public Integer getNrmaxdep() {
        return nrmaxdep;
    }

    public void setNrmaxdep(Integer nrmaxdep) {
        this.nrmaxdep = nrmaxdep;
    }

    public String getObsplano() {
        return obsplano;
    }

    public void setObsplano(String obsplano) {
        this.obsplano = obsplano;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codplve != null ? codplve.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabplaven)) {
            return false;
        }
        Tabplaven other = (Tabplaven) object;
        if ((this.codplve == null && other.codplve != null) || (this.codplve != null && !this.codplve.equals(other.codplve))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabplaven[ codplve=" + codplve + " ]";
    }
    
}
