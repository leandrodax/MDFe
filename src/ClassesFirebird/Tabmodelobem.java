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
public class Tabmodelobem implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Integer codmodelo;
    private String nommodelo;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private Character rgevento;
    private Integer codmarca;

    public Tabmodelobem() {
    }

    public Tabmodelobem(Integer codmodelo) {
        this.codmodelo = codmodelo;
    }

    public Integer getCodmodelo() {
        return codmodelo;
    }

    public void setCodmodelo(Integer codmodelo) {
        this.codmodelo = codmodelo;
    }

    public String getNommodelo() {
        return nommodelo;
    }

    public void setNommodelo(String nommodelo) {
        this.nommodelo = nommodelo;
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

    public Integer getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmodelo != null ? codmodelo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabmodelobem)) {
            return false;
        }
        Tabmodelobem other = (Tabmodelobem) object;
        if ((this.codmodelo == null && other.codmodelo != null) || (this.codmodelo != null && !this.codmodelo.equals(other.codmodelo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabmodelobem[ codmodelo=" + codmodelo + " ]";
    }
    
}
