/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Movinfevollac {
    
    private static final long serialVersionUID = 1L;
    protected MovinfevollacPK movinfevollacPK;
    private String nlacre;

    public Movinfevollac() {
    }

    public Movinfevollac(MovinfevollacPK movinfevollacPK) {
        this.movinfevollacPK = movinfevollacPK;
    }

    public Movinfevollac(int keynfe, int nitemvol, int nitem) {
        this.movinfevollacPK = new MovinfevollacPK(keynfe, nitemvol, nitem);
    }

    public MovinfevollacPK getMovinfevollacPK() {
        return movinfevollacPK;
    }

    public void setMovinfevollacPK(MovinfevollacPK movinfevollacPK) {
        this.movinfevollacPK = movinfevollacPK;
    }

    public String getNlacre() {
        return nlacre;
    }

    public void setNlacre(String nlacre) {
        this.nlacre = nlacre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movinfevollacPK != null ? movinfevollacPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movinfevollac)) {
            return false;
        }
        Movinfevollac other = (Movinfevollac) object;
        if ((this.movinfevollacPK == null && other.movinfevollacPK != null) || (this.movinfevollacPK != null && !this.movinfevollacPK.equals(other.movinfevollacPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movinfevollac[ movinfevollacPK=" + movinfevollacPK + " ]";
    }
    
}
