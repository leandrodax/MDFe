/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class MoviReceitamedItensPK  {
    private int coditem;
    private int codreceita;

    public MoviReceitamedItensPK() {
    }

    public MoviReceitamedItensPK(int coditem, int codreceita) {
        this.coditem = coditem;
        this.codreceita = codreceita;
    }

    public int getCoditem() {
        return coditem;
    }

    public void setCoditem(int coditem) {
        this.coditem = coditem;
    }

    public int getCodreceita() {
        return codreceita;
    }

    public void setCodreceita(int codreceita) {
        this.codreceita = codreceita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) coditem;
        hash += (int) codreceita;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MoviReceitamedItensPK)) {
            return false;
        }
        MoviReceitamedItensPK other = (MoviReceitamedItensPK) object;
        if (this.coditem != other.coditem) {
            return false;
        }
        if (this.codreceita != other.codreceita) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MoviReceitamedItensPK[ coditem=" + coditem + ", codreceita=" + codreceita + " ]";
    }
    
}
