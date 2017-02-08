/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class MovioslogPK {
    
    private int codos;
    private int codoslog;

    public MovioslogPK() {
    }

    public MovioslogPK(int codos, int codoslog) {
        this.codos = codos;
        this.codoslog = codoslog;
    }

    public int getCodos() {
        return codos;
    }

    public void setCodos(int codos) {
        this.codos = codos;
    }

    public int getCodoslog() {
        return codoslog;
    }

    public void setCodoslog(int codoslog) {
        this.codoslog = codoslog;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codos;
        hash += (int) codoslog;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovioslogPK)) {
            return false;
        }
        MovioslogPK other = (MovioslogPK) object;
        if (this.codos != other.codos) {
            return false;
        }
        if (this.codoslog != other.codoslog) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MovioslogPK[ codos=" + codos + ", codoslog=" + codoslog + " ]";
    }
    
}
