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
public class Devolvendait {
    private static final long serialVersionUID = 1L;
    protected DevolvendaitPK devolvendaitPK;
    private String codpro;
    private String codvas;
    private String coddig;
    private String descpro;
    private String unidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdvend;
    private Double vlunit;
    private Character tpdesacrnot;
    private Double vldesacrnot;
    private Character tpdesacrite;
    private Double vldesacrite;
    private String indice;
    private Double alicms;
    private Double vlicms;
    private Double vlcusto;
    private Double vltotal;
    private Double qtdund;
    private Double vlund;
    private String referencia;
    private String modelo;
    private String cor;
    private String tamanho;
    private Date dtvenc;
    private Character contrquant;
    private Character contrrefer;
    private Character contrcomp;
    private String unemb;
    private Double qtdemb;
    private String ununit;
    private String tpitem;
    private Devolvenda devolvenda;

    public Devolvendait() {
    }

    public Devolvendait(DevolvendaitPK devolvendaitPK) {
        this.devolvendaitPK = devolvendaitPK;
    }

    public Devolvendait(int nritem, String nrdevol) {
        this.devolvendaitPK = new DevolvendaitPK(nritem, nrdevol);
    }

    public DevolvendaitPK getDevolvendaitPK() {
        return devolvendaitPK;
    }

    public void setDevolvendaitPK(DevolvendaitPK devolvendaitPK) {
        this.devolvendaitPK = devolvendaitPK;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCodvas() {
        return codvas;
    }

    public void setCodvas(String codvas) {
        this.codvas = codvas;
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

    public Double getQtdvend() {
        return qtdvend;
    }

    public void setQtdvend(Double qtdvend) {
        this.qtdvend = qtdvend;
    }

    public Double getVlunit() {
        return vlunit;
    }

    public void setVlunit(Double vlunit) {
        this.vlunit = vlunit;
    }

    public Character getTpdesacrnot() {
        return tpdesacrnot;
    }

    public void setTpdesacrnot(Character tpdesacrnot) {
        this.tpdesacrnot = tpdesacrnot;
    }

    public Double getVldesacrnot() {
        return vldesacrnot;
    }

    public void setVldesacrnot(Double vldesacrnot) {
        this.vldesacrnot = vldesacrnot;
    }

    public Character getTpdesacrite() {
        return tpdesacrite;
    }

    public void setTpdesacrite(Character tpdesacrite) {
        this.tpdesacrite = tpdesacrite;
    }

    public Double getVldesacrite() {
        return vldesacrite;
    }

    public void setVldesacrite(Double vldesacrite) {
        this.vldesacrite = vldesacrite;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
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

    public Double getVlcusto() {
        return vlcusto;
    }

    public void setVlcusto(Double vlcusto) {
        this.vlcusto = vlcusto;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
    }

    public Double getQtdund() {
        return qtdund;
    }

    public void setQtdund(Double qtdund) {
        this.qtdund = qtdund;
    }

    public Double getVlund() {
        return vlund;
    }

    public void setVlund(Double vlund) {
        this.vlund = vlund;
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

    public String getUnemb() {
        return unemb;
    }

    public void setUnemb(String unemb) {
        this.unemb = unemb;
    }

    public Double getQtdemb() {
        return qtdemb;
    }

    public void setQtdemb(Double qtdemb) {
        this.qtdemb = qtdemb;
    }

    public String getUnunit() {
        return ununit;
    }

    public void setUnunit(String ununit) {
        this.ununit = ununit;
    }

    public String getTpitem() {
        return tpitem;
    }

    public void setTpitem(String tpitem) {
        this.tpitem = tpitem;
    }

    public Devolvenda getDevolvenda() {
        return devolvenda;
    }

    public void setDevolvenda(Devolvenda devolvenda) {
        this.devolvenda = devolvenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devolvendaitPK != null ? devolvendaitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolvendait)) {
            return false;
        }
        Devolvendait other = (Devolvendait) object;
        if ((this.devolvendaitPK == null && other.devolvendaitPK != null) || (this.devolvendaitPK != null && !this.devolvendaitPK.equals(other.devolvendaitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Devolvendait[ devolvendaitPK=" + devolvendaitPK + " ]";
    }
    
}
