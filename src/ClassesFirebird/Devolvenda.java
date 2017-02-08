/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vplayer
 */

public class Devolvenda {
    private static final long serialVersionUID = 1L;
    private String nrdevol;
    private String nrcontr;
    private String nrabert;
    private Integer nrcaixa;
    private Integer codfil;
    private String codcli;
    private String nomcli;
    private String cfop;
    private Date dtemiss;
    private Date dtdevol;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vldesco;
    private Double totalno;
    private Double totcred;
    private Double totabat;
    private Character status;
    private Integer codusu;
    private String usuario;
    private String tppagam;
    private Character especie;
    private Character serie;
    private String nrfiscal;
    private String obsvenda;
    private Character origem;
    private Integer codusuest;
    private String usuarioest;
    private Date dtestorno;
    private Integer codusubai;
    private String usuariobai;
    private Date dtbaixa;

    public Devolvenda() {
    }

    public Devolvenda(String nrdevol) {
        this.nrdevol = nrdevol;
    }

    public String getNrdevol() {
        return nrdevol;
    }

    public void setNrdevol(String nrdevol) {
        this.nrdevol = nrdevol;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrabert() {
        return nrabert;
    }

    public void setNrabert(String nrabert) {
        this.nrabert = nrabert;
    }

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public Date getDtemiss() {
        return dtemiss;
    }

    public void setDtemiss(Date dtemiss) {
        this.dtemiss = dtemiss;
    }

    public Date getDtdevol() {
        return dtdevol;
    }

    public void setDtdevol(Date dtdevol) {
        this.dtdevol = dtdevol;
    }

    public Double getVldesco() {
        return vldesco;
    }

    public void setVldesco(Double vldesco) {
        this.vldesco = vldesco;
    }

    public Double getTotalno() {
        return totalno;
    }

    public void setTotalno(Double totalno) {
        this.totalno = totalno;
    }

    public Double getTotcred() {
        return totcred;
    }

    public void setTotcred(Double totcred) {
        this.totcred = totcred;
    }

    public Double getTotabat() {
        return totabat;
    }

    public void setTotabat(Double totabat) {
        this.totabat = totabat;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Integer getCodusu() {
        return codusu;
    }

    public void setCodusu(Integer codusu) {
        this.codusu = codusu;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTppagam() {
        return tppagam;
    }

    public void setTppagam(String tppagam) {
        this.tppagam = tppagam;
    }

    public Character getEspecie() {
        return especie;
    }

    public void setEspecie(Character especie) {
        this.especie = especie;
    }

    public Character getSerie() {
        return serie;
    }

    public void setSerie(Character serie) {
        this.serie = serie;
    }

    public String getNrfiscal() {
        return nrfiscal;
    }

    public void setNrfiscal(String nrfiscal) {
        this.nrfiscal = nrfiscal;
    }

    public String getObsvenda() {
        return obsvenda;
    }

    public void setObsvenda(String obsvenda) {
        this.obsvenda = obsvenda;
    }

    public Character getOrigem() {
        return origem;
    }

    public void setOrigem(Character origem) {
        this.origem = origem;
    }

    public Integer getCodusuest() {
        return codusuest;
    }

    public void setCodusuest(Integer codusuest) {
        this.codusuest = codusuest;
    }

    public String getUsuarioest() {
        return usuarioest;
    }

    public void setUsuarioest(String usuarioest) {
        this.usuarioest = usuarioest;
    }

    public Date getDtestorno() {
        return dtestorno;
    }

    public void setDtestorno(Date dtestorno) {
        this.dtestorno = dtestorno;
    }

    public Integer getCodusubai() {
        return codusubai;
    }

    public void setCodusubai(Integer codusubai) {
        this.codusubai = codusubai;
    }

    public String getUsuariobai() {
        return usuariobai;
    }

    public void setUsuariobai(String usuariobai) {
        this.usuariobai = usuariobai;
    }

    public Date getDtbaixa() {
        return dtbaixa;
    }

    public void setDtbaixa(Date dtbaixa) {
        this.dtbaixa = dtbaixa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrdevol != null ? nrdevol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolvenda)) {
            return false;
        }
        Devolvenda other = (Devolvenda) object;
        if ((this.nrdevol == null && other.nrdevol != null) || (this.nrdevol != null && !this.nrdevol.equals(other.nrdevol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Devolvenda[ nrdevol=" + nrdevol + " ]";
    }
    
}
