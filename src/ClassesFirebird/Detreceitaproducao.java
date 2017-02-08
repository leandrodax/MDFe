/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

/**
 *
 * @author vplayer
 */
public class Detreceitaproducao {
    private static final long serialVersionUID = 1L;
    protected DetreceitaproducaoPK detreceitaproducaoPK;
    private String codpro;
    private String descpro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double prvapro;
    private String indice;
    private Integer codven;
    private Character reservaestoque;
    private Double vldesacrite;
    private Character tpdesacrite;
    private Integer codprof;
    private Double qtde;
    private Integer codtiposervico;
    private Character iniciado;
    private Character fimproducao;
    private String referencia;
    private Date dtvenc;
    private Tabreceitaproducao tabreceitaproducao;

    public Detreceitaproducao() {
    }

    public Detreceitaproducao(DetreceitaproducaoPK detreceitaproducaoPK) {
        this.detreceitaproducaoPK = detreceitaproducaoPK;
    }

    public Detreceitaproducao(int codreceita, int nritem) {
        this.detreceitaproducaoPK = new DetreceitaproducaoPK(codreceita, nritem);
    }

    public DetreceitaproducaoPK getDetreceitaproducaoPK() {
        return detreceitaproducaoPK;
    }

    public void setDetreceitaproducaoPK(DetreceitaproducaoPK detreceitaproducaoPK) {
        this.detreceitaproducaoPK = detreceitaproducaoPK;
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

    public Double getPrvapro() {
        return prvapro;
    }

    public void setPrvapro(Double prvapro) {
        this.prvapro = prvapro;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public Character getReservaestoque() {
        return reservaestoque;
    }

    public void setReservaestoque(Character reservaestoque) {
        this.reservaestoque = reservaestoque;
    }

    public Double getVldesacrite() {
        return vldesacrite;
    }

    public void setVldesacrite(Double vldesacrite) {
        this.vldesacrite = vldesacrite;
    }

    public Character getTpdesacrite() {
        return tpdesacrite;
    }

    public void setTpdesacrite(Character tpdesacrite) {
        this.tpdesacrite = tpdesacrite;
    }

    public Integer getCodprof() {
        return codprof;
    }

    public void setCodprof(Integer codprof) {
        this.codprof = codprof;
    }

    public Double getQtde() {
        return qtde;
    }

    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }

    public Integer getCodtiposervico() {
        return codtiposervico;
    }

    public void setCodtiposervico(Integer codtiposervico) {
        this.codtiposervico = codtiposervico;
    }

    public Character getIniciado() {
        return iniciado;
    }

    public void setIniciado(Character iniciado) {
        this.iniciado = iniciado;
    }

    public Character getFimproducao() {
        return fimproducao;
    }

    public void setFimproducao(Character fimproducao) {
        this.fimproducao = fimproducao;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Date getDtvenc() {
        return dtvenc;
    }

    public void setDtvenc(Date dtvenc) {
        this.dtvenc = dtvenc;
    }

    public Tabreceitaproducao getTabreceitaproducao() {
        return tabreceitaproducao;
    }

    public void setTabreceitaproducao(Tabreceitaproducao tabreceitaproducao) {
        this.tabreceitaproducao = tabreceitaproducao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detreceitaproducaoPK != null ? detreceitaproducaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detreceitaproducao)) {
            return false;
        }
        Detreceitaproducao other = (Detreceitaproducao) object;
        if ((this.detreceitaproducaoPK == null && other.detreceitaproducaoPK != null) || (this.detreceitaproducaoPK != null && !this.detreceitaproducaoPK.equals(other.detreceitaproducaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detreceitaproducao[ detreceitaproducaoPK=" + detreceitaproducaoPK + " ]";
    }
    
}
