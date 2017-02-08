/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;


public class Tabcheqr implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Integer codchqr;
    private String desbanco;
    private Integer codfil;
    private String codagencia;
    private String tcorcheqr;
    private String cpfcheqr;
    private String cnpcheqr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double valcheqr;
    private Integer codplan;
    private Character loccheqr;
    private Date vencheqr;
    private Double vljcheqr;
    private Double vlpcheqr;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    private String pgpcheqr;
    private Character tpocheqr;
    private Integer numcheqr;
    private String ccorcheqr;
    private Integer rgcodusu;
    private String codbanco;
    private Integer codconta;
    private String stacheqrr;
    private String stacheqr;
    private String stacheqrd;
    private String taborigem;
    private String codorigem;
    private String codclix;
    private Date datlanc;
    private String codcli;
    private Integer codban;
    private Integer codage;
    private Integer codccor;
    private Date dtbaixa;
    private Integer codtroca;

    public Tabcheqr() {
    }

    public Tabcheqr(Integer codchqr) {
        this.codchqr = codchqr;
    }

    public Integer getCodchqr() {
        return codchqr;
    }

    public void setCodchqr(Integer codchqr) {
        this.codchqr = codchqr;
    }

    public String getDesbanco() {
        return desbanco;
    }

    public void setDesbanco(String desbanco) {
        this.desbanco = desbanco;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getCodagencia() {
        return codagencia;
    }

    public void setCodagencia(String codagencia) {
        this.codagencia = codagencia;
    }

    public String getTcorcheqr() {
        return tcorcheqr;
    }

    public void setTcorcheqr(String tcorcheqr) {
        this.tcorcheqr = tcorcheqr;
    }

    public String getCpfcheqr() {
        return cpfcheqr;
    }

    public void setCpfcheqr(String cpfcheqr) {
        this.cpfcheqr = cpfcheqr;
    }

    public String getCnpcheqr() {
        return cnpcheqr;
    }

    public void setCnpcheqr(String cnpcheqr) {
        this.cnpcheqr = cnpcheqr;
    }

    public Double getValcheqr() {
        return valcheqr;
    }

    public void setValcheqr(Double valcheqr) {
        this.valcheqr = valcheqr;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public Character getLoccheqr() {
        return loccheqr;
    }

    public void setLoccheqr(Character loccheqr) {
        this.loccheqr = loccheqr;
    }

    public Date getVencheqr() {
        return vencheqr;
    }

    public void setVencheqr(Date vencheqr) {
        this.vencheqr = vencheqr;
    }

    public Double getVljcheqr() {
        return vljcheqr;
    }

    public void setVljcheqr(Double vljcheqr) {
        this.vljcheqr = vljcheqr;
    }

    public Double getVlpcheqr() {
        return vlpcheqr;
    }

    public void setVlpcheqr(Double vlpcheqr) {
        this.vlpcheqr = vlpcheqr;
    }

    public String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public Character getRgevento() {
        return rgevento;
    }

    public void setRgevento(Character rgevento) {
        this.rgevento = rgevento;
    }

    public String getPgpcheqr() {
        return pgpcheqr;
    }

    public void setPgpcheqr(String pgpcheqr) {
        this.pgpcheqr = pgpcheqr;
    }

    public Character getTpocheqr() {
        return tpocheqr;
    }

    public void setTpocheqr(Character tpocheqr) {
        this.tpocheqr = tpocheqr;
    }

    public Integer getNumcheqr() {
        return numcheqr;
    }

    public void setNumcheqr(Integer numcheqr) {
        this.numcheqr = numcheqr;
    }

    public String getCcorcheqr() {
        return ccorcheqr;
    }

    public void setCcorcheqr(String ccorcheqr) {
        this.ccorcheqr = ccorcheqr;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public String getCodbanco() {
        return codbanco;
    }

    public void setCodbanco(String codbanco) {
        this.codbanco = codbanco;
    }

    public Integer getCodconta() {
        return codconta;
    }

    public void setCodconta(Integer codconta) {
        this.codconta = codconta;
    }

    public String getStacheqrr() {
        return stacheqrr;
    }

    public void setStacheqrr(String stacheqrr) {
        this.stacheqrr = stacheqrr;
    }

    public String getStacheqr() {
        return stacheqr;
    }

    public void setStacheqr(String stacheqr) {
        this.stacheqr = stacheqr;
    }

    public String getStacheqrd() {
        return stacheqrd;
    }

    public void setStacheqrd(String stacheqrd) {
        this.stacheqrd = stacheqrd;
    }

    public String getTaborigem() {
        return taborigem;
    }

    public void setTaborigem(String taborigem) {
        this.taborigem = taborigem;
    }

    public String getCodorigem() {
        return codorigem;
    }

    public void setCodorigem(String codorigem) {
        this.codorigem = codorigem;
    }

    public String getCodclix() {
        return codclix;
    }

    public void setCodclix(String codclix) {
        this.codclix = codclix;
    }

    public Date getDatlanc() {
        return datlanc;
    }

    public void setDatlanc(Date datlanc) {
        this.datlanc = datlanc;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public Integer getCodban() {
        return codban;
    }

    public void setCodban(Integer codban) {
        this.codban = codban;
    }

    public Integer getCodage() {
        return codage;
    }

    public void setCodage(Integer codage) {
        this.codage = codage;
    }

    public Integer getCodccor() {
        return codccor;
    }

    public void setCodccor(Integer codccor) {
        this.codccor = codccor;
    }

    public Date getDtbaixa() {
        return dtbaixa;
    }

    public void setDtbaixa(Date dtbaixa) {
        this.dtbaixa = dtbaixa;
    }

    public Integer getCodtroca() {
        return codtroca;
    }

    public void setCodtroca(Integer codtroca) {
        this.codtroca = codtroca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codchqr != null ? codchqr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcheqr)) {
            return false;
        }
        Tabcheqr other = (Tabcheqr) object;
        if ((this.codchqr == null && other.codchqr != null) || (this.codchqr != null && !this.codchqr.equals(other.codchqr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcheqr[ codchqr=" + codchqr + " ]";
    }
    
}
