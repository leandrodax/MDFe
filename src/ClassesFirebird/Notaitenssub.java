/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Notaitenssub {
    
    private static final long serialVersionUID = 1L;
    protected NotaitenssubPK notaitenssubPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdpro;
    private Date dtvenc;
    private String codigo;
    private Double prvapro;
    private Double qtddevsub;
    private Notaentitens notaentitens;

    public Notaitenssub() {
    }

    public Notaitenssub(NotaitenssubPK notaitenssubPK) {
        this.notaitenssubPK = notaitenssubPK;
    }

    public Notaitenssub(int codfil, int codfor, String nrnota, int nritem, String codpro, String referencia, String modelo, String cor, String tamanho) {
        this.notaitenssubPK = new NotaitenssubPK(codfil, codfor, nrnota, nritem, codpro, referencia, modelo, cor, tamanho);
    }

    public NotaitenssubPK getNotaitenssubPK() {
        return notaitenssubPK;
    }

    public void setNotaitenssubPK(NotaitenssubPK notaitenssubPK) {
        this.notaitenssubPK = notaitenssubPK;
    }

    public Double getQtdpro() {
        return qtdpro;
    }

    public void setQtdpro(Double qtdpro) {
        this.qtdpro = qtdpro;
    }

    public Date getDtvenc() {
        return dtvenc;
    }

    public void setDtvenc(Date dtvenc) {
        this.dtvenc = dtvenc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPrvapro() {
        return prvapro;
    }

    public void setPrvapro(Double prvapro) {
        this.prvapro = prvapro;
    }

    public Double getQtddevsub() {
        return qtddevsub;
    }

    public void setQtddevsub(Double qtddevsub) {
        this.qtddevsub = qtddevsub;
    }

    public Notaentitens getNotaentitens() {
        return notaentitens;
    }

    public void setNotaentitens(Notaentitens notaentitens) {
        this.notaentitens = notaentitens;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notaitenssubPK != null ? notaitenssubPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notaitenssub)) {
            return false;
        }
        Notaitenssub other = (Notaitenssub) object;
        if ((this.notaitenssubPK == null && other.notaitenssubPK != null) || (this.notaitenssubPK != null && !this.notaitenssubPK.equals(other.notaitenssubPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notaitenssub[ notaitenssubPK=" + notaitenssubPK + " ]";
    }
    
}
