/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class MoviReceitamedItens {
    private static final long serialVersionUID = 1L;
    protected MoviReceitamedItensPK moviReceitamedItensPK;
    private String codpro;
    private String descpro;
    private String unemb;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdemb;
    private String unidade;
    private String usoprolongado;
    private String registromsmedicamento;
    private String numerolotemedicamento;
    private Integer quantidademedicamento;
    private String unidademedidamedicamento;
    private Date datavendamedicamento;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private String clasterapItem;
    private MoviReceitamed moviReceitamed;

    public MoviReceitamedItens() {
    }

    public MoviReceitamedItens(MoviReceitamedItensPK moviReceitamedItensPK) {
        this.moviReceitamedItensPK = moviReceitamedItensPK;
    }

    public MoviReceitamedItens(int coditem, int codreceita) {
        this.moviReceitamedItensPK = new MoviReceitamedItensPK(coditem, codreceita);
    }

    public MoviReceitamedItensPK getMoviReceitamedItensPK() {
        return moviReceitamedItensPK;
    }

    public void setMoviReceitamedItensPK(MoviReceitamedItensPK moviReceitamedItensPK) {
        this.moviReceitamedItensPK = moviReceitamedItensPK;
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

    public String getUnemb() {
        return unemb;
    }

    public void setUnemb(String unemb) {
        this.unemb = unemb;
    }

    public Double getQtdemb() {
        return qtdemb;
    }

    public void setQtdemb(Double qtdemb) {
        this.qtdemb = qtdemb;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getUsoprolongado() {
        return usoprolongado;
    }

    public void setUsoprolongado(String usoprolongado) {
        this.usoprolongado = usoprolongado;
    }

    public String getRegistromsmedicamento() {
        return registromsmedicamento;
    }

    public void setRegistromsmedicamento(String registromsmedicamento) {
        this.registromsmedicamento = registromsmedicamento;
    }

    public String getNumerolotemedicamento() {
        return numerolotemedicamento;
    }

    public void setNumerolotemedicamento(String numerolotemedicamento) {
        this.numerolotemedicamento = numerolotemedicamento;
    }

    public Integer getQuantidademedicamento() {
        return quantidademedicamento;
    }

    public void setQuantidademedicamento(Integer quantidademedicamento) {
        this.quantidademedicamento = quantidademedicamento;
    }

    public String getUnidademedidamedicamento() {
        return unidademedidamedicamento;
    }

    public void setUnidademedidamedicamento(String unidademedidamedicamento) {
        this.unidademedidamedicamento = unidademedidamedicamento;
    }

    public Date getDatavendamedicamento() {
        return datavendamedicamento;
    }

    public void setDatavendamedicamento(Date datavendamedicamento) {
        this.datavendamedicamento = datavendamedicamento;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
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

    public String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }

    public String getClasterapItem() {
        return clasterapItem;
    }

    public void setClasterapItem(String clasterapItem) {
        this.clasterapItem = clasterapItem;
    }

    public MoviReceitamed getMoviReceitamed() {
        return moviReceitamed;
    }

    public void setMoviReceitamed(MoviReceitamed moviReceitamed) {
        this.moviReceitamed = moviReceitamed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moviReceitamedItensPK != null ? moviReceitamedItensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MoviReceitamedItens)) {
            return false;
        }
        MoviReceitamedItens other = (MoviReceitamedItens) object;
        if ((this.moviReceitamedItensPK == null && other.moviReceitamedItensPK != null) || (this.moviReceitamedItensPK != null && !this.moviReceitamedItensPK.equals(other.moviReceitamedItensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MoviReceitamedItens[ moviReceitamedItensPK=" + moviReceitamedItensPK + " ]";
    }
    
}
