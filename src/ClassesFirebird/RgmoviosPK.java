/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class RgmoviosPK {
   
    private int codigo;
    private int codos;

    public RgmoviosPK() {
    }

    public RgmoviosPK(int codigo, int codos) {
        this.codigo = codigo;
        this.codos = codos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodos() {
        return codos;
    }

    public void setCodos(int codos) {
        this.codos = codos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigo;
        hash += (int) codos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RgmoviosPK)) {
            return false;
        }
        RgmoviosPK other = (RgmoviosPK) object;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.codos != other.codos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.RgmoviosPK[ codigo=" + codigo + ", codos=" + codos + " ]";
    }
    
}
