/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notaentitens {
    
    private static final long serialVersionUID = 1L;
    protected NotaentitensPK notaentitensPK;
    private String codpro;
    private String coddig;
    private String descpro;
    private String unidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdcom;
    private Double vlunit;
    private Double percdesc;
    private Double vldesc;
    private Double vltotal;
    private Double alicms;
    private Double vlicms;
    private Double alipi;
    private Double vlipi;
    private Double qtdund;
    private Double vlund;
    private Double qtdcomant;
    private Double vlunitant;
    private Character contrquant;
    private Character contrrefer;
    private Character contrcomp;
    private String indice;
    private Date datavenc;
    private String lotevenc;
    private Double qtddevol;
    private String cfopi;
    private String indipi;
    private String cst;
    private Double vldescab;
    private Double vlbascal;
    private Double qtdemb;
    private String ununit;
    private String unemb;
    private Integer qtdquabov;
    private Notaent notaent;
    
    public Notaentitens() {
    }

    public Notaentitens(NotaentitensPK notaentitensPK) {
        this.notaentitensPK = notaentitensPK;
    }

    public Notaentitens(int codfil, int codfor, String nrnota, int nritem) {
        this.notaentitensPK = new NotaentitensPK(codfil, codfor, nrnota, nritem);
    }

    public NotaentitensPK getNotaentitensPK() {
        return notaentitensPK;
    }

    public void setNotaentitensPK(NotaentitensPK notaentitensPK) {
        this.notaentitensPK = notaentitensPK;
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

    public Double getQtdcom() {
        return qtdcom;
    }

    public void setQtdcom(Double qtdcom) {
        this.qtdcom = qtdcom;
    }

    public Double getVlunit() {
        return vlunit;
    }

    public void setVlunit(Double vlunit) {
        this.vlunit = vlunit;
    }

    public Double getPercdesc() {
        return percdesc;
    }

    public void setPercdesc(Double percdesc) {
        this.percdesc = percdesc;
    }

    public Double getVldesc() {
        return vldesc;
    }

    public void setVldesc(Double vldesc) {
        this.vldesc = vldesc;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
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

    public Double getQtdund() {
        return qtdund;
    }

    public void setQtdund(Double qtdund) {
        this.qtdund = qtdund;
    }

    public Double getVlund() {
        return vlund;
    }

    public void setVlund(Double vlund) {
        this.vlund = vlund;
    }

    public Double getQtdcomant() {
        return qtdcomant;
    }

    public void setQtdcomant(Double qtdcomant) {
        this.qtdcomant = qtdcomant;
    }

    public Double getVlunitant() {
        return vlunitant;
    }

    public void setVlunitant(Double vlunitant) {
        this.vlunitant = vlunitant;
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

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public Date getDatavenc() {
        return datavenc;
    }

    public void setDatavenc(Date datavenc) {
        this.datavenc = datavenc;
    }

    public String getLotevenc() {
        return lotevenc;
    }

    public void setLotevenc(String lotevenc) {
        this.lotevenc = lotevenc;
    }

    public Double getQtddevol() {
        return qtddevol;
    }

    public void setQtddevol(Double qtddevol) {
        this.qtddevol = qtddevol;
    }

    public String getCfopi() {
        return cfopi;
    }

    public void setCfopi(String cfopi) {
        this.cfopi = cfopi;
    }

    public String getIndipi() {
        return indipi;
    }

    public void setIndipi(String indipi) {
        this.indipi = indipi;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public Double getVldescab() {
        return vldescab;
    }

    public void setVldescab(Double vldescab) {
        this.vldescab = vldescab;
    }

    public Double getVlbascal() {
        return vlbascal;
    }

    public void setVlbascal(Double vlbascal) {
        this.vlbascal = vlbascal;
    }

    public Double getQtdemb() {
        return qtdemb;
    }

    public void setQtdemb(Double qtdemb) {
        this.qtdemb = qtdemb;
    }

    public String getUnunit() {
        return ununit;
    }

    public void setUnunit(String ununit) {
        this.ununit = ununit;
    }

    public String getUnemb() {
        return unemb;
    }

    public void setUnemb(String unemb) {
        this.unemb = unemb;
    }

    public Integer getQtdquabov() {
        return qtdquabov;
    }

    public void setQtdquabov(Integer qtdquabov) {
        this.qtdquabov = qtdquabov;
    }

    public Notaent getNotaent() {
        return notaent;
    }

    public void setNotaent(Notaent notaent) {
        this.notaent = notaent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notaentitensPK != null ? notaentitensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notaentitens)) {
            return false;
        }
        Notaentitens other = (Notaentitens) object;
        if ((this.notaentitensPK == null && other.notaentitensPK != null) || (this.notaentitensPK != null && !this.notaentitensPK.equals(other.notaentitensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notaentitens[ notaentitensPK=" + notaentitensPK + " ]";
    }
    
}
