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

public class Tabforma {
    private static final long serialVersionUID = 1L;
    private Integer codforma;
    private String nomforma;
    private Character tpforma;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percentual;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private Integer codcartao;
    private String tpag;
    private Collection<Tabfpagfil> tabfpagfilCollection;

    public Tabforma() {
    }

    public Tabforma(Integer codforma) {
        this.codforma = codforma;
    }

    public Integer getCodforma() {
        return codforma;
    }

    public void setCodforma(Integer codforma) {
        this.codforma = codforma;
    }

    public String getNomforma() {
        return nomforma;
    }

    public void setNomforma(String nomforma) {
        this.nomforma = nomforma;
    }

    public Character getTpforma() {
        return tpforma;
    }

    public void setTpforma(Character tpforma) {
        this.tpforma = tpforma;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
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

    public Integer getCodcartao() {
        return codcartao;
    }

    public void setCodcartao(Integer codcartao) {
        this.codcartao = codcartao;
    }

    public String getTpag() {
        return tpag;
    }

    public void setTpag(String tpag) {
        this.tpag = tpag;
    }

    @XmlTransient
    public Collection<Tabfpagfil> getTabfpagfilCollection() {
        return tabfpagfilCollection;
    }

    public void setTabfpagfilCollection(Collection<Tabfpagfil> tabfpagfilCollection) {
        this.tabfpagfilCollection = tabfpagfilCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codforma != null ? codforma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabforma)) {
            return false;
        }
        Tabforma other = (Tabforma) object;
        if ((this.codforma == null && other.codforma != null) || (this.codforma != null && !this.codforma.equals(other.codforma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabforma[ codforma=" + codforma + " ]";
    }
    
}
