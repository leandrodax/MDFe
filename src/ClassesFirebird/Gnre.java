/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Gnre {
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private Integer codfil;
    private String cnpj;
    private String ie;
    private Date dtpagam;
    private String ufsub;
    private String uffav;
    private String banco;
    private String agencia;
    private String nrgnre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlpago;
    private Date dtvencim;
    private String mesano;
    private String nrconv;
    private Integer codusuent;
    private String nomusuent;
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;
    private Date datafin;
    private String nrlote;
    private String situacao;

    public Gnre() {
    }

    public Gnre(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Date getDtpagam() {
        return dtpagam;
    }

    public void setDtpagam(Date dtpagam) {
        this.dtpagam = dtpagam;
    }

    public String getUfsub() {
        return ufsub;
    }

    public void setUfsub(String ufsub) {
        this.ufsub = ufsub;
    }

    public String getUffav() {
        return uffav;
    }

    public void setUffav(String uffav) {
        this.uffav = uffav;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNrgnre() {
        return nrgnre;
    }

    public void setNrgnre(String nrgnre) {
        this.nrgnre = nrgnre;
    }

    public Double getVlpago() {
        return vlpago;
    }

    public void setVlpago(Double vlpago) {
        this.vlpago = vlpago;
    }

    public Date getDtvencim() {
        return dtvencim;
    }

    public void setDtvencim(Date dtvencim) {
        this.dtvencim = dtvencim;
    }

    public String getMesano() {
        return mesano;
    }

    public void setMesano(String mesano) {
        this.mesano = mesano;
    }

    public String getNrconv() {
        return nrconv;
    }

    public void setNrconv(String nrconv) {
        this.nrconv = nrconv;
    }

    public Integer getCodusuent() {
        return codusuent;
    }

    public void setCodusuent(Integer codusuent) {
        this.codusuent = codusuent;
    }

    public String getNomusuent() {
        return nomusuent;
    }

    public void setNomusuent(String nomusuent) {
        this.nomusuent = nomusuent;
    }

    public Date getDataent() {
        return dataent;
    }

    public void setDataent(Date dataent) {
        this.dataent = dataent;
    }

    public Integer getCodusufin() {
        return codusufin;
    }

    public void setCodusufin(Integer codusufin) {
        this.codusufin = codusufin;
    }

    public String getNomusufin() {
        return nomusufin;
    }

    public void setNomusufin(String nomusufin) {
        this.nomusufin = nomusufin;
    }

    public Date getDatafin() {
        return datafin;
    }

    public void setDatafin(Date datafin) {
        this.datafin = datafin;
    }

    public String getNrlote() {
        return nrlote;
    }

    public void setNrlote(String nrlote) {
        this.nrlote = nrlote;
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
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gnre)) {
            return false;
        }
        Gnre other = (Gnre) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Gnre[ nrcontr=" + nrcontr + " ]";
    }
    
}
