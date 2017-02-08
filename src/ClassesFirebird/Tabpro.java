/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vplayer
 */
public class Tabpro implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codpro;
    private String descpro;
    private String detalhe;
    private String codbarun;
    private String codbarcx;
    private String codrefer;
    private String unemb;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdemb;
    private String unidade;
    private String codvas;
    private Double vlcomi;
    private String grupro;
    private Integer fabpro;
    private Integer forpro01;
    private Integer forpro02;
    private Integer forpro03;
    private String docfor01;
    private String docfor02;
    private String docfor03;
    private Double qtdultent01;
    private Double qtdultent02;
    private Double qtdultent03;
    private Double ultprcom01;
    private Double ultprcom02;
    private Double ultprcom03;
    
    private Date dtultcom01;
    
    private Date dtultcom02;
    
    private Date dtultcom03;
    
    private Date dtchegada;
    
    private Date dtsaipro;
    private Double icms;
    private String indice;
    private Character peso;
    private Double largura;
    private Double altura;
    private Character massacompr;
    private Character contrquant;
    private Character contrrefer;
    private Character contrcomp;
    private Character contrponto;
    private Integer baixaponto;
    private Character stprod;
    private Character qualprod;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    private Double alicmscom;
    private Double alipicom;
    private Double prcustocom;
    private Double vldescocom;
    private Double vlfretecom;
    private Double vlsegcom;
    private Double outdespcom;
    private Double fatorirpj;
    private Double fatorcsll;
    private Double fatorpis;
    private Double fatorcofins;
    private Character substrib;
    private Character ipi;
    private Double percipi;
    private Character meioameio;
    private Double ultprcompra;
    private Double prmepro;
    private Character tpsubest;
    private String modelo;
    private String tamanho;
    private String indcomp;
    private Double perclucro;
    private Character remcontr;
    private Character libquant;
    private Double vlcomiavva;
    private Double vlcomiccva;
    private Double vlcomiapva;
    private Double vlcomiavat;
    private Double vlcomiccat;
    private Double vlcomiapat;
    
    private Date dtvenc01;
    
    private Date dtvenc02;
    private String ltvenc01;
    private String ltvenc02;
    private Character balanca;
    private String clasfiscal;
    private Integer codaluser;
    private Integer codcolecao;
    private Double quantped;
    
    private Date dtchegped;
    private String corconsul;
    private Integer casadec;
    private String cst;
    private Double fatorsubst;
    private String cores;
    private Character tribmono;
    private Double pesobruto;
    private Double pesoliquido;
    private Character libdesconto;
    private String tipoitem;
    private String exipi;
    private String codgen;
    private String codlst;
    private String codanp;
    private String codif;
    private String clasterap;
    private String usoprolong;
    private String regmsmed;
    private String unidmed;
    private String coddcbins;
    private String cestabas;
    private String desonfolha;
    private Integer diasvenc;
    private String origprod;
    private Integer icodpro;
    private String farmapop;
    private Double quantund;
    private String unidemb;
    private Double fatorpiscom;
    private Double fatorcofinscom;
    private String quartobov;
        

    public Tabpro() {
    }

    public Tabpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getCodbarun() {
        return codbarun;
    }

    public void setCodbarun(String codbarun) {
        this.codbarun = codbarun;
    }

    public String getCodbarcx() {
        return codbarcx;
    }

    public void setCodbarcx(String codbarcx) {
        this.codbarcx = codbarcx;
    }

    public String getCodrefer() {
        return codrefer;
    }

    public void setCodrefer(String codrefer) {
        this.codrefer = codrefer;
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

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getCodvas() {
        return codvas;
    }

    public void setCodvas(String codvas) {
        this.codvas = codvas;
    }

    public Double getVlcomi() {
        return vlcomi;
    }

    public void setVlcomi(Double vlcomi) {
        this.vlcomi = vlcomi;
    }

    public String getGrupro() {
        return grupro;
    }

    public void setGrupro(String grupro) {
        this.grupro = grupro;
    }

    public Integer getFabpro() {
        return fabpro;
    }

    public void setFabpro(Integer fabpro) {
        this.fabpro = fabpro;
    }

    public Integer getForpro01() {
        return forpro01;
    }

    public void setForpro01(Integer forpro01) {
        this.forpro01 = forpro01;
    }

    public Integer getForpro02() {
        return forpro02;
    }

    public void setForpro02(Integer forpro02) {
        this.forpro02 = forpro02;
    }

    public Integer getForpro03() {
        return forpro03;
    }

    public void setForpro03(Integer forpro03) {
        this.forpro03 = forpro03;
    }

    public String getDocfor01() {
        return docfor01;
    }

    public void setDocfor01(String docfor01) {
        this.docfor01 = docfor01;
    }

    public String getDocfor02() {
        return docfor02;
    }

    public void setDocfor02(String docfor02) {
        this.docfor02 = docfor02;
    }

    public String getDocfor03() {
        return docfor03;
    }

    public void setDocfor03(String docfor03) {
        this.docfor03 = docfor03;
    }

    public Double getQtdultent01() {
        return qtdultent01;
    }

    public void setQtdultent01(Double qtdultent01) {
        this.qtdultent01 = qtdultent01;
    }

    public Double getQtdultent02() {
        return qtdultent02;
    }

    public void setQtdultent02(Double qtdultent02) {
        this.qtdultent02 = qtdultent02;
    }

    public Double getQtdultent03() {
        return qtdultent03;
    }

    public void setQtdultent03(Double qtdultent03) {
        this.qtdultent03 = qtdultent03;
    }

    public Double getUltprcom01() {
        return ultprcom01;
    }

    public void setUltprcom01(Double ultprcom01) {
        this.ultprcom01 = ultprcom01;
    }

    public Double getUltprcom02() {
        return ultprcom02;
    }

    public void setUltprcom02(Double ultprcom02) {
        this.ultprcom02 = ultprcom02;
    }

    public Double getUltprcom03() {
        return ultprcom03;
    }

    public void setUltprcom03(Double ultprcom03) {
        this.ultprcom03 = ultprcom03;
    }

    public Date getDtultcom01() {
        return dtultcom01;
    }

    public void setDtultcom01(Date dtultcom01) {
        this.dtultcom01 = dtultcom01;
    }

    public Date getDtultcom02() {
        return dtultcom02;
    }

    public void setDtultcom02(Date dtultcom02) {
        this.dtultcom02 = dtultcom02;
    }

    public Date getDtultcom03() {
        return dtultcom03;
    }

    public void setDtultcom03(Date dtultcom03) {
        this.dtultcom03 = dtultcom03;
    }

    public Date getDtchegada() {
        return dtchegada;
    }

    public void setDtchegada(Date dtchegada) {
        this.dtchegada = dtchegada;
    }

    public Date getDtsaipro() {
        return dtsaipro;
    }

    public void setDtsaipro(Date dtsaipro) {
        this.dtsaipro = dtsaipro;
    }

    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public Character getPeso() {
        return peso;
    }

    public void setPeso(Character peso) {
        this.peso = peso;
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

    public Character getMassacompr() {
        return massacompr;
    }

    public void setMassacompr(Character massacompr) {
        this.massacompr = massacompr;
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

    public Character getContrponto() {
        return contrponto;
    }

    public void setContrponto(Character contrponto) {
        this.contrponto = contrponto;
    }

    public Integer getBaixaponto() {
        return baixaponto;
    }

    public void setBaixaponto(Integer baixaponto) {
        this.baixaponto = baixaponto;
    }

    public Character getStprod() {
        return stprod;
    }

    public void setStprod(Character stprod) {
        this.stprod = stprod;
    }

    public Character getQualprod() {
        return qualprod;
    }

    public void setQualprod(Character qualprod) {
        this.qualprod = qualprod;
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

    public Double getAlicmscom() {
        return alicmscom;
    }

    public void setAlicmscom(Double alicmscom) {
        this.alicmscom = alicmscom;
    }

    public Double getAlipicom() {
        return alipicom;
    }

    public void setAlipicom(Double alipicom) {
        this.alipicom = alipicom;
    }

    public Double getPrcustocom() {
        return prcustocom;
    }

    public void setPrcustocom(Double prcustocom) {
        this.prcustocom = prcustocom;
    }

    public Double getVldescocom() {
        return vldescocom;
    }

    public void setVldescocom(Double vldescocom) {
        this.vldescocom = vldescocom;
    }

    public Double getVlfretecom() {
        return vlfretecom;
    }

    public void setVlfretecom(Double vlfretecom) {
        this.vlfretecom = vlfretecom;
    }

    public Double getVlsegcom() {
        return vlsegcom;
    }

    public void setVlsegcom(Double vlsegcom) {
        this.vlsegcom = vlsegcom;
    }

    public Double getOutdespcom() {
        return outdespcom;
    }

    public void setOutdespcom(Double outdespcom) {
        this.outdespcom = outdespcom;
    }

    public Double getFatorirpj() {
        return fatorirpj;
    }

    public void setFatorirpj(Double fatorirpj) {
        this.fatorirpj = fatorirpj;
    }

    public Double getFatorcsll() {
        return fatorcsll;
    }

    public void setFatorcsll(Double fatorcsll) {
        this.fatorcsll = fatorcsll;
    }

    public Double getFatorpis() {
        return fatorpis;
    }

    public void setFatorpis(Double fatorpis) {
        this.fatorpis = fatorpis;
    }

    public Double getFatorcofins() {
        return fatorcofins;
    }

    public void setFatorcofins(Double fatorcofins) {
        this.fatorcofins = fatorcofins;
    }

    public Character getSubstrib() {
        return substrib;
    }

    public void setSubstrib(Character substrib) {
        this.substrib = substrib;
    }

    public Character getIpi() {
        return ipi;
    }

    public void setIpi(Character ipi) {
        this.ipi = ipi;
    }

    public Double getPercipi() {
        return percipi;
    }

    public void setPercipi(Double percipi) {
        this.percipi = percipi;
    }

    public Character getMeioameio() {
        return meioameio;
    }

    public void setMeioameio(Character meioameio) {
        this.meioameio = meioameio;
    }

    public Double getUltprcompra() {
        return ultprcompra;
    }

    public void setUltprcompra(Double ultprcompra) {
        this.ultprcompra = ultprcompra;
    }

    public Double getPrmepro() {
        return prmepro;
    }

    public void setPrmepro(Double prmepro) {
        this.prmepro = prmepro;
    }

    public Character getTpsubest() {
        return tpsubest;
    }

    public void setTpsubest(Character tpsubest) {
        this.tpsubest = tpsubest;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getIndcomp() {
        return indcomp;
    }

    public void setIndcomp(String indcomp) {
        this.indcomp = indcomp;
    }

    public Double getPerclucro() {
        return perclucro;
    }

    public void setPerclucro(Double perclucro) {
        this.perclucro = perclucro;
    }

    public Character getRemcontr() {
        return remcontr;
    }

    public void setRemcontr(Character remcontr) {
        this.remcontr = remcontr;
    }

    public Character getLibquant() {
        return libquant;
    }

    public void setLibquant(Character libquant) {
        this.libquant = libquant;
    }

    public Double getVlcomiavva() {
        return vlcomiavva;
    }

    public void setVlcomiavva(Double vlcomiavva) {
        this.vlcomiavva = vlcomiavva;
    }

    public Double getVlcomiccva() {
        return vlcomiccva;
    }

    public void setVlcomiccva(Double vlcomiccva) {
        this.vlcomiccva = vlcomiccva;
    }

    public Double getVlcomiapva() {
        return vlcomiapva;
    }

    public void setVlcomiapva(Double vlcomiapva) {
        this.vlcomiapva = vlcomiapva;
    }

    public Double getVlcomiavat() {
        return vlcomiavat;
    }

    public void setVlcomiavat(Double vlcomiavat) {
        this.vlcomiavat = vlcomiavat;
    }

    public Double getVlcomiccat() {
        return vlcomiccat;
    }

    public void setVlcomiccat(Double vlcomiccat) {
        this.vlcomiccat = vlcomiccat;
    }

    public Double getVlcomiapat() {
        return vlcomiapat;
    }

    public void setVlcomiapat(Double vlcomiapat) {
        this.vlcomiapat = vlcomiapat;
    }

    public Date getDtvenc01() {
        return dtvenc01;
    }

    public void setDtvenc01(Date dtvenc01) {
        this.dtvenc01 = dtvenc01;
    }

    public Date getDtvenc02() {
        return dtvenc02;
    }

    public void setDtvenc02(Date dtvenc02) {
        this.dtvenc02 = dtvenc02;
    }

    public String getLtvenc01() {
        return ltvenc01;
    }

    public void setLtvenc01(String ltvenc01) {
        this.ltvenc01 = ltvenc01;
    }

    public String getLtvenc02() {
        return ltvenc02;
    }

    public void setLtvenc02(String ltvenc02) {
        this.ltvenc02 = ltvenc02;
    }

    public Character getBalanca() {
        return balanca;
    }

    public void setBalanca(Character balanca) {
        this.balanca = balanca;
    }

    public String getClasfiscal() {
        return clasfiscal;
    }

    public void setClasfiscal(String clasfiscal) {
        this.clasfiscal = clasfiscal;
    }

    public Integer getCodaluser() {
        return codaluser;
    }

    public void setCodaluser(Integer codaluser) {
        this.codaluser = codaluser;
    }

    public Integer getCodcolecao() {
        return codcolecao;
    }

    public void setCodcolecao(Integer codcolecao) {
        this.codcolecao = codcolecao;
    }

    public Double getQuantped() {
        return quantped;
    }

    public void setQuantped(Double quantped) {
        this.quantped = quantped;
    }

    public Date getDtchegped() {
        return dtchegped;
    }

    public void setDtchegped(Date dtchegped) {
        this.dtchegped = dtchegped;
    }

    public String getCorconsul() {
        return corconsul;
    }

    public void setCorconsul(String corconsul) {
        this.corconsul = corconsul;
    }

    public Integer getCasadec() {
        return casadec;
    }

    public void setCasadec(Integer casadec) {
        this.casadec = casadec;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public Double getFatorsubst() {
        return fatorsubst;
    }

    public void setFatorsubst(Double fatorsubst) {
        this.fatorsubst = fatorsubst;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public Character getTribmono() {
        return tribmono;
    }

    public void setTribmono(Character tribmono) {
        this.tribmono = tribmono;
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

    public Character getLibdesconto() {
        return libdesconto;
    }

    public void setLibdesconto(Character libdesconto) {
        this.libdesconto = libdesconto;
    }

    public String getTipoitem() {
        return tipoitem;
    }

    public void setTipoitem(String tipoitem) {
        this.tipoitem = tipoitem;
    }

    public String getExipi() {
        return exipi;
    }

    public void setExipi(String exipi) {
        this.exipi = exipi;
    }

    public String getCodgen() {
        return codgen;
    }

    public void setCodgen(String codgen) {
        this.codgen = codgen;
    }

    public String getCodlst() {
        return codlst;
    }

    public void setCodlst(String codlst) {
        this.codlst = codlst;
    }

    public String getCodanp() {
        return codanp;
    }

    public void setCodanp(String codanp) {
        this.codanp = codanp;
    }

    public String getCodif() {
        return codif;
    }

    public void setCodif(String codif) {
        this.codif = codif;
    }

    public String getClasterap() {
        return clasterap;
    }

    public void setClasterap(String clasterap) {
        this.clasterap = clasterap;
    }

    public String getUsoprolong() {
        return usoprolong;
    }

    public void setUsoprolong(String usoprolong) {
        this.usoprolong = usoprolong;
    }

    public String getRegmsmed() {
        return regmsmed;
    }

    public void setRegmsmed(String regmsmed) {
        this.regmsmed = regmsmed;
    }

    public String getUnidmed() {
        return unidmed;
    }

    public void setUnidmed(String unidmed) {
        this.unidmed = unidmed;
    }

    public String getCoddcbins() {
        return coddcbins;
    }

    public void setCoddcbins(String coddcbins) {
        this.coddcbins = coddcbins;
    }

    public String getCestabas() {
        return cestabas;
    }

    public void setCestabas(String cestabas) {
        this.cestabas = cestabas;
    }

    public String getDesonfolha() {
        return desonfolha;
    }

    public void setDesonfolha(String desonfolha) {
        this.desonfolha = desonfolha;
    }

    public Integer getDiasvenc() {
        return diasvenc;
    }

    public void setDiasvenc(Integer diasvenc) {
        this.diasvenc = diasvenc;
    }

    public String getOrigprod() {
        return origprod;
    }

    public void setOrigprod(String origprod) {
        this.origprod = origprod;
    }

    public Integer getIcodpro() {
        return icodpro;
    }

    public void setIcodpro(Integer icodpro) {
        this.icodpro = icodpro;
    }

    public String getFarmapop() {
        return farmapop;
    }

    public void setFarmapop(String farmapop) {
        this.farmapop = farmapop;
    }

    public Double getQuantund() {
        return quantund;
    }

    public void setQuantund(Double quantund) {
        this.quantund = quantund;
    }

    public String getUnidemb() {
        return unidemb;
    }

    public void setUnidemb(String unidemb) {
        this.unidemb = unidemb;
    }

    public Double getFatorpiscom() {
        return fatorpiscom;
    }

    public void setFatorpiscom(Double fatorpiscom) {
        this.fatorpiscom = fatorpiscom;
    }

    public Double getFatorcofinscom() {
        return fatorcofinscom;
    }

    public void setFatorcofinscom(Double fatorcofinscom) {
        this.fatorcofinscom = fatorcofinscom;
    }

    public String getQuartobov() {
        return quartobov;
    }

    public void setQuartobov(String quartobov) {
        this.quartobov = quartobov;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpro != null ? codpro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabpro)) {
            return false;
        }
        Tabpro other = (Tabpro) object;
        if ((this.codpro == null && other.codpro != null) || (this.codpro != null && !this.codpro.equals(other.codpro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabpro[ codpro=" + codpro + " ]";
    }
    
}
