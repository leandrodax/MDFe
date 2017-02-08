/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Tabautor {
    
    private static final long serialVersionUID = 1L;
    private Integer codautor;
    private String nomautor;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private String detalhe;
    private Character bloqautor;
    
    public Tabautor() {
    }

    public Tabautor(Integer codautor) {
        this.codautor = codautor;
    }

    public Integer getCodautor() {
        return codautor;
    }

    public void setCodautor(Integer codautor) {
        this.codautor = codautor;
    }

    public String getNomautor() {
        return nomautor;
    }

    public void setNomautor(String nomautor) {
        this.nomautor = nomautor;
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

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Character getBloqautor() {
        return bloqautor;
    }

    public void setBloqautor(Character bloqautor) {
        this.bloqautor = bloqautor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codautor != null ? codautor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabautor)) {
            return false;
        }
        Tabautor other = (Tabautor) object;
        if ((this.codautor == null && other.codautor != null) || (this.codautor != null && !this.codautor.equals(other.codautor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabautor[ codautor=" + codautor + " ]";
    }
    
}
