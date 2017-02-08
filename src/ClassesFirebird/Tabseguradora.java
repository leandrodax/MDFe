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
public class Tabseguradora implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Integer codseguradora;
    private String nomseguradora;
    private String cnpj;
    private String nomfantasia;
    private String telefone;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private Character rgevento;

    public Tabseguradora() {
    }

    public Tabseguradora(Integer codseguradora) {
        this.codseguradora = codseguradora;
    }

    public Integer getCodseguradora() {
        return codseguradora;
    }

    public void setCodseguradora(Integer codseguradora) {
        this.codseguradora = codseguradora;
    }

    public String getNomseguradora() {
        return nomseguradora;
    }

    public void setNomseguradora(String nomseguradora) {
        this.nomseguradora = nomseguradora;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomfantasia() {
        return nomfantasia;
    }

    public void setNomfantasia(String nomfantasia) {
        this.nomfantasia = nomfantasia;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
        hash += (codseguradora != null ? codseguradora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabseguradora)) {
            return false;
        }
        Tabseguradora other = (Tabseguradora) object;
        if ((this.codseguradora == null && other.codseguradora != null) || (this.codseguradora != null && !this.codseguradora.equals(other.codseguradora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabseguradora[ codseguradora=" + codseguradora + " ]";
    }
    
}
