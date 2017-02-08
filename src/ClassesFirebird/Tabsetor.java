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
public class Tabsetor implements Serializable {
    private static final long serialVersionUID = 1L;
    private Short codsetor;
    private String nomsetor;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;

    public Tabsetor() {
    }

    public Tabsetor(Short codsetor) {
        this.codsetor = codsetor;
    }

    public Short getCodsetor() {
        return codsetor;
    }

    public void setCodsetor(Short codsetor) {
        this.codsetor = codsetor;
    }

    public String getNomsetor() {
        return nomsetor;
    }

    public void setNomsetor(String nomsetor) {
        this.nomsetor = nomsetor;
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
        hash += (codsetor != null ? codsetor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabsetor)) {
            return false;
        }
        Tabsetor other = (Tabsetor) object;
        if ((this.codsetor == null && other.codsetor != null) || (this.codsetor != null && !this.codsetor.equals(other.codsetor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabsetor[ codsetor=" + codsetor + " ]";
    }
    
}
