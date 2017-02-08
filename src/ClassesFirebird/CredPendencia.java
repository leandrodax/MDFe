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
public class CredPendencia implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codOnline;
    private int codCompra;
    private Date data;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double face;
    private Double valor;
    private String nsu;
    private String ddd;
    private String fone;
    private String loja;
    private String codOperadora;

    public CredPendencia() {
    }

    public CredPendencia(Integer codOnline) {
        this.codOnline = codOnline;
    }

    public CredPendencia(Integer codOnline, int codCompra) {
        this.codOnline = codOnline;
        this.codCompra = codCompra;
    }

    public Integer getCodOnline() {
        return codOnline;
    }

    public void setCodOnline(Integer codOnline) {
        this.codOnline = codOnline;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getFace() {
        return face;
    }

    public void setFace(Double face) {
        this.face = face;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNsu() {
        return nsu;
    }

    public void setNsu(String nsu) {
        this.nsu = nsu;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(String codOperadora) {
        this.codOperadora = codOperadora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codOnline != null ? codOnline.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredPendencia)) {
            return false;
        }
        CredPendencia other = (CredPendencia) object;
        if ((this.codOnline == null && other.codOnline != null) || (this.codOnline != null && !this.codOnline.equals(other.codOnline))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredPendencia[ codOnline=" + codOnline + " ]";
    }
    
}
