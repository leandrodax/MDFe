/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Escrfissub {
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private String emitente;
    private Integer codfil;
    private String modelo;
    private String serie;
    private String nrnota;
    private String cfop;
    private String codigo;
    private String nome;
    private String cnpj;
    private String ie;
    private String uf;
    private Date dtentsai;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double bscalcicms;
    private Double vlicmsret;
    private Double vldespesas;
    private Integer codusuent;
    private String nomusuent;
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;
    private Date datafin;
    private String nrlote;
    private String situacao;
    private String sitfiscal;
    private String origem;
    private String entrada;

    public Escrfissub() {
    }

    public Escrfissub(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getEmitente() {
        return emitente;
    }

    public void setEmitente(String emitente) {
        this.emitente = emitente;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
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

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getDtentsai() {
        return dtentsai;
    }

    public void setDtentsai(Date dtentsai) {
        this.dtentsai = dtentsai;
    }

    public Double getBscalcicms() {
        return bscalcicms;
    }

    public void setBscalcicms(Double bscalcicms) {
        this.bscalcicms = bscalcicms;
    }

    public Double getVlicmsret() {
        return vlicmsret;
    }

    public void setVlicmsret(Double vlicmsret) {
        this.vlicmsret = vlicmsret;
    }

    public Double getVldespesas() {
        return vldespesas;
    }

    public void setVldespesas(Double vldespesas) {
        this.vldespesas = vldespesas;
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

    public String getSitfiscal() {
        return sitfiscal;
    }

    public void setSitfiscal(String sitfiscal) {
        this.sitfiscal = sitfiscal;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
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
        if (!(object instanceof Escrfissub)) {
            return false;
        }
        Escrfissub other = (Escrfissub) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Escrfissub[ nrcontr=" + nrcontr + " ]";
    }
    
}
