/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Tabcaixa {
    private static final long serialVersionUID = 1L;
    
    private Short codcaixa;
    private String nomcaixa;
    private String dircaixa;
    private String stultenvio;
    private Date dtatualiz;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private String status;
    private String estoque;

    public Tabcaixa() {
    }

    public Tabcaixa(Short codcaixa) {
        this.codcaixa = codcaixa;
    }

    public Short getCodcaixa() {
        return codcaixa;
    }

    public void setCodcaixa(Short codcaixa) {
        this.codcaixa = codcaixa;
    }

    public String getNomcaixa() {
        return nomcaixa;
    }

    public void setNomcaixa(String nomcaixa) {
        this.nomcaixa = nomcaixa;
    }

    public String getDircaixa() {
        return dircaixa;
    }

    public void setDircaixa(String dircaixa) {
        this.dircaixa = dircaixa;
    }

    public String getStultenvio() {
        return stultenvio;
    }

    public void setStultenvio(String stultenvio) {
        this.stultenvio = stultenvio;
    }

    public Date getDtatualiz() {
        return dtatualiz;
    }

    public void setDtatualiz(Date dtatualiz) {
        this.dtatualiz = dtatualiz;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcaixa != null ? codcaixa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcaixa)) {
            return false;
        }
        Tabcaixa other = (Tabcaixa) object;
        if ((this.codcaixa == null && other.codcaixa != null) || (this.codcaixa != null && !this.codcaixa.equals(other.codcaixa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcaixa[ codcaixa=" + codcaixa + " ]";
    }
    
}
