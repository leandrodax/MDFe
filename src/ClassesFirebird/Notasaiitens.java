/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notasaiitens {
    
    private static final long serialVersionUID = 1L;
    protected NotasaiitensPK notasaiitensPK;
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
    private Integer codfab;
    private Integer codven;
    private Double vlcomvend;
    private Double vlcomprof;
    private Integer pontos;
    private Integer totpontos;
    private String codgru;
    private Double qtdemb;
    private String ununit;
    private String unemb;
    private Double vlunant;
    private Integer filsai;
    private String tpitem;
    private Double qtddevol;
    private Double vlcartaitem;
    private Double largura;
    private Double altura;
    private Integer codsab01;
    private Integer codsab02;
    private Integer codsab03;
    private Integer codsab04;
    private String obsitem;
    private String cfopi;
    private Double aluf;
    private Double bscicms;
    private Double percagr;
    private Double bssubtr;
    private Double vlsubtr;
    private String tptripi;
    private Double percipi;
    private Double vlipi;
    private Double pesobruto;
    private Double pesoliquido;
    private Character desconto;
    private Integer codprof;
    private Character origem;
    private Integer qtdquabov;
    private Notasai notasai;

    public Notasaiitens() {
    }

    public Notasaiitens(NotasaiitensPK notasaiitensPK) {
        this.notasaiitensPK = notasaiitensPK;
    }

    public Notasaiitens(int nritem, String nrcontr) {
        this.notasaiitensPK = new NotasaiitensPK(nritem, nrcontr);
    }

    public NotasaiitensPK getNotasaiitensPK() {
        return notasaiitensPK;
    }

    public void setNotasaiitensPK(NotasaiitensPK notasaiitensPK) {
        this.notasaiitensPK = notasaiitensPK;
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

    public Double getVlcomvend() {
        return vlcomvend;
    }

    public void setVlcomvend(Double vlcomvend) {
        this.vlcomvend = vlcomvend;
    }

    public Double getVlcomprof() {
        return vlcomprof;
    }

    public void setVlcomprof(Double vlcomprof) {
        this.vlcomprof = vlcomprof;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public Integer getTotpontos() {
        return totpontos;
    }

    public void setTotpontos(Integer totpontos) {
        this.totpontos = totpontos;
    }

    public String getCodgru() {
        return codgru;
    }

    public void setCodgru(String codgru) {
        this.codgru = codgru;
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

    public Double getVlunant() {
        return vlunant;
    }

    public void setVlunant(Double vlunant) {
        this.vlunant = vlunant;
    }

    public Integer getFilsai() {
        return filsai;
    }

    public void setFilsai(Integer filsai) {
        this.filsai = filsai;
    }

    public String getTpitem() {
        return tpitem;
    }

    public void setTpitem(String tpitem) {
        this.tpitem = tpitem;
    }

    public Double getQtddevol() {
        return qtddevol;
    }

    public void setQtddevol(Double qtddevol) {
        this.qtddevol = qtddevol;
    }

    public Double getVlcartaitem() {
        return vlcartaitem;
    }

    public void setVlcartaitem(Double vlcartaitem) {
        this.vlcartaitem = vlcartaitem;
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

    public String getCfopi() {
        return cfopi;
    }

    public void setCfopi(String cfopi) {
        this.cfopi = cfopi;
    }

    public Double getAluf() {
        return aluf;
    }

    public void setAluf(Double aluf) {
        this.aluf = aluf;
    }

    public Double getBscicms() {
        return bscicms;
    }

    public void setBscicms(Double bscicms) {
        this.bscicms = bscicms;
    }

    public Double getPercagr() {
        return percagr;
    }

    public void setPercagr(Double percagr) {
        this.percagr = percagr;
    }

    public Double getBssubtr() {
        return bssubtr;
    }

    public void setBssubtr(Double bssubtr) {
        this.bssubtr = bssubtr;
    }

    public Double getVlsubtr() {
        return vlsubtr;
    }

    public void setVlsubtr(Double vlsubtr) {
        this.vlsubtr = vlsubtr;
    }

    public String getTptripi() {
        return tptripi;
    }

    public void setTptripi(String tptripi) {
        this.tptripi = tptripi;
    }

    public Double getPercipi() {
        return percipi;
    }

    public void setPercipi(Double percipi) {
        this.percipi = percipi;
    }

    public Double getVlipi() {
        return vlipi;
    }

    public void setVlipi(Double vlipi) {
        this.vlipi = vlipi;
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

    public Integer getQtdquabov() {
        return qtdquabov;
    }

    public void setQtdquabov(Integer qtdquabov) {
        this.qtdquabov = qtdquabov;
    }

    public Notasai getNotasai() {
        return notasai;
    }

    public void setNotasai(Notasai notasai) {
        this.notasai = notasai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notasaiitensPK != null ? notasaiitensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notasaiitens)) {
            return false;
        }
        Notasaiitens other = (Notasaiitens) object;
        if ((this.notasaiitensPK == null && other.notasaiitensPK != null) || (this.notasaiitensPK != null && !this.notasaiitensPK.equals(other.notasaiitensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notasaiitens[ notasaiitensPK=" + notasaiitensPK + " ]";
    }
    
}
