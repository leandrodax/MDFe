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
public class Tabmotdev implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codmot;
    private String codmotivo;
    private String desmotivo;
    private Character acdmotivo;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Tabmotdev() {
    }

    public Tabmotdev(Integer codmot) {
        this.codmot = codmot;
    }

    public Integer getCodmot() {
        return codmot;
    }

    public void setCodmot(Integer codmot) {
        this.codmot = codmot;
    }

    public String getCodmotivo() {
        return codmotivo;
    }

    public void setCodmotivo(String codmotivo) {
        this.codmotivo = codmotivo;
    }

    public String getDesmotivo() {
        return desmotivo;
    }

    public void setDesmotivo(String desmotivo) {
        this.desmotivo = desmotivo;
    }

    public Character getAcdmotivo() {
        return acdmotivo;
    }

    public void setAcdmotivo(Character acdmotivo) {
        this.acdmotivo = acdmotivo;
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

    public Character getRgevento() {
        return rgevento;
    }

    public void setRgevento(Character rgevento) {
        this.rgevento = rgevento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmot != null ? codmot.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabmotdev)) {
            return false;
        }
        Tabmotdev other = (Tabmotdev) object;
        if ((this.codmot == null && other.codmot != null) || (this.codmot != null && !this.codmot.equals(other.codmot))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabmotdev[ codmot=" + codmot + " ]";
    }
    
}
