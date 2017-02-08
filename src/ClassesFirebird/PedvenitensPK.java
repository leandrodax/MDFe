/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class PedvenitensPK {

    private String nrpedido;
    private int nritem;

    public PedvenitensPK() {
    }

    public PedvenitensPK(String nrpedido, int nritem) {
        this.nrpedido = nrpedido;
        this.nritem = nritem;
    }

    public String getNrpedido() {
        return nrpedido;
    }

    public void setNrpedido(String nrpedido) {
        this.nrpedido = nrpedido;
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
        hash += (nrpedido != null ? nrpedido.hashCode() : 0);
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedvenitensPK)) {
            return false;
        }
        PedvenitensPK other = (PedvenitensPK) object;
        if ((this.nrpedido == null && other.nrpedido != null) || (this.nrpedido != null && !this.nrpedido.equals(other.nrpedido))) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.PedvenitensPK[ nrpedido=" + nrpedido + ", nritem=" + nritem + " ]";
    }
    
}
