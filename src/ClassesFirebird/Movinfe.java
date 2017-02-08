/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movinfe {

    private static final long serialVersionUID = 1L;
    private Integer keynfe;
    private int codfil;
    private String id;
    private String versao;
    private String cuf;
    private String cnf;
    private String natop;
    private String indpag;
    private String mod;
    private String serie;
    private String nnf;
    private Date demi;
    private Date dsaient;
    private String hsaient;
    private String tpnf;
    private String cmunfg;
    private String tpimp;
    private String tpemis;
    private String cdv;
    private String tpamb;
    private String finnfe;
    private String procemi;
    private String verproc;
    private Date dhcont;
    private String xjust;
    private String emitcnpj;
    private String emitxnome;
    private String emitxfant;
    private String emitxlgr;
    private String emitnro;
    private String emitxcpl;
    private String emitxbairro;
    private String emitmun;
    private String emitxmun;
    private String emituf;
    private String emitcep;
    private String emitcpais;
    private String emitxpais;
    private String emitfone;
    private String emitie;
    private String emitiest;
    private String emitim;
    private String emitcnae;
    private String emitcrt;
    private String destcnpj;
    private String destxnome;
    private String destxlgr;
    private String destnro;
    private String destxcpl;
    private String destxbairro;
    private String destcmun;
    private String destxmun;
    private String destuf;
    private String destcep;
    private String destcpais;
    private String destxpais;
    private String destfone;
    private String destie;
    private String destisuf;
    private String destemail;
    private String retcnpj;
    private String retxlgr;
    private String retnro;
    private String retxcpl;
    private String retxbairro;
    private String retcmun;
    private String retxmun;
    private String retuf;
    private String entcnpj;
    private String entxlgr;
    private String entnro;
    private String entxcpl;
    private String entxbairro;
    private String entcmun;
    private String entxmun;
    private String entuf;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double totvbc;
    private Double totvicms;
    private Double totvbcst;
    private Double totvst;
    private Double totvprod;
    private Double totvfrete;
    private Double totvseg;
    private Double totvdesc;
    private Double totvii;
    private Double totvipi;
    private Double totvpis;
    private Double totvcofins;
    private Double totvoutro;
    private Double totvnf;
    private Double totsvserv;
    private Double totsvbc;
    private Double totsiss;
    private Double totsvpis;
    private Double totsvcofins;
    private Double totrvretpis;
    private Double totrvretcofins;
    private Double totrvretcsll;
    private Double totrvbcirrf;
    private Double totrvirrf;
    private Double totrvbcretprev;
    private Double totrvretprev;
    private String modfrete;
    private String transcnpj;
    private String transxnome;
    private String transie;
    private String transxender;
    private String transxmun;
    private String transuf;
    private Double transvserv;
    private Double transvbcret;
    private Double transpicmsret;
    private Double transvicmsret;
    private String transcfop;
    private String transcmunfg;
    private String transveicplaca;
    private String transveicuf;
    private String transveicrntc;
    private String cobrnfat;
    private Double cobrvorig;
    private Double cobrvdesc;
    private Double cobrcliq;
    private String infadfisco;
    private String infcpl;
    private String expufembarq;
    private String expxlocembarq;
    private String expxnemp;
    private String expxped;
    private String expxcont;
    private String desttpcnpj;
    private String localret;
    private String localent;
    private String transp;
    private String tptransp;
    private String isendest;
    private String isentrans;
    private String origdoc;
    private String coddocum;
    private String situacao;
    private String nrec;
    private Date dhrecbto;
    private String sitautor;
    private String danfeimp;
    private Integer nrlote;
    private String nprot;
    private String codmot;
    private String motivo;
    private String obscanci;
    private String nprotci;
    private String codmotci;
    private String motivoci;
    private Date dhrecbtoci;
    private String xmlaprrep;
    private String xmldelina;
    private String xmlenvio;
    private Character sped;
    private Double vltottrib;
    private String iddest;
    private String indfinal;
    private String indpres;
    private String destautcnpj;
    private Double totvicmsdeson;
    private String expxlocdespacho;

    public Movinfe() {
    }

    public Movinfe(Integer keynfe) {
        this.keynfe = keynfe;
    }

    public Movinfe(Integer keynfe, int codfil, String id) {
        this.keynfe = keynfe;
        this.codfil = codfil;
        this.id = id;
    }

    public Integer getKeynfe() {
        return keynfe;
    }

    public void setKeynfe(Integer keynfe) {
        this.keynfe = keynfe;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getCuf() {
        return cuf;
    }

    public void setCuf(String cuf) {
        this.cuf = cuf;
    }

    public String getCnf() {
        return cnf;
    }

    public void setCnf(String cnf) {
        this.cnf = cnf;
    }

    public String getNatop() {
        return natop;
    }

    public void setNatop(String natop) {
        this.natop = natop;
    }

    public String getIndpag() {
        return indpag;
    }

    public void setIndpag(String indpag) {
        this.indpag = indpag;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNnf() {
        return nnf;
    }

    public void setNnf(String nnf) {
        this.nnf = nnf;
    }

    public Date getDemi() {
        return demi;
    }

    public void setDemi(Date demi) {
        this.demi = demi;
    }

    public Date getDsaient() {
        return dsaient;
    }

    public void setDsaient(Date dsaient) {
        this.dsaient = dsaient;
    }

    public String getHsaient() {
        return hsaient;
    }

    public void setHsaient(String hsaient) {
        this.hsaient = hsaient;
    }

    public String getTpnf() {
        return tpnf;
    }

    public void setTpnf(String tpnf) {
        this.tpnf = tpnf;
    }

    public String getCmunfg() {
        return cmunfg;
    }

    public void setCmunfg(String cmunfg) {
        this.cmunfg = cmunfg;
    }

    public String getTpimp() {
        return tpimp;
    }

    public void setTpimp(String tpimp) {
        this.tpimp = tpimp;
    }

    public String getTpemis() {
        return tpemis;
    }

    public void setTpemis(String tpemis) {
        this.tpemis = tpemis;
    }

    public String getCdv() {
        return cdv;
    }

    public void setCdv(String cdv) {
        this.cdv = cdv;
    }

    public String getTpamb() {
        return tpamb;
    }

    public void setTpamb(String tpamb) {
        this.tpamb = tpamb;
    }

    public String getFinnfe() {
        return finnfe;
    }

    public void setFinnfe(String finnfe) {
        this.finnfe = finnfe;
    }

    public String getProcemi() {
        return procemi;
    }

    public void setProcemi(String procemi) {
        this.procemi = procemi;
    }

    public String getVerproc() {
        return verproc;
    }

    public void setVerproc(String verproc) {
        this.verproc = verproc;
    }

    public Date getDhcont() {
        return dhcont;
    }

    public void setDhcont(Date dhcont) {
        this.dhcont = dhcont;
    }

    public String getXjust() {
        return xjust;
    }

    public void setXjust(String xjust) {
        this.xjust = xjust;
    }

    public String getEmitcnpj() {
        return emitcnpj;
    }

    public void setEmitcnpj(String emitcnpj) {
        this.emitcnpj = emitcnpj;
    }

    public String getEmitxnome() {
        return emitxnome;
    }

    public void setEmitxnome(String emitxnome) {
        this.emitxnome = emitxnome;
    }

    public String getEmitxfant() {
        return emitxfant;
    }

    public void setEmitxfant(String emitxfant) {
        this.emitxfant = emitxfant;
    }

    public String getEmitxlgr() {
        return emitxlgr;
    }

    public void setEmitxlgr(String emitxlgr) {
        this.emitxlgr = emitxlgr;
    }

    public String getEmitnro() {
        return emitnro;
    }

    public void setEmitnro(String emitnro) {
        this.emitnro = emitnro;
    }

    public String getEmitxcpl() {
        return emitxcpl;
    }

    public void setEmitxcpl(String emitxcpl) {
        this.emitxcpl = emitxcpl;
    }

    public String getEmitxbairro() {
        return emitxbairro;
    }

    public void setEmitxbairro(String emitxbairro) {
        this.emitxbairro = emitxbairro;
    }

    public String getEmitmun() {
        return emitmun;
    }

    public void setEmitmun(String emitmun) {
        this.emitmun = emitmun;
    }

    public String getEmitxmun() {
        return emitxmun;
    }

    public void setEmitxmun(String emitxmun) {
        this.emitxmun = emitxmun;
    }

    public String getEmituf() {
        return emituf;
    }

    public void setEmituf(String emituf) {
        this.emituf = emituf;
    }

    public String getEmitcep() {
        return emitcep;
    }

    public void setEmitcep(String emitcep) {
        this.emitcep = emitcep;
    }

    public String getEmitcpais() {
        return emitcpais;
    }

    public void setEmitcpais(String emitcpais) {
        this.emitcpais = emitcpais;
    }

    public String getEmitxpais() {
        return emitxpais;
    }

    public void setEmitxpais(String emitxpais) {
        this.emitxpais = emitxpais;
    }

    public String getEmitfone() {
        return emitfone;
    }

    public void setEmitfone(String emitfone) {
        this.emitfone = emitfone;
    }

    public String getEmitie() {
        return emitie;
    }

    public void setEmitie(String emitie) {
        this.emitie = emitie;
    }

    public String getEmitiest() {
        return emitiest;
    }

    public void setEmitiest(String emitiest) {
        this.emitiest = emitiest;
    }

    public String getEmitim() {
        return emitim;
    }

    public void setEmitim(String emitim) {
        this.emitim = emitim;
    }

    public String getEmitcnae() {
        return emitcnae;
    }

    public void setEmitcnae(String emitcnae) {
        this.emitcnae = emitcnae;
    }

    public String getEmitcrt() {
        return emitcrt;
    }

    public void setEmitcrt(String emitcrt) {
        this.emitcrt = emitcrt;
    }

    public String getDestcnpj() {
        return destcnpj;
    }

    public void setDestcnpj(String destcnpj) {
        this.destcnpj = destcnpj;
    }

    public String getDestxnome() {
        return destxnome;
    }

    public void setDestxnome(String destxnome) {
        this.destxnome = destxnome;
    }

    public String getDestxlgr() {
        return destxlgr;
    }

    public void setDestxlgr(String destxlgr) {
        this.destxlgr = destxlgr;
    }

    public String getDestnro() {
        return destnro;
    }

    public void setDestnro(String destnro) {
        this.destnro = destnro;
    }

    public String getDestxcpl() {
        return destxcpl;
    }

    public void setDestxcpl(String destxcpl) {
        this.destxcpl = destxcpl;
    }

    public String getDestxbairro() {
        return destxbairro;
    }

    public void setDestxbairro(String destxbairro) {
        this.destxbairro = destxbairro;
    }

    public String getDestcmun() {
        return destcmun;
    }

    public void setDestcmun(String destcmun) {
        this.destcmun = destcmun;
    }

    public String getDestxmun() {
        return destxmun;
    }

    public void setDestxmun(String destxmun) {
        this.destxmun = destxmun;
    }

    public String getDestuf() {
        return destuf;
    }

    public void setDestuf(String destuf) {
        this.destuf = destuf;
    }

    public String getDestcep() {
        return destcep;
    }

    public void setDestcep(String destcep) {
        this.destcep = destcep;
    }

    public String getDestcpais() {
        return destcpais;
    }

    public void setDestcpais(String destcpais) {
        this.destcpais = destcpais;
    }

    public String getDestxpais() {
        return destxpais;
    }

    public void setDestxpais(String destxpais) {
        this.destxpais = destxpais;
    }

    public String getDestfone() {
        return destfone;
    }

    public void setDestfone(String destfone) {
        this.destfone = destfone;
    }

    public String getDestie() {
        return destie;
    }

    public void setDestie(String destie) {
        this.destie = destie;
    }

    public String getDestisuf() {
        return destisuf;
    }

    public void setDestisuf(String destisuf) {
        this.destisuf = destisuf;
    }

    public String getDestemail() {
        return destemail;
    }

    public void setDestemail(String destemail) {
        this.destemail = destemail;
    }

    public String getRetcnpj() {
        return retcnpj;
    }

    public void setRetcnpj(String retcnpj) {
        this.retcnpj = retcnpj;
    }

    public String getRetxlgr() {
        return retxlgr;
    }

    public void setRetxlgr(String retxlgr) {
        this.retxlgr = retxlgr;
    }

    public String getRetnro() {
        return retnro;
    }

    public void setRetnro(String retnro) {
        this.retnro = retnro;
    }

    public String getRetxcpl() {
        return retxcpl;
    }

    public void setRetxcpl(String retxcpl) {
        this.retxcpl = retxcpl;
    }

    public String getRetxbairro() {
        return retxbairro;
    }

    public void setRetxbairro(String retxbairro) {
        this.retxbairro = retxbairro;
    }

    public String getRetcmun() {
        return retcmun;
    }

    public void setRetcmun(String retcmun) {
        this.retcmun = retcmun;
    }

    public String getRetxmun() {
        return retxmun;
    }

    public void setRetxmun(String retxmun) {
        this.retxmun = retxmun;
    }

    public String getRetuf() {
        return retuf;
    }

    public void setRetuf(String retuf) {
        this.retuf = retuf;
    }

    public String getEntcnpj() {
        return entcnpj;
    }

    public void setEntcnpj(String entcnpj) {
        this.entcnpj = entcnpj;
    }

    public String getEntxlgr() {
        return entxlgr;
    }

    public void setEntxlgr(String entxlgr) {
        this.entxlgr = entxlgr;
    }

    public String getEntnro() {
        return entnro;
    }

    public void setEntnro(String entnro) {
        this.entnro = entnro;
    }

    public String getEntxcpl() {
        return entxcpl;
    }

    public void setEntxcpl(String entxcpl) {
        this.entxcpl = entxcpl;
    }

    public String getEntxbairro() {
        return entxbairro;
    }

    public void setEntxbairro(String entxbairro) {
        this.entxbairro = entxbairro;
    }

    public String getEntcmun() {
        return entcmun;
    }

    public void setEntcmun(String entcmun) {
        this.entcmun = entcmun;
    }

    public String getEntxmun() {
        return entxmun;
    }

    public void setEntxmun(String entxmun) {
        this.entxmun = entxmun;
    }

    public String getEntuf() {
        return entuf;
    }

    public void setEntuf(String entuf) {
        this.entuf = entuf;
    }

    public Double getTotvbc() {
        return totvbc;
    }

    public void setTotvbc(Double totvbc) {
        this.totvbc = totvbc;
    }

    public Double getTotvicms() {
        return totvicms;
    }

    public void setTotvicms(Double totvicms) {
        this.totvicms = totvicms;
    }

    public Double getTotvbcst() {
        return totvbcst;
    }

    public void setTotvbcst(Double totvbcst) {
        this.totvbcst = totvbcst;
    }

    public Double getTotvst() {
        return totvst;
    }

    public void setTotvst(Double totvst) {
        this.totvst = totvst;
    }

    public Double getTotvprod() {
        return totvprod;
    }

    public void setTotvprod(Double totvprod) {
        this.totvprod = totvprod;
    }

    public Double getTotvfrete() {
        return totvfrete;
    }

    public void setTotvfrete(Double totvfrete) {
        this.totvfrete = totvfrete;
    }

    public Double getTotvseg() {
        return totvseg;
    }

    public void setTotvseg(Double totvseg) {
        this.totvseg = totvseg;
    }

    public Double getTotvdesc() {
        return totvdesc;
    }

    public void setTotvdesc(Double totvdesc) {
        this.totvdesc = totvdesc;
    }

    public Double getTotvii() {
        return totvii;
    }

    public void setTotvii(Double totvii) {
        this.totvii = totvii;
    }

    public Double getTotvipi() {
        return totvipi;
    }

    public void setTotvipi(Double totvipi) {
        this.totvipi = totvipi;
    }

    public Double getTotvpis() {
        return totvpis;
    }

    public void setTotvpis(Double totvpis) {
        this.totvpis = totvpis;
    }

    public Double getTotvcofins() {
        return totvcofins;
    }

    public void setTotvcofins(Double totvcofins) {
        this.totvcofins = totvcofins;
    }

    public Double getTotvoutro() {
        return totvoutro;
    }

    public void setTotvoutro(Double totvoutro) {
        this.totvoutro = totvoutro;
    }

    public Double getTotvnf() {
        return totvnf;
    }

    public void setTotvnf(Double totvnf) {
        this.totvnf = totvnf;
    }

    public Double getTotsvserv() {
        return totsvserv;
    }

    public void setTotsvserv(Double totsvserv) {
        this.totsvserv = totsvserv;
    }

    public Double getTotsvbc() {
        return totsvbc;
    }

    public void setTotsvbc(Double totsvbc) {
        this.totsvbc = totsvbc;
    }

    public Double getTotsiss() {
        return totsiss;
    }

    public void setTotsiss(Double totsiss) {
        this.totsiss = totsiss;
    }

    public Double getTotsvpis() {
        return totsvpis;
    }

    public void setTotsvpis(Double totsvpis) {
        this.totsvpis = totsvpis;
    }

    public Double getTotsvcofins() {
        return totsvcofins;
    }

    public void setTotsvcofins(Double totsvcofins) {
        this.totsvcofins = totsvcofins;
    }

    public Double getTotrvretpis() {
        return totrvretpis;
    }

    public void setTotrvretpis(Double totrvretpis) {
        this.totrvretpis = totrvretpis;
    }

    public Double getTotrvretcofins() {
        return totrvretcofins;
    }

    public void setTotrvretcofins(Double totrvretcofins) {
        this.totrvretcofins = totrvretcofins;
    }

    public Double getTotrvretcsll() {
        return totrvretcsll;
    }

    public void setTotrvretcsll(Double totrvretcsll) {
        this.totrvretcsll = totrvretcsll;
    }

    public Double getTotrvbcirrf() {
        return totrvbcirrf;
    }

    public void setTotrvbcirrf(Double totrvbcirrf) {
        this.totrvbcirrf = totrvbcirrf;
    }

    public Double getTotrvirrf() {
        return totrvirrf;
    }

    public void setTotrvirrf(Double totrvirrf) {
        this.totrvirrf = totrvirrf;
    }

    public Double getTotrvbcretprev() {
        return totrvbcretprev;
    }

    public void setTotrvbcretprev(Double totrvbcretprev) {
        this.totrvbcretprev = totrvbcretprev;
    }

    public Double getTotrvretprev() {
        return totrvretprev;
    }

    public void setTotrvretprev(Double totrvretprev) {
        this.totrvretprev = totrvretprev;
    }

    public String getModfrete() {
        return modfrete;
    }

    public void setModfrete(String modfrete) {
        this.modfrete = modfrete;
    }

    public String getTranscnpj() {
        return transcnpj;
    }

    public void setTranscnpj(String transcnpj) {
        this.transcnpj = transcnpj;
    }

    public String getTransxnome() {
        return transxnome;
    }

    public void setTransxnome(String transxnome) {
        this.transxnome = transxnome;
    }

    public String getTransie() {
        return transie;
    }

    public void setTransie(String transie) {
        this.transie = transie;
    }

    public String getTransxender() {
        return transxender;
    }

    public void setTransxender(String transxender) {
        this.transxender = transxender;
    }

    public String getTransxmun() {
        return transxmun;
    }

    public void setTransxmun(String transxmun) {
        this.transxmun = transxmun;
    }

    public String getTransuf() {
        return transuf;
    }

    public void setTransuf(String transuf) {
        this.transuf = transuf;
    }

    public Double getTransvserv() {
        return transvserv;
    }

    public void setTransvserv(Double transvserv) {
        this.transvserv = transvserv;
    }

    public Double getTransvbcret() {
        return transvbcret;
    }

    public void setTransvbcret(Double transvbcret) {
        this.transvbcret = transvbcret;
    }

    public Double getTranspicmsret() {
        return transpicmsret;
    }

    public void setTranspicmsret(Double transpicmsret) {
        this.transpicmsret = transpicmsret;
    }

    public Double getTransvicmsret() {
        return transvicmsret;
    }

    public void setTransvicmsret(Double transvicmsret) {
        this.transvicmsret = transvicmsret;
    }

    public String getTranscfop() {
        return transcfop;
    }

    public void setTranscfop(String transcfop) {
        this.transcfop = transcfop;
    }

    public String getTranscmunfg() {
        return transcmunfg;
    }

    public void setTranscmunfg(String transcmunfg) {
        this.transcmunfg = transcmunfg;
    }

    public String getTransveicplaca() {
        return transveicplaca;
    }

    public void setTransveicplaca(String transveicplaca) {
        this.transveicplaca = transveicplaca;
    }

    public String getTransveicuf() {
        return transveicuf;
    }

    public void setTransveicuf(String transveicuf) {
        this.transveicuf = transveicuf;
    }

    public String getTransveicrntc() {
        return transveicrntc;
    }

    public void setTransveicrntc(String transveicrntc) {
        this.transveicrntc = transveicrntc;
    }

    public String getCobrnfat() {
        return cobrnfat;
    }

    public void setCobrnfat(String cobrnfat) {
        this.cobrnfat = cobrnfat;
    }

    public Double getCobrvorig() {
        return cobrvorig;
    }

    public void setCobrvorig(Double cobrvorig) {
        this.cobrvorig = cobrvorig;
    }

    public Double getCobrvdesc() {
        return cobrvdesc;
    }

    public void setCobrvdesc(Double cobrvdesc) {
        this.cobrvdesc = cobrvdesc;
    }

    public Double getCobrcliq() {
        return cobrcliq;
    }

    public void setCobrcliq(Double cobrcliq) {
        this.cobrcliq = cobrcliq;
    }

    public String getInfadfisco() {
        return infadfisco;
    }

    public void setInfadfisco(String infadfisco) {
        this.infadfisco = infadfisco;
    }

    public String getInfcpl() {
        return infcpl;
    }

    public void setInfcpl(String infcpl) {
        this.infcpl = infcpl;
    }

    public String getExpufembarq() {
        return expufembarq;
    }

    public void setExpufembarq(String expufembarq) {
        this.expufembarq = expufembarq;
    }

    public String getExpxlocembarq() {
        return expxlocembarq;
    }

    public void setExpxlocembarq(String expxlocembarq) {
        this.expxlocembarq = expxlocembarq;
    }

    public String getExpxnemp() {
        return expxnemp;
    }

    public void setExpxnemp(String expxnemp) {
        this.expxnemp = expxnemp;
    }

    public String getExpxped() {
        return expxped;
    }

    public void setExpxped(String expxped) {
        this.expxped = expxped;
    }

    public String getExpxcont() {
        return expxcont;
    }

    public void setExpxcont(String expxcont) {
        this.expxcont = expxcont;
    }

    public String getDesttpcnpj() {
        return desttpcnpj;
    }

    public void setDesttpcnpj(String desttpcnpj) {
        this.desttpcnpj = desttpcnpj;
    }

    public String getLocalret() {
        return localret;
    }

    public void setLocalret(String localret) {
        this.localret = localret;
    }

    public String getLocalent() {
        return localent;
    }

    public void setLocalent(String localent) {
        this.localent = localent;
    }

    public String getTransp() {
        return transp;
    }

    public void setTransp(String transp) {
        this.transp = transp;
    }

    public String getTptransp() {
        return tptransp;
    }

    public void setTptransp(String tptransp) {
        this.tptransp = tptransp;
    }

    public String getIsendest() {
        return isendest;
    }

    public void setIsendest(String isendest) {
        this.isendest = isendest;
    }

    public String getIsentrans() {
        return isentrans;
    }

    public void setIsentrans(String isentrans) {
        this.isentrans = isentrans;
    }

    public String getOrigdoc() {
        return origdoc;
    }

    public void setOrigdoc(String origdoc) {
        this.origdoc = origdoc;
    }

    public String getCoddocum() {
        return coddocum;
    }

    public void setCoddocum(String coddocum) {
        this.coddocum = coddocum;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNrec() {
        return nrec;
    }

    public void setNrec(String nrec) {
        this.nrec = nrec;
    }

    public Date getDhrecbto() {
        return dhrecbto;
    }

    public void setDhrecbto(Date dhrecbto) {
        this.dhrecbto = dhrecbto;
    }

    public String getSitautor() {
        return sitautor;
    }

    public void setSitautor(String sitautor) {
        this.sitautor = sitautor;
    }

    public String getDanfeimp() {
        return danfeimp;
    }

    public void setDanfeimp(String danfeimp) {
        this.danfeimp = danfeimp;
    }

    public Integer getNrlote() {
        return nrlote;
    }

    public void setNrlote(Integer nrlote) {
        this.nrlote = nrlote;
    }

    public String getNprot() {
        return nprot;
    }

    public void setNprot(String nprot) {
        this.nprot = nprot;
    }

    public String getCodmot() {
        return codmot;
    }

    public void setCodmot(String codmot) {
        this.codmot = codmot;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObscanci() {
        return obscanci;
    }

    public void setObscanci(String obscanci) {
        this.obscanci = obscanci;
    }

    public String getNprotci() {
        return nprotci;
    }

    public void setNprotci(String nprotci) {
        this.nprotci = nprotci;
    }

    public String getCodmotci() {
        return codmotci;
    }

    public void setCodmotci(String codmotci) {
        this.codmotci = codmotci;
    }

    public String getMotivoci() {
        return motivoci;
    }

    public void setMotivoci(String motivoci) {
        this.motivoci = motivoci;
    }

    public Date getDhrecbtoci() {
        return dhrecbtoci;
    }

    public void setDhrecbtoci(Date dhrecbtoci) {
        this.dhrecbtoci = dhrecbtoci;
    }

    public String getXmlaprrep() {
        return xmlaprrep;
    }

    public void setXmlaprrep(String xmlaprrep) {
        this.xmlaprrep = xmlaprrep;
    }

    public String getXmldelina() {
        return xmldelina;
    }

    public void setXmldelina(String xmldelina) {
        this.xmldelina = xmldelina;
    }

    public String getXmlenvio() {
        return xmlenvio;
    }

    public void setXmlenvio(String xmlenvio) {
        this.xmlenvio = xmlenvio;
    }

    public Character getSped() {
        return sped;
    }

    public void setSped(Character sped) {
        this.sped = sped;
    }

    public Double getVltottrib() {
        return vltottrib;
    }

    public void setVltottrib(Double vltottrib) {
        this.vltottrib = vltottrib;
    }

    public String getIddest() {
        return iddest;
    }

    public void setIddest(String iddest) {
        this.iddest = iddest;
    }

    public String getIndfinal() {
        return indfinal;
    }

    public void setIndfinal(String indfinal) {
        this.indfinal = indfinal;
    }

    public String getIndpres() {
        return indpres;
    }

    public void setIndpres(String indpres) {
        this.indpres = indpres;
    }

    public String getDestautcnpj() {
        return destautcnpj;
    }

    public void setDestautcnpj(String destautcnpj) {
        this.destautcnpj = destautcnpj;
    }

    public Double getTotvicmsdeson() {
        return totvicmsdeson;
    }

    public void setTotvicmsdeson(Double totvicmsdeson) {
        this.totvicmsdeson = totvicmsdeson;
    }

    public String getExpxlocdespacho() {
        return expxlocdespacho;
    }

    public void setExpxlocdespacho(String expxlocdespacho) {
        this.expxlocdespacho = expxlocdespacho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keynfe != null ? keynfe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movinfe)) {
            return false;
        }
        Movinfe other = (Movinfe) object;
        if ((this.keynfe == null && other.keynfe != null) || (this.keynfe != null && !this.keynfe.equals(other.keynfe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movinfe[ keynfe=" + keynfe + " ]";
    }
    
}
