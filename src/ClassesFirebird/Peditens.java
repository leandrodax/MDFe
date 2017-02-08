/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Peditens {
    
    private static final long serialVersionUID = 1L;
    protected PeditensPK peditensPK;
    private String codpro;
    private String coddig;
    private String descpro;
    private String unped;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdped;
    private Double prneg;
    private Double vltotal;
    private Double qtdpedant;
    private Double prnegant;
    private Double percdescneg;
    private Double vldescneg;
    private Pedidos pedidos;

    public Peditens() {
    }

    public Peditens(PeditensPK peditensPK) {
        this.peditensPK = peditensPK;
    }

    public Peditens(String nrpedido, int nritem) {
        this.peditensPK = new PeditensPK(nrpedido, nritem);
    }

    public PeditensPK getPeditensPK() {
        return peditensPK;
    }

    public void setPeditensPK(PeditensPK peditensPK) {
        this.peditensPK = peditensPK;
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

    public Double getPrneg() {
        return prneg;
    }

    public void setPrneg(Double prneg) {
        this.prneg = prneg;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
    }

    public Double getQtdpedant() {
        return qtdpedant;
    }

    public void setQtdpedant(Double qtdpedant) {
        this.qtdpedant = qtdpedant;
    }

    public Double getPrnegant() {
        return prnegant;
    }

    public void setPrnegant(Double prnegant) {
        this.prnegant = prnegant;
    }

    public Double getPercdescneg() {
        return percdescneg;
    }

    public void setPercdescneg(Double percdescneg) {
        this.percdescneg = percdescneg;
    }

    public Double getVldescneg() {
        return vldescneg;
    }

    public void setVldescneg(Double vldescneg) {
        this.vldescneg = vldescneg;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (peditensPK != null ? peditensPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Peditens)) {
            return false;
        }
        Peditens other = (Peditens) object;
        if ((this.peditensPK == null && other.peditensPK != null) || (this.peditensPK != null && !this.peditensPK.equals(other.peditensPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Peditens[ peditensPK=" + peditensPK + " ]";
    }
    
}
