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
public class Tabserv implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Integer codserv;
    private String nomserv;
    private String indice;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
 
    private Collection<Tabservfil> tabservfilCollection;

    public Tabserv() {
    }

    public Tabserv(Integer codserv) {
        this.codserv = codserv;
    }

    public Integer getCodserv() {
        return codserv;
    }

    public void setCodserv(Integer codserv) {
        this.codserv = codserv;
    }

    public String getNomserv() {
        return nomserv;
    }

    public void setNomserv(String nomserv) {
        this.nomserv = nomserv;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
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
    public Collection<Tabservfil> getTabservfilCollection() {
        return tabservfilCollection;
    }

    public void setTabservfilCollection(Collection<Tabservfil> tabservfilCollection) {
        this.tabservfilCollection = tabservfilCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codserv != null ? codserv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabserv)) {
            return false;
        }
        Tabserv other = (Tabserv) object;
        if ((this.codserv == null && other.codserv != null) || (this.codserv != null && !this.codserv.equals(other.codserv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabserv[ codserv=" + codserv + " ]";
    }
    
}
