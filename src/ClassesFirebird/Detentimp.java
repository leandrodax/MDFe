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
public class Detentimp implements Serializable {
    private static final long serialVersionUID = 1L;
    protected DetentimpPK detentimpPK;
    private String ndi;
    private Date ddi;
    private String xlocdesemb;
    private String ufdesemb;
    private Date ddesemb;
    private String cexportador;
    private String tpviatransp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vafrmm;
    private String tpintermedio;
    private String cnpj;
    private String ufterceito;

    public Detentimp() {
    }

    public Detentimp(DetentimpPK detentimpPK) {
        this.detentimpPK = detentimpPK;
    }

    public Detentimp(int keynfe, int nitemdet, int nitem) {
        this.detentimpPK = new DetentimpPK(keynfe, nitemdet, nitem);
    }

    public DetentimpPK getDetentimpPK() {
        return detentimpPK;
    }

    public void setDetentimpPK(DetentimpPK detentimpPK) {
        this.detentimpPK = detentimpPK;
    }

    public String getNdi() {
        return ndi;
    }

    public void setNdi(String ndi) {
        this.ndi = ndi;
    }

    public Date getDdi() {
        return ddi;
    }

    public void setDdi(Date ddi) {
        this.ddi = ddi;
    }

    public String getXlocdesemb() {
        return xlocdesemb;
    }

    public void setXlocdesemb(String xlocdesemb) {
        this.xlocdesemb = xlocdesemb;
    }

    public String getUfdesemb() {
        return ufdesemb;
    }

    public void setUfdesemb(String ufdesemb) {
        this.ufdesemb = ufdesemb;
    }

    public Date getDdesemb() {
        return ddesemb;
    }

    public void setDdesemb(Date ddesemb) {
        this.ddesemb = ddesemb;
    }

    public String getCexportador() {
        return cexportador;
    }

    public void setCexportador(String cexportador) {
        this.cexportador = cexportador;
    }

    public String getTpviatransp() {
        return tpviatransp;
    }

    public void setTpviatransp(String tpviatransp) {
        this.tpviatransp = tpviatransp;
    }

    public Double getVafrmm() {
        return vafrmm;
    }

    public void setVafrmm(Double vafrmm) {
        this.vafrmm = vafrmm;
    }

    public String getTpintermedio() {
        return tpintermedio;
    }

    public void setTpintermedio(String tpintermedio) {
        this.tpintermedio = tpintermedio;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getUfterceito() {
        return ufterceito;
    }

    public void setUfterceito(String ufterceito) {
        this.ufterceito = ufterceito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detentimpPK != null ? detentimpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detentimp)) {
            return false;
        }
        Detentimp other = (Detentimp) object;
        if ((this.detentimpPK == null && other.detentimpPK != null) || (this.detentimpPK != null && !this.detentimpPK.equals(other.detentimpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detentimp[ detentimpPK=" + detentimpPK + " ]";
    }
    
}
