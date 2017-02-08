/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class FpPedido {
    private static final long serialVersionUID = 1L;
    private Integer codSolicitacao;
    private String cpfPaciente;
    private String crmMedico;
    private String ufMedico;
    private Date dtEmiPresc;
    private String codRetorno;
    private String msgRetorno;
    private String nrPreAutorizacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlMs;
    private Double vlPaciente;
    private Double vlTotal;
    private String ambiente;
    private String rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private String nrEstorno;
    private String codEstorno;
    private String msgEstorno;
    private Double qtdEstornado;
    private Double qtdDevolvida;
    private String cupomvinculado;

    public FpPedido() {
    }

    public FpPedido(Integer codSolicitacao) {
        this.codSolicitacao = codSolicitacao;
    }

    public Integer getCodSolicitacao() {
        return codSolicitacao;
    }

    public void setCodSolicitacao(Integer codSolicitacao) {
        this.codSolicitacao = codSolicitacao;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getUfMedico() {
        return ufMedico;
    }

    public void setUfMedico(String ufMedico) {
        this.ufMedico = ufMedico;
    }

    public Date getDtEmiPresc() {
        return dtEmiPresc;
    }

    public void setDtEmiPresc(Date dtEmiPresc) {
        this.dtEmiPresc = dtEmiPresc;
    }

    public String getCodRetorno() {
        return codRetorno;
    }

    public void setCodRetorno(String codRetorno) {
        this.codRetorno = codRetorno;
    }

    public String getMsgRetorno() {
        return msgRetorno;
    }

    public void setMsgRetorno(String msgRetorno) {
        this.msgRetorno = msgRetorno;
    }

    public String getNrPreAutorizacao() {
        return nrPreAutorizacao;
    }

    public void setNrPreAutorizacao(String nrPreAutorizacao) {
        this.nrPreAutorizacao = nrPreAutorizacao;
    }

    public Double getVlMs() {
        return vlMs;
    }

    public void setVlMs(Double vlMs) {
        this.vlMs = vlMs;
    }

    public Double getVlPaciente() {
        return vlPaciente;
    }

    public void setVlPaciente(Double vlPaciente) {
        this.vlPaciente = vlPaciente;
    }

    public Double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(Double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(String rgcodusu) {
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

    public String getNrEstorno() {
        return nrEstorno;
    }

    public void setNrEstorno(String nrEstorno) {
        this.nrEstorno = nrEstorno;
    }

    public String getCodEstorno() {
        return codEstorno;
    }

    public void setCodEstorno(String codEstorno) {
        this.codEstorno = codEstorno;
    }

    public String getMsgEstorno() {
        return msgEstorno;
    }

    public void setMsgEstorno(String msgEstorno) {
        this.msgEstorno = msgEstorno;
    }

    public Double getQtdEstornado() {
        return qtdEstornado;
    }

    public void setQtdEstornado(Double qtdEstornado) {
        this.qtdEstornado = qtdEstornado;
    }

    public Double getQtdDevolvida() {
        return qtdDevolvida;
    }

    public void setQtdDevolvida(Double qtdDevolvida) {
        this.qtdDevolvida = qtdDevolvida;
    }

    public String getCupomvinculado() {
        return cupomvinculado;
    }

    public void setCupomvinculado(String cupomvinculado) {
        this.cupomvinculado = cupomvinculado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSolicitacao != null ? codSolicitacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FpPedido)) {
            return false;
        }
        FpPedido other = (FpPedido) object;
        if ((this.codSolicitacao == null && other.codSolicitacao != null) || (this.codSolicitacao != null && !this.codSolicitacao.equals(other.codSolicitacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.FpPedido[ codSolicitacao=" + codSolicitacao + " ]";
    }
    
}
