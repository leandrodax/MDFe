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
public class Tabstatusos implements Serializable {
    private static final long serialVersionUID = 1L;
   
   
    private Integer codstatus;
    private String nomstatus;
    private Integer rgcodusu;
    private String rgusuario;
  
    private Date rgdata;
    private Character rgevento;

    public Tabstatusos() {
    }

    public Tabstatusos(Integer codstatus) {
        this.codstatus = codstatus;
    }

    public Integer getCodstatus() {
        return codstatus;
    }

    public void setCodstatus(Integer codstatus) {
        this.codstatus = codstatus;
    }

    public String getNomstatus() {
        return nomstatus;
    }

    public void setNomstatus(String nomstatus) {
        this.nomstatus = nomstatus;
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
        hash += (codstatus != null ? codstatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabstatusos)) {
            return false;
        }
        Tabstatusos other = (Tabstatusos) object;
        if ((this.codstatus == null && other.codstatus != null) || (this.codstatus != null && !this.codstatus.equals(other.codstatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabstatusos[ codstatus=" + codstatus + " ]";
    }
    
}
