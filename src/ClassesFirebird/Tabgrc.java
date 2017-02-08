/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;


public class Tabgrc {
    
    private static final long serialVersionUID = 1L;
    private String codgrc;
    private String nomgrc;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private Integer codsecao;

    public Tabgrc() {
    }

    public Tabgrc(String codgrc) {
        this.codgrc = codgrc;
    }

    public String getCodgrc() {
        return codgrc;
    }

    public void setCodgrc(String codgrc) {
        this.codgrc = codgrc;
    }

    public String getNomgrc() {
        return nomgrc;
    }

    public void setNomgrc(String nomgrc) {
        this.nomgrc = nomgrc;
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

    public Integer getCodsecao() {
        return codsecao;
    }

    public void setCodsecao(Integer codsecao) {
        this.codsecao = codsecao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codgrc != null ? codgrc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabgrc)) {
            return false;
        }
        Tabgrc other = (Tabgrc) object;
        if ((this.codgrc == null && other.codgrc != null) || (this.codgrc != null && !this.codgrc.equals(other.codgrc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabgrc[ codgrc=" + codgrc + " ]";
    }
    
}
