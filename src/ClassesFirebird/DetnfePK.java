/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class DetnfePK{
    private int keynfe;
    private int nitem;

    public DetnfePK() {
    }

    public DetnfePK(int keynfe, int nitem) {
        this.keynfe = keynfe;
        this.nitem = nitem;
    }

    public int getKeynfe() {
        return keynfe;
    }

    public void setKeynfe(int keynfe) {
        this.keynfe = keynfe;
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
        hash += (int) nitem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetnfePK)) {
            return false;
        }
        DetnfePK other = (DetnfePK) object;
        if (this.keynfe != other.keynfe) {
            return false;
        }
        if (this.nitem != other.nitem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DetnfePK[ keynfe=" + keynfe + ", nitem=" + nitem + " ]";
    }
    
}
