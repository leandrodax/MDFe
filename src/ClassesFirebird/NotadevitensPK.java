/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class NotadevitensPK {
    
    private int nritem;
    private String nrcontr;

    public NotadevitensPK() {
    }

    public NotadevitensPK(int nritem, String nrcontr) {
        this.nritem = nritem;
        this.nrcontr = nrcontr;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nritem;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotadevitensPK)) {
            return false;
        }
        NotadevitensPK other = (NotadevitensPK) object;
        if (this.nritem != other.nritem) {
            return false;
        }
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.NotadevitensPK[ nritem=" + nritem + ", nrcontr=" + nrcontr + " ]";
    }
    
}
