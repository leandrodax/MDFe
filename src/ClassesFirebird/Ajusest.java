package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;

public class Ajusest implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private String tipoent;
    private Integer codfil;
    private String nome;
    private String nrnota;
    private Date dtentrada;
    private String codpro;
    private String coddig;
    private String descpro;
    private String unidade;
    private String referencia;
    private String modelo;
    private String cor;
    private String tamanho;
    private Character contrquant;
    private Character contrrefer;
    private Character contrcomp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdaju;
    private Double qtdund;
    private Integer codusuent;
    private String nomusuent;
    private Date dataent;
    private String situacao;
    private Integer codusufin;
    private String nomusufin;
    private Date datafin;
    private String observ;
    private String codigo;
    private Date dtvenc;
    private Character tpentsai;
    private Integer codhis;
    private String codsub;
    private Double vlunit;
    private String indice;
    private Double alicms;
    private Double vlicms;
    private Double alipi;
    private Double vlipi;
    private Double vltotal;
    private Integer nritem;
    private String nrdevol;
    private Integer qtdquabov;

    public Ajusest() {
    }

    public Ajusest(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getTipoent() {
        return tipoent;
    }

    public void setTipoent(String tipoent) {
        this.tipoent = tipoent;
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

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public Date getDtentrada() {
        return dtentrada;
    }

    public void setDtentrada(Date dtentrada) {
        this.dtentrada = dtentrada;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCoddig() {
        return coddig;
    }

    public void setCoddig(String coddig) {
        this.coddig = coddig;
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

    public Character getContrquant() {
        return contrquant;
    }

    public void setContrquant(Character contrquant) {
        this.contrquant = contrquant;
    }

    public Character getContrrefer() {
        return contrrefer;
    }

    public void setContrrefer(Character contrrefer) {
        this.contrrefer = contrrefer;
    }

    public Character getContrcomp() {
        return contrcomp;
    }

    public void setContrcomp(Character contrcomp) {
        this.contrcomp = contrcomp;
    }

    public Double getQtdaju() {
        return qtdaju;
    }

    public void setQtdaju(Double qtdaju) {
        this.qtdaju = qtdaju;
    }

    public Double getQtdund() {
        return qtdund;
    }

    public void setQtdund(Double qtdund) {
        this.qtdund = qtdund;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDtvenc() {
        return dtvenc;
    }

    public void setDtvenc(Date dtvenc) {
        this.dtvenc = dtvenc;
    }

    public Character getTpentsai() {
        return tpentsai;
    }

    public void setTpentsai(Character tpentsai) {
        this.tpentsai = tpentsai;
    }

    public Integer getCodhis() {
        return codhis;
    }

    public void setCodhis(Integer codhis) {
        this.codhis = codhis;
    }

    public String getCodsub() {
        return codsub;
    }

    public void setCodsub(String codsub) {
        this.codsub = codsub;
    }

    public Double getVlunit() {
        return vlunit;
    }

    public void setVlunit(Double vlunit) {
        this.vlunit = vlunit;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
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

    public Double getAlipi() {
        return alipi;
    }

    public void setAlipi(Double alipi) {
        this.alipi = alipi;
    }

    public Double getVlipi() {
        return vlipi;
    }

    public void setVlipi(Double vlipi) {
        this.vlipi = vlipi;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
    }

    public Integer getNritem() {
        return nritem;
    }

    public void setNritem(Integer nritem) {
        this.nritem = nritem;
    }

    public String getNrdevol() {
        return nrdevol;
    }

    public void setNrdevol(String nrdevol) {
        this.nrdevol = nrdevol;
    }

    public Integer getQtdquabov() {
        return qtdquabov;
    }

    public void setQtdquabov(Integer qtdquabov) {
        this.qtdquabov = qtdquabov;
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
        if (!(object instanceof Ajusest)) {
            return false;
        }
        Ajusest other = (Ajusest) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Ajusest[ nrcontr=" + nrcontr + " ]";
    }

}
