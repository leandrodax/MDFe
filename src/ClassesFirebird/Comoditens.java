/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;

/**
 *
 * @author vplayer
 */

public class Comoditens implements Serializable {
    private static final long serialVersionUID = 1L;
    protected ComoditensPK comoditensPK;
    private String codpro;
    private String coddig;
    private String descpro;
    private String unidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdcom;
    private Double qtdund;
    private Double vlcusto;
    private Double vlpreco;
    private Double totcusto;
    private Double totpreco;
    private String observ;
    private Double qtddevol;
    private Comodato comodato;

    public Comoditens() {
    }

    public Comoditens(ComoditensPK comoditensPK) {
        this.comoditensPK = comoditensPK;
    }

    public Comoditens(String nrcontr, int nritem) {
        this.comoditensPK = new ComoditensPK(nrcontr, nritem);
    }

    public ComoditensPK getComoditensPK() {
        return comoditensPK;
    }

    public void setComoditensPK(ComoditensPK comoditensPK) {
        this.comoditensPK = comoditensPK;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCoddig() {
        return coddig;
    }

    public void setCoddig(String coddig) {
        this.coddig = coddig;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Double getQtdcom() {
        return qtdcom;
    }

    public void setQtdcom(Double qtdcom) {
        this.qtdcom = qtdcom;
    }

    public Double getQtdund() {
        return qtdund;
    }

    public void setQtdund(Double qtdund) {
        this.qtdund = qtdund;
    }

    public Double getVlcusto() {
        return vlcusto;
    }

    public void setVlcusto(Double vlcusto) {
        this.vlcusto = vlcusto;
    }

    public Double getVlpreco() {
        return vlpreco;
    }

    public void setVlpreco(Double vlpreco) {
        this.vlpreco = vlpreco;
    }

    public Double getTotcusto() {
        return totcusto;
    }

    public void setTotcusto(Double totcusto) {
        this.totcusto = totcusto;
    }

    public Double getTotpreco() {
        return totpreco;
    }

    public void setTotpreco(Double totpreco) {
        this.totpreco = totpreco;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public Double getQtddevol() {
        return qtddevol;
    }

    public void setQtddevol(Double qtddevol) {
        this.qtddevol = qtddevol;
    }

    public Comodato getComodato() {
        return comodato;
    }

    public void setComodato(Comodato comodato) {
        this.comodato = comodato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (comoditensPK != null ? comoditensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comoditens)) {
            return false;
        }
        Comoditens other = (Comoditens) object;
        if ((this.comoditensPK == null && other.comoditensPK != null) || (this.comoditensPK != null && !this.comoditensPK.equals(other.comoditensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Comoditens[ comoditensPK=" + comoditensPK + " ]";
    }
    
}
