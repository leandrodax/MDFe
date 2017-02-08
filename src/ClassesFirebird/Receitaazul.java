/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Receitaazul {
    
    private static final long serialVersionUID = 1L;
    private Integer nrcont;
    private Character tpreceita;
    private Integer nrreceita;
    private String idenemit;
    private String cnpjemit;
    private String nommed;
    private String crm;
    private String nompacie;
    private String nomcompr;
    private String endcompr;
    private String identcomp;
    private String orgaoemi;
    private String telefone;
    private String espfarma;
    private Date dtcompra;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdmed;
    private String formamed;

    public Receitaazul() {
    }

    public Receitaazul(Integer nrcont) {
        this.nrcont = nrcont;
    }

    public Integer getNrcont() {
        return nrcont;
    }

    public void setNrcont(Integer nrcont) {
        this.nrcont = nrcont;
    }

    public Character getTpreceita() {
        return tpreceita;
    }

    public void setTpreceita(Character tpreceita) {
        this.tpreceita = tpreceita;
    }

    public Integer getNrreceita() {
        return nrreceita;
    }

    public void setNrreceita(Integer nrreceita) {
        this.nrreceita = nrreceita;
    }

    public String getIdenemit() {
        return idenemit;
    }

    public void setIdenemit(String idenemit) {
        this.idenemit = idenemit;
    }

    public String getCnpjemit() {
        return cnpjemit;
    }

    public void setCnpjemit(String cnpjemit) {
        this.cnpjemit = cnpjemit;
    }

    public String getNommed() {
        return nommed;
    }

    public void setNommed(String nommed) {
        this.nommed = nommed;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNompacie() {
        return nompacie;
    }

    public void setNompacie(String nompacie) {
        this.nompacie = nompacie;
    }

    public String getNomcompr() {
        return nomcompr;
    }

    public void setNomcompr(String nomcompr) {
        this.nomcompr = nomcompr;
    }

    public String getEndcompr() {
        return endcompr;
    }

    public void setEndcompr(String endcompr) {
        this.endcompr = endcompr;
    }

    public String getIdentcomp() {
        return identcomp;
    }

    public void setIdentcomp(String identcomp) {
        this.identcomp = identcomp;
    }

    public String getOrgaoemi() {
        return orgaoemi;
    }

    public void setOrgaoemi(String orgaoemi) {
        this.orgaoemi = orgaoemi;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspfarma() {
        return espfarma;
    }

    public void setEspfarma(String espfarma) {
        this.espfarma = espfarma;
    }

    public Date getDtcompra() {
        return dtcompra;
    }

    public void setDtcompra(Date dtcompra) {
        this.dtcompra = dtcompra;
    }

    public Double getQtdmed() {
        return qtdmed;
    }

    public void setQtdmed(Double qtdmed) {
        this.qtdmed = qtdmed;
    }

    public String getFormamed() {
        return formamed;
    }

    public void setFormamed(String formamed) {
        this.formamed = formamed;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrcont != null ? nrcont.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receitaazul)) {
            return false;
        }
        Receitaazul other = (Receitaazul) object;
        if ((this.nrcont == null && other.nrcont != null) || (this.nrcont != null && !this.nrcont.equals(other.nrcont))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Receitaazul[ nrcont=" + nrcont + " ]";
    }
    
}
