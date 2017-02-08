/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

/**
 *
 * @author vplayer
 */

public class DetreceitaproducaoPK {
    private int codreceita;
    private int nritem;

    public DetreceitaproducaoPK() {
    }

    public DetreceitaproducaoPK(int codreceita, int nritem) {
        this.codreceita = codreceita;
        this.nritem = nritem;
    }

    public int getCodreceita() {
        return codreceita;
    }

    public void setCodreceita(int codreceita) {
        this.codreceita = codreceita;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codreceita;
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetreceitaproducaoPK)) {
            return false;
        }
        DetreceitaproducaoPK other = (DetreceitaproducaoPK) object;
        if (this.codreceita != other.codreceita) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DetreceitaproducaoPK[ codreceita=" + codreceita + ", nritem=" + nritem + " ]";
    }
    
}
