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
public class Tabproimp implements Serializable {
    private static final long serialVersionUID = 1L;
   
    protected TabproimpPK tabproimpPK;
    private String icmscst;
    private String icmsorig;
    private String icmsmodbc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double icmspredbc;
    private Double icmspicms;
    private String icmsmodbcst;
    private Double icmspmvast;
    private Double icmspredbcst;
    private Double icmspicmsst;
    private String ipipicst;
    private String ipicenq;
    private String ipiclenq;
    private String ipicnpjprod;
    private String tipoipicalc;
    private Double ipivunid;
    private Double ipipipi;
    private String piscst;
    private String tipopiscalc;
    private Double pisppis;
    private Double valiqprod;
    private String tipopisstcalc;
    private Double pisppisst;
    private Double valiqprodst;
    private String cofinscst;
    private String tipocofinscalc;
    private Double cofinspcofins;
    private Double cofinsvaliqprod;
    private String tipocofinsstcalc;
    private Double cofinspcofinsst;
    private Double cofinsvaliqprodst;
    private Double issvaliq;
    private String clistserv;
    private String extipi;
    private String icmsmotdesicms;
    private Double icmspcredsn;
    private String csittrib;
    private Double icmspbcop;
    private String icmscstint;
    private Tabfil tabfil;
    private Tabpro tabpro;

    public Tabproimp() {
    }

    public Tabproimp(TabproimpPK tabproimpPK) {
        this.tabproimpPK = tabproimpPK;
    }

    public Tabproimp(String codpro, int codfil) {
        this.tabproimpPK = new TabproimpPK(codpro, codfil);
    }

    public TabproimpPK getTabproimpPK() {
        return tabproimpPK;
    }

    public void setTabproimpPK(TabproimpPK tabproimpPK) {
        this.tabproimpPK = tabproimpPK;
    }

    public String getIcmscst() {
        return icmscst;
    }

    public void setIcmscst(String icmscst) {
        this.icmscst = icmscst;
    }

    public String getIcmsorig() {
        return icmsorig;
    }

    public void setIcmsorig(String icmsorig) {
        this.icmsorig = icmsorig;
    }

    public String getIcmsmodbc() {
        return icmsmodbc;
    }

    public void setIcmsmodbc(String icmsmodbc) {
        this.icmsmodbc = icmsmodbc;
    }

    public Double getIcmspredbc() {
        return icmspredbc;
    }

    public void setIcmspredbc(Double icmspredbc) {
        this.icmspredbc = icmspredbc;
    }

    public Double getIcmspicms() {
        return icmspicms;
    }

    public void setIcmspicms(Double icmspicms) {
        this.icmspicms = icmspicms;
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

    public Double getIcmspicmsst() {
        return icmspicmsst;
    }

    public void setIcmspicmsst(Double icmspicmsst) {
        this.icmspicmsst = icmspicmsst;
    }

    public String getIpipicst() {
        return ipipicst;
    }

    public void setIpipicst(String ipipicst) {
        this.ipipicst = ipipicst;
    }

    public String getIpicenq() {
        return ipicenq;
    }

    public void setIpicenq(String ipicenq) {
        this.ipicenq = ipicenq;
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

    public String getTipoipicalc() {
        return tipoipicalc;
    }

    public void setTipoipicalc(String tipoipicalc) {
        this.tipoipicalc = tipoipicalc;
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

    public String getPiscst() {
        return piscst;
    }

    public void setPiscst(String piscst) {
        this.piscst = piscst;
    }

    public String getTipopiscalc() {
        return tipopiscalc;
    }

    public void setTipopiscalc(String tipopiscalc) {
        this.tipopiscalc = tipopiscalc;
    }

    public Double getPisppis() {
        return pisppis;
    }

    public void setPisppis(Double pisppis) {
        this.pisppis = pisppis;
    }

    public Double getValiqprod() {
        return valiqprod;
    }

    public void setValiqprod(Double valiqprod) {
        this.valiqprod = valiqprod;
    }

    public String getTipopisstcalc() {
        return tipopisstcalc;
    }

    public void setTipopisstcalc(String tipopisstcalc) {
        this.tipopisstcalc = tipopisstcalc;
    }

    public Double getPisppisst() {
        return pisppisst;
    }

    public void setPisppisst(Double pisppisst) {
        this.pisppisst = pisppisst;
    }

    public Double getValiqprodst() {
        return valiqprodst;
    }

    public void setValiqprodst(Double valiqprodst) {
        this.valiqprodst = valiqprodst;
    }

    public String getCofinscst() {
        return cofinscst;
    }

    public void setCofinscst(String cofinscst) {
        this.cofinscst = cofinscst;
    }

    public String getTipocofinscalc() {
        return tipocofinscalc;
    }

    public void setTipocofinscalc(String tipocofinscalc) {
        this.tipocofinscalc = tipocofinscalc;
    }

    public Double getCofinspcofins() {
        return cofinspcofins;
    }

    public void setCofinspcofins(Double cofinspcofins) {
        this.cofinspcofins = cofinspcofins;
    }

    public Double getCofinsvaliqprod() {
        return cofinsvaliqprod;
    }

    public void setCofinsvaliqprod(Double cofinsvaliqprod) {
        this.cofinsvaliqprod = cofinsvaliqprod;
    }

    public String getTipocofinsstcalc() {
        return tipocofinsstcalc;
    }

    public void setTipocofinsstcalc(String tipocofinsstcalc) {
        this.tipocofinsstcalc = tipocofinsstcalc;
    }

    public Double getCofinspcofinsst() {
        return cofinspcofinsst;
    }

    public void setCofinspcofinsst(Double cofinspcofinsst) {
        this.cofinspcofinsst = cofinspcofinsst;
    }

    public Double getCofinsvaliqprodst() {
        return cofinsvaliqprodst;
    }

    public void setCofinsvaliqprodst(Double cofinsvaliqprodst) {
        this.cofinsvaliqprodst = cofinsvaliqprodst;
    }

    public Double getIssvaliq() {
        return issvaliq;
    }

    public void setIssvaliq(Double issvaliq) {
        this.issvaliq = issvaliq;
    }

    public String getClistserv() {
        return clistserv;
    }

    public void setClistserv(String clistserv) {
        this.clistserv = clistserv;
    }

    public String getExtipi() {
        return extipi;
    }

    public void setExtipi(String extipi) {
        this.extipi = extipi;
    }

    public String getIcmsmotdesicms() {
        return icmsmotdesicms;
    }

    public void setIcmsmotdesicms(String icmsmotdesicms) {
        this.icmsmotdesicms = icmsmotdesicms;
    }

    public Double getIcmspcredsn() {
        return icmspcredsn;
    }

    public void setIcmspcredsn(Double icmspcredsn) {
        this.icmspcredsn = icmspcredsn;
    }

    public String getCsittrib() {
        return csittrib;
    }

    public void setCsittrib(String csittrib) {
        this.csittrib = csittrib;
    }

    public Double getIcmspbcop() {
        return icmspbcop;
    }

    public void setIcmspbcop(Double icmspbcop) {
        this.icmspbcop = icmspbcop;
    }

    public String getIcmscstint() {
        return icmscstint;
    }

    public void setIcmscstint(String icmscstint) {
        this.icmscstint = icmscstint;
    }

    public Tabfil getTabfil() {
        return tabfil;
    }

    public void setTabfil(Tabfil tabfil) {
        this.tabfil = tabfil;
    }

    public Tabpro getTabpro() {
        return tabpro;
    }

    public void setTabpro(Tabpro tabpro) {
        this.tabpro = tabpro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabproimpPK != null ? tabproimpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabproimp)) {
            return false;
        }
        Tabproimp other = (Tabproimp) object;
        if ((this.tabproimpPK == null && other.tabproimpPK != null) || (this.tabproimpPK != null && !this.tabproimpPK.equals(other.tabproimpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabproimp[ tabproimpPK=" + tabproimpPK + " ]";
    }
    
}
