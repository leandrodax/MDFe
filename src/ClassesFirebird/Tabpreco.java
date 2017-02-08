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
public class Tabpreco implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer codpreco;
    private String nompreco;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    
    private Collection<Tabpreitem> tabpreitemCollection;

    public Tabpreco() {
    }

    public Tabpreco(Integer codpreco) {
        this.codpreco = codpreco;
    }

    public Integer getCodpreco() {
        return codpreco;
    }

    public void setCodpreco(Integer codpreco) {
        this.codpreco = codpreco;
    }

    public String getNompreco() {
        return nompreco;
    }

    public void setNompreco(String nompreco) {
        this.nompreco = nompreco;
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

    @XmlTransient
    public Collection<Tabpreitem> getTabpreitemCollection() {
        return tabpreitemCollection;
    }

    public void setTabpreitemCollection(Collection<Tabpreitem> tabpreitemCollection) {
        this.tabpreitemCollection = tabpreitemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpreco != null ? codpreco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabpreco)) {
            return false;
        }
        Tabpreco other = (Tabpreco) object;
        if ((this.codpreco == null && other.codpreco != null) || (this.codpreco != null && !this.codpreco.equals(other.codpreco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabpreco[ codpreco=" + codpreco + " ]";
    }
    
}
