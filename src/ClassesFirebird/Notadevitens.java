/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notadevitens {

    private static final long serialVersionUID = 1L;
    protected NotadevitensPK notadevitensPK;
    private String codpro;
    private String codvas;
    private String coddig;
    private String descpro;
    private String unidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdvend;
    private Double vlunit;
    private Character tpdesacrite;
    private Double vldesacrite;
    private String indice;
    private Double alicms;
    private Double vlicms;
    private Double vlcusto;
    private Double vltotal;
    private Double qtdund;
    private Double vlund;
    private Double qtdemb;
    private String ununit;
    private String unemb;
    private String referencia;
    private String modelo;
    private String cor;
    private String tamanho;
    private Date dtvenc;
    private Character contrquant;
    private Character contrrefer;
    private Character contrcomp;
    private Integer codfab;
    private Integer codven;
    private String codgru;
    private String tpitem;
    private Integer codsab01;
    private Integer codsab02;
    private Integer codsab03;
    private Integer codsab04;
    private String obsitem;
    private Double largura;
    private Double altura;
    private Double pesobruto;
    private Double pesoliquido;
    private Character desconto;
    private Integer codprof;
    private Character origem;
    private Notasaidev notasaidev;

    public Notadevitens() {
    }

    public Notadevitens(NotadevitensPK notadevitensPK) {
        this.notadevitensPK = notadevitensPK;
    }

    public Notadevitens(int nritem, String nrcontr) {
        this.notadevitensPK = new NotadevitensPK(nritem, nrcontr);
    }

    public NotadevitensPK getNotadevitensPK() {
        return notadevitensPK;
    }

    public void setNotadevitensPK(NotadevitensPK notadevitensPK) {
        this.notadevitensPK = notadevitensPK;
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

    public String getUnemb() {
        return unemb;
    }

    public void setUnemb(String unemb) {
        this.unemb = unemb;
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

    public Integer getCodfab() {
        return codfab;
    }

    public void setCodfab(Integer codfab) {
        this.codfab = codfab;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public String getCodgru() {
        return codgru;
    }

    public void setCodgru(String codgru) {
        this.codgru = codgru;
    }

    public String getTpitem() {
        return tpitem;
    }

    public void setTpitem(String tpitem) {
        this.tpitem = tpitem;
    }

    public Integer getCodsab01() {
        return codsab01;
    }

    public void setCodsab01(Integer codsab01) {
        this.codsab01 = codsab01;
    }

    public Integer getCodsab02() {
        return codsab02;
    }

    public void setCodsab02(Integer codsab02) {
        this.codsab02 = codsab02;
    }

    public Integer getCodsab03() {
        return codsab03;
    }

    public void setCodsab03(Integer codsab03) {
        this.codsab03 = codsab03;
    }

    public Integer getCodsab04() {
        return codsab04;
    }

    public void setCodsab04(Integer codsab04) {
        this.codsab04 = codsab04;
    }

    public String getObsitem() {
        return obsitem;
    }

    public void setObsitem(String obsitem) {
        this.obsitem = obsitem;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(Double pesobruto) {
        this.pesobruto = pesobruto;
    }

    public Double getPesoliquido() {
        return pesoliquido;
    }

    public void setPesoliquido(Double pesoliquido) {
        this.pesoliquido = pesoliquido;
    }

    public Character getDesconto() {
        return desconto;
    }

    public void setDesconto(Character desconto) {
        this.desconto = desconto;
    }

    public Integer getCodprof() {
        return codprof;
    }

    public void setCodprof(Integer codprof) {
        this.codprof = codprof;
    }

    public Character getOrigem() {
        return origem;
    }

    public void setOrigem(Character origem) {
        this.origem = origem;
    }

    public Notasaidev getNotasaidev() {
        return notasaidev;
    }

    public void setNotasaidev(Notasaidev notasaidev) {
        this.notasaidev = notasaidev;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notadevitensPK != null ? notadevitensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notadevitens)) {
            return false;
        }
        Notadevitens other = (Notadevitens) object;
        if ((this.notadevitensPK == null && other.notadevitensPK != null) || (this.notadevitensPK != null && !this.notadevitensPK.equals(other.notadevitensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notadevitens[ notadevitensPK=" + notadevitensPK + " ]";
    }
    
}
