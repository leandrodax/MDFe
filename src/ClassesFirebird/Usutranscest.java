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
public class Usutranscest implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsutranscestPK usutranscestPK;
    private String nomusu;
    private String codpro;
    private String codgru;
    private Integer codfab;
    private Integer quantreg;
    private Character imptranrede;
    private String caminho;
    private Integer nrtransf;
    
    private Date dtrecarq;
    private Character imptranemail;
    private Character imptranline;

    public Usutranscest() {
    }

    public Usutranscest(UsutranscestPK usutranscestPK) {
        this.usutranscestPK = usutranscestPK;
    }

    public Usutranscest(int codfil, Date dttransf, int codusu) {
        this.usutranscestPK = new UsutranscestPK(codfil, dttransf, codusu);
    }

    public UsutranscestPK getUsutranscestPK() {
        return usutranscestPK;
    }

    public void setUsutranscestPK(UsutranscestPK usutranscestPK) {
        this.usutranscestPK = usutranscestPK;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getCodgru() {
        return codgru;
    }

    public void setCodgru(String codgru) {
        this.codgru = codgru;
    }

    public Integer getCodfab() {
        return codfab;
    }

    public void setCodfab(Integer codfab) {
        this.codfab = codfab;
    }

    public Integer getQuantreg() {
        return quantreg;
    }

    public void setQuantreg(Integer quantreg) {
        this.quantreg = quantreg;
    }

    public Character getImptranrede() {
        return imptranrede;
    }

    public void setImptranrede(Character imptranrede) {
        this.imptranrede = imptranrede;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Integer getNrtransf() {
        return nrtransf;
    }

    public void setNrtransf(Integer nrtransf) {
        this.nrtransf = nrtransf;
    }

    public Date getDtrecarq() {
        return dtrecarq;
    }

    public void setDtrecarq(Date dtrecarq) {
        this.dtrecarq = dtrecarq;
    }

    public Character getImptranemail() {
        return imptranemail;
    }

    public void setImptranemail(Character imptranemail) {
        this.imptranemail = imptranemail;
    }

    public Character getImptranline() {
        return imptranline;
    }

    public void setImptranline(Character imptranline) {
        this.imptranline = imptranline;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usutranscestPK != null ? usutranscestPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usutranscest)) {
            return false;
        }
        Usutranscest other = (Usutranscest) object;
        if ((this.usutranscestPK == null && other.usutranscestPK != null) || (this.usutranscestPK != null && !this.usutranscestPK.equals(other.usutranscestPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Usutranscest[ usutranscestPK=" + usutranscestPK + " ]";
    }
    
}
