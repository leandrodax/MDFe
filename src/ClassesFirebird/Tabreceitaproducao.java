/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vplayer
 */
public class Tabreceitaproducao implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Integer codreceita;
    private String nomreceita;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private Character rgevento;
    
    private Collection<Detreceitaproducao> detreceitaproducaoCollection;

    public Tabreceitaproducao() {
    }

    public Tabreceitaproducao(Integer codreceita) {
        this.codreceita = codreceita;
    }

    public Integer getCodreceita() {
        return codreceita;
    }

    public void setCodreceita(Integer codreceita) {
        this.codreceita = codreceita;
    }

    public String getNomreceita() {
        return nomreceita;
    }

    public void setNomreceita(String nomreceita) {
        this.nomreceita = nomreceita;
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

    @XmlTransient
    public Collection<Detreceitaproducao> getDetreceitaproducaoCollection() {
        return detreceitaproducaoCollection;
    }

    public void setDetreceitaproducaoCollection(Collection<Detreceitaproducao> detreceitaproducaoCollection) {
        this.detreceitaproducaoCollection = detreceitaproducaoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codreceita != null ? codreceita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabreceitaproducao)) {
            return false;
        }
        Tabreceitaproducao other = (Tabreceitaproducao) object;
        if ((this.codreceita == null && other.codreceita != null) || (this.codreceita != null && !this.codreceita.equals(other.codreceita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabreceitaproducao[ codreceita=" + codreceita + " ]";
    }
    
}
