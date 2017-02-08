/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Regcaixa {
    
    private static final long serialVersionUID = 1L;
    protected RegcaixaPK regcaixaPK;
    private Integer tpregis;
    private Integer codfil;
    private String nomcli;
    private String coddoc;
    private Integer nrcaixa;
    private Integer codforma;
    private String nomforma;
    private Character tpforma;
    private Integer nrparcela;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlregis;
    private Double vltroco;
    private Double vlpago;
    private Date dtemissao;
    private String hremissao;
    private Integer codusuario;
    private String nomusuario;
    private String codcli;
    private Character situacao;
    private Integer nrabert;
    private Character stenvio;
    private Character tpmovcx;
    private Integer nrcxold;
    private Integer nrabold;
    private String nrcontold;
    private Integer codplan;
    private Character entrada;
    private Character docbaixa;
    private Integer nrregold;
    private String nrvenda;
    private Date dtbaixa;
    private Integer nrped;
    
    public Regcaixa() {
    }

    public Regcaixa(RegcaixaPK regcaixaPK) {
        this.regcaixaPK = regcaixaPK;
    }

    public Regcaixa(int nrregis, String nrcontr) {
        this.regcaixaPK = new RegcaixaPK(nrregis, nrcontr);
    }

    public RegcaixaPK getRegcaixaPK() {
        return regcaixaPK;
    }

    public void setRegcaixaPK(RegcaixaPK regcaixaPK) {
        this.regcaixaPK = regcaixaPK;
    }

    public Integer getTpregis() {
        return tpregis;
    }

    public void setTpregis(Integer tpregis) {
        this.tpregis = tpregis;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getCoddoc() {
        return coddoc;
    }

    public void setCoddoc(String coddoc) {
        this.coddoc = coddoc;
    }

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public Integer getCodforma() {
        return codforma;
    }

    public void setCodforma(Integer codforma) {
        this.codforma = codforma;
    }

    public String getNomforma() {
        return nomforma;
    }

    public void setNomforma(String nomforma) {
        this.nomforma = nomforma;
    }

    public Character getTpforma() {
        return tpforma;
    }

    public void setTpforma(Character tpforma) {
        this.tpforma = tpforma;
    }

    public Integer getNrparcela() {
        return nrparcela;
    }

    public void setNrparcela(Integer nrparcela) {
        this.nrparcela = nrparcela;
    }

    public Double getVlregis() {
        return vlregis;
    }

    public void setVlregis(Double vlregis) {
        this.vlregis = vlregis;
    }

    public Double getVltroco() {
        return vltroco;
    }

    public void setVltroco(Double vltroco) {
        this.vltroco = vltroco;
    }

    public Double getVlpago() {
        return vlpago;
    }

    public void setVlpago(Double vlpago) {
        this.vlpago = vlpago;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public String getHremissao() {
        return hremissao;
    }

    public void setHremissao(String hremissao) {
        this.hremissao = hremissao;
    }

    public Integer getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(Integer codusuario) {
        this.codusuario = codusuario;
    }

    public String getNomusuario() {
        return nomusuario;
    }

    public void setNomusuario(String nomusuario) {
        this.nomusuario = nomusuario;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Integer getNrabert() {
        return nrabert;
    }

    public void setNrabert(Integer nrabert) {
        this.nrabert = nrabert;
    }

    public Character getStenvio() {
        return stenvio;
    }

    public void setStenvio(Character stenvio) {
        this.stenvio = stenvio;
    }

    public Character getTpmovcx() {
        return tpmovcx;
    }

    public void setTpmovcx(Character tpmovcx) {
        this.tpmovcx = tpmovcx;
    }

    public Integer getNrcxold() {
        return nrcxold;
    }

    public void setNrcxold(Integer nrcxold) {
        this.nrcxold = nrcxold;
    }

    public Integer getNrabold() {
        return nrabold;
    }

    public void setNrabold(Integer nrabold) {
        this.nrabold = nrabold;
    }

    public String getNrcontold() {
        return nrcontold;
    }

    public void setNrcontold(String nrcontold) {
        this.nrcontold = nrcontold;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public Character getEntrada() {
        return entrada;
    }

    public void setEntrada(Character entrada) {
        this.entrada = entrada;
    }

    public Character getDocbaixa() {
        return docbaixa;
    }

    public void setDocbaixa(Character docbaixa) {
        this.docbaixa = docbaixa;
    }

    public Integer getNrregold() {
        return nrregold;
    }

    public void setNrregold(Integer nrregold) {
        this.nrregold = nrregold;
    }

    public String getNrvenda() {
        return nrvenda;
    }

    public void setNrvenda(String nrvenda) {
        this.nrvenda = nrvenda;
    }

    public Date getDtbaixa() {
        return dtbaixa;
    }

    public void setDtbaixa(Date dtbaixa) {
        this.dtbaixa = dtbaixa;
    }

    public Integer getNrped() {
        return nrped;
    }

    public void setNrped(Integer nrped) {
        this.nrped = nrped;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regcaixaPK != null ? regcaixaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regcaixa)) {
            return false;
        }
        Regcaixa other = (Regcaixa) object;
        if ((this.regcaixaPK == null && other.regcaixaPK != null) || (this.regcaixaPK != null && !this.regcaixaPK.equals(other.regcaixaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Regcaixa[ regcaixaPK=" + regcaixaPK + " ]";
    }
    
}
