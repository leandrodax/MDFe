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
public class Tabsecao implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Integer codsecao;
    private String nomsecao;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private Character rgevento;

    public Tabsecao() {
    }

    public Tabsecao(Integer codsecao) {
        this.codsecao = codsecao;
    }

    public Integer getCodsecao() {
        return codsecao;
    }

    public void setCodsecao(Integer codsecao) {
        this.codsecao = codsecao;
    }

    public String getNomsecao() {
        return nomsecao;
    }

    public void setNomsecao(String nomsecao) {
        this.nomsecao = nomsecao;
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
        hash += (codsecao != null ? codsecao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabsecao)) {
            return false;
        }
        Tabsecao other = (Tabsecao) object;
        if ((this.codsecao == null && other.codsecao != null) || (this.codsecao != null && !this.codsecao.equals(other.codsecao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabsecao[ codsecao=" + codsecao + " ]";
    }
    
}
