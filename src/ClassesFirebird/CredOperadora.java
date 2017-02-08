/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class CredOperadora implements Serializable {
    private static final long serialVersionUID = 1L;
    private String codigoOperadora;
    private String nomeOperadora;
    private Date ultimaAtualizacaoOperadora;

    public CredOperadora() {
    }

    public CredOperadora(String codigoOperadora) {
        this.codigoOperadora = codigoOperadora;
    }

    public String getCodigoOperadora() {
        return codigoOperadora;
    }

    public void setCodigoOperadora(String codigoOperadora) {
        this.codigoOperadora = codigoOperadora;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public Date getUltimaAtualizacaoOperadora() {
        return ultimaAtualizacaoOperadora;
    }

    public void setUltimaAtualizacaoOperadora(Date ultimaAtualizacaoOperadora) {
        this.ultimaAtualizacaoOperadora = ultimaAtualizacaoOperadora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoOperadora != null ? codigoOperadora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredOperadora)) {
            return false;
        }
        CredOperadora other = (CredOperadora) object;
        if ((this.codigoOperadora == null && other.codigoOperadora != null) || (this.codigoOperadora != null && !this.codigoOperadora.equals(other.codigoOperadora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredOperadora[ codigoOperadora=" + codigoOperadora + " ]";
    }
    
}
