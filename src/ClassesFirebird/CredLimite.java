/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class CredLimite implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codTrans;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double antecipado;
    private Double limite;

    public CredLimite() {
    }

    public CredLimite(Integer codTrans) {
        this.codTrans = codTrans;
    }

    public Integer getCodTrans() {
        return codTrans;
    }

    public void setCodTrans(Integer codTrans) {
        this.codTrans = codTrans;
    }

    public Double getAntecipado() {
        return antecipado;
    }

    public void setAntecipado(Double antecipado) {
        this.antecipado = antecipado;
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTrans != null ? codTrans.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredLimite)) {
            return false;
        }
        CredLimite other = (CredLimite) object;
        if ((this.codTrans == null && other.codTrans != null) || (this.codTrans != null && !this.codTrans.equals(other.codTrans))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredLimite[ codTrans=" + codTrans + " ]";
    }
    
}
