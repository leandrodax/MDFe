/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Movicartparc {
    private static final long serialVersionUID = 1L;
    protected MovicartparcPK movicartparcPK;
    private Date dtvencimento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percadmin;
    private Double vlparcela;
    private Double vlcredito;
    private Date dtbaixa;
    private Character bxantenc;
    private Double percantc;
    private Double vlliquido;
    private Movicartao movicartao;

    public Movicartparc() {
    }

    public Movicartparc(MovicartparcPK movicartparcPK) {
        this.movicartparcPK = movicartparcPK;
    }

    public Movicartparc(int nrregis, String nrcontr, String parcela) {
        this.movicartparcPK = new MovicartparcPK(nrregis, nrcontr, parcela);
    }

    public MovicartparcPK getMovicartparcPK() {
        return movicartparcPK;
    }

    public void setMovicartparcPK(MovicartparcPK movicartparcPK) {
        this.movicartparcPK = movicartparcPK;
    }

    public Date getDtvencimento() {
        return dtvencimento;
    }

    public void setDtvencimento(Date dtvencimento) {
        this.dtvencimento = dtvencimento;
    }

    public Double getPercadmin() {
        return percadmin;
    }

    public void setPercadmin(Double percadmin) {
        this.percadmin = percadmin;
    }

    public Double getVlparcela() {
        return vlparcela;
    }

    public void setVlparcela(Double vlparcela) {
        this.vlparcela = vlparcela;
    }

    public Double getVlcredito() {
        return vlcredito;
    }

    public void setVlcredito(Double vlcredito) {
        this.vlcredito = vlcredito;
    }

    public Date getDtbaixa() {
        return dtbaixa;
    }

    public void setDtbaixa(Date dtbaixa) {
        this.dtbaixa = dtbaixa;
    }

    public Character getBxantenc() {
        return bxantenc;
    }

    public void setBxantenc(Character bxantenc) {
        this.bxantenc = bxantenc;
    }

    public Double getPercantc() {
        return percantc;
    }

    public void setPercantc(Double percantc) {
        this.percantc = percantc;
    }

    public Double getVlliquido() {
        return vlliquido;
    }

    public void setVlliquido(Double vlliquido) {
        this.vlliquido = vlliquido;
    }

    public Movicartao getMovicartao() {
        return movicartao;
    }

    public void setMovicartao(Movicartao movicartao) {
        this.movicartao = movicartao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movicartparcPK != null ? movicartparcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movicartparc)) {
            return false;
        }
        Movicartparc other = (Movicartparc) object;
        if ((this.movicartparcPK == null && other.movicartparcPK != null) || (this.movicartparcPK != null && !this.movicartparcPK.equals(other.movicartparcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movicartparc[ movicartparcPK=" + movicartparcPK + " ]";
    }
    
}
