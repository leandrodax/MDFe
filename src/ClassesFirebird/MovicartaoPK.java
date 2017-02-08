/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class MovicartaoPK {

    private int nrregis;
    private String nrcontr;

    public MovicartaoPK() {
    }

    public MovicartaoPK(int nrregis, String nrcontr) {
        this.nrregis = nrregis;
        this.nrcontr = nrcontr;
    }

    public int getNrregis() {
        return nrregis;
    }

    public void setNrregis(int nrregis) {
        this.nrregis = nrregis;
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
        hash += (int) nrregis;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovicartaoPK)) {
            return false;
        }
        MovicartaoPK other = (MovicartaoPK) object;
        if (this.nrregis != other.nrregis) {
            return false;
        }
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MovicartaoPK[ nrregis=" + nrregis + ", nrcontr=" + nrcontr + " ]";
    }
    
}
