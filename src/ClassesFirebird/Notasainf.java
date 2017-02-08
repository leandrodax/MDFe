/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notasainf {
    
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private String cfops;
    private String nrnota;
    private String sserie;
    private String selo;
    private Date dataemi;
    private Date datasai;
    private String horasai;
    private Character frete;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double basesubst;
    private Double valorsubs;
    private Notasai notasai;

    public Notasainf() {
    }

    public Notasainf(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getCfops() {
        return cfops;
    }

    public void setCfops(String cfops) {
        this.cfops = cfops;
    }

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public String getSserie() {
        return sserie;
    }

    public void setSserie(String sserie) {
        this.sserie = sserie;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    public Date getDataemi() {
        return dataemi;
    }

    public void setDataemi(Date dataemi) {
        this.dataemi = dataemi;
    }

    public Date getDatasai() {
        return datasai;
    }

    public void setDatasai(Date datasai) {
        this.datasai = datasai;
    }

    public String getHorasai() {
        return horasai;
    }

    public void setHorasai(String horasai) {
        this.horasai = horasai;
    }

    public Character getFrete() {
        return frete;
    }

    public void setFrete(Character frete) {
        this.frete = frete;
    }

    public Double getBasesubst() {
        return basesubst;
    }

    public void setBasesubst(Double basesubst) {
        this.basesubst = basesubst;
    }

    public Double getValorsubs() {
        return valorsubs;
    }

    public void setValorsubs(Double valorsubs) {
        this.valorsubs = valorsubs;
    }

    public Notasai getNotasai() {
        return notasai;
    }

    public void setNotasai(Notasai notasai) {
        this.notasai = notasai;
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
        if (!(object instanceof Notasainf)) {
            return false;
        }
        Notasainf other = (Notasainf) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notasainf[ nrcontr=" + nrcontr + " ]";
    }
    
}
