/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;

/**
 *
 * @author vplayer
 */
public class CredUfoperadoraPK implements Serializable {
    private String codigoOperadora;
    private String nomeEstado;

    public CredUfoperadoraPK() {
    }

    public CredUfoperadoraPK(String codigoOperadora, String nomeEstado) {
        this.codigoOperadora = codigoOperadora;
        this.nomeEstado = nomeEstado;
    }

    public String getCodigoOperadora() {
        return codigoOperadora;
    }

    public void setCodigoOperadora(String codigoOperadora) {
        this.codigoOperadora = codigoOperadora;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoOperadora != null ? codigoOperadora.hashCode() : 0);
        hash += (nomeEstado != null ? nomeEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredUfoperadoraPK)) {
            return false;
        }
        CredUfoperadoraPK other = (CredUfoperadoraPK) object;
        if ((this.codigoOperadora == null && other.codigoOperadora != null) || (this.codigoOperadora != null && !this.codigoOperadora.equals(other.codigoOperadora))) {
            return false;
        }
        if ((this.nomeEstado == null && other.nomeEstado != null) || (this.nomeEstado != null && !this.nomeEstado.equals(other.nomeEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredUfoperadoraPK[ codigoOperadora=" + codigoOperadora + ", nomeEstado=" + nomeEstado + " ]";
    }
    
}
