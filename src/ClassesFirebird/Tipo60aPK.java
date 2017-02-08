/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author vplayer
 */

public class Tipo60aPK implements Serializable {
    
    
    private Date dtemissao;
    
    private String nrserie;
    
    private String indice;

    public Tipo60aPK() {
    }

    public Tipo60aPK(Date dtemissao, String nrserie, String indice) {
        this.dtemissao = dtemissao;
        this.nrserie = nrserie;
        this.indice = indice;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public String getNrserie() {
        return nrserie;
    }

    public void setNrserie(String nrserie) {
        this.nrserie = nrserie;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtemissao != null ? dtemissao.hashCode() : 0);
        hash += (nrserie != null ? nrserie.hashCode() : 0);
        hash += (indice != null ? indice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo60aPK)) {
            return false;
        }
        Tipo60aPK other = (Tipo60aPK) object;
        if ((this.dtemissao == null && other.dtemissao != null) || (this.dtemissao != null && !this.dtemissao.equals(other.dtemissao))) {
            return false;
        }
        if ((this.nrserie == null && other.nrserie != null) || (this.nrserie != null && !this.nrserie.equals(other.nrserie))) {
            return false;
        }
        if ((this.indice == null && other.indice != null) || (this.indice != null && !this.indice.equals(other.indice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tipo60aPK[ dtemissao=" + dtemissao + ", nrserie=" + nrserie + ", indice=" + indice + " ]";
    }
    
}
