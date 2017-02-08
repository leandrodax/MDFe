/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Moviimpostos {
    
    private static final long serialVersionUID = 1L;
    private Integer nrcontr;
    private Integer codfilent;
    private Integer codfilsai;
    private Character tpimposto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double valormov;
    private Date rgdata;
    private String obs;

    public Moviimpostos() {
    }

    public Moviimpostos(Integer nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Integer getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(Integer nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Integer getCodfilent() {
        return codfilent;
    }

    public void setCodfilent(Integer codfilent) {
        this.codfilent = codfilent;
    }

    public Integer getCodfilsai() {
        return codfilsai;
    }

    public void setCodfilsai(Integer codfilsai) {
        this.codfilsai = codfilsai;
    }

    public Character getTpimposto() {
        return tpimposto;
    }

    public void setTpimposto(Character tpimposto) {
        this.tpimposto = tpimposto;
    }

    public Double getValormov() {
        return valormov;
    }

    public void setValormov(Double valormov) {
        this.valormov = valormov;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moviimpostos)) {
            return false;
        }
        Moviimpostos other = (Moviimpostos) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Moviimpostos[ nrcontr=" + nrcontr + " ]";
    }
    
}
