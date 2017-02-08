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

public class Tabrec implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Short codrec;
    private String nomrec;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;

    public Tabrec() {
    }

    public Tabrec(Short codrec) {
        this.codrec = codrec;
    }

    public Short getCodrec() {
        return codrec;
    }

    public void setCodrec(Short codrec) {
        this.codrec = codrec;
    }

    public String getNomrec() {
        return nomrec;
    }

    public void setNomrec(String nomrec) {
        this.nomrec = nomrec;
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
        hash += (codrec != null ? codrec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabrec)) {
            return false;
        }
        Tabrec other = (Tabrec) object;
        if ((this.codrec == null && other.codrec != null) || (this.codrec != null && !this.codrec.equals(other.codrec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabrec[ codrec=" + codrec + " ]";
    }
    
}
