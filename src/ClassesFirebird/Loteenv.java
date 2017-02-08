/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Loteenv {
    private static final long serialVersionUID = 1L;
    private String nrlote;
    private Date dtemis;
    private Integer qtdinc;
    private Integer qtdalt;
    private Integer qtdexc;
    private Integer qtdpag;
    private int codusu;
    private String nomusu;

    public Loteenv() {
    }

    public Loteenv(String nrlote) {
        this.nrlote = nrlote;
    }

    public Loteenv(String nrlote, int codusu) {
        this.nrlote = nrlote;
        this.codusu = codusu;
    }

    public String getNrlote() {
        return nrlote;
    }

    public void setNrlote(String nrlote) {
        this.nrlote = nrlote;
    }

    public Date getDtemis() {
        return dtemis;
    }

    public void setDtemis(Date dtemis) {
        this.dtemis = dtemis;
    }

    public Integer getQtdinc() {
        return qtdinc;
    }

    public void setQtdinc(Integer qtdinc) {
        this.qtdinc = qtdinc;
    }

    public Integer getQtdalt() {
        return qtdalt;
    }

    public void setQtdalt(Integer qtdalt) {
        this.qtdalt = qtdalt;
    }

    public Integer getQtdexc() {
        return qtdexc;
    }

    public void setQtdexc(Integer qtdexc) {
        this.qtdexc = qtdexc;
    }

    public Integer getQtdpag() {
        return qtdpag;
    }

    public void setQtdpag(Integer qtdpag) {
        this.qtdpag = qtdpag;
    }

    public int getCodusu() {
        return codusu;
    }

    public void setCodusu(int codusu) {
        this.codusu = codusu;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrlote != null ? nrlote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loteenv)) {
            return false;
        }
        Loteenv other = (Loteenv) object;
        if ((this.nrlote == null && other.nrlote != null) || (this.nrlote != null && !this.nrlote.equals(other.nrlote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Loteenv[ nrlote=" + nrlote + " ]";
    }
    
}
