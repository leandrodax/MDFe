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

public class Tipo60mPK implements Serializable {
   
    
    private Date dtemissao;
   
    private String nrserie;

    public Tipo60mPK() {
    }

    public Tipo60mPK(Date dtemissao, String nrserie) {
        this.dtemissao = dtemissao;
        this.nrserie = nrserie;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dtemissao != null ? dtemissao.hashCode() : 0);
        hash += (nrserie != null ? nrserie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo60mPK)) {
            return false;
        }
        Tipo60mPK other = (Tipo60mPK) object;
        if ((this.dtemissao == null && other.dtemissao != null) || (this.dtemissao != null && !this.dtemissao.equals(other.dtemissao))) {
            return false;
        }
        if ((this.nrserie == null && other.nrserie != null) || (this.nrserie != null && !this.nrserie.equals(other.nrserie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tipo60mPK[ dtemissao=" + dtemissao + ", nrserie=" + nrserie + " ]";
    }
    
}
