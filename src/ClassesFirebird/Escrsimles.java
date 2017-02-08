/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Escrsimles {
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private Integer codfil;
    private Date dtemissao;
    private String modelo;
    private String serie;
    private String subser;
    private String nriniord;
    private String nrfimord;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlcontabil;
    private Double bscalcicms;
    private Double alicms;
    private Double vlicms;
    private Double vlisento;
    private Double vloutras;
    private Integer codusuent;
    private String nomusuent;
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;
    private Date datafin;
    private String nrlote;
    private String situacao;
    private String origem;

    public Escrsimles() {
    }

    public Escrsimles(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSubser() {
        return subser;
    }

    public void setSubser(String subser) {
        this.subser = subser;
    }

    public String getNriniord() {
        return nriniord;
    }

    public void setNriniord(String nriniord) {
        this.nriniord = nriniord;
    }

    public String getNrfimord() {
        return nrfimord;
    }

    public void setNrfimord(String nrfimord) {
        this.nrfimord = nrfimord;
    }

    public Double getVlcontabil() {
        return vlcontabil;
    }

    public void setVlcontabil(Double vlcontabil) {
        this.vlcontabil = vlcontabil;
    }

    public Double getBscalcicms() {
        return bscalcicms;
    }

    public void setBscalcicms(Double bscalcicms) {
        this.bscalcicms = bscalcicms;
    }

    public Double getAlicms() {
        return alicms;
    }

    public void setAlicms(Double alicms) {
        this.alicms = alicms;
    }

    public Double getVlicms() {
        return vlicms;
    }

    public void setVlicms(Double vlicms) {
        this.vlicms = vlicms;
    }

    public Double getVlisento() {
        return vlisento;
    }

    public void setVlisento(Double vlisento) {
        this.vlisento = vlisento;
    }

    public Double getVloutras() {
        return vloutras;
    }

    public void setVloutras(Double vloutras) {
        this.vloutras = vloutras;
    }

    public Integer getCodusuent() {
        return codusuent;
    }

    public void setCodusuent(Integer codusuent) {
        this.codusuent = codusuent;
    }

    public String getNomusuent() {
        return nomusuent;
    }

    public void setNomusuent(String nomusuent) {
        this.nomusuent = nomusuent;
    }

    public Date getDataent() {
        return dataent;
    }

    public void setDataent(Date dataent) {
        this.dataent = dataent;
    }

    public Integer getCodusufin() {
        return codusufin;
    }

    public void setCodusufin(Integer codusufin) {
        this.codusufin = codusufin;
    }

    public String getNomusufin() {
        return nomusufin;
    }

    public void setNomusufin(String nomusufin) {
        this.nomusufin = nomusufin;
    }

    public Date getDatafin() {
        return datafin;
    }

    public void setDatafin(Date datafin) {
        this.datafin = datafin;
    }

    public String getNrlote() {
        return nrlote;
    }

    public void setNrlote(String nrlote) {
        this.nrlote = nrlote;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
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
        if (!(object instanceof Escrsimles)) {
            return false;
        }
        Escrsimles other = (Escrsimles) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Escrsimles[ nrcontr=" + nrcontr + " ]";
    }
    
}
