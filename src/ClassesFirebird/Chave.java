/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;


public class Chave implements Serializable {
    private static final long serialVersionUID = 1L;
    private String alias;
    private int numero;
    private Date dtcampo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double valor;

    public Chave() {
    }

    public Chave(String alias) {
        this.alias = alias;
    }

    public Chave(String alias, int numero) {
        this.alias = alias;
        this.numero = numero;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDtcampo() {
        return dtcampo;
    }

    public void setDtcampo(Date dtcampo) {
        this.dtcampo = dtcampo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alias != null ? alias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chave)) {
            return false;
        }
        Chave other = (Chave) object;
        if ((this.alias == null && other.alias != null) || (this.alias != null && !this.alias.equals(other.alias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Chave[ alias=" + alias + " ]";
    }
    
}
