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
public class Tabinfnfe implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer codinfnfe;
    private String descinfnfe;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabinfnfe() {
    }

    public Tabinfnfe(Integer codinfnfe) {
        this.codinfnfe = codinfnfe;
    }

    public Integer getCodinfnfe() {
        return codinfnfe;
    }

    public void setCodinfnfe(Integer codinfnfe) {
        this.codinfnfe = codinfnfe;
    }

    public String getDescinfnfe() {
        return descinfnfe;
    }

    public void setDescinfnfe(String descinfnfe) {
        this.descinfnfe = descinfnfe;
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
        hash += (codinfnfe != null ? codinfnfe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabinfnfe)) {
            return false;
        }
        Tabinfnfe other = (Tabinfnfe) object;
        if ((this.codinfnfe == null && other.codinfnfe != null) || (this.codinfnfe != null && !this.codinfnfe.equals(other.codinfnfe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabinfnfe[ codinfnfe=" + codinfnfe + " ]";
    }
    
}
