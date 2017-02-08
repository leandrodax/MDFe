/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Movcheqe {
    private static final long serialVersionUID = 1L;
    private Integer codmov;
    private Date datmov;
    private String hormov;
    private Integer codchqe;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vantmov;
    private Double valmov;
    private Double salmov;
    private Character tipmov;
    private Integer codplan;
    private Integer codconta;

    public Movcheqe() {
    }

    public Movcheqe(Integer codmov) {
        this.codmov = codmov;
    }

    public Integer getCodmov() {
        return codmov;
    }

    public void setCodmov(Integer codmov) {
        this.codmov = codmov;
    }

    public Date getDatmov() {
        return datmov;
    }

    public void setDatmov(Date datmov) {
        this.datmov = datmov;
    }

    public String getHormov() {
        return hormov;
    }

    public void setHormov(String hormov) {
        this.hormov = hormov;
    }

    public Integer getCodchqe() {
        return codchqe;
    }

    public void setCodchqe(Integer codchqe) {
        this.codchqe = codchqe;
    }

    public Double getVantmov() {
        return vantmov;
    }

    public void setVantmov(Double vantmov) {
        this.vantmov = vantmov;
    }

    public Double getValmov() {
        return valmov;
    }

    public void setValmov(Double valmov) {
        this.valmov = valmov;
    }

    public Double getSalmov() {
        return salmov;
    }

    public void setSalmov(Double salmov) {
        this.salmov = salmov;
    }

    public Character getTipmov() {
        return tipmov;
    }

    public void setTipmov(Character tipmov) {
        this.tipmov = tipmov;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public Integer getCodconta() {
        return codconta;
    }

    public void setCodconta(Integer codconta) {
        this.codconta = codconta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codmov != null ? codmov.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movcheqe)) {
            return false;
        }
        Movcheqe other = (Movcheqe) object;
        if ((this.codmov == null && other.codmov != null) || (this.codmov != null && !this.codmov.equals(other.codmov))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movcheqe[ codmov=" + codmov + " ]";
    }
    
}
