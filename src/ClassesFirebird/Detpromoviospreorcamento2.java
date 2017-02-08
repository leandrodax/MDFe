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
public class Detpromoviospreorcamento2 {
    private static final long serialVersionUID = 1L;
    protected Detpromoviospreorcamento2PK detpromoviospreorcamento2PK;
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
    private Moviospreorcamento2 moviospreorcamento2;

    public Detpromoviospreorcamento2() {
    }

    public Detpromoviospreorcamento2(Detpromoviospreorcamento2PK detpromoviospreorcamento2PK) {
        this.detpromoviospreorcamento2PK = detpromoviospreorcamento2PK;
    }

    public Detpromoviospreorcamento2(int codospreorcamento, int nritem) {
        this.detpromoviospreorcamento2PK = new Detpromoviospreorcamento2PK(codospreorcamento, nritem);
    }

    public Detpromoviospreorcamento2PK getDetpromoviospreorcamento2PK() {
        return detpromoviospreorcamento2PK;
    }

    public void setDetpromoviospreorcamento2PK(Detpromoviospreorcamento2PK detpromoviospreorcamento2PK) {
        this.detpromoviospreorcamento2PK = detpromoviospreorcamento2PK;
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

    public Moviospreorcamento2 getMoviospreorcamento2() {
        return moviospreorcamento2;
    }

    public void setMoviospreorcamento2(Moviospreorcamento2 moviospreorcamento2) {
        this.moviospreorcamento2 = moviospreorcamento2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detpromoviospreorcamento2PK != null ? detpromoviospreorcamento2PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detpromoviospreorcamento2)) {
            return false;
        }
        Detpromoviospreorcamento2 other = (Detpromoviospreorcamento2) object;
        if ((this.detpromoviospreorcamento2PK == null && other.detpromoviospreorcamento2PK != null) || (this.detpromoviospreorcamento2PK != null && !this.detpromoviospreorcamento2PK.equals(other.detpromoviospreorcamento2PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detpromoviospreorcamento2[ detpromoviospreorcamento2PK=" + detpromoviospreorcamento2PK + " ]";
    }
    
}
