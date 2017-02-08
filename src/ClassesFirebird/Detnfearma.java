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
public class Detnfearma implements Serializable {
    private static final long serialVersionUID = 1L;
    protected DetnfearmaPK detnfearmaPK;
    private String tparma;
    private String nserie;
    private String ncano;
    private String descr;

    public Detnfearma() {
    }

    public Detnfearma(DetnfearmaPK detnfearmaPK) {
        this.detnfearmaPK = detnfearmaPK;
    }

    public Detnfearma(int keynfe, int nitemdet, int nitem) {
        this.detnfearmaPK = new DetnfearmaPK(keynfe, nitemdet, nitem);
    }

    public DetnfearmaPK getDetnfearmaPK() {
        return detnfearmaPK;
    }

    public void setDetnfearmaPK(DetnfearmaPK detnfearmaPK) {
        this.detnfearmaPK = detnfearmaPK;
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
        hash += (detnfearmaPK != null ? detnfearmaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detnfearma)) {
            return false;
        }
        Detnfearma other = (Detnfearma) object;
        if ((this.detnfearmaPK == null && other.detnfearmaPK != null) || (this.detnfearmaPK != null && !this.detnfearmaPK.equals(other.detnfearmaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detnfearma[ detnfearmaPK=" + detnfearmaPK + " ]";
    }
    
}
