/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Nfecnae {
    
    private static final long serialVersionUID = 1L;
    private Integer codcnae;
    private String sigcnae;
    private String sigcaemt;
    private String nomcnae;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Nfecnae() {
    }

    public Nfecnae(Integer codcnae) {
        this.codcnae = codcnae;
    }

    public Integer getCodcnae() {
        return codcnae;
    }

    public void setCodcnae(Integer codcnae) {
        this.codcnae = codcnae;
    }

    public String getSigcnae() {
        return sigcnae;
    }

    public void setSigcnae(String sigcnae) {
        this.sigcnae = sigcnae;
    }

    public String getSigcaemt() {
        return sigcaemt;
    }

    public void setSigcaemt(String sigcaemt) {
        this.sigcaemt = sigcaemt;
    }

    public String getNomcnae() {
        return nomcnae;
    }

    public void setNomcnae(String nomcnae) {
        this.nomcnae = nomcnae;
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
        hash += (codcnae != null ? codcnae.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nfecnae)) {
            return false;
        }
        Nfecnae other = (Nfecnae) object;
        if ((this.codcnae == null && other.codcnae != null) || (this.codcnae != null && !this.codcnae.equals(other.codcnae))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Nfecnae[ codcnae=" + codcnae + " ]";
    }
    
}
