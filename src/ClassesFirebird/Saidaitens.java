/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;


public class Saidaitens {
    
    private static final long serialVersionUID = 1L;
    protected SaidaitensPK saidaitensPK;
    private String codpro;
    private String coddig;
    private String descpro;
    private String unidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdemb;
    private Double qtdsai;
    private Double qtdtec;
    private Double qtdbais;
    private Double qtdbait;
    private String observ;
    private String referencia;
    private String modelo;
    private String cor;
    private String tamanho;
    private Date dtvenc;
    private Character contrquant;
    private Character contrrefer;
    private Character contrcomp;
    private Saidaveic saidaveic;

    public Saidaitens() {
    }

    public Saidaitens(SaidaitensPK saidaitensPK) {
        this.saidaitensPK = saidaitensPK;
    }

    public Saidaitens(String nrcontr, int nritem) {
        this.saidaitensPK = new SaidaitensPK(nrcontr, nritem);
    }

    public SaidaitensPK getSaidaitensPK() {
        return saidaitensPK;
    }

    public void setSaidaitensPK(SaidaitensPK saidaitensPK) {
        this.saidaitensPK = saidaitensPK;
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

    public Double getQtdemb() {
        return qtdemb;
    }

    public void setQtdemb(Double qtdemb) {
        this.qtdemb = qtdemb;
    }

    public Double getQtdsai() {
        return qtdsai;
    }

    public void setQtdsai(Double qtdsai) {
        this.qtdsai = qtdsai;
    }

    public Double getQtdtec() {
        return qtdtec;
    }

    public void setQtdtec(Double qtdtec) {
        this.qtdtec = qtdtec;
    }

    public Double getQtdbais() {
        return qtdbais;
    }

    public void setQtdbais(Double qtdbais) {
        this.qtdbais = qtdbais;
    }

    public Double getQtdbait() {
        return qtdbait;
    }

    public void setQtdbait(Double qtdbait) {
        this.qtdbait = qtdbait;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
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

    public Saidaveic getSaidaveic() {
        return saidaveic;
    }

    public void setSaidaveic(Saidaveic saidaveic) {
        this.saidaveic = saidaveic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saidaitensPK != null ? saidaitensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saidaitens)) {
            return false;
        }
        Saidaitens other = (Saidaitens) object;
        if ((this.saidaitensPK == null && other.saidaitensPK != null) || (this.saidaitensPK != null && !this.saidaitensPK.equals(other.saidaitensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Saidaitens[ saidaitensPK=" + saidaitensPK + " ]";
    }
    
}
