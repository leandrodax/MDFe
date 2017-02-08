/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Tabcobr {
    
    private static final long serialVersionUID = 1L;
    private Short codcobr;
    private String nomcobr;
    private String endcobr;
    private String cidcobr;
    private String bairro;
    private String cpfcobr;
    private String rgcobr;
    private String telcobr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percomis;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;

    public Tabcobr() {
    }

    public Tabcobr(Short codcobr) {
        this.codcobr = codcobr;
    }

    public Short getCodcobr() {
        return codcobr;
    }

    public void setCodcobr(Short codcobr) {
        this.codcobr = codcobr;
    }

    public String getNomcobr() {
        return nomcobr;
    }

    public void setNomcobr(String nomcobr) {
        this.nomcobr = nomcobr;
    }

    public String getEndcobr() {
        return endcobr;
    }

    public void setEndcobr(String endcobr) {
        this.endcobr = endcobr;
    }

    public String getCidcobr() {
        return cidcobr;
    }

    public void setCidcobr(String cidcobr) {
        this.cidcobr = cidcobr;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpfcobr() {
        return cpfcobr;
    }

    public void setCpfcobr(String cpfcobr) {
        this.cpfcobr = cpfcobr;
    }

    public String getRgcobr() {
        return rgcobr;
    }

    public void setRgcobr(String rgcobr) {
        this.rgcobr = rgcobr;
    }

    public String getTelcobr() {
        return telcobr;
    }

    public void setTelcobr(String telcobr) {
        this.telcobr = telcobr;
    }

    public Double getPercomis() {
        return percomis;
    }

    public void setPercomis(Double percomis) {
        this.percomis = percomis;
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
        hash += (codcobr != null ? codcobr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcobr)) {
            return false;
        }
        Tabcobr other = (Tabcobr) object;
        if ((this.codcobr == null && other.codcobr != null) || (this.codcobr != null && !this.codcobr.equals(other.codcobr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcobr[ codcobr=" + codcobr + " ]";
    }
    
}
