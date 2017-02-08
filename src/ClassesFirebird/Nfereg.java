/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Nfereg {
    private static final long serialVersionUID = 1L;
    private Integer codreg;
    private String sigreg;
    private String nomreg;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Nfereg() {
    }

    public Nfereg(Integer codreg) {
        this.codreg = codreg;
    }

    public Integer getCodreg() {
        return codreg;
    }

    public void setCodreg(Integer codreg) {
        this.codreg = codreg;
    }

    public String getSigreg() {
        return sigreg;
    }

    public void setSigreg(String sigreg) {
        this.sigreg = sigreg;
    }

    public String getNomreg() {
        return nomreg;
    }

    public void setNomreg(String nomreg) {
        this.nomreg = nomreg;
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
        hash += (codreg != null ? codreg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nfereg)) {
            return false;
        }
        Nfereg other = (Nfereg) object;
        if ((this.codreg == null && other.codreg != null) || (this.codreg != null && !this.codreg.equals(other.codreg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Nfereg[ codreg=" + codreg + " ]";
    }
    
}
