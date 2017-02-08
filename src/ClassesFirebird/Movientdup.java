/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;

public class Movientdup implements Serializable {

    private static final long serialVersionUID = 1L;
    protected MovientdupPK movientdupPK;
    private String ndup;
    private Date dvenc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vdup;

    public Movientdup() {
    }

    public Movientdup(MovientdupPK movientdupPK) {
        this.movientdupPK = movientdupPK;
    }

    public Movientdup(int keynfe, int nitem) {
        this.movientdupPK = new MovientdupPK(keynfe, nitem);
    }

    public MovientdupPK getMovientdupPK() {
        return movientdupPK;
    }

    public void setMovientdupPK(MovientdupPK movientdupPK) {
        this.movientdupPK = movientdupPK;
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
        hash += (movientdupPK != null ? movientdupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movientdup)) {
            return false;
        }
        Movientdup other = (Movientdup) object;
        if ((this.movientdupPK == null && other.movientdupPK != null) || (this.movientdupPK != null && !this.movientdupPK.equals(other.movientdupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movientdup[ movientdupPK=" + movientdupPK + " ]";
    }
    
}
