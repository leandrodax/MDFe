/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class Modcarta {
    private static final long serialVersionUID = 1L;
     private Integer codmod;
    private String descmod;
    private String cabecalho;
    private String rodape;

    public Modcarta() {
    }

    public Modcarta(Integer codmod) {
        this.codmod = codmod;
    }

    public Integer getCodmod() {
        return codmod;
    }

    public void setCodmod(Integer codmod) {
        this.codmod = codmod;
    }

    public String getDescmod() {
        return descmod;
    }

    public void setDescmod(String descmod) {
        this.descmod = descmod;
    }

    public String getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }

    public String getRodape() {
        return rodape;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmod != null ? codmod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modcarta)) {
            return false;
        }
        Modcarta other = (Modcarta) object;
        if ((this.codmod == null && other.codmod != null) || (this.codmod != null && !this.codmod.equals(other.codmod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Modcarta[ codmod=" + codmod + " ]";
    }
    
}
