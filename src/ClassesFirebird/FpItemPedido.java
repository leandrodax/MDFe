/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class FpItemPedido {
    private static final long serialVersionUID = 1L;
    protected FpItemPedidoPK fpItemPedidoPK;
    private String codEan;
    private String nomeItem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdSolicitada;
    private Double qtdPrescrita;
    private Double qtdUn;
    private Double vlVenda;
    private Double vlTotal;
    private String unidemb;
    private String codRetorno;
    private String msgRetorno;
    private String nrEstorno;
    private String codEstorno;
    private String msgEstorno;
    private Double qtdEstornado;
    private Double qtdDevolvida;
    private Double qtdAutorizada;
    private FpPedido fpPedido;

    public FpItemPedido() {
    }

    public FpItemPedido(FpItemPedidoPK fpItemPedidoPK) {
        this.fpItemPedidoPK = fpItemPedidoPK;
    }

    public FpItemPedido(int codItemSolic, int codSolicitacao) {
        this.fpItemPedidoPK = new FpItemPedidoPK(codItemSolic, codSolicitacao);
    }

    public FpItemPedidoPK getFpItemPedidoPK() {
        return fpItemPedidoPK;
    }

    public void setFpItemPedidoPK(FpItemPedidoPK fpItemPedidoPK) {
        this.fpItemPedidoPK = fpItemPedidoPK;
    }

    public String getCodEan() {
        return codEan;
    }

    public void setCodEan(String codEan) {
        this.codEan = codEan;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Double getQtdSolicitada() {
        return qtdSolicitada;
    }

    public void setQtdSolicitada(Double qtdSolicitada) {
        this.qtdSolicitada = qtdSolicitada;
    }

    public Double getQtdPrescrita() {
        return qtdPrescrita;
    }

    public void setQtdPrescrita(Double qtdPrescrita) {
        this.qtdPrescrita = qtdPrescrita;
    }

    public Double getQtdUn() {
        return qtdUn;
    }

    public void setQtdUn(Double qtdUn) {
        this.qtdUn = qtdUn;
    }

    public Double getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(Double vlVenda) {
        this.vlVenda = vlVenda;
    }

    public Double getVlTotal() {
        return vlTotal;
    }

    public void setVlTotal(Double vlTotal) {
        this.vlTotal = vlTotal;
    }

    public String getUnidemb() {
        return unidemb;
    }

    public void setUnidemb(String unidemb) {
        this.unidemb = unidemb;
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

    public Double getQtdAutorizada() {
        return qtdAutorizada;
    }

    public void setQtdAutorizada(Double qtdAutorizada) {
        this.qtdAutorizada = qtdAutorizada;
    }

    public FpPedido getFpPedido() {
        return fpPedido;
    }

    public void setFpPedido(FpPedido fpPedido) {
        this.fpPedido = fpPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fpItemPedidoPK != null ? fpItemPedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FpItemPedido)) {
            return false;
        }
        FpItemPedido other = (FpItemPedido) object;
        if ((this.fpItemPedidoPK == null && other.fpItemPedidoPK != null) || (this.fpItemPedidoPK != null && !this.fpItemPedidoPK.equals(other.fpItemPedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.FpItemPedido[ fpItemPedidoPK=" + fpItemPedidoPK + " ]";
    }
    
}
