/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Regcxparc {
    
    private static final long serialVersionUID = 1L;
    
    protected RegcxparcPK regcxparcPK;
    private Date dtvencimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlparcela;
    private String parcela;
    private Regcaixa regcaixa;

    public Regcxparc() {
    }

    public Regcxparc(RegcxparcPK regcxparcPK) {
        this.regcxparcPK = regcxparcPK;
    }

    public Regcxparc(int nrregis, String nrcontr, String codtit) {
        this.regcxparcPK = new RegcxparcPK(nrregis, nrcontr, codtit);
    }

    public RegcxparcPK getRegcxparcPK() {
        return regcxparcPK;
    }

    public void setRegcxparcPK(RegcxparcPK regcxparcPK) {
        this.regcxparcPK = regcxparcPK;
    }

    public Date getDtvencimento() {
        return dtvencimento;
    }

    public void setDtvencimento(Date dtvencimento) {
        this.dtvencimento = dtvencimento;
    }

    public Double getVlparcela() {
        return vlparcela;
    }

    public void setVlparcela(Double vlparcela) {
        this.vlparcela = vlparcela;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public Regcaixa getRegcaixa() {
        return regcaixa;
    }

    public void setRegcaixa(Regcaixa regcaixa) {
        this.regcaixa = regcaixa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regcxparcPK != null ? regcxparcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regcxparc)) {
            return false;
        }
        Regcxparc other = (Regcxparc) object;
        if ((this.regcxparcPK == null && other.regcxparcPK != null) || (this.regcxparcPK != null && !this.regcxparcPK.equals(other.regcxparcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Regcxparc[ regcxparcPK=" + regcxparcPK + " ]";
    }
    
}
