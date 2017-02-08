/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class RegcxparcPK {

    private int nrregis;
    private String nrcontr;
    private String codtit;

    public RegcxparcPK() {
    }

    public RegcxparcPK(int nrregis, String nrcontr, String codtit) {
        this.nrregis = nrregis;
        this.nrcontr = nrcontr;
        this.codtit = codtit;
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

    public String getCodtit() {
        return codtit;
    }

    public void setCodtit(String codtit) {
        this.codtit = codtit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nrregis;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        hash += (codtit != null ? codtit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegcxparcPK)) {
            return false;
        }
        RegcxparcPK other = (RegcxparcPK) object;
        if (this.nrregis != other.nrregis) {
            return false;
        }
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        if ((this.codtit == null && other.codtit != null) || (this.codtit != null && !this.codtit.equals(other.codtit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.RegcxparcPK[ nrregis=" + nrregis + ", nrcontr=" + nrcontr + ", codtit=" + codtit + " ]";
    }
    
}
