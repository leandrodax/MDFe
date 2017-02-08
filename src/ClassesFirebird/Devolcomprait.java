/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

/**
 *
 * @author vplayer
 */
public class Devolcomprait {
    private static final long serialVersionUID = 1L;
    protected DevolcompraitPK devolcompraitPK;
    private String codpro;
    private String coddig;
    private String descpro;
    private String unidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdcom;
    private Double vlunit;
    private Double percdesc;
    private Double vldesc;
    private Double vltotal;
    private Double alicms;
    private Double vlicms;
    private Character contrquant;
    private Character contrrefer;
    private Character contrcomp;
    private Double vldesccab;
    private String referencia;
    private String modelo;
    private String cor;
    private String tamanho;
    private Date dtvenc;
    private Devolcompra devolcompra;

    public Devolcomprait() {
    }

    public Devolcomprait(DevolcompraitPK devolcompraitPK) {
        this.devolcompraitPK = devolcompraitPK;
    }

    public Devolcomprait(String nrdevol, int nritem) {
        this.devolcompraitPK = new DevolcompraitPK(nrdevol, nritem);
    }

    public DevolcompraitPK getDevolcompraitPK() {
        return devolcompraitPK;
    }

    public void setDevolcompraitPK(DevolcompraitPK devolcompraitPK) {
        this.devolcompraitPK = devolcompraitPK;
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

    public Double getVlunit() {
        return vlunit;
    }

    public void setVlunit(Double vlunit) {
        this.vlunit = vlunit;
    }

    public Double getPercdesc() {
        return percdesc;
    }

    public void setPercdesc(Double percdesc) {
        this.percdesc = percdesc;
    }

    public Double getVldesc() {
        return vldesc;
    }

    public void setVldesc(Double vldesc) {
        this.vldesc = vldesc;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
    }

    public Double getAlicms() {
        return alicms;
    }

    public void setAlicms(Double alicms) {
        this.alicms = alicms;
    }

    public Double getVlicms() {
        return vlicms;
    }

    public void setVlicms(Double vlicms) {
        this.vlicms = vlicms;
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

    public Double getVldesccab() {
        return vldesccab;
    }

    public void setVldesccab(Double vldesccab) {
        this.vldesccab = vldesccab;
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

    public Devolcompra getDevolcompra() {
        return devolcompra;
    }

    public void setDevolcompra(Devolcompra devolcompra) {
        this.devolcompra = devolcompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devolcompraitPK != null ? devolcompraitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolcomprait)) {
            return false;
        }
        Devolcomprait other = (Devolcomprait) object;
        if ((this.devolcompraitPK == null && other.devolcompraitPK != null) || (this.devolcompraitPK != null && !this.devolcompraitPK.equals(other.devolcompraitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Devolcomprait[ devolcompraitPK=" + devolcompraitPK + " ]";
    }
    
}
