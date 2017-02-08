/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Tabcheqrtroca {
    
    private static final long serialVersionUID = 1L;
    private Integer codtroca;
    private Integer codccor;
    private Integer rgcodusu;
    private String rgusuario;
    private Character rgevento;
    private Date daltroca;
    private Character statroca;
    private Date daftroca;
    private Date dabtroca;
    private Integer codconta;
    private Integer codplano;
    private Date dactroca;
    private Date rgdata;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vrftroca;
    private Double pertroca;
    private Double vrstroca;
    private Integer codbco;
    private Integer codage;
    private String codbanco;
    private String codagencia;
    private String nrccor;
    private String obs;

    public Tabcheqrtroca() {
    }

    public Tabcheqrtroca(Integer codtroca) {
        this.codtroca = codtroca;
    }

    public Integer getCodtroca() {
        return codtroca;
    }

    public void setCodtroca(Integer codtroca) {
        this.codtroca = codtroca;
    }

    public Integer getCodccor() {
        return codccor;
    }

    public void setCodccor(Integer codccor) {
        this.codccor = codccor;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public Character getRgevento() {
        return rgevento;
    }

    public void setRgevento(Character rgevento) {
        this.rgevento = rgevento;
    }

    public Date getDaltroca() {
        return daltroca;
    }

    public void setDaltroca(Date daltroca) {
        this.daltroca = daltroca;
    }

    public Character getStatroca() {
        return statroca;
    }

    public void setStatroca(Character statroca) {
        this.statroca = statroca;
    }

    public Date getDaftroca() {
        return daftroca;
    }

    public void setDaftroca(Date daftroca) {
        this.daftroca = daftroca;
    }

    public Date getDabtroca() {
        return dabtroca;
    }

    public void setDabtroca(Date dabtroca) {
        this.dabtroca = dabtroca;
    }

    public Integer getCodconta() {
        return codconta;
    }

    public void setCodconta(Integer codconta) {
        this.codconta = codconta;
    }

    public Integer getCodplano() {
        return codplano;
    }

    public void setCodplano(Integer codplano) {
        this.codplano = codplano;
    }

    public Date getDactroca() {
        return dactroca;
    }

    public void setDactroca(Date dactroca) {
        this.dactroca = dactroca;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public Double getVrftroca() {
        return vrftroca;
    }

    public void setVrftroca(Double vrftroca) {
        this.vrftroca = vrftroca;
    }

    public Double getPertroca() {
        return pertroca;
    }

    public void setPertroca(Double pertroca) {
        this.pertroca = pertroca;
    }

    public Double getVrstroca() {
        return vrstroca;
    }

    public void setVrstroca(Double vrstroca) {
        this.vrstroca = vrstroca;
    }

    public Integer getCodbco() {
        return codbco;
    }

    public void setCodbco(Integer codbco) {
        this.codbco = codbco;
    }

    public Integer getCodage() {
        return codage;
    }

    public void setCodage(Integer codage) {
        this.codage = codage;
    }

    public String getCodbanco() {
        return codbanco;
    }

    public void setCodbanco(String codbanco) {
        this.codbanco = codbanco;
    }

    public String getCodagencia() {
        return codagencia;
    }

    public void setCodagencia(String codagencia) {
        this.codagencia = codagencia;
    }

    public String getNrccor() {
        return nrccor;
    }

    public void setNrccor(String nrccor) {
        this.nrccor = nrccor;
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
        hash += (codtroca != null ? codtroca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcheqrtroca)) {
            return false;
        }
        Tabcheqrtroca other = (Tabcheqrtroca) object;
        if ((this.codtroca == null && other.codtroca != null) || (this.codtroca != null && !this.codtroca.equals(other.codtroca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcheqrtroca[ codtroca=" + codtroca + " ]";
    }
    
}
