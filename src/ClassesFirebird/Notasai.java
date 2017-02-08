/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notasai {
    
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private String nrabert;
    private Integer codfil;
    private String cfops;
    private String nomcli;
    private Character entregar;
    private String endentrega;
    private String cidentrega;
    private String baientrega;
    private String estentrega;
    private String refentrega;
    private String foneentrega;
    private String cpfcnpj;
    private Integer codven;
    private String nomven;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percomnot;
    private Double totcomnot;
    private Double percomser;
    private Double totcomser;
    private Short codprof;
    private String nomprof;
    private Double percomprof;
    private Double totcomprof;
    private Integer codusu;
    private String usuario;
    private Date dtemissao;
    private Double baseicms;
    private Double toticms;
    private Double percdesc;
    private Double vldescnot;
    private Double totcusto;
    private Double totnota;
    private Double totiss;
    private Double vldescser;
    private Double totserv;
    private Double totgeral;
    private Integer nrcaixa;
    private Integer codplan;
    private String descplan;
    private Character especie;
    private Character serie;
    private String nrfiscal;
    private Character situacao;
    private String nrcontr01;
    private Date data01;
    private Double valor01;
    private String nrcontr02;
    private Date data02;
    private Double valor02;
    private Character tpvenda;
    private Integer nrpedos;
    private Integer nrcxpedos;
    private Date dtemipedos;
    private Integer cdusupedos;
    private String nmusupedos;
    private String nomcomp;
    private String motcancel;
    private Date dthrlanc;
    private String obsvenda;
    private String codcli;
    private Integer totpontos;
    private Double percacrdes;
    private String tppagam;
    private String rgie;
    private Integer codusdes;
    private String usuardes;
    private Character devolucao;
    private String nrconvei;
    private Character entregue;
    private Integer nrentrega;
    private Double vlcartacab;
    private Character cartadevol;
    private Character serieserv;
    private Character tiposerv;
    private String nrfisserv;
    private String cep;
    private Date dtagenda;
    private String hragenda;
    private Date dtentrega;
    private String hrentrega;
    private String nrendcli;
    private Character escriturado;
    private Double vltotprod;
    private Double bssubtrib;
    private Double vlsubtrib;
    private Double vltotipi;
    private Double vlfrete;
    private Double vlseguro;
    private Double outrdesp;
    private Double vltotdes;
    private Double vltotnota;
    private Character impcupom;
    private String serieecf;
    private String nrcaixaecf;
    private String nrcupecf;
    private Date dtemiecf;
    private Character impnotaf;
    private String nrnotaf;
    private Date dteminotaf;
    private Character impnfe;
    private String nrnfe;
    private Date dteminfe;
    private Integer codforma;
    private String nomforma;
    private Character bonifica;
    private Character emissbol;
    private Character emitnfe;
    private String sserie;
    private String selo;
    private Date datasai;
    private String horasai;
    private Character frete;
    private Double ccv;
    private Double saldoanterior;
    private Notasainf notasainf;

    public Notasai() {
    }

    public Notasai(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrabert() {
        return nrabert;
    }

    public void setNrabert(String nrabert) {
        this.nrabert = nrabert;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getCfops() {
        return cfops;
    }

    public void setCfops(String cfops) {
        this.cfops = cfops;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public Character getEntregar() {
        return entregar;
    }

    public void setEntregar(Character entregar) {
        this.entregar = entregar;
    }

    public String getEndentrega() {
        return endentrega;
    }

    public void setEndentrega(String endentrega) {
        this.endentrega = endentrega;
    }

    public String getCidentrega() {
        return cidentrega;
    }

    public void setCidentrega(String cidentrega) {
        this.cidentrega = cidentrega;
    }

    public String getBaientrega() {
        return baientrega;
    }

    public void setBaientrega(String baientrega) {
        this.baientrega = baientrega;
    }

    public String getEstentrega() {
        return estentrega;
    }

    public void setEstentrega(String estentrega) {
        this.estentrega = estentrega;
    }

    public String getRefentrega() {
        return refentrega;
    }

    public void setRefentrega(String refentrega) {
        this.refentrega = refentrega;
    }

    public String getFoneentrega() {
        return foneentrega;
    }

    public void setFoneentrega(String foneentrega) {
        this.foneentrega = foneentrega;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public String getNomven() {
        return nomven;
    }

    public void setNomven(String nomven) {
        this.nomven = nomven;
    }

    public Double getPercomnot() {
        return percomnot;
    }

    public void setPercomnot(Double percomnot) {
        this.percomnot = percomnot;
    }

    public Double getTotcomnot() {
        return totcomnot;
    }

    public void setTotcomnot(Double totcomnot) {
        this.totcomnot = totcomnot;
    }

    public Double getPercomser() {
        return percomser;
    }

    public void setPercomser(Double percomser) {
        this.percomser = percomser;
    }

    public Double getTotcomser() {
        return totcomser;
    }

    public void setTotcomser(Double totcomser) {
        this.totcomser = totcomser;
    }

    public Short getCodprof() {
        return codprof;
    }

    public void setCodprof(Short codprof) {
        this.codprof = codprof;
    }

    public String getNomprof() {
        return nomprof;
    }

    public void setNomprof(String nomprof) {
        this.nomprof = nomprof;
    }

    public Double getPercomprof() {
        return percomprof;
    }

    public void setPercomprof(Double percomprof) {
        this.percomprof = percomprof;
    }

    public Double getTotcomprof() {
        return totcomprof;
    }

    public void setTotcomprof(Double totcomprof) {
        this.totcomprof = totcomprof;
    }

    public Integer getCodusu() {
        return codusu;
    }

    public void setCodusu(Integer codusu) {
        this.codusu = codusu;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Double getBaseicms() {
        return baseicms;
    }

    public void setBaseicms(Double baseicms) {
        this.baseicms = baseicms;
    }

    public Double getToticms() {
        return toticms;
    }

    public void setToticms(Double toticms) {
        this.toticms = toticms;
    }

    public Double getPercdesc() {
        return percdesc;
    }

    public void setPercdesc(Double percdesc) {
        this.percdesc = percdesc;
    }

    public Double getVldescnot() {
        return vldescnot;
    }

    public void setVldescnot(Double vldescnot) {
        this.vldescnot = vldescnot;
    }

    public Double getTotcusto() {
        return totcusto;
    }

    public void setTotcusto(Double totcusto) {
        this.totcusto = totcusto;
    }

    public Double getTotnota() {
        return totnota;
    }

    public void setTotnota(Double totnota) {
        this.totnota = totnota;
    }

    public Double getTotiss() {
        return totiss;
    }

    public void setTotiss(Double totiss) {
        this.totiss = totiss;
    }

    public Double getVldescser() {
        return vldescser;
    }

    public void setVldescser(Double vldescser) {
        this.vldescser = vldescser;
    }

    public Double getTotserv() {
        return totserv;
    }

    public void setTotserv(Double totserv) {
        this.totserv = totserv;
    }

    public Double getTotgeral() {
        return totgeral;
    }

    public void setTotgeral(Double totgeral) {
        this.totgeral = totgeral;
    }

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public String getDescplan() {
        return descplan;
    }

    public void setDescplan(String descplan) {
        this.descplan = descplan;
    }

    public Character getEspecie() {
        return especie;
    }

    public void setEspecie(Character especie) {
        this.especie = especie;
    }

    public Character getSerie() {
        return serie;
    }

    public void setSerie(Character serie) {
        this.serie = serie;
    }

    public String getNrfiscal() {
        return nrfiscal;
    }

    public void setNrfiscal(String nrfiscal) {
        this.nrfiscal = nrfiscal;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public String getNrcontr01() {
        return nrcontr01;
    }

    public void setNrcontr01(String nrcontr01) {
        this.nrcontr01 = nrcontr01;
    }

    public Date getData01() {
        return data01;
    }

    public void setData01(Date data01) {
        this.data01 = data01;
    }

    public Double getValor01() {
        return valor01;
    }

    public void setValor01(Double valor01) {
        this.valor01 = valor01;
    }

    public String getNrcontr02() {
        return nrcontr02;
    }

    public void setNrcontr02(String nrcontr02) {
        this.nrcontr02 = nrcontr02;
    }

    public Date getData02() {
        return data02;
    }

    public void setData02(Date data02) {
        this.data02 = data02;
    }

    public Double getValor02() {
        return valor02;
    }

    public void setValor02(Double valor02) {
        this.valor02 = valor02;
    }

    public Character getTpvenda() {
        return tpvenda;
    }

    public void setTpvenda(Character tpvenda) {
        this.tpvenda = tpvenda;
    }

    public Integer getNrpedos() {
        return nrpedos;
    }

    public void setNrpedos(Integer nrpedos) {
        this.nrpedos = nrpedos;
    }

    public Integer getNrcxpedos() {
        return nrcxpedos;
    }

    public void setNrcxpedos(Integer nrcxpedos) {
        this.nrcxpedos = nrcxpedos;
    }

    public Date getDtemipedos() {
        return dtemipedos;
    }

    public void setDtemipedos(Date dtemipedos) {
        this.dtemipedos = dtemipedos;
    }

    public Integer getCdusupedos() {
        return cdusupedos;
    }

    public void setCdusupedos(Integer cdusupedos) {
        this.cdusupedos = cdusupedos;
    }

    public String getNmusupedos() {
        return nmusupedos;
    }

    public void setNmusupedos(String nmusupedos) {
        this.nmusupedos = nmusupedos;
    }

    public String getNomcomp() {
        return nomcomp;
    }

    public void setNomcomp(String nomcomp) {
        this.nomcomp = nomcomp;
    }

    public String getMotcancel() {
        return motcancel;
    }

    public void setMotcancel(String motcancel) {
        this.motcancel = motcancel;
    }

    public Date getDthrlanc() {
        return dthrlanc;
    }

    public void setDthrlanc(Date dthrlanc) {
        this.dthrlanc = dthrlanc;
    }

    public String getObsvenda() {
        return obsvenda;
    }

    public void setObsvenda(String obsvenda) {
        this.obsvenda = obsvenda;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public Integer getTotpontos() {
        return totpontos;
    }

    public void setTotpontos(Integer totpontos) {
        this.totpontos = totpontos;
    }

    public Double getPercacrdes() {
        return percacrdes;
    }

    public void setPercacrdes(Double percacrdes) {
        this.percacrdes = percacrdes;
    }

    public String getTppagam() {
        return tppagam;
    }

    public void setTppagam(String tppagam) {
        this.tppagam = tppagam;
    }

    public String getRgie() {
        return rgie;
    }

    public void setRgie(String rgie) {
        this.rgie = rgie;
    }

    public Integer getCodusdes() {
        return codusdes;
    }

    public void setCodusdes(Integer codusdes) {
        this.codusdes = codusdes;
    }

    public String getUsuardes() {
        return usuardes;
    }

    public void setUsuardes(String usuardes) {
        this.usuardes = usuardes;
    }

    public Character getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Character devolucao) {
        this.devolucao = devolucao;
    }

    public String getNrconvei() {
        return nrconvei;
    }

    public void setNrconvei(String nrconvei) {
        this.nrconvei = nrconvei;
    }

    public Character getEntregue() {
        return entregue;
    }

    public void setEntregue(Character entregue) {
        this.entregue = entregue;
    }

    public Integer getNrentrega() {
        return nrentrega;
    }

    public void setNrentrega(Integer nrentrega) {
        this.nrentrega = nrentrega;
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

    public Character getSerieserv() {
        return serieserv;
    }

    public void setSerieserv(Character serieserv) {
        this.serieserv = serieserv;
    }

    public Character getTiposerv() {
        return tiposerv;
    }

    public void setTiposerv(Character tiposerv) {
        this.tiposerv = tiposerv;
    }

    public String getNrfisserv() {
        return nrfisserv;
    }

    public void setNrfisserv(String nrfisserv) {
        this.nrfisserv = nrfisserv;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDtagenda() {
        return dtagenda;
    }

    public void setDtagenda(Date dtagenda) {
        this.dtagenda = dtagenda;
    }

    public String getHragenda() {
        return hragenda;
    }

    public void setHragenda(String hragenda) {
        this.hragenda = hragenda;
    }

    public Date getDtentrega() {
        return dtentrega;
    }

    public void setDtentrega(Date dtentrega) {
        this.dtentrega = dtentrega;
    }

    public String getHrentrega() {
        return hrentrega;
    }

    public void setHrentrega(String hrentrega) {
        this.hrentrega = hrentrega;
    }

    public String getNrendcli() {
        return nrendcli;
    }

    public void setNrendcli(String nrendcli) {
        this.nrendcli = nrendcli;
    }

    public Character getEscriturado() {
        return escriturado;
    }

    public void setEscriturado(Character escriturado) {
        this.escriturado = escriturado;
    }

    public Double getVltotprod() {
        return vltotprod;
    }

    public void setVltotprod(Double vltotprod) {
        this.vltotprod = vltotprod;
    }

    public Double getBssubtrib() {
        return bssubtrib;
    }

    public void setBssubtrib(Double bssubtrib) {
        this.bssubtrib = bssubtrib;
    }

    public Double getVlsubtrib() {
        return vlsubtrib;
    }

    public void setVlsubtrib(Double vlsubtrib) {
        this.vlsubtrib = vlsubtrib;
    }

    public Double getVltotipi() {
        return vltotipi;
    }

    public void setVltotipi(Double vltotipi) {
        this.vltotipi = vltotipi;
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

    public Double getOutrdesp() {
        return outrdesp;
    }

    public void setOutrdesp(Double outrdesp) {
        this.outrdesp = outrdesp;
    }

    public Double getVltotdes() {
        return vltotdes;
    }

    public void setVltotdes(Double vltotdes) {
        this.vltotdes = vltotdes;
    }

    public Double getVltotnota() {
        return vltotnota;
    }

    public void setVltotnota(Double vltotnota) {
        this.vltotnota = vltotnota;
    }

    public Character getImpcupom() {
        return impcupom;
    }

    public void setImpcupom(Character impcupom) {
        this.impcupom = impcupom;
    }

    public String getSerieecf() {
        return serieecf;
    }

    public void setSerieecf(String serieecf) {
        this.serieecf = serieecf;
    }

    public String getNrcaixaecf() {
        return nrcaixaecf;
    }

    public void setNrcaixaecf(String nrcaixaecf) {
        this.nrcaixaecf = nrcaixaecf;
    }

    public String getNrcupecf() {
        return nrcupecf;
    }

    public void setNrcupecf(String nrcupecf) {
        this.nrcupecf = nrcupecf;
    }

    public Date getDtemiecf() {
        return dtemiecf;
    }

    public void setDtemiecf(Date dtemiecf) {
        this.dtemiecf = dtemiecf;
    }

    public Character getImpnotaf() {
        return impnotaf;
    }

    public void setImpnotaf(Character impnotaf) {
        this.impnotaf = impnotaf;
    }

    public String getNrnotaf() {
        return nrnotaf;
    }

    public void setNrnotaf(String nrnotaf) {
        this.nrnotaf = nrnotaf;
    }

    public Date getDteminotaf() {
        return dteminotaf;
    }

    public void setDteminotaf(Date dteminotaf) {
        this.dteminotaf = dteminotaf;
    }

    public Character getImpnfe() {
        return impnfe;
    }

    public void setImpnfe(Character impnfe) {
        this.impnfe = impnfe;
    }

    public String getNrnfe() {
        return nrnfe;
    }

    public void setNrnfe(String nrnfe) {
        this.nrnfe = nrnfe;
    }

    public Date getDteminfe() {
        return dteminfe;
    }

    public void setDteminfe(Date dteminfe) {
        this.dteminfe = dteminfe;
    }

    public Integer getCodforma() {
        return codforma;
    }

    public void setCodforma(Integer codforma) {
        this.codforma = codforma;
    }

    public String getNomforma() {
        return nomforma;
    }

    public void setNomforma(String nomforma) {
        this.nomforma = nomforma;
    }

    public Character getBonifica() {
        return bonifica;
    }

    public void setBonifica(Character bonifica) {
        this.bonifica = bonifica;
    }

    public Character getEmissbol() {
        return emissbol;
    }

    public void setEmissbol(Character emissbol) {
        this.emissbol = emissbol;
    }

    public Character getEmitnfe() {
        return emitnfe;
    }

    public void setEmitnfe(Character emitnfe) {
        this.emitnfe = emitnfe;
    }

    public String getSserie() {
        return sserie;
    }

    public void setSserie(String sserie) {
        this.sserie = sserie;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    public Date getDatasai() {
        return datasai;
    }

    public void setDatasai(Date datasai) {
        this.datasai = datasai;
    }

    public String getHorasai() {
        return horasai;
    }

    public void setHorasai(String horasai) {
        this.horasai = horasai;
    }

    public Character getFrete() {
        return frete;
    }

    public void setFrete(Character frete) {
        this.frete = frete;
    }

    public Double getCcv() {
        return ccv;
    }

    public void setCcv(Double ccv) {
        this.ccv = ccv;
    }

    public Double getSaldoanterior() {
        return saldoanterior;
    }

    public void setSaldoanterior(Double saldoanterior) {
        this.saldoanterior = saldoanterior;
    }


    public Notasainf getNotasainf() {
        return notasainf;
    }

    public void setNotasainf(Notasainf notasainf) {
        this.notasainf = notasainf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notasai)) {
            return false;
        }
        Notasai other = (Notasai) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notasai[ nrcontr=" + nrcontr + " ]";
    }
    
}
