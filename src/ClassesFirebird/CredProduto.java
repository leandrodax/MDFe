/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class CredProduto implements Serializable {
    private static final long serialVersionUID = 1L;
    private String codigoProduto;
    private String nomeProduto;
    private String codigoOperadora;
    private String nomeOperadora;
    private String modeloRecarga;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double precoCompraProduto;
    private Double precoVendaProduto;
    private String precoVariavelProduto;
    private Double valorMinimoProduto;
    private Double valorMaximoProduto;
    private Double valorIncrementoProduto;
    private Date ultimaAtualizacaoProduto;

    public CredProduto() {
    }

    public CredProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCodigoOperadora() {
        return codigoOperadora;
    }

    public void setCodigoOperadora(String codigoOperadora) {
        this.codigoOperadora = codigoOperadora;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public String getModeloRecarga() {
        return modeloRecarga;
    }

    public void setModeloRecarga(String modeloRecarga) {
        this.modeloRecarga = modeloRecarga;
    }

    public Double getPrecoCompraProduto() {
        return precoCompraProduto;
    }

    public void setPrecoCompraProduto(Double precoCompraProduto) {
        this.precoCompraProduto = precoCompraProduto;
    }

    public Double getPrecoVendaProduto() {
        return precoVendaProduto;
    }

    public void setPrecoVendaProduto(Double precoVendaProduto) {
        this.precoVendaProduto = precoVendaProduto;
    }

    public String getPrecoVariavelProduto() {
        return precoVariavelProduto;
    }

    public void setPrecoVariavelProduto(String precoVariavelProduto) {
        this.precoVariavelProduto = precoVariavelProduto;
    }

    public Double getValorMinimoProduto() {
        return valorMinimoProduto;
    }

    public void setValorMinimoProduto(Double valorMinimoProduto) {
        this.valorMinimoProduto = valorMinimoProduto;
    }

    public Double getValorMaximoProduto() {
        return valorMaximoProduto;
    }

    public void setValorMaximoProduto(Double valorMaximoProduto) {
        this.valorMaximoProduto = valorMaximoProduto;
    }

    public Double getValorIncrementoProduto() {
        return valorIncrementoProduto;
    }

    public void setValorIncrementoProduto(Double valorIncrementoProduto) {
        this.valorIncrementoProduto = valorIncrementoProduto;
    }

    public Date getUltimaAtualizacaoProduto() {
        return ultimaAtualizacaoProduto;
    }

    public void setUltimaAtualizacaoProduto(Date ultimaAtualizacaoProduto) {
        this.ultimaAtualizacaoProduto = ultimaAtualizacaoProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoProduto != null ? codigoProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredProduto)) {
            return false;
        }
        CredProduto other = (CredProduto) object;
        if ((this.codigoProduto == null && other.codigoProduto != null) || (this.codigoProduto != null && !this.codigoProduto.equals(other.codigoProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredProduto[ codigoProduto=" + codigoProduto + " ]";
    }
    
}
