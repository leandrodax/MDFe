/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class Detpromoviospreorcamento2PK {
    private int codospreorcamento;
    private int nritem;

    public Detpromoviospreorcamento2PK() {
    }

    public Detpromoviospreorcamento2PK(int codospreorcamento, int nritem) {
        this.codospreorcamento = codospreorcamento;
        this.nritem = nritem;
    }

    public int getCodospreorcamento() {
        return codospreorcamento;
    }

    public void setCodospreorcamento(int codospreorcamento) {
        this.codospreorcamento = codospreorcamento;
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
        hash += (int) codospreorcamento;
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detpromoviospreorcamento2PK)) {
            return false;
        }
        Detpromoviospreorcamento2PK other = (Detpromoviospreorcamento2PK) object;
        if (this.codospreorcamento != other.codospreorcamento) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detpromoviospreorcamento2PK[ codospreorcamento=" + codospreorcamento + ", nritem=" + nritem + " ]";
    }
    
}
