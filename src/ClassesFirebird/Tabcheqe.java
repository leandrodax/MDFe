/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;


public class Tabcheqe {
    
    private static final long serialVersionUID = 1L;
    private Integer codchqe;
    private Integer codban;
    private Integer codfil;
    private Integer codage;
    private Character stacheqe;
    private String pgacheqe;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double valcheqe;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    private Character tpocheqe;
    private Integer numcheqe;
    private Integer codccor;
    private Integer rgcodusu;
    private Integer codplan;
    private Integer codfor;
    private Date vencheqe;
    private Double vlpcheqe;
    private String taborigem;
    private String codorigem;
    private Character stacheqea;
    private Character blqcheqe;
    private Date dtcancelamento;
    private Date dtemissao;
    private Date dtbaixa;

    public Tabcheqe() {
    }

    public Tabcheqe(Integer codchqe) {
        this.codchqe = codchqe;
    }

    public Integer getCodchqe() {
        return codchqe;
    }

    public void setCodchqe(Integer codchqe) {
        this.codchqe = codchqe;
    }

    public Integer getCodban() {
        return codban;
    }

    public void setCodban(Integer codban) {
        this.codban = codban;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public Integer getCodage() {
        return codage;
    }

    public void setCodage(Integer codage) {
        this.codage = codage;
    }

    public Character getStacheqe() {
        return stacheqe;
    }

    public void setStacheqe(Character stacheqe) {
        this.stacheqe = stacheqe;
    }

    public String getPgacheqe() {
        return pgacheqe;
    }

    public void setPgacheqe(String pgacheqe) {
        this.pgacheqe = pgacheqe;
    }

    public Double getValcheqe() {
        return valcheqe;
    }

    public void setValcheqe(Double valcheqe) {
        this.valcheqe = valcheqe;
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

    public Character getTpocheqe() {
        return tpocheqe;
    }

    public void setTpocheqe(Character tpocheqe) {
        this.tpocheqe = tpocheqe;
    }

    public Integer getNumcheqe() {
        return numcheqe;
    }

    public void setNumcheqe(Integer numcheqe) {
        this.numcheqe = numcheqe;
    }

    public Integer getCodccor() {
        return codccor;
    }

    public void setCodccor(Integer codccor) {
        this.codccor = codccor;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public Integer getCodfor() {
        return codfor;
    }

    public void setCodfor(Integer codfor) {
        this.codfor = codfor;
    }

    public Date getVencheqe() {
        return vencheqe;
    }

    public void setVencheqe(Date vencheqe) {
        this.vencheqe = vencheqe;
    }

    public Double getVlpcheqe() {
        return vlpcheqe;
    }

    public void setVlpcheqe(Double vlpcheqe) {
        this.vlpcheqe = vlpcheqe;
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

    public Character getStacheqea() {
        return stacheqea;
    }

    public void setStacheqea(Character stacheqea) {
        this.stacheqea = stacheqea;
    }

    public Character getBlqcheqe() {
        return blqcheqe;
    }

    public void setBlqcheqe(Character blqcheqe) {
        this.blqcheqe = blqcheqe;
    }

    public Date getDtcancelamento() {
        return dtcancelamento;
    }

    public void setDtcancelamento(Date dtcancelamento) {
        this.dtcancelamento = dtcancelamento;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
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
        hash += (codchqe != null ? codchqe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcheqe)) {
            return false;
        }
        Tabcheqe other = (Tabcheqe) object;
        if ((this.codchqe == null && other.codchqe != null) || (this.codchqe != null && !this.codchqe.equals(other.codchqe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcheqe[ codchqe=" + codchqe + " ]";
    }
    
}
