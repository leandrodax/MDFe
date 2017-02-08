/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Tabcolecao {
    
    private static final long serialVersionUID = 1L;
    private Integer codcolecao;
    private String nomcolecao;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;

    public Tabcolecao() {
    }

    public Tabcolecao(Integer codcolecao) {
        this.codcolecao = codcolecao;
    }

    public Integer getCodcolecao() {
        return codcolecao;
    }

    public void setCodcolecao(Integer codcolecao) {
        this.codcolecao = codcolecao;
    }

    public String getNomcolecao() {
        return nomcolecao;
    }

    public void setNomcolecao(String nomcolecao) {
        this.nomcolecao = nomcolecao;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcolecao != null ? codcolecao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcolecao)) {
            return false;
        }
        Tabcolecao other = (Tabcolecao) object;
        if ((this.codcolecao == null && other.codcolecao != null) || (this.codcolecao != null && !this.codcolecao.equals(other.codcolecao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcolecao[ codcolecao=" + codcolecao + " ]";
    }
    
}
