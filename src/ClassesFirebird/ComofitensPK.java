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
public class ComofitensPK implements Serializable {
    private String nrcontr;
    private int nritem;

    public ComofitensPK() {
    }

    public ComofitensPK(String nrcontr, int nritem) {
        this.nrcontr = nrcontr;
        this.nritem = nritem;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
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
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ComofitensPK)) {
            return false;
        }
        ComofitensPK other = (ComofitensPK) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.ComofitensPK[ nrcontr=" + nrcontr + ", nritem=" + nritem + " ]";
    }
    
}
