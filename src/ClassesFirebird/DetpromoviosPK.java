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
public class DetpromoviosPK {
    private int codos;
    private int nritem;

    public DetpromoviosPK() {
    }

    public DetpromoviosPK(int codos, int nritem) {
        this.codos = codos;
        this.nritem = nritem;
    }

    public int getCodos() {
        return codos;
    }

    public void setCodos(int codos) {
        this.codos = codos;
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
        hash += (int) codos;
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetpromoviosPK)) {
            return false;
        }
        DetpromoviosPK other = (DetpromoviosPK) object;
        if (this.codos != other.codos) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DetpromoviosPK[ codos=" + codos + ", nritem=" + nritem + " ]";
    }
    
}
