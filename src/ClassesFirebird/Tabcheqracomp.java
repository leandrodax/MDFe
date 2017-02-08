/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Tabcheqracomp {
    
    private static final long serialVersionUID = 1L;
    private Integer codacomp;
    private Integer codchqr;
    private Date datacomp;
    private String horacomp;
    private String conacomp;
    private String obsacomp;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Tabcheqracomp() {
    }

    public Tabcheqracomp(Integer codacomp) {
        this.codacomp = codacomp;
    }

    public Integer getCodacomp() {
        return codacomp;
    }

    public void setCodacomp(Integer codacomp) {
        this.codacomp = codacomp;
    }

    public Integer getCodchqr() {
        return codchqr;
    }

    public void setCodchqr(Integer codchqr) {
        this.codchqr = codchqr;
    }

    public Date getDatacomp() {
        return datacomp;
    }

    public void setDatacomp(Date datacomp) {
        this.datacomp = datacomp;
    }

    public String getHoracomp() {
        return horacomp;
    }

    public void setHoracomp(String horacomp) {
        this.horacomp = horacomp;
    }

    public String getConacomp() {
        return conacomp;
    }

    public void setConacomp(String conacomp) {
        this.conacomp = conacomp;
    }

    public String getObsacomp() {
        return obsacomp;
    }

    public void setObsacomp(String obsacomp) {
        this.obsacomp = obsacomp;
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
        hash += (codacomp != null ? codacomp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcheqracomp)) {
            return false;
        }
        Tabcheqracomp other = (Tabcheqracomp) object;
        if ((this.codacomp == null && other.codacomp != null) || (this.codacomp != null && !this.codacomp.equals(other.codacomp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcheqracomp[ codacomp=" + codacomp + " ]";
    }
    
}
