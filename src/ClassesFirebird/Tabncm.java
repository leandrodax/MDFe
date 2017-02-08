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
public class Tabncm implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private String codncm;
    private String nomncm;
    private String unincm;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private Character rgevento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double indnacio;
    private Double indimport;

    public Tabncm() {
    }

    public Tabncm(String codncm) {
        this.codncm = codncm;
    }

    public String getCodncm() {
        return codncm;
    }

    public void setCodncm(String codncm) {
        this.codncm = codncm;
    }

    public String getNomncm() {
        return nomncm;
    }

    public void setNomncm(String nomncm) {
        this.nomncm = nomncm;
    }

    public String getUnincm() {
        return unincm;
    }

    public void setUnincm(String unincm) {
        this.unincm = unincm;
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
        hash += (codncm != null ? codncm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabncm)) {
            return false;
        }
        Tabncm other = (Tabncm) object;
        if ((this.codncm == null && other.codncm != null) || (this.codncm != null && !this.codncm.equals(other.codncm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabncm[ codncm=" + codncm + " ]";
    }
    
}
