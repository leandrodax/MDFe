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

public class Tabrede implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Short codrede;
    private String nomrede;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabrede() {
    }

    public Tabrede(Short codrede) {
        this.codrede = codrede;
    }

    public Short getCodrede() {
        return codrede;
    }

    public void setCodrede(Short codrede) {
        this.codrede = codrede;
    }

    public String getNomrede() {
        return nomrede;
    }

    public void setNomrede(String nomrede) {
        this.nomrede = nomrede;
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
        hash += (codrede != null ? codrede.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabrede)) {
            return false;
        }
        Tabrede other = (Tabrede) object;
        if ((this.codrede == null && other.codrede != null) || (this.codrede != null && !this.codrede.equals(other.codrede))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabrede[ codrede=" + codrede + " ]";
    }
    
}
