/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Paises {

    private static final long serialVersionUID = 1L;
    private String codpais;
    private String nompais;

    public Paises() {
    }

    public Paises(String codpais) {
        this.codpais = codpais;
    }

    public Paises(String codpais, String nompais) {
        this.codpais = codpais;
        this.nompais = nompais;
    }

    public String getCodpais() {
        return codpais;
    }

    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    public String getNompais() {
        return nompais;
    }

    public void setNompais(String nompais) {
        this.nompais = nompais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpais != null ? codpais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paises)) {
            return false;
        }
        Paises other = (Paises) object;
        if ((this.codpais == null && other.codpais != null) || (this.codpais != null && !this.codpais.equals(other.codpais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Paises[ codpais=" + codpais + " ]";
    }
    
}
