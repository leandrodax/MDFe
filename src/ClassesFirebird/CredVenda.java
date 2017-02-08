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
public class CredVenda implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codCompra;
    private String codOnline;
    private String codTerminal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double face;
    private Date dataVencimento;
    private Date dataRv;
    private String mensagem;
    private String nsu;
    private String codOperadora;
    private String nomeOperadora;
    private String modeloRecarga;
    private String codProduto;
    private String nomeProduto;
    private Date datahoraVenda;
    private String ddd;
    private String telefone;
    private String pin;
    private String lote;
    private String serie;
    private Double valor;

    public CredVenda() {
    }

    public CredVenda(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public Integer getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }

    public String getCodOnline() {
        return codOnline;
    }

    public void setCodOnline(String codOnline) {
        this.codOnline = codOnline;
    }

    public String getCodTerminal() {
        return codTerminal;
    }

    public void setCodTerminal(String codTerminal) {
        this.codTerminal = codTerminal;
    }

    public Double getFace() {
        return face;
    }

    public void setFace(Double face) {
        this.face = face;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataRv() {
        return dataRv;
    }

    public void setDataRv(Date dataRv) {
        this.dataRv = dataRv;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNsu() {
        return nsu;
    }

    public void setNsu(String nsu) {
        this.nsu = nsu;
    }

    public String getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(String codOperadora) {
        this.codOperadora = codOperadora;
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

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Date getDatahoraVenda() {
        return datahoraVenda;
    }

    public void setDatahoraVenda(Date datahoraVenda) {
        this.datahoraVenda = datahoraVenda;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCompra != null ? codCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CredVenda)) {
            return false;
        }
        CredVenda other = (CredVenda) object;
        if ((this.codCompra == null && other.codCompra != null) || (this.codCompra != null && !this.codCompra.equals(other.codCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.CredVenda[ codCompra=" + codCompra + " ]";
    }
    
}
