/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class MovioscontrolestatusPK {

    private int codos;
    private int codstatus;
    private Date rgdata;

    public MovioscontrolestatusPK() {
    }

    public MovioscontrolestatusPK(int codos, int codstatus, Date rgdata) {
        this.codos = codos;
        this.codstatus = codstatus;
        this.rgdata = rgdata;
    }

    public int getCodos() {
        return codos;
    }

    public void setCodos(int codos) {
        this.codos = codos;
    }

    public int getCodstatus() {
        return codstatus;
    }

    public void setCodstatus(int codstatus) {
        this.codstatus = codstatus;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codos;
        hash += (int) codstatus;
        hash += (rgdata != null ? rgdata.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovioscontrolestatusPK)) {
            return false;
        }
        MovioscontrolestatusPK other = (MovioscontrolestatusPK) object;
        if (this.codos != other.codos) {
            return false;
        }
        if (this.codstatus != other.codstatus) {
            return false;
        }
        if ((this.rgdata == null && other.rgdata != null) || (this.rgdata != null && !this.rgdata.equals(other.rgdata))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MovioscontrolestatusPK[ codos=" + codos + ", codstatus=" + codstatus + ", rgdata=" + rgdata + " ]";
    }
    
}
