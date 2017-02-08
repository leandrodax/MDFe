/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movifluxo {

    private static final long serialVersionUID = 1L;
    private Integer nrcontr;
    private Integer codfil;
    private Integer codconta;
    private int codplan;
    private String cdgrupo;
    private String cdsubgr;
    private String cdsubit;
    private Character tpplan0;
    private Date dtemissao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double valormov;
    private Integer codusuent;
    private String nomusuent;
    private Integer codusuefe;
    private String nomusuefe;
    private Date dataefeti;
    private String situacao;
    private Integer codhis;
    private String historico;
    private Double sldant;
    private Double sldatu;
    private String taborigem;
    private Character tipocod;
    private String obsmov;
    private String codorigem;
    private Character entsai;
    private String mascplan;

    public Movifluxo() {
    }

    public Movifluxo(Integer nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Movifluxo(Integer nrcontr, int codplan) {
        this.nrcontr = nrcontr;
        this.codplan = codplan;
    }

    public Integer getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(Integer nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public Integer getCodconta() {
        return codconta;
    }

    public void setCodconta(Integer codconta) {
        this.codconta = codconta;
    }

    public int getCodplan() {
        return codplan;
    }

    public void setCodplan(int codplan) {
        this.codplan = codplan;
    }

    public String getCdgrupo() {
        return cdgrupo;
    }

    public void setCdgrupo(String cdgrupo) {
        this.cdgrupo = cdgrupo;
    }

    public String getCdsubgr() {
        return cdsubgr;
    }

    public void setCdsubgr(String cdsubgr) {
        this.cdsubgr = cdsubgr;
    }

    public String getCdsubit() {
        return cdsubit;
    }

    public void setCdsubit(String cdsubit) {
        this.cdsubit = cdsubit;
    }

    public Character getTpplan0() {
        return tpplan0;
    }

    public void setTpplan0(Character tpplan0) {
        this.tpplan0 = tpplan0;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Double getValormov() {
        return valormov;
    }

    public void setValormov(Double valormov) {
        this.valormov = valormov;
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

    public Integer getCodusuefe() {
        return codusuefe;
    }

    public void setCodusuefe(Integer codusuefe) {
        this.codusuefe = codusuefe;
    }

    public String getNomusuefe() {
        return nomusuefe;
    }

    public void setNomusuefe(String nomusuefe) {
        this.nomusuefe = nomusuefe;
    }

    public Date getDataefeti() {
        return dataefeti;
    }

    public void setDataefeti(Date dataefeti) {
        this.dataefeti = dataefeti;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getCodhis() {
        return codhis;
    }

    public void setCodhis(Integer codhis) {
        this.codhis = codhis;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Double getSldant() {
        return sldant;
    }

    public void setSldant(Double sldant) {
        this.sldant = sldant;
    }

    public Double getSldatu() {
        return sldatu;
    }

    public void setSldatu(Double sldatu) {
        this.sldatu = sldatu;
    }

    public String getTaborigem() {
        return taborigem;
    }

    public void setTaborigem(String taborigem) {
        this.taborigem = taborigem;
    }

    public Character getTipocod() {
        return tipocod;
    }

    public void setTipocod(Character tipocod) {
        this.tipocod = tipocod;
    }

    public String getObsmov() {
        return obsmov;
    }

    public void setObsmov(String obsmov) {
        this.obsmov = obsmov;
    }

    public String getCodorigem() {
        return codorigem;
    }

    public void setCodorigem(String codorigem) {
        this.codorigem = codorigem;
    }

    public Character getEntsai() {
        return entsai;
    }

    public void setEntsai(Character entsai) {
        this.entsai = entsai;
    }

    public String getMascplan() {
        return mascplan;
    }

    public void setMascplan(String mascplan) {
        this.mascplan = mascplan;
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
        if (!(object instanceof Movifluxo)) {
            return false;
        }
        Movifluxo other = (Movifluxo) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movifluxo[ nrcontr=" + nrcontr + " ]";
    }
    
}
