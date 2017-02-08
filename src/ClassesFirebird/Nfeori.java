/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Nfeori {

    private static final long serialVersionUID = 1L;
    private Integer codori;
    private String sigori;
    private String nomori;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Nfeori() {
    }

    public Nfeori(Integer codori) {
        this.codori = codori;
    }

    public Integer getCodori() {
        return codori;
    }

    public void setCodori(Integer codori) {
        this.codori = codori;
    }

    public String getSigori() {
        return sigori;
    }

    public void setSigori(String sigori) {
        this.sigori = sigori;
    }

    public String getNomori() {
        return nomori;
    }

    public void setNomori(String nomori) {
        this.nomori = nomori;
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
        hash += (codori != null ? codori.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nfeori)) {
            return false;
        }
        Nfeori other = (Nfeori) object;
        if ((this.codori == null && other.codori != null) || (this.codori != null && !this.codori.equals(other.codori))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Nfeori[ codori=" + codori + " ]";
    }
    
}
