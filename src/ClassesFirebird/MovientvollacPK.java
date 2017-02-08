/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class MovientvollacPK{
  
    private int keynfe;
    private int nitemvol;
    private int nitem;

    public MovientvollacPK() {
    }

    public MovientvollacPK(int keynfe, int nitemvol, int nitem) {
        this.keynfe = keynfe;
        this.nitemvol = nitemvol;
        this.nitem = nitem;
    }

    public int getKeynfe() {
        return keynfe;
    }

    public void setKeynfe(int keynfe) {
        this.keynfe = keynfe;
    }

    public int getNitemvol() {
        return nitemvol;
    }

    public void setNitemvol(int nitemvol) {
        this.nitemvol = nitemvol;
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
        hash += (int) nitemvol;
        hash += (int) nitem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovientvollacPK)) {
            return false;
        }
        MovientvollacPK other = (MovientvollacPK) object;
        if (this.keynfe != other.keynfe) {
            return false;
        }
        if (this.nitemvol != other.nitemvol) {
            return false;
        }
        if (this.nitem != other.nitem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MovientvollacPK[ keynfe=" + keynfe + ", nitemvol=" + nitemvol + ", nitem=" + nitem + " ]";
    }
    
}
