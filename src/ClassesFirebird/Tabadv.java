/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


/**
 *
 * @author vplayer
 */

public class Tabadv {
    
    private static final long serialVersionUID = 1L;
    private Short codadv;
    private String razadv;
    private String fanadv;
    private String endereco;
    private String perimetro;
    private String bairro;
    private String cidade;
    private String estado;
    private String cepadv;
    private String cnpjcpf;
    private String ierg;
    private String docdiv;
    private String email;
    private String pagina;
    private String contadv;
    private String telcob01;
    private String telcob02;
    private String faxcobr;
    private String celcobr;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;

    public Tabadv() {
    }

    public Tabadv(Short codadv) {
        this.codadv = codadv;
    }

    public Short getCodadv() {
        return codadv;
    }

    public void setCodadv(Short codadv) {
        this.codadv = codadv;
    }

    public String getRazadv() {
        return razadv;
    }

    public void setRazadv(String razadv) {
        this.razadv = razadv;
    }

    public String getFanadv() {
        return fanadv;
    }

    public void setFanadv(String fanadv) {
        this.fanadv = fanadv;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(String perimetro) {
        this.perimetro = perimetro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCepadv() {
        return cepadv;
    }

    public void setCepadv(String cepadv) {
        this.cepadv = cepadv;
    }

    public String getCnpjcpf() {
        return cnpjcpf;
    }

    public void setCnpjcpf(String cnpjcpf) {
        this.cnpjcpf = cnpjcpf;
    }

    public String getIerg() {
        return ierg;
    }

    public void setIerg(String ierg) {
        this.ierg = ierg;
    }

    public String getDocdiv() {
        return docdiv;
    }

    public void setDocdiv(String docdiv) {
        this.docdiv = docdiv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getContadv() {
        return contadv;
    }

    public void setContadv(String contadv) {
        this.contadv = contadv;
    }

    public String getTelcob01() {
        return telcob01;
    }

    public void setTelcob01(String telcob01) {
        this.telcob01 = telcob01;
    }

    public String getTelcob02() {
        return telcob02;
    }

    public void setTelcob02(String telcob02) {
        this.telcob02 = telcob02;
    }

    public String getFaxcobr() {
        return faxcobr;
    }

    public void setFaxcobr(String faxcobr) {
        this.faxcobr = faxcobr;
    }

    public String getCelcobr() {
        return celcobr;
    }

    public void setCelcobr(String celcobr) {
        this.celcobr = celcobr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codadv != null ? codadv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabadv)) {
            return false;
        }
        Tabadv other = (Tabadv) object;
        if ((this.codadv == null && other.codadv != null) || (this.codadv != null && !this.codadv.equals(other.codadv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabadv[ codadv=" + codadv + " ]";
    }
    
}
