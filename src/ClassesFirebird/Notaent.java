/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notaent {

    private static final long serialVersionUID = 1L;
    protected NotaentPK notaentPK;
    private String nomfor;
    private String cnpj;
    private String ie;
    private String uf;
    private String cfops;
    private String cfope;
    private Date dtentrada;
    private Date dtemissao;
    private String especie;
    private String serie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double bscalcicms;
    private Double alicms;
    private Double vlicms;
    private Double bsicmssubs;
    private Double vlicmssubs;
    private Double vlproduto;
    private String tpfrete;
    private String nrfrete;
    private Integer codforfr;
    private String nomforfr;
    private String cnpjfr;
    private String iefr;
    private String uffr;
    private Double alicmsfr;
    private Double vlicmsfr;
    private Double vlfrete;
    private Double vlseguro;
    private Double outdesp;
    private Double vlipi;
    private Double percdesc0;
    private Double vldesc0;
    private Double vlnota;
    private Integer codusuent;
    private String usuarioent;
    private Date dataent;
    private Integer codusufin;
    private String usuariofin;
    private Date datafin;
    private String situacao;
    private String tpfpg;
    private String planopag;
    private String nrpedido;
    private Character tpentsai;
    private String nrfrete02;
    private Integer codforfr02;
    private String nomforfr02;
    private String cnpjfr02;
    private String iefr02;
    private String uffr02;
    private Double alicmsfr02;
    private Double vlicmsfr02;
    private Double vlfrete02;
    private String nrfrete03;
    private Integer codforfr03;
    private String nomforfr03;
    private String cnpjfr03;
    private String iefr03;
    private String uffr03;
    private Double alicmsfr03;
    private Double vlicmsfr03;
    private Double vlfrete03;
    private Double vlcartacab;
    private Character cartadevol;
    private Integer nrcontr;
    private String modelo;
    private Character escriturado;
    private Character sittrans;
    private Date dttrans;
    private Integer nrtransf;
    private Double vlunitfrete;
    private Integer qtdfrete;

    public Notaent() {
    }

    public Notaent(NotaentPK notaentPK) {
        this.notaentPK = notaentPK;
    }

    public Notaent(NotaentPK notaentPK, String nomfor) {
        this.notaentPK = notaentPK;
        this.nomfor = nomfor;
    }

    public Notaent(int codfil, String nrnota, int codfor) {
        this.notaentPK = new NotaentPK(codfil, nrnota, codfor);
    }

    public NotaentPK getNotaentPK() {
        return notaentPK;
    }

    public void setNotaentPK(NotaentPK notaentPK) {
        this.notaentPK = notaentPK;
    }

    public String getNomfor() {
        return nomfor;
    }

    public void setNomfor(String nomfor) {
        this.nomfor = nomfor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCfops() {
        return cfops;
    }

    public void setCfops(String cfops) {
        this.cfops = cfops;
    }

    public String getCfope() {
        return cfope;
    }

    public void setCfope(String cfope) {
        this.cfope = cfope;
    }

    public Date getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Date dtentrada) {
        this.dtentrada = dtentrada;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double getBscalcicms() {
        return bscalcicms;
    }

    public void setBscalcicms(Double bscalcicms) {
        this.bscalcicms = bscalcicms;
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

    public Double getBsicmssubs() {
        return bsicmssubs;
    }

    public void setBsicmssubs(Double bsicmssubs) {
        this.bsicmssubs = bsicmssubs;
    }

    public Double getVlicmssubs() {
        return vlicmssubs;
    }

    public void setVlicmssubs(Double vlicmssubs) {
        this.vlicmssubs = vlicmssubs;
    }

    public Double getVlproduto() {
        return vlproduto;
    }

    public void setVlproduto(Double vlproduto) {
        this.vlproduto = vlproduto;
    }

    public String getTpfrete() {
        return tpfrete;
    }

    public void setTpfrete(String tpfrete) {
        this.tpfrete = tpfrete;
    }

    public String getNrfrete() {
        return nrfrete;
    }

    public void setNrfrete(String nrfrete) {
        this.nrfrete = nrfrete;
    }

    public Integer getCodforfr() {
        return codforfr;
    }

    public void setCodforfr(Integer codforfr) {
        this.codforfr = codforfr;
    }

    public String getNomforfr() {
        return nomforfr;
    }

    public void setNomforfr(String nomforfr) {
        this.nomforfr = nomforfr;
    }

    public String getCnpjfr() {
        return cnpjfr;
    }

    public void setCnpjfr(String cnpjfr) {
        this.cnpjfr = cnpjfr;
    }

    public String getIefr() {
        return iefr;
    }

    public void setIefr(String iefr) {
        this.iefr = iefr;
    }

    public String getUffr() {
        return uffr;
    }

    public void setUffr(String uffr) {
        this.uffr = uffr;
    }

    public Double getAlicmsfr() {
        return alicmsfr;
    }

    public void setAlicmsfr(Double alicmsfr) {
        this.alicmsfr = alicmsfr;
    }

    public Double getVlicmsfr() {
        return vlicmsfr;
    }

    public void setVlicmsfr(Double vlicmsfr) {
        this.vlicmsfr = vlicmsfr;
    }

    public Double getVlfrete() {
        return vlfrete;
    }

    public void setVlfrete(Double vlfrete) {
        this.vlfrete = vlfrete;
    }

    public Double getVlseguro() {
        return vlseguro;
    }

    public void setVlseguro(Double vlseguro) {
        this.vlseguro = vlseguro;
    }

    public Double getOutdesp() {
        return outdesp;
    }

    public void setOutdesp(Double outdesp) {
        this.outdesp = outdesp;
    }

    public Double getVlipi() {
        return vlipi;
    }

    public void setVlipi(Double vlipi) {
        this.vlipi = vlipi;
    }

    public Double getPercdesc0() {
        return percdesc0;
    }

    public void setPercdesc0(Double percdesc0) {
        this.percdesc0 = percdesc0;
    }

    public Double getVldesc0() {
        return vldesc0;
    }

    public void setVldesc0(Double vldesc0) {
        this.vldesc0 = vldesc0;
    }

    public Double getVlnota() {
        return vlnota;
    }

    public void setVlnota(Double vlnota) {
        this.vlnota = vlnota;
    }

    public Integer getCodusuent() {
        return codusuent;
    }

    public void setCodusuent(Integer codusuent) {
        this.codusuent = codusuent;
    }

    public String getUsuarioent() {
        return usuarioent;
    }

    public void setUsuarioent(String usuarioent) {
        this.usuarioent = usuarioent;
    }

    public Date getDataent() {
        return dataent;
    }

    public void setDataent(Date dataent) {
        this.dataent = dataent;
    }

    public Integer getCodusufin() {
        return codusufin;
    }

    public void setCodusufin(Integer codusufin) {
        this.codusufin = codusufin;
    }

    public String getUsuariofin() {
        return usuariofin;
    }

    public void setUsuariofin(String usuariofin) {
        this.usuariofin = usuariofin;
    }

    public Date getDatafin() {
        return datafin;
    }

    public void setDatafin(Date datafin) {
        this.datafin = datafin;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTpfpg() {
        return tpfpg;
    }

    public void setTpfpg(String tpfpg) {
        this.tpfpg = tpfpg;
    }

    public String getPlanopag() {
        return planopag;
    }

    public void setPlanopag(String planopag) {
        this.planopag = planopag;
    }

    public String getNrpedido() {
        return nrpedido;
    }

    public void setNrpedido(String nrpedido) {
        this.nrpedido = nrpedido;
    }

    public Character getTpentsai() {
        return tpentsai;
    }

    public void setTpentsai(Character tpentsai) {
        this.tpentsai = tpentsai;
    }

    public String getNrfrete02() {
        return nrfrete02;
    }

    public void setNrfrete02(String nrfrete02) {
        this.nrfrete02 = nrfrete02;
    }

    public Integer getCodforfr02() {
        return codforfr02;
    }

    public void setCodforfr02(Integer codforfr02) {
        this.codforfr02 = codforfr02;
    }

    public String getNomforfr02() {
        return nomforfr02;
    }

    public void setNomforfr02(String nomforfr02) {
        this.nomforfr02 = nomforfr02;
    }

    public String getCnpjfr02() {
        return cnpjfr02;
    }

    public void setCnpjfr02(String cnpjfr02) {
        this.cnpjfr02 = cnpjfr02;
    }

    public String getIefr02() {
        return iefr02;
    }

    public void setIefr02(String iefr02) {
        this.iefr02 = iefr02;
    }

    public String getUffr02() {
        return uffr02;
    }

    public void setUffr02(String uffr02) {
        this.uffr02 = uffr02;
    }

    public Double getAlicmsfr02() {
        return alicmsfr02;
    }

    public void setAlicmsfr02(Double alicmsfr02) {
        this.alicmsfr02 = alicmsfr02;
    }

    public Double getVlicmsfr02() {
        return vlicmsfr02;
    }

    public void setVlicmsfr02(Double vlicmsfr02) {
        this.vlicmsfr02 = vlicmsfr02;
    }

    public Double getVlfrete02() {
        return vlfrete02;
    }

    public void setVlfrete02(Double vlfrete02) {
        this.vlfrete02 = vlfrete02;
    }

    public String getNrfrete03() {
        return nrfrete03;
    }

    public void setNrfrete03(String nrfrete03) {
        this.nrfrete03 = nrfrete03;
    }

    public Integer getCodforfr03() {
        return codforfr03;
    }

    public void setCodforfr03(Integer codforfr03) {
        this.codforfr03 = codforfr03;
    }

    public String getNomforfr03() {
        return nomforfr03;
    }

    public void setNomforfr03(String nomforfr03) {
        this.nomforfr03 = nomforfr03;
    }

    public String getCnpjfr03() {
        return cnpjfr03;
    }

    public void setCnpjfr03(String cnpjfr03) {
        this.cnpjfr03 = cnpjfr03;
    }

    public String getIefr03() {
        return iefr03;
    }

    public void setIefr03(String iefr03) {
        this.iefr03 = iefr03;
    }

    public String getUffr03() {
        return uffr03;
    }

    public void setUffr03(String uffr03) {
        this.uffr03 = uffr03;
    }

    public Double getAlicmsfr03() {
        return alicmsfr03;
    }

    public void setAlicmsfr03(Double alicmsfr03) {
        this.alicmsfr03 = alicmsfr03;
    }

    public Double getVlicmsfr03() {
        return vlicmsfr03;
    }

    public void setVlicmsfr03(Double vlicmsfr03) {
        this.vlicmsfr03 = vlicmsfr03;
    }

    public Double getVlfrete03() {
        return vlfrete03;
    }

    public void setVlfrete03(Double vlfrete03) {
        this.vlfrete03 = vlfrete03;
    }

    public Double getVlcartacab() {
        return vlcartacab;
    }

    public void setVlcartacab(Double vlcartacab) {
        this.vlcartacab = vlcartacab;
    }

    public Character getCartadevol() {
        return cartadevol;
    }

    public void setCartadevol(Character cartadevol) {
        this.cartadevol = cartadevol;
    }

    public Integer getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(Integer nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Character getEscriturado() {
        return escriturado;
    }

    public void setEscriturado(Character escriturado) {
        this.escriturado = escriturado;
    }

    public Character getSittrans() {
        return sittrans;
    }

    public void setSittrans(Character sittrans) {
        this.sittrans = sittrans;
    }

    public Date getDttrans() {
        return dttrans;
    }

    public void setDttrans(Date dttrans) {
        this.dttrans = dttrans;
    }

    public Integer getNrtransf() {
        return nrtransf;
    }

    public void setNrtransf(Integer nrtransf) {
        this.nrtransf = nrtransf;
    }

    public Double getVlunitfrete() {
        return vlunitfrete;
    }

    public void setVlunitfrete(Double vlunitfrete) {
        this.vlunitfrete = vlunitfrete;
    }

    public Integer getQtdfrete() {
        return qtdfrete;
    }

    public void setQtdfrete(Integer qtdfrete) {
        this.qtdfrete = qtdfrete;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notaentPK != null ? notaentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notaent)) {
            return false;
        }
        Notaent other = (Notaent) object;
        if ((this.notaentPK == null && other.notaentPK != null) || (this.notaentPK != null && !this.notaentPK.equals(other.notaentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notaent[ notaentPK=" + notaentPK + " ]";
    }
    
}
