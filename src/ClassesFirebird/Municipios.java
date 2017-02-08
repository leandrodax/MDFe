/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class Municipios {

    private static final long serialVersionUID = 1L;
    private Integer codmun;
    private short codest;
    private String nome;

    public Municipios() {
    }

    public Municipios(Integer codmun) {
        this.codmun = codmun;
    }

    public Municipios(Integer codmun, short codest, String nome) {
        this.codmun = codmun;
        this.codest = codest;
        this.nome = nome;
    }

    public Integer getCodmun() {
        return codmun;
    }

    public void setCodmun(Integer codmun) {
        this.codmun = codmun;
    }

    public short getCodest() {
        return codest;
    }

    public void setCodest(short codest) {
        this.codest = codest;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmun != null ? codmun.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Municipios)) {
            return false;
        }
        Municipios other = (Municipios) object;
        if ((this.codmun == null && other.codmun != null) || (this.codmun != null && !this.codmun.equals(other.codmun))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Municipios[ codmun=" + codmun + " ]";
    }
    
}
