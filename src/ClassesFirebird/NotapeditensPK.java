/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class NotapeditensPK {

    private int nritem;
    private int nrped;

    public NotapeditensPK() {
    }

    public NotapeditensPK(int nritem, int nrped) {
        this.nritem = nritem;
        this.nrped = nrped;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    public int getNrped() {
        return nrped;
    }

    public void setNrped(int nrped) {
        this.nrped = nrped;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nritem;
        hash += (int) nrped;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotapeditensPK)) {
            return false;
        }
        NotapeditensPK other = (NotapeditensPK) object;
        if (this.nritem != other.nritem) {
            return false;
        }
        if (this.nrped != other.nrped) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.NotapeditensPK[ nritem=" + nritem + ", nrped=" + nrped + " ]";
    }
    
}
