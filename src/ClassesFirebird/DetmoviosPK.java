/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class DetmoviosPK {
    private int codos;
    private int codprof;

    public DetmoviosPK() {
    }

    public DetmoviosPK(int codos, int codprof) {
        this.codos = codos;
        this.codprof = codprof;
    }

    public int getCodos() {
        return codos;
    }

    public void setCodos(int codos) {
        this.codos = codos;
    }

    public int getCodprof() {
        return codprof;
    }

    public void setCodprof(int codprof) {
        this.codprof = codprof;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codos;
        hash += (int) codprof;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetmoviosPK)) {
            return false;
        }
        DetmoviosPK other = (DetmoviosPK) object;
        if (this.codos != other.codos) {
            return false;
        }
        if (this.codprof != other.codprof) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.DetmoviosPK[ codos=" + codos + ", codprof=" + codprof + " ]";
    }
    
}
