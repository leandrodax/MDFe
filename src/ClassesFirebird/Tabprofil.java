/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Tabprofil implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabprofilPK tabprofilPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdpro;
    private Double qtdrespro;
    private Double qtddevpro;
    private Double qtdmin;
    private Double qtdmax;
    private Double qtdmeta;
    private Double qtdultinv;
    
    private Date dtultinv;
    private Double pratpro;
    private Double prvapro;
    private Double prcupro;
    private Double percdescco;
    private Double percdescat;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    private Double outcusto;
    private Double marglucat;
    private Double marglucva;
    private Double pratprosug;
    private Double prvaprosug;
    private Double prcuprosug;
    private Double outcustosug;
    private Double marlucsugat;
    private Double marlucsugva;
    private Character contreffil;
    private Character contrplano;
    private Integer qtddesco;
    private String locaprod;
    private Double prveant;
    private Double percdesccocc;
    private Double percdescatcc;
    private Double percdesccoap;
    private Double percdescatap;
    private Double qtdminven;
    private Double qtdrom;
    private Double qtdent;
    private Double prcompraat;
    private Double prcomprava;
    private Double prcusvar;
    private Double prcomatsug;
    private Double prcomvasug;
    private Double prcuvarsug;
    private Double qtdestant;
    private Double qtdquabov;
    private Tabfil tabfil;
    private Tabpro tabpro;

    public Tabprofil() {
    }

    public Tabprofil(TabprofilPK tabprofilPK) {
        this.tabprofilPK = tabprofilPK;
    }

    public Tabprofil(String codpro, int codfil) {
        this.tabprofilPK = new TabprofilPK(codpro, codfil);
    }

    public TabprofilPK getTabprofilPK() {
        return tabprofilPK;
    }

    public void setTabprofilPK(TabprofilPK tabprofilPK) {
        this.tabprofilPK = tabprofilPK;
    }

    public Double getQtdpro() {
        return qtdpro;
    }

    public void setQtdpro(Double qtdpro) {
        this.qtdpro = qtdpro;
    }

    public Double getQtdrespro() {
        return qtdrespro;
    }

    public void setQtdrespro(Double qtdrespro) {
        this.qtdrespro = qtdrespro;
    }

    public Double getQtddevpro() {
        return qtddevpro;
    }

    public void setQtddevpro(Double qtddevpro) {
        this.qtddevpro = qtddevpro;
    }

    public Double getQtdmin() {
        return qtdmin;
    }

    public void setQtdmin(Double qtdmin) {
        this.qtdmin = qtdmin;
    }

    public Double getQtdmax() {
        return qtdmax;
    }

    public void setQtdmax(Double qtdmax) {
        this.qtdmax = qtdmax;
    }

    public Double getQtdmeta() {
        return qtdmeta;
    }

    public void setQtdmeta(Double qtdmeta) {
        this.qtdmeta = qtdmeta;
    }

    public Double getQtdultinv() {
        return qtdultinv;
    }

    public void setQtdultinv(Double qtdultinv) {
        this.qtdultinv = qtdultinv;
    }

    public Date getDtultinv() {
        return dtultinv;
    }

    public void setDtultinv(Date dtultinv) {
        this.dtultinv = dtultinv;
    }

    public Double getPratpro() {
        return pratpro;
    }

    public void setPratpro(Double pratpro) {
        this.pratpro = pratpro;
    }

    public Double getPrvapro() {
        return prvapro;
    }

    public void setPrvapro(Double prvapro) {
        this.prvapro = prvapro;
    }

    public Double getPrcupro() {
        return prcupro;
    }

    public void setPrcupro(Double prcupro) {
        this.prcupro = prcupro;
    }

    public Double getPercdescco() {
        return percdescco;
    }

    public void setPercdescco(Double percdescco) {
        this.percdescco = percdescco;
    }

    public Double getPercdescat() {
        return percdescat;
    }

    public void setPercdescat(Double percdescat) {
        this.percdescat = percdescat;
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

    public Double getOutcusto() {
        return outcusto;
    }

    public void setOutcusto(Double outcusto) {
        this.outcusto = outcusto;
    }

    public Double getMarglucat() {
        return marglucat;
    }

    public void setMarglucat(Double marglucat) {
        this.marglucat = marglucat;
    }

    public Double getMarglucva() {
        return marglucva;
    }

    public void setMarglucva(Double marglucva) {
        this.marglucva = marglucva;
    }

    public Double getPratprosug() {
        return pratprosug;
    }

    public void setPratprosug(Double pratprosug) {
        this.pratprosug = pratprosug;
    }

    public Double getPrvaprosug() {
        return prvaprosug;
    }

    public void setPrvaprosug(Double prvaprosug) {
        this.prvaprosug = prvaprosug;
    }

    public Double getPrcuprosug() {
        return prcuprosug;
    }

    public void setPrcuprosug(Double prcuprosug) {
        this.prcuprosug = prcuprosug;
    }

    public Double getOutcustosug() {
        return outcustosug;
    }

    public void setOutcustosug(Double outcustosug) {
        this.outcustosug = outcustosug;
    }

    public Double getMarlucsugat() {
        return marlucsugat;
    }

    public void setMarlucsugat(Double marlucsugat) {
        this.marlucsugat = marlucsugat;
    }

    public Double getMarlucsugva() {
        return marlucsugva;
    }

    public void setMarlucsugva(Double marlucsugva) {
        this.marlucsugva = marlucsugva;
    }

    public Character getContreffil() {
        return contreffil;
    }

    public void setContreffil(Character contreffil) {
        this.contreffil = contreffil;
    }

    public Character getContrplano() {
        return contrplano;
    }

    public void setContrplano(Character contrplano) {
        this.contrplano = contrplano;
    }

    public Integer getQtddesco() {
        return qtddesco;
    }

    public void setQtddesco(Integer qtddesco) {
        this.qtddesco = qtddesco;
    }

    public String getLocaprod() {
        return locaprod;
    }

    public void setLocaprod(String locaprod) {
        this.locaprod = locaprod;
    }

    public Double getPrveant() {
        return prveant;
    }

    public void setPrveant(Double prveant) {
        this.prveant = prveant;
    }

    public Double getPercdesccocc() {
        return percdesccocc;
    }

    public void setPercdesccocc(Double percdesccocc) {
        this.percdesccocc = percdesccocc;
    }

    public Double getPercdescatcc() {
        return percdescatcc;
    }

    public void setPercdescatcc(Double percdescatcc) {
        this.percdescatcc = percdescatcc;
    }

    public Double getPercdesccoap() {
        return percdesccoap;
    }

    public void setPercdesccoap(Double percdesccoap) {
        this.percdesccoap = percdesccoap;
    }

    public Double getPercdescatap() {
        return percdescatap;
    }

    public void setPercdescatap(Double percdescatap) {
        this.percdescatap = percdescatap;
    }

    public Double getQtdminven() {
        return qtdminven;
    }

    public void setQtdminven(Double qtdminven) {
        this.qtdminven = qtdminven;
    }

    public Double getQtdrom() {
        return qtdrom;
    }

    public void setQtdrom(Double qtdrom) {
        this.qtdrom = qtdrom;
    }

    public Double getQtdent() {
        return qtdent;
    }

    public void setQtdent(Double qtdent) {
        this.qtdent = qtdent;
    }

    public Double getPrcompraat() {
        return prcompraat;
    }

    public void setPrcompraat(Double prcompraat) {
        this.prcompraat = prcompraat;
    }

    public Double getPrcomprava() {
        return prcomprava;
    }

    public void setPrcomprava(Double prcomprava) {
        this.prcomprava = prcomprava;
    }

    public Double getPrcusvar() {
        return prcusvar;
    }

    public void setPrcusvar(Double prcusvar) {
        this.prcusvar = prcusvar;
    }

    public Double getPrcomatsug() {
        return prcomatsug;
    }

    public void setPrcomatsug(Double prcomatsug) {
        this.prcomatsug = prcomatsug;
    }

    public Double getPrcomvasug() {
        return prcomvasug;
    }

    public void setPrcomvasug(Double prcomvasug) {
        this.prcomvasug = prcomvasug;
    }

    public Double getPrcuvarsug() {
        return prcuvarsug;
    }

    public void setPrcuvarsug(Double prcuvarsug) {
        this.prcuvarsug = prcuvarsug;
    }

    public Double getQtdestant() {
        return qtdestant;
    }

    public void setQtdestant(Double qtdestant) {
        this.qtdestant = qtdestant;
    }

    public Double getQtdquabov() {
        return qtdquabov;
    }

    public void setQtdquabov(Double qtdquabov) {
        this.qtdquabov = qtdquabov;
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
        hash += (tabprofilPK != null ? tabprofilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabprofil)) {
            return false;
        }
        Tabprofil other = (Tabprofil) object;
        if ((this.tabprofilPK == null && other.tabprofilPK != null) || (this.tabprofilPK != null && !this.tabprofilPK.equals(other.tabprofilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabprofil[ tabprofilPK=" + tabprofilPK + " ]";
    }
    
}
