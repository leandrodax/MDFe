/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Tabcheqrdev {
    
    private static final long serialVersionUID = 1L;
    private Integer codrdev;
    private Integer codmot;
    private String obsdev;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    private Integer codchqr;

    public Tabcheqrdev() {
    }

    public Tabcheqrdev(Integer codrdev) {
        this.codrdev = codrdev;
    }

    public Integer getCodrdev() {
        return codrdev;
    }

    public void setCodrdev(Integer codrdev) {
        this.codrdev = codrdev;
    }

    public Integer getCodmot() {
        return codmot;
    }

    public void setCodmot(Integer codmot) {
        this.codmot = codmot;
    }

    public String getObsdev() {
        return obsdev;
    }

    public void setObsdev(String obsdev) {
        this.obsdev = obsdev;
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

    public Integer getCodchqr() {
        return codchqr;
    }

    public void setCodchqr(Integer codchqr) {
        this.codchqr = codchqr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codrdev != null ? codrdev.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcheqrdev)) {
            return false;
        }
        Tabcheqrdev other = (Tabcheqrdev) object;
        if ((this.codrdev == null && other.codrdev != null) || (this.codrdev != null && !this.codrdev.equals(other.codrdev))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcheqrdev[ codrdev=" + codrdev + " ]";
    }
    
}
