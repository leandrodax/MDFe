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
public class DevolvendaitPK {
    private int nritem;
    private String nrdevol;

    public DevolvendaitPK() {
    }

    public DevolvendaitPK(int nritem, String nrdevol) {
        this.nritem = nritem;
        this.nrdevol = nrdevol;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    public String getNrdevol() {
        return nrdevol;
    }

    public void setNrdevol(String nrdevol) {
        this.nrdevol = nrdevol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nritem;
        hash += (nrdevol != null ? nrdevol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DevolvendaitPK)) {
            return false;
        }
        DevolvendaitPK other = (DevolvendaitPK) object;
        if (this.nritem != other.nritem) {
            return false;
        }
        if ((this.nrdevol == null && other.nrdevol != null) || (this.nrdevol != null && !this.nrdevol.equals(other.nrdevol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DevolvendaitPK[ nritem=" + nritem + ", nrdevol=" + nrdevol + " ]";
    }
    
}
