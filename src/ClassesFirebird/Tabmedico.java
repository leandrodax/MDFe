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
public class Tabmedico implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer codmed;
    private String nommed;
    private String crmmed;
    private String areamed;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabmedico() {
    }

    public Tabmedico(Integer codmed) {
        this.codmed = codmed;
    }

    public Integer getCodmed() {
        return codmed;
    }

    public void setCodmed(Integer codmed) {
        this.codmed = codmed;
    }

    public String getNommed() {
        return nommed;
    }

    public void setNommed(String nommed) {
        this.nommed = nommed;
    }

    public String getCrmmed() {
        return crmmed;
    }

    public void setCrmmed(String crmmed) {
        this.crmmed = crmmed;
    }

    public String getAreamed() {
        return areamed;
    }

    public void setAreamed(String areamed) {
        this.areamed = areamed;
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
        hash += (codmed != null ? codmed.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabmedico)) {
            return false;
        }
        Tabmedico other = (Tabmedico) object;
        if ((this.codmed == null && other.codmed != null) || (this.codmed != null && !this.codmed.equals(other.codmed))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabmedico[ codmed=" + codmed + " ]";
    }
    
}
