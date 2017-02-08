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
public class Detentarma implements Serializable {
    private static final long serialVersionUID = 1L;
    protected DetentarmaPK detentarmaPK;
    private String tparma;
    private String nserie;
    private String ncano;
    private String descr;

    public Detentarma() {
    }

    public Detentarma(DetentarmaPK detentarmaPK) {
        this.detentarmaPK = detentarmaPK;
    }

    public Detentarma(int keynfe, int nitemdet, int nitem) {
        this.detentarmaPK = new DetentarmaPK(keynfe, nitemdet, nitem);
    }

    public DetentarmaPK getDetentarmaPK() {
        return detentarmaPK;
    }

    public void setDetentarmaPK(DetentarmaPK detentarmaPK) {
        this.detentarmaPK = detentarmaPK;
    }

    public String getTparma() {
        return tparma;
    }

    public void setTparma(String tparma) {
        this.tparma = tparma;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public String getNcano() {
        return ncano;
    }

    public void setNcano(String ncano) {
        this.ncano = ncano;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detentarmaPK != null ? detentarmaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detentarma)) {
            return false;
        }
        Detentarma other = (Detentarma) object;
        if ((this.detentarmaPK == null && other.detentarmaPK != null) || (this.detentarmaPK != null && !this.detentarmaPK.equals(other.detentarmaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detentarma[ detentarmaPK=" + detentarmaPK + " ]";
    }
    
}
