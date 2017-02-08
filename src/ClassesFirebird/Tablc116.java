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
public class Tablc116 implements Serializable {
    private static final long serialVersionUID = 1L;
    private String codlc116;
    private String nomlc116;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double indnacio;
    private Double indimport;

    public Tablc116() {
    }

    public Tablc116(String codlc116) {
        this.codlc116 = codlc116;
    }

    public String getCodlc116() {
        return codlc116;
    }

    public void setCodlc116(String codlc116) {
        this.codlc116 = codlc116;
    }

    public String getNomlc116() {
        return nomlc116;
    }

    public void setNomlc116(String nomlc116) {
        this.nomlc116 = nomlc116;
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

    public Double getIndnacio() {
        return indnacio;
    }

    public void setIndnacio(Double indnacio) {
        this.indnacio = indnacio;
    }

    public Double getIndimport() {
        return indimport;
    }

    public void setIndimport(Double indimport) {
        this.indimport = indimport;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codlc116 != null ? codlc116.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tablc116)) {
            return false;
        }
        Tablc116 other = (Tablc116) object;
        if ((this.codlc116 == null && other.codlc116 != null) || (this.codlc116 != null && !this.codlc116.equals(other.codlc116))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tablc116[ codlc116=" + codlc116 + " ]";
    }
    
}
