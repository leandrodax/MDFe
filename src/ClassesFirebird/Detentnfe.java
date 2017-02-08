/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Detentnfe implements Serializable {
    private static final long serialVersionUID = 1L;
    protected DetentnfePK detentnfePK;
    private String cprod;
    private String codpro;
    private String unident;
    private String cfopent;
    private String cean;
    private String xprod;
    private String ncm;
    private String extipi;
    private String cfop;
    private String ucom;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qcom;
    private Double vuncom;
    private Double vprod;
    private String ceantrib;
    private String utrib;
    private Double qtrib;
    private Double vuntrib;
    private Double vfrete;
    private Double vseg;
    private Double vdesc;
    private Double voutro;
    private String indtot;
    private String tipoitem;
    private String icmsorig;
    private String icmscst;
    private String icmsmodbc;
    private Double icmsvbc;
    private Double icmspicms;
    private Double icmsvicms;
    private String icmsmodbcst;
    private Double icmspmvast;
    private Double icmspredbcst;
    private Double icmsvbcst;
    private Double icmspicmsst;
    private Double icmsvicmsst;
    private String icmsmotdesicms;
    private Double icmspredbc;
    private Double icmsvbcstret;
    private Double icmsvicmsstret;
    private String ipiclenq;
    private String ipicnpjprod;
    private String ipicselo;
    private Double ipiqselo;
    private String ipicenq;
    private String ipipicst;
    private Double ipivbc;
    private Double ipiqunid;
    private Double ipivunid;
    private Double ipipipi;
    private Double ipivipi;
    private Double importvbc;
    private Double importvdespadu;
    private Double importvii;
    private Double importviof;
    private String piscst;
    private Double pisvbc;
    private Double pisppis;
    private Double qbcprod;
    private Double valiqprod;
    private Double pisvpis;
    private String cofinscst;
    private Double cofinsvbc;
    private Double cofinspcofins;
    private Double cofinsqbcprod;
    private Double cofinsvaliqprod;
    private Double cofinsvcofins;
    private Double issvbc;
    private Double issvaliq;
    private Double issvissqn;
    private String isscmunfg;
    private String clistserv;
    private String csittrib;
    private String infadprod1;
    private String infadprod2;
    private String veictpop;
    private String veicchassi;
    private String veicccor;
    private String veicxcor;
    private String veicpot;
    private String veiccilin;
    private String veicpesol;
    private String veicpesob;
    private String veicnserie;
    private String veictpcomb;
    private String veicnmotor;
    private String veiccmt;
    private String veicdist;
    private String veicanomod;
    private String veicanofab;
    private String veictppint;
    private String veictpveic;
    private String veicespveic;
    private String veicvin;
    private String veiccondveic;
    private String veiccmod;
    private String veicccorden;
    private String veiclota;
    private String veictprest;
    private String combcprodanp;
    private String combcodif;
    private Double combqtemp;
    private String combufcons;
    private Double combqbcprod;
    private Double vcombaliqprod;
    private Double combvcide;
    private Double combvbcicms;
    private Double combvicms;
    private Double combvbcicmsst;
    private Double combvicmsst;
    private Double combvbcicmsstdest;
    private Double combvicmsstdest;
    private Double combvbcicmsstcons;
    private Double combvicmsstcons;
    private String genero;
    private String tipoipicalc;
    private String tipopiscalc;
    private String tipopisstcalc;
    private String tipocofinscalc;
    private String tipocofinsstcalc;
    private Double pisvbcst;
    private Double pisppisst;
    private Double qbcprodst;
    private Double valiqprodst;
    private Double pisvpisst;
    private Double cofinsvbcst;
    private Double cofinspcofinsst;
    private Double cofinsqbcprodst;
    private Double cofinsvaliqprodst;
    private Double cofinsvcofinsst;
    private String renavam;
    private String icmsufst;
    private Double icmspbcop;
    private Double icmsvbcstdest;
    private Double icmsvicmsstdest;
    private Double icmspcredsn;
    private Double icmsvcredicmssn;
    private Double fator;
    private Double vltottrib;
    private String descpro;
    private Double qtdunit;
    private String ununit;
    private String nve;
    private String xped;
    private String nitemped;
    private String nfci;
    private Double combpmixgn;
    private Double icmsvicmsdeson;
    private Double icmsvicmsop;
    private Double icmspdif;
    private Double icmsvicmsdif;

    public Detentnfe() {
    }

    public Detentnfe(DetentnfePK detentnfePK) {
        this.detentnfePK = detentnfePK;
    }

    public Detentnfe(int keynfe, int nitem) {
        this.detentnfePK = new DetentnfePK(keynfe, nitem);
    }

    public DetentnfePK getDetentnfePK() {
        return detentnfePK;
    }

    public void setDetentnfePK(DetentnfePK detentnfePK) {
        this.detentnfePK = detentnfePK;
    }

    public String getCprod() {
        return cprod;
    }

    public void setCprod(String cprod) {
        this.cprod = cprod;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getUnident() {
        return unident;
    }

    public void setUnident(String unident) {
        this.unident = unident;
    }

    public String getCfopent() {
        return cfopent;
    }

    public void setCfopent(String cfopent) {
        this.cfopent = cfopent;
    }

    public String getCean() {
        return cean;
    }

    public void setCean(String cean) {
        this.cean = cean;
    }

    public String getXprod() {
        return xprod;
    }

    public void setXprod(String xprod) {
        this.xprod = xprod;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getExtipi() {
        return extipi;
    }

    public void setExtipi(String extipi) {
        this.extipi = extipi;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getUcom() {
        return ucom;
    }

    public void setUcom(String ucom) {
        this.ucom = ucom;
    }

    public Double getQcom() {
        return qcom;
    }

    public void setQcom(Double qcom) {
        this.qcom = qcom;
    }

    public Double getVuncom() {
        return vuncom;
    }

    public void setVuncom(Double vuncom) {
        this.vuncom = vuncom;
    }

    public Double getVprod() {
        return vprod;
    }

    public void setVprod(Double vprod) {
        this.vprod = vprod;
    }

    public String getCeantrib() {
        return ceantrib;
    }

    public void setCeantrib(String ceantrib) {
        this.ceantrib = ceantrib;
    }

    public String getUtrib() {
        return utrib;
    }

    public void setUtrib(String utrib) {
        this.utrib = utrib;
    }

    public Double getQtrib() {
        return qtrib;
    }

    public void setQtrib(Double qtrib) {
        this.qtrib = qtrib;
    }

    public Double getVuntrib() {
        return vuntrib;
    }

    public void setVuntrib(Double vuntrib) {
        this.vuntrib = vuntrib;
    }

    public Double getVfrete() {
        return vfrete;
    }

    public void setVfrete(Double vfrete) {
        this.vfrete = vfrete;
    }

    public Double getVseg() {
        return vseg;
    }

    public void setVseg(Double vseg) {
        this.vseg = vseg;
    }

    public Double getVdesc() {
        return vdesc;
    }

    public void setVdesc(Double vdesc) {
        this.vdesc = vdesc;
    }

    public Double getVoutro() {
        return voutro;
    }

    public void setVoutro(Double voutro) {
        this.voutro = voutro;
    }

    public String getIndtot() {
        return indtot;
    }

    public void setIndtot(String indtot) {
        this.indtot = indtot;
    }

    public String getTipoitem() {
        return tipoitem;
    }

    public void setTipoitem(String tipoitem) {
        this.tipoitem = tipoitem;
    }

    public String getIcmsorig() {
        return icmsorig;
    }

    public void setIcmsorig(String icmsorig) {
        this.icmsorig = icmsorig;
    }

    public String getIcmscst() {
        return icmscst;
    }

    public void setIcmscst(String icmscst) {
        this.icmscst = icmscst;
    }

    public String getIcmsmodbc() {
        return icmsmodbc;
    }

    public void setIcmsmodbc(String icmsmodbc) {
        this.icmsmodbc = icmsmodbc;
    }

    public Double getIcmsvbc() {
        return icmsvbc;
    }

    public void setIcmsvbc(Double icmsvbc) {
        this.icmsvbc = icmsvbc;
    }

    public Double getIcmspicms() {
        return icmspicms;
    }

    public void setIcmspicms(Double icmspicms) {
        this.icmspicms = icmspicms;
    }

    public Double getIcmsvicms() {
        return icmsvicms;
    }

    public void setIcmsvicms(Double icmsvicms) {
        this.icmsvicms = icmsvicms;
    }

    public String getIcmsmodbcst() {
        return icmsmodbcst;
    }

    public void setIcmsmodbcst(String icmsmodbcst) {
        this.icmsmodbcst = icmsmodbcst;
    }

    public Double getIcmspmvast() {
        return icmspmvast;
    }

    public void setIcmspmvast(Double icmspmvast) {
        this.icmspmvast = icmspmvast;
    }

    public Double getIcmspredbcst() {
        return icmspredbcst;
    }

    public void setIcmspredbcst(Double icmspredbcst) {
        this.icmspredbcst = icmspredbcst;
    }

    public Double getIcmsvbcst() {
        return icmsvbcst;
    }

    public void setIcmsvbcst(Double icmsvbcst) {
        this.icmsvbcst = icmsvbcst;
    }

    public Double getIcmspicmsst() {
        return icmspicmsst;
    }

    public void setIcmspicmsst(Double icmspicmsst) {
        this.icmspicmsst = icmspicmsst;
    }

    public Double getIcmsvicmsst() {
        return icmsvicmsst;
    }

    public void setIcmsvicmsst(Double icmsvicmsst) {
        this.icmsvicmsst = icmsvicmsst;
    }

    public String getIcmsmotdesicms() {
        return icmsmotdesicms;
    }

    public void setIcmsmotdesicms(String icmsmotdesicms) {
        this.icmsmotdesicms = icmsmotdesicms;
    }

    public Double getIcmspredbc() {
        return icmspredbc;
    }

    public void setIcmspredbc(Double icmspredbc) {
        this.icmspredbc = icmspredbc;
    }

    public Double getIcmsvbcstret() {
        return icmsvbcstret;
    }

    public void setIcmsvbcstret(Double icmsvbcstret) {
        this.icmsvbcstret = icmsvbcstret;
    }

    public Double getIcmsvicmsstret() {
        return icmsvicmsstret;
    }

    public void setIcmsvicmsstret(Double icmsvicmsstret) {
        this.icmsvicmsstret = icmsvicmsstret;
    }

    public String getIpiclenq() {
        return ipiclenq;
    }

    public void setIpiclenq(String ipiclenq) {
        this.ipiclenq = ipiclenq;
    }

    public String getIpicnpjprod() {
        return ipicnpjprod;
    }

    public void setIpicnpjprod(String ipicnpjprod) {
        this.ipicnpjprod = ipicnpjprod;
    }

    public String getIpicselo() {
        return ipicselo;
    }

    public void setIpicselo(String ipicselo) {
        this.ipicselo = ipicselo;
    }

    public Double getIpiqselo() {
        return ipiqselo;
    }

    public void setIpiqselo(Double ipiqselo) {
        this.ipiqselo = ipiqselo;
    }

    public String getIpicenq() {
        return ipicenq;
    }

    public void setIpicenq(String ipicenq) {
        this.ipicenq = ipicenq;
    }

    public String getIpipicst() {
        return ipipicst;
    }

    public void setIpipicst(String ipipicst) {
        this.ipipicst = ipipicst;
    }

    public Double getIpivbc() {
        return ipivbc;
    }

    public void setIpivbc(Double ipivbc) {
        this.ipivbc = ipivbc;
    }

    public Double getIpiqunid() {
        return ipiqunid;
    }

    public void setIpiqunid(Double ipiqunid) {
        this.ipiqunid = ipiqunid;
    }

    public Double getIpivunid() {
        return ipivunid;
    }

    public void setIpivunid(Double ipivunid) {
        this.ipivunid = ipivunid;
    }

    public Double getIpipipi() {
        return ipipipi;
    }

    public void setIpipipi(Double ipipipi) {
        this.ipipipi = ipipipi;
    }

    public Double getIpivipi() {
        return ipivipi;
    }

    public void setIpivipi(Double ipivipi) {
        this.ipivipi = ipivipi;
    }

    public Double getImportvbc() {
        return importvbc;
    }

    public void setImportvbc(Double importvbc) {
        this.importvbc = importvbc;
    }

    public Double getImportvdespadu() {
        return importvdespadu;
    }

    public void setImportvdespadu(Double importvdespadu) {
        this.importvdespadu = importvdespadu;
    }

    public Double getImportvii() {
        return importvii;
    }

    public void setImportvii(Double importvii) {
        this.importvii = importvii;
    }

    public Double getImportviof() {
        return importviof;
    }

    public void setImportviof(Double importviof) {
        this.importviof = importviof;
    }

    public String getPiscst() {
        return piscst;
    }

    public void setPiscst(String piscst) {
        this.piscst = piscst;
    }

    public Double getPisvbc() {
        return pisvbc;
    }

    public void setPisvbc(Double pisvbc) {
        this.pisvbc = pisvbc;
    }

    public Double getPisppis() {
        return pisppis;
    }

    public void setPisppis(Double pisppis) {
        this.pisppis = pisppis;
    }

    public Double getQbcprod() {
        return qbcprod;
    }

    public void setQbcprod(Double qbcprod) {
        this.qbcprod = qbcprod;
    }

    public Double getValiqprod() {
        return valiqprod;
    }

    public void setValiqprod(Double valiqprod) {
        this.valiqprod = valiqprod;
    }

    public Double getPisvpis() {
        return pisvpis;
    }

    public void setPisvpis(Double pisvpis) {
        this.pisvpis = pisvpis;
    }

    public String getCofinscst() {
        return cofinscst;
    }

    public void setCofinscst(String cofinscst) {
        this.cofinscst = cofinscst;
    }

    public Double getCofinsvbc() {
        return cofinsvbc;
    }

    public void setCofinsvbc(Double cofinsvbc) {
        this.cofinsvbc = cofinsvbc;
    }

    public Double getCofinspcofins() {
        return cofinspcofins;
    }

    public void setCofinspcofins(Double cofinspcofins) {
        this.cofinspcofins = cofinspcofins;
    }

    public Double getCofinsqbcprod() {
        return cofinsqbcprod;
    }

    public void setCofinsqbcprod(Double cofinsqbcprod) {
        this.cofinsqbcprod = cofinsqbcprod;
    }

    public Double getCofinsvaliqprod() {
        return cofinsvaliqprod;
    }

    public void setCofinsvaliqprod(Double cofinsvaliqprod) {
        this.cofinsvaliqprod = cofinsvaliqprod;
    }

    public Double getCofinsvcofins() {
        return cofinsvcofins;
    }

    public void setCofinsvcofins(Double cofinsvcofins) {
        this.cofinsvcofins = cofinsvcofins;
    }

    public Double getIssvbc() {
        return issvbc;
    }

    public void setIssvbc(Double issvbc) {
        this.issvbc = issvbc;
    }

    public Double getIssvaliq() {
        return issvaliq;
    }

    public void setIssvaliq(Double issvaliq) {
        this.issvaliq = issvaliq;
    }

    public Double getIssvissqn() {
        return issvissqn;
    }

    public void setIssvissqn(Double issvissqn) {
        this.issvissqn = issvissqn;
    }

    public String getIsscmunfg() {
        return isscmunfg;
    }

    public void setIsscmunfg(String isscmunfg) {
        this.isscmunfg = isscmunfg;
    }

    public String getClistserv() {
        return clistserv;
    }

    public void setClistserv(String clistserv) {
        this.clistserv = clistserv;
    }

    public String getCsittrib() {
        return csittrib;
    }

    public void setCsittrib(String csittrib) {
        this.csittrib = csittrib;
    }

    public String getInfadprod1() {
        return infadprod1;
    }

    public void setInfadprod1(String infadprod1) {
        this.infadprod1 = infadprod1;
    }

    public String getInfadprod2() {
        return infadprod2;
    }

    public void setInfadprod2(String infadprod2) {
        this.infadprod2 = infadprod2;
    }

    public String getVeictpop() {
        return veictpop;
    }

    public void setVeictpop(String veictpop) {
        this.veictpop = veictpop;
    }

    public String getVeicchassi() {
        return veicchassi;
    }

    public void setVeicchassi(String veicchassi) {
        this.veicchassi = veicchassi;
    }

    public String getVeicccor() {
        return veicccor;
    }

    public void setVeicccor(String veicccor) {
        this.veicccor = veicccor;
    }

    public String getVeicxcor() {
        return veicxcor;
    }

    public void setVeicxcor(String veicxcor) {
        this.veicxcor = veicxcor;
    }

    public String getVeicpot() {
        return veicpot;
    }

    public void setVeicpot(String veicpot) {
        this.veicpot = veicpot;
    }

    public String getVeiccilin() {
        return veiccilin;
    }

    public void setVeiccilin(String veiccilin) {
        this.veiccilin = veiccilin;
    }

    public String getVeicpesol() {
        return veicpesol;
    }

    public void setVeicpesol(String veicpesol) {
        this.veicpesol = veicpesol;
    }

    public String getVeicpesob() {
        return veicpesob;
    }

    public void setVeicpesob(String veicpesob) {
        this.veicpesob = veicpesob;
    }

    public String getVeicnserie() {
        return veicnserie;
    }

    public void setVeicnserie(String veicnserie) {
        this.veicnserie = veicnserie;
    }

    public String getVeictpcomb() {
        return veictpcomb;
    }

    public void setVeictpcomb(String veictpcomb) {
        this.veictpcomb = veictpcomb;
    }

    public String getVeicnmotor() {
        return veicnmotor;
    }

    public void setVeicnmotor(String veicnmotor) {
        this.veicnmotor = veicnmotor;
    }

    public String getVeiccmt() {
        return veiccmt;
    }

    public void setVeiccmt(String veiccmt) {
        this.veiccmt = veiccmt;
    }

    public String getVeicdist() {
        return veicdist;
    }

    public void setVeicdist(String veicdist) {
        this.veicdist = veicdist;
    }

    public String getVeicanomod() {
        return veicanomod;
    }

    public void setVeicanomod(String veicanomod) {
        this.veicanomod = veicanomod;
    }

    public String getVeicanofab() {
        return veicanofab;
    }

    public void setVeicanofab(String veicanofab) {
        this.veicanofab = veicanofab;
    }

    public String getVeictppint() {
        return veictppint;
    }

    public void setVeictppint(String veictppint) {
        this.veictppint = veictppint;
    }

    public String getVeictpveic() {
        return veictpveic;
    }

    public void setVeictpveic(String veictpveic) {
        this.veictpveic = veictpveic;
    }

    public String getVeicespveic() {
        return veicespveic;
    }

    public void setVeicespveic(String veicespveic) {
        this.veicespveic = veicespveic;
    }

    public String getVeicvin() {
        return veicvin;
    }

    public void setVeicvin(String veicvin) {
        this.veicvin = veicvin;
    }

    public String getVeiccondveic() {
        return veiccondveic;
    }

    public void setVeiccondveic(String veiccondveic) {
        this.veiccondveic = veiccondveic;
    }

    public String getVeiccmod() {
        return veiccmod;
    }

    public void setVeiccmod(String veiccmod) {
        this.veiccmod = veiccmod;
    }

    public String getVeicccorden() {
        return veicccorden;
    }

    public void setVeicccorden(String veicccorden) {
        this.veicccorden = veicccorden;
    }

    public String getVeiclota() {
        return veiclota;
    }

    public void setVeiclota(String veiclota) {
        this.veiclota = veiclota;
    }

    public String getVeictprest() {
        return veictprest;
    }

    public void setVeictprest(String veictprest) {
        this.veictprest = veictprest;
    }

    public String getCombcprodanp() {
        return combcprodanp;
    }

    public void setCombcprodanp(String combcprodanp) {
        this.combcprodanp = combcprodanp;
    }

    public String getCombcodif() {
        return combcodif;
    }

    public void setCombcodif(String combcodif) {
        this.combcodif = combcodif;
    }

    public Double getCombqtemp() {
        return combqtemp;
    }

    public void setCombqtemp(Double combqtemp) {
        this.combqtemp = combqtemp;
    }

    public String getCombufcons() {
        return combufcons;
    }

    public void setCombufcons(String combufcons) {
        this.combufcons = combufcons;
    }

    public Double getCombqbcprod() {
        return combqbcprod;
    }

    public void setCombqbcprod(Double combqbcprod) {
        this.combqbcprod = combqbcprod;
    }

    public Double getVcombaliqprod() {
        return vcombaliqprod;
    }

    public void setVcombaliqprod(Double vcombaliqprod) {
        this.vcombaliqprod = vcombaliqprod;
    }

    public Double getCombvcide() {
        return combvcide;
    }

    public void setCombvcide(Double combvcide) {
        this.combvcide = combvcide;
    }

    public Double getCombvbcicms() {
        return combvbcicms;
    }

    public void setCombvbcicms(Double combvbcicms) {
        this.combvbcicms = combvbcicms;
    }

    public Double getCombvicms() {
        return combvicms;
    }

    public void setCombvicms(Double combvicms) {
        this.combvicms = combvicms;
    }

    public Double getCombvbcicmsst() {
        return combvbcicmsst;
    }

    public void setCombvbcicmsst(Double combvbcicmsst) {
        this.combvbcicmsst = combvbcicmsst;
    }

    public Double getCombvicmsst() {
        return combvicmsst;
    }

    public void setCombvicmsst(Double combvicmsst) {
        this.combvicmsst = combvicmsst;
    }

    public Double getCombvbcicmsstdest() {
        return combvbcicmsstdest;
    }

    public void setCombvbcicmsstdest(Double combvbcicmsstdest) {
        this.combvbcicmsstdest = combvbcicmsstdest;
    }

    public Double getCombvicmsstdest() {
        return combvicmsstdest;
    }

    public void setCombvicmsstdest(Double combvicmsstdest) {
        this.combvicmsstdest = combvicmsstdest;
    }

    public Double getCombvbcicmsstcons() {
        return combvbcicmsstcons;
    }

    public void setCombvbcicmsstcons(Double combvbcicmsstcons) {
        this.combvbcicmsstcons = combvbcicmsstcons;
    }

    public Double getCombvicmsstcons() {
        return combvicmsstcons;
    }

    public void setCombvicmsstcons(Double combvicmsstcons) {
        this.combvicmsstcons = combvicmsstcons;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoipicalc() {
        return tipoipicalc;
    }

    public void setTipoipicalc(String tipoipicalc) {
        this.tipoipicalc = tipoipicalc;
    }

    public String getTipopiscalc() {
        return tipopiscalc;
    }

    public void setTipopiscalc(String tipopiscalc) {
        this.tipopiscalc = tipopiscalc;
    }

    public String getTipopisstcalc() {
        return tipopisstcalc;
    }

    public void setTipopisstcalc(String tipopisstcalc) {
        this.tipopisstcalc = tipopisstcalc;
    }

    public String getTipocofinscalc() {
        return tipocofinscalc;
    }

    public void setTipocofinscalc(String tipocofinscalc) {
        this.tipocofinscalc = tipocofinscalc;
    }

    public String getTipocofinsstcalc() {
        return tipocofinsstcalc;
    }

    public void setTipocofinsstcalc(String tipocofinsstcalc) {
        this.tipocofinsstcalc = tipocofinsstcalc;
    }

    public Double getPisvbcst() {
        return pisvbcst;
    }

    public void setPisvbcst(Double pisvbcst) {
        this.pisvbcst = pisvbcst;
    }

    public Double getPisppisst() {
        return pisppisst;
    }

    public void setPisppisst(Double pisppisst) {
        this.pisppisst = pisppisst;
    }

    public Double getQbcprodst() {
        return qbcprodst;
    }

    public void setQbcprodst(Double qbcprodst) {
        this.qbcprodst = qbcprodst;
    }

    public Double getValiqprodst() {
        return valiqprodst;
    }

    public void setValiqprodst(Double valiqprodst) {
        this.valiqprodst = valiqprodst;
    }

    public Double getPisvpisst() {
        return pisvpisst;
    }

    public void setPisvpisst(Double pisvpisst) {
        this.pisvpisst = pisvpisst;
    }

    public Double getCofinsvbcst() {
        return cofinsvbcst;
    }

    public void setCofinsvbcst(Double cofinsvbcst) {
        this.cofinsvbcst = cofinsvbcst;
    }

    public Double getCofinspcofinsst() {
        return cofinspcofinsst;
    }

    public void setCofinspcofinsst(Double cofinspcofinsst) {
        this.cofinspcofinsst = cofinspcofinsst;
    }

    public Double getCofinsqbcprodst() {
        return cofinsqbcprodst;
    }

    public void setCofinsqbcprodst(Double cofinsqbcprodst) {
        this.cofinsqbcprodst = cofinsqbcprodst;
    }

    public Double getCofinsvaliqprodst() {
        return cofinsvaliqprodst;
    }

    public void setCofinsvaliqprodst(Double cofinsvaliqprodst) {
        this.cofinsvaliqprodst = cofinsvaliqprodst;
    }

    public Double getCofinsvcofinsst() {
        return cofinsvcofinsst;
    }

    public void setCofinsvcofinsst(Double cofinsvcofinsst) {
        this.cofinsvcofinsst = cofinsvcofinsst;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getIcmsufst() {
        return icmsufst;
    }

    public void setIcmsufst(String icmsufst) {
        this.icmsufst = icmsufst;
    }

    public Double getIcmspbcop() {
        return icmspbcop;
    }

    public void setIcmspbcop(Double icmspbcop) {
        this.icmspbcop = icmspbcop;
    }

    public Double getIcmsvbcstdest() {
        return icmsvbcstdest;
    }

    public void setIcmsvbcstdest(Double icmsvbcstdest) {
        this.icmsvbcstdest = icmsvbcstdest;
    }

    public Double getIcmsvicmsstdest() {
        return icmsvicmsstdest;
    }

    public void setIcmsvicmsstdest(Double icmsvicmsstdest) {
        this.icmsvicmsstdest = icmsvicmsstdest;
    }

    public Double getIcmspcredsn() {
        return icmspcredsn;
    }

    public void setIcmspcredsn(Double icmspcredsn) {
        this.icmspcredsn = icmspcredsn;
    }

    public Double getIcmsvcredicmssn() {
        return icmsvcredicmssn;
    }

    public void setIcmsvcredicmssn(Double icmsvcredicmssn) {
        this.icmsvcredicmssn = icmsvcredicmssn;
    }

    public Double getFator() {
        return fator;
    }

    public void setFator(Double fator) {
        this.fator = fator;
    }

    public Double getVltottrib() {
        return vltottrib;
    }

    public void setVltottrib(Double vltottrib) {
        this.vltottrib = vltottrib;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Double getQtdunit() {
        return qtdunit;
    }

    public void setQtdunit(Double qtdunit) {
        this.qtdunit = qtdunit;
    }

    public String getUnunit() {
        return ununit;
    }

    public void setUnunit(String ununit) {
        this.ununit = ununit;
    }

    public String getNve() {
        return nve;
    }

    public void setNve(String nve) {
        this.nve = nve;
    }

    public String getXped() {
        return xped;
    }

    public void setXped(String xped) {
        this.xped = xped;
    }

    public String getNitemped() {
        return nitemped;
    }

    public void setNitemped(String nitemped) {
        this.nitemped = nitemped;
    }

    public String getNfci() {
        return nfci;
    }

    public void setNfci(String nfci) {
        this.nfci = nfci;
    }

    public Double getCombpmixgn() {
        return combpmixgn;
    }

    public void setCombpmixgn(Double combpmixgn) {
        this.combpmixgn = combpmixgn;
    }

    public Double getIcmsvicmsdeson() {
        return icmsvicmsdeson;
    }

    public void setIcmsvicmsdeson(Double icmsvicmsdeson) {
        this.icmsvicmsdeson = icmsvicmsdeson;
    }

    public Double getIcmsvicmsop() {
        return icmsvicmsop;
    }

    public void setIcmsvicmsop(Double icmsvicmsop) {
        this.icmsvicmsop = icmsvicmsop;
    }

    public Double getIcmspdif() {
        return icmspdif;
    }

    public void setIcmspdif(Double icmspdif) {
        this.icmspdif = icmspdif;
    }

    public Double getIcmsvicmsdif() {
        return icmsvicmsdif;
    }

    public void setIcmsvicmsdif(Double icmsvicmsdif) {
        this.icmsvicmsdif = icmsvicmsdif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detentnfePK != null ? detentnfePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detentnfe)) {
            return false;
        }
        Detentnfe other = (Detentnfe) object;
        if ((this.detentnfePK == null && other.detentnfePK != null) || (this.detentnfePK != null && !this.detentnfePK.equals(other.detentnfePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detentnfe[ detentnfePK=" + detentnfePK + " ]";
    }
    
}
