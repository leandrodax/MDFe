/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movipontos {
    
    private static final long serialVersionUID = 1L;
    private Integer nrcontr;
    private Integer nrtranf;
    private Integer codfil;
    private String codcli;
    private String nomcli;
    private Date dtemissao;
    private Date dtexpirar;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlpontos;
    private Double bxpontos;
    private Double saldopon;
    private Character situacao;
    private Character entsai;
    private Integer nrcaixa;
    private Integer nrabert;
    private String obsmov;
    private String nrorigem;
    private Integer codusu;
    private String nomusu;

    public Movipontos() {
    }

    public Movipontos(Integer nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Integer getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(Integer nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Integer getNrtranf() {
        return nrtranf;
    }

    public void setNrtranf(Integer nrtranf) {
        this.nrtranf = nrtranf;
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

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Date getDtexpirar() {
        return dtexpirar;
    }

    public void setDtexpirar(Date dtexpirar) {
        this.dtexpirar = dtexpirar;
    }

    public Double getVlpontos() {
        return vlpontos;
    }

    public void setVlpontos(Double vlpontos) {
        this.vlpontos = vlpontos;
    }

    public Double getBxpontos() {
        return bxpontos;
    }

    public void setBxpontos(Double bxpontos) {
        this.bxpontos = bxpontos;
    }

    public Double getSaldopon() {
        return saldopon;
    }

    public void setSaldopon(Double saldopon) {
        this.saldopon = saldopon;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Character getEntsai() {
        return entsai;
    }

    public void setEntsai(Character entsai) {
        this.entsai = entsai;
    }

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public Integer getNrabert() {
        return nrabert;
    }

    public void setNrabert(Integer nrabert) {
        this.nrabert = nrabert;
    }

    public String getObsmov() {
        return obsmov;
    }

    public void setObsmov(String obsmov) {
        this.obsmov = obsmov;
    }

    public String getNrorigem() {
        return nrorigem;
    }

    public void setNrorigem(String nrorigem) {
        this.nrorigem = nrorigem;
    }

    public Integer getCodusu() {
        return codusu;
    }

    public void setCodusu(Integer codusu) {
        this.codusu = codusu;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
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
        if (!(object instanceof Movipontos)) {
            return false;
        }
        Movipontos other = (Movipontos) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movipontos[ nrcontr=" + nrcontr + " ]";
    }
    
}
