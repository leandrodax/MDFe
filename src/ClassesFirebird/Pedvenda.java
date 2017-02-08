/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Pedvenda {
    
    private static final long serialVersionUID = 1L;
    private String nrpedido;
    private int codfil;
    private Integer codfor;
    private String nomfor;
    private String codcli;
    private String nomcli;
    private String tpfrete;
    private String planopag;
    private String obs1ne;
    private Date dtemissao;
    private Date dtlancam;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double totped;
    private Integer codven;
    private Double percom;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String situacao;

    public Pedvenda() {
    }

    public Pedvenda(String nrpedido) {
        this.nrpedido = nrpedido;
    }

    public Pedvenda(String nrpedido, int codfil) {
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

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getTpfrete() {
        return tpfrete;
    }

    public void setTpfrete(String tpfrete) {
        this.tpfrete = tpfrete;
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

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public Double getPercom() {
        return percom;
    }

    public void setPercom(Double percom) {
        this.percom = percom;
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


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrpedido != null ? nrpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedvenda)) {
            return false;
        }
        Pedvenda other = (Pedvenda) object;
        if ((this.nrpedido == null && other.nrpedido != null) || (this.nrpedido != null && !this.nrpedido.equals(other.nrpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Pedvenda[ nrpedido=" + nrpedido + " ]";
    }
    
}
