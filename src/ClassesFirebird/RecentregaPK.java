/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class RecentregaPK {
    
    private int nrvia;
    private String nrcontr;

    public RecentregaPK() {
    }

    public RecentregaPK(int nrvia, String nrcontr) {
        this.nrvia = nrvia;
        this.nrcontr = nrcontr;
    }

    public int getNrvia() {
        return nrvia;
    }

    public void setNrvia(int nrvia) {
        this.nrvia = nrvia;
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
        hash += (int) nrvia;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecentregaPK)) {
            return false;
        }
        RecentregaPK other = (RecentregaPK) object;
        if (this.nrvia != other.nrvia) {
            return false;
        }
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.RecentregaPK[ nrvia=" + nrvia + ", nrcontr=" + nrcontr + " ]";
    }
    
}
