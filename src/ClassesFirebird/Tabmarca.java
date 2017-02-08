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
public class Tabmarca implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer codmarca;
    private String nommarca;
    private Integer rgcodusu;
    private String rgusuario;
   
    private Date rgdata;
    private Character rgevento;

    public Tabmarca() {
    }

    public Tabmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    public Integer getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    public String getNommarca() {
        return nommarca;
    }

    public void setNommarca(String nommarca) {
        this.nommarca = nommarca;
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
        hash += (codmarca != null ? codmarca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabmarca)) {
            return false;
        }
        Tabmarca other = (Tabmarca) object;
        if ((this.codmarca == null && other.codmarca != null) || (this.codmarca != null && !this.codmarca.equals(other.codmarca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabmarca[ codmarca=" + codmarca + " ]";
    }
    
}
