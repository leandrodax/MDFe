/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class MovicartparcPK {
    private int nrregis;
    private String nrcontr;
    private String parcela;

    public MovicartparcPK() {
    }

    public MovicartparcPK(int nrregis, String nrcontr, String parcela) {
        this.nrregis = nrregis;
        this.nrcontr = nrcontr;
        this.parcela = parcela;
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

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nrregis;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        hash += (parcela != null ? parcela.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovicartparcPK)) {
            return false;
        }
        MovicartparcPK other = (MovicartparcPK) object;
        if (this.nrregis != other.nrregis) {
            return false;
        }
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        if ((this.parcela == null && other.parcela != null) || (this.parcela != null && !this.parcela.equals(other.parcela))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MovicartparcPK[ nrregis=" + nrregis + ", nrcontr=" + nrcontr + ", parcela=" + parcela + " ]";
    }
    
}
