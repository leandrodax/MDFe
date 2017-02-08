/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movinfedup {
    
    private static final long serialVersionUID = 1L;
    protected MovinfedupPK movinfedupPK;
    private String ndup;
    private Date dvenc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vdup;

    public Movinfedup() {
    }

    public Movinfedup(MovinfedupPK movinfedupPK) {
        this.movinfedupPK = movinfedupPK;
    }

    public Movinfedup(int keynfe, int nitem) {
        this.movinfedupPK = new MovinfedupPK(keynfe, nitem);
    }

    public MovinfedupPK getMovinfedupPK() {
        return movinfedupPK;
    }

    public void setMovinfedupPK(MovinfedupPK movinfedupPK) {
        this.movinfedupPK = movinfedupPK;
    }

    public String getNdup() {
        return ndup;
    }

    public void setNdup(String ndup) {
        this.ndup = ndup;
    }

    public Date getDvenc() {
        return dvenc;
    }

    public void setDvenc(Date dvenc) {
        this.dvenc = dvenc;
    }

    public Double getVdup() {
        return vdup;
    }

    public void setVdup(Double vdup) {
        this.vdup = vdup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movinfedupPK != null ? movinfedupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movinfedup)) {
            return false;
        }
        Movinfedup other = (Movinfedup) object;
        if ((this.movinfedupPK == null && other.movinfedupPK != null) || (this.movinfedupPK != null && !this.movinfedupPK.equals(other.movinfedupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movinfedup[ movinfedupPK=" + movinfedupPK + " ]";
    }
    
}
