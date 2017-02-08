/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author vplayer
 */
public class Chequer implements Serializable {
    private static final long serialVersionUID = 1L;
    protected ChequerPK chequerPK;
    private String nome;
    private String fone;
    private String cpfcnpj;
    private String praca;
    private Character stch;
    private Date dtch;
    private Date dtent;
    private Date dtmov;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlch;
    private Integer codfil;
    private String nrnota;
    private String codtit;
    private String codcli;
    private String nomcli;
    private Integer codven;
    private String nomven;
    private Integer codusu;
    private String nomusu;
    private String obs;

    public Chequer() {
    }

    public Chequer(ChequerPK chequerPK) {
        this.chequerPK = chequerPK;
    }

    public Chequer(String banco, String agen, String conta, String numch) {
        this.chequerPK = new ChequerPK(banco, agen, conta, numch);
    }

    public ChequerPK getChequerPK() {
        return chequerPK;
    }

    public void setChequerPK(ChequerPK chequerPK) {
        this.chequerPK = chequerPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getPraca() {
        return praca;
    }

    public void setPraca(String praca) {
        this.praca = praca;
    }

    public Character getStch() {
        return stch;
    }

    public void setStch(Character stch) {
        this.stch = stch;
    }

    public Date getDtch() {
        return dtch;
    }

    public void setDtch(Date dtch) {
        this.dtch = dtch;
    }

    public Date getDtent() {
        return dtent;
    }

    public void setDtent(Date dtent) {
        this.dtent = dtent;
    }

    public Date getDtmov() {
        return dtmov;
    }

    public void setDtmov(Date dtmov) {
        this.dtmov = dtmov;
    }

    public Double getVlch() {
        return vlch;
    }

    public void setVlch(Double vlch) {
        this.vlch = vlch;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public String getCodtit() {
        return codtit;
    }

    public void setCodtit(String codtit) {
        this.codtit = codtit;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public String getNomven() {
        return nomven;
    }

    public void setNomven(String nomven) {
        this.nomven = nomven;
    }

    public Integer getCodusu() {
        return codusu;
    }

    public void setCodusu(Integer codusu) {
        this.codusu = codusu;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chequerPK != null ? chequerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chequer)) {
            return false;
        }
        Chequer other = (Chequer) object;
        if ((this.chequerPK == null && other.chequerPK != null) || (this.chequerPK != null && !this.chequerPK.equals(other.chequerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Chequer[ chequerPK=" + chequerPK + " ]";
    }
    
}
