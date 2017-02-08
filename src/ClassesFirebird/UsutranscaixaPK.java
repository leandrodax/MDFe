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

public class UsutranscaixaPK implements Serializable {
    
    private int codfil;
    
    
    private Date dttransf;

    public UsutranscaixaPK() {
    }

    public UsutranscaixaPK(int codfil, Date dttransf) {
        this.codfil = codfil;
        this.dttransf = dttransf;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    public Date getDttransf() {
        return dttransf;
    }

    public void setDttransf(Date dttransf) {
        this.dttransf = dttransf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codfil;
        hash += (dttransf != null ? dttransf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsutranscaixaPK)) {
            return false;
        }
        UsutranscaixaPK other = (UsutranscaixaPK) object;
        if (this.codfil != other.codfil) {
            return false;
        }
        if ((this.dttransf == null && other.dttransf != null) || (this.dttransf != null && !this.dttransf.equals(other.dttransf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.UsutranscaixaPK[ codfil=" + codfil + ", dttransf=" + dttransf + " ]";
    }
    
}
