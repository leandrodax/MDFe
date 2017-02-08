/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class MoviReceitamed  {
    private static final long serialVersionUID = 1L;
    private Integer codreceita;
    private String tiporeceituariomedicamento;
    private String numeronotificacaomedicamento;
    private Date dataprescricaomedicamento;
    private String nomeprescritor;
    private String numeroregistroprofissional;
    private String conselhoprofissional;
    private String ufconselho;
    private String usomedicamento;
    private String nomecomprador;
    private String tipodocumento;
    private String numerodocumento;
    private String orgaoexpedidor;
    private String ufemissaodocumento;
    private String nomepaciente;
    private Integer idadepaciente;
    private String unidadeidadepaciente;
    private String sexopaciente;
    private String cidpaciente;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private Date datareceita;

    public MoviReceitamed() {
    }

    public MoviReceitamed(Integer codreceita) {
        this.codreceita = codreceita;
    }

    public Integer getCodreceita() {
        return codreceita;
    }

    public void setCodreceita(Integer codreceita) {
        this.codreceita = codreceita;
    }

    public String getTiporeceituariomedicamento() {
        return tiporeceituariomedicamento;
    }

    public void setTiporeceituariomedicamento(String tiporeceituariomedicamento) {
        this.tiporeceituariomedicamento = tiporeceituariomedicamento;
    }

    public String getNumeronotificacaomedicamento() {
        return numeronotificacaomedicamento;
    }

    public void setNumeronotificacaomedicamento(String numeronotificacaomedicamento) {
        this.numeronotificacaomedicamento = numeronotificacaomedicamento;
    }

    public Date getDataprescricaomedicamento() {
        return dataprescricaomedicamento;
    }

    public void setDataprescricaomedicamento(Date dataprescricaomedicamento) {
        this.dataprescricaomedicamento = dataprescricaomedicamento;
    }

    public String getNomeprescritor() {
        return nomeprescritor;
    }

    public void setNomeprescritor(String nomeprescritor) {
        this.nomeprescritor = nomeprescritor;
    }

    public String getNumeroregistroprofissional() {
        return numeroregistroprofissional;
    }

    public void setNumeroregistroprofissional(String numeroregistroprofissional) {
        this.numeroregistroprofissional = numeroregistroprofissional;
    }

    public String getConselhoprofissional() {
        return conselhoprofissional;
    }

    public void setConselhoprofissional(String conselhoprofissional) {
        this.conselhoprofissional = conselhoprofissional;
    }

    public String getUfconselho() {
        return ufconselho;
    }

    public void setUfconselho(String ufconselho) {
        this.ufconselho = ufconselho;
    }

    public String getUsomedicamento() {
        return usomedicamento;
    }

    public void setUsomedicamento(String usomedicamento) {
        this.usomedicamento = usomedicamento;
    }

    public String getNomecomprador() {
        return nomecomprador;
    }

    public void setNomecomprador(String nomecomprador) {
        this.nomecomprador = nomecomprador;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public void setNumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    public String getOrgaoexpedidor() {
        return orgaoexpedidor;
    }

    public void setOrgaoexpedidor(String orgaoexpedidor) {
        this.orgaoexpedidor = orgaoexpedidor;
    }

    public String getUfemissaodocumento() {
        return ufemissaodocumento;
    }

    public void setUfemissaodocumento(String ufemissaodocumento) {
        this.ufemissaodocumento = ufemissaodocumento;
    }

    public String getNomepaciente() {
        return nomepaciente;
    }

    public void setNomepaciente(String nomepaciente) {
        this.nomepaciente = nomepaciente;
    }

    public Integer getIdadepaciente() {
        return idadepaciente;
    }

    public void setIdadepaciente(Integer idadepaciente) {
        this.idadepaciente = idadepaciente;
    }

    public String getUnidadeidadepaciente() {
        return unidadeidadepaciente;
    }

    public void setUnidadeidadepaciente(String unidadeidadepaciente) {
        this.unidadeidadepaciente = unidadeidadepaciente;
    }

    public String getSexopaciente() {
        return sexopaciente;
    }

    public void setSexopaciente(String sexopaciente) {
        this.sexopaciente = sexopaciente;
    }

    public String getCidpaciente() {
        return cidpaciente;
    }

    public void setCidpaciente(String cidpaciente) {
        this.cidpaciente = cidpaciente;
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

    public Date getDatareceita() {
        return datareceita;
    }

    public void setDatareceita(Date datareceita) {
        this.datareceita = datareceita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codreceita != null ? codreceita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MoviReceitamed)) {
            return false;
        }
        MoviReceitamed other = (MoviReceitamed) object;
        if ((this.codreceita == null && other.codreceita != null) || (this.codreceita != null && !this.codreceita.equals(other.codreceita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MoviReceitamed[ codreceita=" + codreceita + " ]";
    }
    
}
