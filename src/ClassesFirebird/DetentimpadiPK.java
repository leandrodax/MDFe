/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;

/**
 *
 * @author vplayer
 */
public class DetentimpadiPK implements Serializable {
    private int keynfe;
    private int nitemdet;
    private int nitemimp;
    private int nitem;

    public DetentimpadiPK() {
    }

    public DetentimpadiPK(int keynfe, int nitemdet, int nitemimp, int nitem) {
        this.keynfe = keynfe;
        this.nitemdet = nitemdet;
        this.nitemimp = nitemimp;
        this.nitem = nitem;
    }

    public int getKeynfe() {
        return keynfe;
    }

    public void setKeynfe(int keynfe) {
        this.keynfe = keynfe;
    }

    public int getNitemdet() {
        return nitemdet;
    }

    public void setNitemdet(int nitemdet) {
        this.nitemdet = nitemdet;
    }

    public int getNitemimp() {
        return nitemimp;
    }

    public void setNitemimp(int nitemimp) {
        this.nitemimp = nitemimp;
    }

    public int getNitem() {
        return nitem;
    }

    public void setNitem(int nitem) {
        this.nitem = nitem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) keynfe;
        hash += (int) nitemdet;
        hash += (int) nitemimp;
        hash += (int) nitem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetentimpadiPK)) {
            return false;
        }
        DetentimpadiPK other = (DetentimpadiPK) object;
        if (this.keynfe != other.keynfe) {
            return false;
        }
        if (this.nitemdet != other.nitemdet) {
            return false;
        }
        if (this.nitemimp != other.nitemimp) {
            return false;
        }
        if (this.nitem != other.nitem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DetentimpadiPK[ keynfe=" + keynfe + ", nitemdet=" + nitemdet + ", nitemimp=" + nitemimp + ", nitem=" + nitem + " ]";
    }
    
}
