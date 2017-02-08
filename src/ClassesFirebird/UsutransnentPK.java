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

public class UsutransnentPK implements Serializable {
   
    private int codfil;
   
    
    private Date dttransf;
   
    private int codusu;

    public UsutransnentPK() {
    }

    public UsutransnentPK(int codfil, Date dttransf, int codusu) {
        this.codfil = codfil;
        this.dttransf = dttransf;
        this.codusu = codusu;
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

    public int getCodusu() {
        return codusu;
    }

    public void setCodusu(int codusu) {
        this.codusu = codusu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codfil;
        hash += (dttransf != null ? dttransf.hashCode() : 0);
        hash += (int) codusu;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsutransnentPK)) {
            return false;
        }
        UsutransnentPK other = (UsutransnentPK) object;
        if (this.codfil != other.codfil) {
            return false;
        }
        if ((this.dttransf == null && other.dttransf != null) || (this.dttransf != null && !this.dttransf.equals(other.dttransf))) {
            return false;
        }
        if (this.codusu != other.codusu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.UsutransnentPK[ codfil=" + codfil + ", dttransf=" + dttransf + ", codusu=" + codusu + " ]";
    }
    
}
