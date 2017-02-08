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
public class Chequep implements Serializable {
    private static final long serialVersionUID = 1L;
    protected ChequepPK chequepPK;
    private String nome;
    private String fone;
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
    private Integer codfor;
    private String nomfor;
    private Integer codusu;
    private String nomusu;
    private String obs;
    private String cpfcnpj;

    public Chequep() {
    }

    public Chequep(ChequepPK chequepPK) {
        this.chequepPK = chequepPK;
    }

    public Chequep(String banco, String agen, String conta, String numch) {
        this.chequepPK = new ChequepPK(banco, agen, conta, numch);
    }

    public ChequepPK getChequepPK() {
        return chequepPK;
    }

    public void setChequepPK(ChequepPK chequepPK) {
        this.chequepPK = chequepPK;
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

    public Integer getCodfor() {
        return codfor;
    }

    public void setCodfor(Integer codfor) {
        this.codfor = codfor;
    }

    public String getNomfor() {
        return nomfor;
    }

    public void setNomfor(String nomfor) {
        this.nomfor = nomfor;
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

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chequepPK != null ? chequepPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chequep)) {
            return false;
        }
        Chequep other = (Chequep) object;
        if ((this.chequepPK == null && other.chequepPK != null) || (this.chequepPK != null && !this.chequepPK.equals(other.chequepPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Chequep[ chequepPK=" + chequepPK + " ]";
    }
    
}
