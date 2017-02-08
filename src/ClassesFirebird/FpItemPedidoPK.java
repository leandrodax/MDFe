/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class FpItemPedidoPK {
    private int codItemSolic;
    private int codSolicitacao;

    public FpItemPedidoPK() {
    }

    public FpItemPedidoPK(int codItemSolic, int codSolicitacao) {
        this.codItemSolic = codItemSolic;
        this.codSolicitacao = codSolicitacao;
    }

    public int getCodItemSolic() {
        return codItemSolic;
    }

    public void setCodItemSolic(int codItemSolic) {
        this.codItemSolic = codItemSolic;
    }

    public int getCodSolicitacao() {
        return codSolicitacao;
    }

    public void setCodSolicitacao(int codSolicitacao) {
        this.codSolicitacao = codSolicitacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codItemSolic;
        hash += (int) codSolicitacao;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FpItemPedidoPK)) {
            return false;
        }
        FpItemPedidoPK other = (FpItemPedidoPK) object;
        if (this.codItemSolic != other.codItemSolic) {
            return false;
        }
        if (this.codSolicitacao != other.codSolicitacao) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.FpItemPedidoPK[ codItemSolic=" + codItemSolic + ", codSolicitacao=" + codSolicitacao + " ]";
    }
    
}
