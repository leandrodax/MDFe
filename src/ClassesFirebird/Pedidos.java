/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Pedidos {
    
    private static final long serialVersionUID = 1L;
    private String nrpedido;
    private int codfil;
    private Integer codfor;
    private String nomfor;
    private Date dtemissao;
    private Date dtlancam;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double totped;
    private String planopag;
    private String obs1ne;
    private String tpfrete;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String situacao;
    private String nomfan;
    private Integer codusufin;
    private String usuarifin;
    private Date rgdatafin;

    public Pedidos() {
    }

    public Pedidos(String nrpedido) {
        this.nrpedido = nrpedido;
    }

    public Pedidos(String nrpedido, int codfil) {
        this.nrpedido = nrpedido;
        this.codfil = codfil;
    }

    public String getNrpedido() {
        return nrpedido;
    }

    public void setNrpedido(String nrpedido) {
        this.nrpedido = nrpedido;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    public Integer getCodfor() {
        return codfor;
    }

    public void setCodfor(Integer codfor) {
        this.codfor = codfor;
    }

    public String getNomfor() {
        return nomfor;
    }

    public void setNomfor(String nomfor) {
        this.nomfor = nomfor;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Date getDtlancam() {
        return dtlancam;
    }

    public void setDtlancam(Date dtlancam) {
        this.dtlancam = dtlancam;
    }

    public Double getTotped() {
        return totped;
    }

    public void setTotped(Double totped) {
        this.totped = totped;
    }

    public String getPlanopag() {
        return planopag;
    }

    public void setPlanopag(String planopag) {
        this.planopag = planopag;
    }

    public String getObs1ne() {
        return obs1ne;
    }

    public void setObs1ne(String obs1ne) {
        this.obs1ne = obs1ne;
    }

    public String getTpfrete() {
        return tpfrete;
    }

    public void setTpfrete(String tpfrete) {
        this.tpfrete = tpfrete;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNomfan() {
        return nomfan;
    }

    public void setNomfan(String nomfan) {
        this.nomfan = nomfan;
    }

    public Integer getCodusufin() {
        return codusufin;
    }

    public void setCodusufin(Integer codusufin) {
        this.codusufin = codusufin;
    }

    public String getUsuarifin() {
        return usuarifin;
    }

    public void setUsuarifin(String usuarifin) {
        this.usuarifin = usuarifin;
    }

    public Date getRgdatafin() {
        return rgdatafin;
    }

    public void setRgdatafin(Date rgdatafin) {
        this.rgdatafin = rgdatafin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrpedido != null ? nrpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.nrpedido == null && other.nrpedido != null) || (this.nrpedido != null && !this.nrpedido.equals(other.nrpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Pedidos[ nrpedido=" + nrpedido + " ]";
    }
    
}
