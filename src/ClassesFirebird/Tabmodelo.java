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
public class Tabmodelo implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String codmod;
    private String descmod;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabmodelo() {
    }

    public Tabmodelo(String codmod) {
        this.codmod = codmod;
    }

    public String getCodmod() {
        return codmod;
    }

    public void setCodmod(String codmod) {
        this.codmod = codmod;
    }

    public String getDescmod() {
        return descmod;
    }

    public void setDescmod(String descmod) {
        this.descmod = descmod;
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
        hash += (codmod != null ? codmod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabmodelo)) {
            return false;
        }
        Tabmodelo other = (Tabmodelo) object;
        if ((this.codmod == null && other.codmod != null) || (this.codmod != null && !this.codmod.equals(other.codmod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabmodelo[ codmod=" + codmod + " ]";
    }
    
}
