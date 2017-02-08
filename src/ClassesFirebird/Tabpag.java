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
public class Tabpag implements Serializable {
    private static final long serialVersionUID = 1L;
     private Short codpag;
    private String nompag;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;

    public Tabpag() {
    }

    public Tabpag(Short codpag) {
        this.codpag = codpag;
    }

    public Short getCodpag() {
        return codpag;
    }

    public void setCodpag(Short codpag) {
        this.codpag = codpag;
    }

    public String getNompag() {
        return nompag;
    }

    public void setNompag(String nompag) {
        this.nompag = nompag;
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
        hash += (codpag != null ? codpag.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabpag)) {
            return false;
        }
        Tabpag other = (Tabpag) object;
        if ((this.codpag == null && other.codpag != null) || (this.codpag != null && !this.codpag.equals(other.codpag))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabpag[ codpag=" + codpag + " ]";
    }
    
}
