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

public class Tabsis implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer codsis;
    private String nomsis;
    private String pasta;
    private Integer rgcodusu;
    private String rgusuario;
   
    private Date rgdata;
    private String rgevento;

    public Tabsis() {
    }

    public Tabsis(Integer codsis) {
        this.codsis = codsis;
    }

    public Integer getCodsis() {
        return codsis;
    }

    public void setCodsis(Integer codsis) {
        this.codsis = codsis;
    }

    public String getNomsis() {
        return nomsis;
    }

    public void setNomsis(String nomsis) {
        this.nomsis = nomsis;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
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
        hash += (codsis != null ? codsis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabsis)) {
            return false;
        }
        Tabsis other = (Tabsis) object;
        if ((this.codsis == null && other.codsis != null) || (this.codsis != null && !this.codsis.equals(other.codsis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabsis[ codsis=" + codsis + " ]";
    }
    
}
