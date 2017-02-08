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
public class Transfestitens implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TransfestitensPK transfestitensPK;
    private String codpro;
    private String coddig;
    private String descpro;
    private String unidade;
    private String referencia;
    private String modelo;
    private String cor;
    private String tamanho;
    
    private Date dtvenc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdtra;
    private Double qtdund;
    private Double vlcusto;
    private Double vlpreco;
    private Double totcusto;
    private Double totpreco;
    private Character contrquant;
    private Character contrrefer;
    private Character contrcomp;

    private Transfest transfest;

    public Transfestitens() {
    }

    public Transfestitens(TransfestitensPK transfestitensPK) {
        this.transfestitensPK = transfestitensPK;
    }

    public Transfestitens(String nrcontr, int nritem) {
        this.transfestitensPK = new TransfestitensPK(nrcontr, nritem);
    }

    public TransfestitensPK getTransfestitensPK() {
        return transfestitensPK;
    }

    public void setTransfestitensPK(TransfestitensPK transfestitensPK) {
        this.transfestitensPK = transfestitensPK;
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

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Date getDtvenc() {
        return dtvenc;
    }

    public void setDtvenc(Date dtvenc) {
        this.dtvenc = dtvenc;
    }

    public Double getQtdtra() {
        return qtdtra;
    }

    public void setQtdtra(Double qtdtra) {
        this.qtdtra = qtdtra;
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

    public Character getContrquant() {
        return contrquant;
    }

    public void setContrquant(Character contrquant) {
        this.contrquant = contrquant;
    }

    public Character getContrrefer() {
        return contrrefer;
    }

    public void setContrrefer(Character contrrefer) {
        this.contrrefer = contrrefer;
    }

    public Character getContrcomp() {
        return contrcomp;
    }

    public void setContrcomp(Character contrcomp) {
        this.contrcomp = contrcomp;
    }

    public Transfest getTransfest() {
        return transfest;
    }

    public void setTransfest(Transfest transfest) {
        this.transfest = transfest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transfestitensPK != null ? transfestitensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transfestitens)) {
            return false;
        }
        Transfestitens other = (Transfestitens) object;
        if ((this.transfestitensPK == null && other.transfestitensPK != null) || (this.transfestitensPK != null && !this.transfestitensPK.equals(other.transfestitensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Transfestitens[ transfestitensPK=" + transfestitensPK + " ]";
    }
    
}
