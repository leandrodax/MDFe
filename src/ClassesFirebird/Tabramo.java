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

public class Tabramo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Short codramo;
    private String nomramo;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabramo() {
    }

    public Tabramo(Short codramo) {
        this.codramo = codramo;
    }

    public Short getCodramo() {
        return codramo;
    }

    public void setCodramo(Short codramo) {
        this.codramo = codramo;
    }

    public String getNomramo() {
        return nomramo;
    }

    public void setNomramo(String nomramo) {
        this.nomramo = nomramo;
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
        hash += (codramo != null ? codramo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabramo)) {
            return false;
        }
        Tabramo other = (Tabramo) object;
        if ((this.codramo == null && other.codramo != null) || (this.codramo != null && !this.codramo.equals(other.codramo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabramo[ codramo=" + codramo + " ]";
    }
    
}
