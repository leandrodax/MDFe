
package ClassesFirebird;

public class DetnfemedicPK {
    private int keynfe;
    private int nitemdet;
    private int nitem;

    public DetnfemedicPK() {
    }

    public DetnfemedicPK(int keynfe, int nitemdet, int nitem) {
        this.keynfe = keynfe;
        this.nitemdet = nitemdet;
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
        hash += (int) nitem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetnfemedicPK)) {
            return false;
        }
        DetnfemedicPK other = (DetnfemedicPK) object;
        if (this.keynfe != other.keynfe) {
            return false;
        }
        if (this.nitemdet != other.nitemdet) {
            return false;
        }
        if (this.nitem != other.nitem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DetnfemedicPK[ keynfe=" + keynfe + ", nitemdet=" + nitemdet + ", nitem=" + nitem + " ]";
    }
    
}
