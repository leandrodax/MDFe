/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

/**
 *
 * @author vplayer
 */

public class DevolcompraitPK {
    private String nrdevol;
    private int nritem;

    public DevolcompraitPK() {
    }

    public DevolcompraitPK(String nrdevol, int nritem) {
        this.nrdevol = nrdevol;
        this.nritem = nritem;
    }

    public String getNrdevol() {
        return nrdevol;
    }

    public void setNrdevol(String nrdevol) {
        this.nrdevol = nrdevol;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrdevol != null ? nrdevol.hashCode() : 0);
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DevolcompraitPK)) {
            return false;
        }
        DevolcompraitPK other = (DevolcompraitPK) object;
        if ((this.nrdevol == null && other.nrdevol != null) || (this.nrdevol != null && !this.nrdevol.equals(other.nrdevol))) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DevolcompraitPK[ nrdevol=" + nrdevol + ", nritem=" + nritem + " ]";
    }
    
}
