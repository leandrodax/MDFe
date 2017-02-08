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
public class Detentimpadi implements Serializable {
    private static final long serialVersionUID = 1L;
    protected DetentimpadiPK detentimpadiPK;
    private String nadicao;
    private String nseqadic;
    private String cfabricante;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vdescdi;
    private String xped;
    private String nitemped;

    public Detentimpadi() {
    }

    public Detentimpadi(DetentimpadiPK detentimpadiPK) {
        this.detentimpadiPK = detentimpadiPK;
    }

    public Detentimpadi(int keynfe, int nitemdet, int nitemimp, int nitem) {
        this.detentimpadiPK = new DetentimpadiPK(keynfe, nitemdet, nitemimp, nitem);
    }

    public DetentimpadiPK getDetentimpadiPK() {
        return detentimpadiPK;
    }

    public void setDetentimpadiPK(DetentimpadiPK detentimpadiPK) {
        this.detentimpadiPK = detentimpadiPK;
    }

    public String getNadicao() {
        return nadicao;
    }

    public void setNadicao(String nadicao) {
        this.nadicao = nadicao;
    }

    public String getNseqadic() {
        return nseqadic;
    }

    public void setNseqadic(String nseqadic) {
        this.nseqadic = nseqadic;
    }

    public String getCfabricante() {
        return cfabricante;
    }

    public void setCfabricante(String cfabricante) {
        this.cfabricante = cfabricante;
    }

    public Double getVdescdi() {
        return vdescdi;
    }

    public void setVdescdi(Double vdescdi) {
        this.vdescdi = vdescdi;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detentimpadiPK != null ? detentimpadiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detentimpadi)) {
            return false;
        }
        Detentimpadi other = (Detentimpadi) object;
        if ((this.detentimpadiPK == null && other.detentimpadiPK != null) || (this.detentimpadiPK != null && !this.detentimpadiPK.equals(other.detentimpadiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detentimpadi[ detentimpadiPK=" + detentimpadiPK + " ]";
    }
    
}
