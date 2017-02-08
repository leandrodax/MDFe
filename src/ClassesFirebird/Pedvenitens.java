/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Pedvenitens {
    
    private static final long serialVersionUID = 1L;
    protected PedvenitensPK pedvenitensPK;
    private String codpro;
    private String coddig;
    private String descpro;
    private String unped;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdped;
    private Double custo;
    private Double preco;
    private Double peso;
    private Double vlpeso;
    private Double vlcusto;
    private Double vltotal;
    private Pedvenda pedvenda;

    public Pedvenitens() {
    }

    public Pedvenitens(PedvenitensPK pedvenitensPK) {
        this.pedvenitensPK = pedvenitensPK;
    }

    public Pedvenitens(String nrpedido, int nritem) {
        this.pedvenitensPK = new PedvenitensPK(nrpedido, nritem);
    }

    public PedvenitensPK getPedvenitensPK() {
        return pedvenitensPK;
    }

    public void setPedvenitensPK(PedvenitensPK pedvenitensPK) {
        this.pedvenitensPK = pedvenitensPK;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCoddig() {
        return coddig;
    }

    public void setCoddig(String coddig) {
        this.coddig = coddig;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public String getUnped() {
        return unped;
    }

    public void setUnped(String unped) {
        this.unped = unped;
    }

    public Double getQtdped() {
        return qtdped;
    }

    public void setQtdped(Double qtdped) {
        this.qtdped = qtdped;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getVlpeso() {
        return vlpeso;
    }

    public void setVlpeso(Double vlpeso) {
        this.vlpeso = vlpeso;
    }

    public Double getVlcusto() {
        return vlcusto;
    }

    public void setVlcusto(Double vlcusto) {
        this.vlcusto = vlcusto;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
    }

    public Pedvenda getPedvenda() {
        return pedvenda;
    }

    public void setPedvenda(Pedvenda pedvenda) {
        this.pedvenda = pedvenda;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedvenitensPK != null ? pedvenitensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedvenitens)) {
            return false;
        }
        Pedvenitens other = (Pedvenitens) object;
        if ((this.pedvenitensPK == null && other.pedvenitensPK != null) || (this.pedvenitensPK != null && !this.pedvenitensPK.equals(other.pedvenitensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Pedvenitens[ pedvenitensPK=" + pedvenitensPK + " ]";
    }
    
}
