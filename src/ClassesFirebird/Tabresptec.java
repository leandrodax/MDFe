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
public class Tabresptec implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Integer codtec;
    private String nomtec;
    private String cpftec;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabresptec() {
    }

    public Tabresptec(Integer codtec) {
        this.codtec = codtec;
    }

    public Integer getCodtec() {
        return codtec;
    }

    public void setCodtec(Integer codtec) {
        this.codtec = codtec;
    }

    public String getNomtec() {
        return nomtec;
    }

    public void setNomtec(String nomtec) {
        this.nomtec = nomtec;
    }

    public String getCpftec() {
        return cpftec;
    }

    public void setCpftec(String cpftec) {
        this.cpftec = cpftec;
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
        hash += (codtec != null ? codtec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabresptec)) {
            return false;
        }
        Tabresptec other = (Tabresptec) object;
        if ((this.codtec == null && other.codtec != null) || (this.codtec != null && !this.codtec.equals(other.codtec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabresptec[ codtec=" + codtec + " ]";
    }
    
}
