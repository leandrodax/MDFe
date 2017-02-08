/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class NotaositensPK {
    
    private int nritem;
    private int nros;

    public NotaositensPK() {
    }

    public NotaositensPK(int nritem, int nros) {
        this.nritem = nritem;
        this.nros = nros;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    public int getNros() {
        return nros;
    }

    public void setNros(int nros) {
        this.nros = nros;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nritem;
        hash += (int) nros;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaositensPK)) {
            return false;
        }
        NotaositensPK other = (NotaositensPK) object;
        if (this.nritem != other.nritem) {
            return false;
        }
        if (this.nros != other.nros) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.NotaositensPK[ nritem=" + nritem + ", nros=" + nros + " ]";
    }
    
}
