/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;



public class SaidanotavPK  {
    
    private String nrcontr;
    private String nrcontrv;

    public SaidanotavPK() {
    }

    public SaidanotavPK(String nrcontr, String nrcontrv) {
        this.nrcontr = nrcontr;
        this.nrcontrv = nrcontrv;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontrv() {
        return nrcontrv;
    }

    public void setNrcontrv(String nrcontrv) {
        this.nrcontrv = nrcontrv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        hash += (nrcontrv != null ? nrcontrv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SaidanotavPK)) {
            return false;
        }
        SaidanotavPK other = (SaidanotavPK) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        if ((this.nrcontrv == null && other.nrcontrv != null) || (this.nrcontrv != null && !this.nrcontrv.equals(other.nrcontrv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.SaidanotavPK[ nrcontr=" + nrcontr + ", nrcontrv=" + nrcontrv + " ]";
    }
    
}
