/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class Movientvollac{
    
    private static final long serialVersionUID = 1L;
    protected MovientvollacPK movientvollacPK;
    private String nlacre;

    public Movientvollac() {
    }

    public Movientvollac(MovientvollacPK movientvollacPK) {
        this.movientvollacPK = movientvollacPK;
    }

    public Movientvollac(int keynfe, int nitemvol, int nitem) {
        this.movientvollacPK = new MovientvollacPK(keynfe, nitemvol, nitem);
    }

    public MovientvollacPK getMovientvollacPK() {
        return movientvollacPK;
    }

    public void setMovientvollacPK(MovientvollacPK movientvollacPK) {
        this.movientvollacPK = movientvollacPK;
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
        hash += (movientvollacPK != null ? movientvollacPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movientvollac)) {
            return false;
        }
        Movientvollac other = (Movientvollac) object;
        if ((this.movientvollacPK == null && other.movientvollacPK != null) || (this.movientvollacPK != null && !this.movientvollacPK.equals(other.movientvollacPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movientvollac[ movientvollacPK=" + movientvollacPK + " ]";
    }
    
}
