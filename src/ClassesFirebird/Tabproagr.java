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
public class Tabproagr implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private String codpro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double acagr;
    private Double alagr;
    private Double amagr;
    private Double apagr;
    private Double baagr;
    private Double ceagr;
    private Double dfagr;
    private Double esagr;
    private Double goagr;
    private Double maagr;
    private Double mtagr;
    private Double msagr;
    private Double mgagr;
    private Double paagr;
    private Double pbagr;
    private Double pragr;
    private Double peagr;
    private Double piagr;
    private Double rnagr;
    private Double rsagr;
    private Double rjagr;
    private Double roagr;
    private Double rragr;
    private Double scagr;
    private Double spagr;
    private Double seagr;
    private Double toagr;
    private Tabpro tabpro;

    public Tabproagr() {
    }

    public Tabproagr(String codpro) {
        this.codpro = codpro;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public Double getAcagr() {
        return acagr;
    }

    public void setAcagr(Double acagr) {
        this.acagr = acagr;
    }

    public Double getAlagr() {
        return alagr;
    }

    public void setAlagr(Double alagr) {
        this.alagr = alagr;
    }

    public Double getAmagr() {
        return amagr;
    }

    public void setAmagr(Double amagr) {
        this.amagr = amagr;
    }

    public Double getApagr() {
        return apagr;
    }

    public void setApagr(Double apagr) {
        this.apagr = apagr;
    }

    public Double getBaagr() {
        return baagr;
    }

    public void setBaagr(Double baagr) {
        this.baagr = baagr;
    }

    public Double getCeagr() {
        return ceagr;
    }

    public void setCeagr(Double ceagr) {
        this.ceagr = ceagr;
    }

    public Double getDfagr() {
        return dfagr;
    }

    public void setDfagr(Double dfagr) {
        this.dfagr = dfagr;
    }

    public Double getEsagr() {
        return esagr;
    }

    public void setEsagr(Double esagr) {
        this.esagr = esagr;
    }

    public Double getGoagr() {
        return goagr;
    }

    public void setGoagr(Double goagr) {
        this.goagr = goagr;
    }

    public Double getMaagr() {
        return maagr;
    }

    public void setMaagr(Double maagr) {
        this.maagr = maagr;
    }

    public Double getMtagr() {
        return mtagr;
    }

    public void setMtagr(Double mtagr) {
        this.mtagr = mtagr;
    }

    public Double getMsagr() {
        return msagr;
    }

    public void setMsagr(Double msagr) {
        this.msagr = msagr;
    }

    public Double getMgagr() {
        return mgagr;
    }

    public void setMgagr(Double mgagr) {
        this.mgagr = mgagr;
    }

    public Double getPaagr() {
        return paagr;
    }

    public void setPaagr(Double paagr) {
        this.paagr = paagr;
    }

    public Double getPbagr() {
        return pbagr;
    }

    public void setPbagr(Double pbagr) {
        this.pbagr = pbagr;
    }

    public Double getPragr() {
        return pragr;
    }

    public void setPragr(Double pragr) {
        this.pragr = pragr;
    }

    public Double getPeagr() {
        return peagr;
    }

    public void setPeagr(Double peagr) {
        this.peagr = peagr;
    }

    public Double getPiagr() {
        return piagr;
    }

    public void setPiagr(Double piagr) {
        this.piagr = piagr;
    }

    public Double getRnagr() {
        return rnagr;
    }

    public void setRnagr(Double rnagr) {
        this.rnagr = rnagr;
    }

    public Double getRsagr() {
        return rsagr;
    }

    public void setRsagr(Double rsagr) {
        this.rsagr = rsagr;
    }

    public Double getRjagr() {
        return rjagr;
    }

    public void setRjagr(Double rjagr) {
        this.rjagr = rjagr;
    }

    public Double getRoagr() {
        return roagr;
    }

    public void setRoagr(Double roagr) {
        this.roagr = roagr;
    }

    public Double getRragr() {
        return rragr;
    }

    public void setRragr(Double rragr) {
        this.rragr = rragr;
    }

    public Double getScagr() {
        return scagr;
    }

    public void setScagr(Double scagr) {
        this.scagr = scagr;
    }

    public Double getSpagr() {
        return spagr;
    }

    public void setSpagr(Double spagr) {
        this.spagr = spagr;
    }

    public Double getSeagr() {
        return seagr;
    }

    public void setSeagr(Double seagr) {
        this.seagr = seagr;
    }

    public Double getToagr() {
        return toagr;
    }

    public void setToagr(Double toagr) {
        this.toagr = toagr;
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
        hash += (codpro != null ? codpro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabproagr)) {
            return false;
        }
        Tabproagr other = (Tabproagr) object;
        if ((this.codpro == null && other.codpro != null) || (this.codpro != null && !this.codpro.equals(other.codpro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabproagr[ codpro=" + codpro + " ]";
    }
    
}
