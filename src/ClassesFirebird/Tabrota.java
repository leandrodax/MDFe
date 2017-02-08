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
public class Tabrota implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Short codrota;
    private String nomrota;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabrota() {
    }

    public Tabrota(Short codrota) {
        this.codrota = codrota;
    }

    public Short getCodrota() {
        return codrota;
    }

    public void setCodrota(Short codrota) {
        this.codrota = codrota;
    }

    public String getNomrota() {
        return nomrota;
    }

    public void setNomrota(String nomrota) {
        this.nomrota = nomrota;
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
        hash += (codrota != null ? codrota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabrota)) {
            return false;
        }
        Tabrota other = (Tabrota) object;
        if ((this.codrota == null && other.codrota != null) || (this.codrota != null && !this.codrota.equals(other.codrota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabrota[ codrota=" + codrota + " ]";
    }
    
}
