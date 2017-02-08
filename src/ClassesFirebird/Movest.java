/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movest {
    private static final long serialVersionUID = 1L;
    private Integer chave;
    private String nrdoc;
    private Integer codfil;
    private String nome;
    private Integer codfab;
    private String codpro;
    private String descpro;
    private String unidade;
    private String referencia;
    private String modelo;
    private String cor;
    private String tamanho;
    private Integer tpmov;
    private Date dtemis;
    private Date dthrmov;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdent;
    private Double qtdsai;
    private Double qtdemb;
    private String unimov;
    private Double estfis;
    private Double precomov;
    private Double prcusto;
    private Integer codusu;
    private String nomusu;
    private String codgru;
    private String codigo;
    private Double qtdmovqua;
    private Double qtdquabov;

    public Movest() {
    }

    public Movest(Integer chave) {
        this.chave = chave;
    }

    public Integer getChave() {
        return chave;
    }

    public void setChave(Integer chave) {
        this.chave = chave;
    }

    public String getNrdoc() {
        return nrdoc;
    }

    public void setNrdoc(String nrdoc) {
        this.nrdoc = nrdoc;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodfab() {
        return codfab;
    }

    public void setCodfab(Integer codfab) {
        this.codfab = codfab;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getTpmov() {
        return tpmov;
    }

    public void setTpmov(Integer tpmov) {
        this.tpmov = tpmov;
    }

    public Date getDtemis() {
        return dtemis;
    }

    public void setDtemis(Date dtemis) {
        this.dtemis = dtemis;
    }

    public Date getDthrmov() {
        return dthrmov;
    }

    public void setDthrmov(Date dthrmov) {
        this.dthrmov = dthrmov;
    }

    public Double getQtdent() {
        return qtdent;
    }

    public void setQtdent(Double qtdent) {
        this.qtdent = qtdent;
    }

    public Double getQtdsai() {
        return qtdsai;
    }

    public void setQtdsai(Double qtdsai) {
        this.qtdsai = qtdsai;
    }

    public Double getQtdemb() {
        return qtdemb;
    }

    public void setQtdemb(Double qtdemb) {
        this.qtdemb = qtdemb;
    }

    public String getUnimov() {
        return unimov;
    }

    public void setUnimov(String unimov) {
        this.unimov = unimov;
    }

    public Double getEstfis() {
        return estfis;
    }

    public void setEstfis(Double estfis) {
        this.estfis = estfis;
    }

    public Double getPrecomov() {
        return precomov;
    }

    public void setPrecomov(Double precomov) {
        this.precomov = precomov;
    }

    public Double getPrcusto() {
        return prcusto;
    }

    public void setPrcusto(Double prcusto) {
        this.prcusto = prcusto;
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

    public String getCodgru() {
        return codgru;
    }

    public void setCodgru(String codgru) {
        this.codgru = codgru;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getQtdmovqua() {
        return qtdmovqua;
    }

    public void setQtdmovqua(Double qtdmovqua) {
        this.qtdmovqua = qtdmovqua;
    }

    public Double getQtdquabov() {
        return qtdquabov;
    }

    public void setQtdquabov(Double qtdquabov) {
        this.qtdquabov = qtdquabov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chave != null ? chave.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movest)) {
            return false;
        }
        Movest other = (Movest) object;
        if ((this.chave == null && other.chave != null) || (this.chave != null && !this.chave.equals(other.chave))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movest[ chave=" + chave + " ]";
    }
    
}
