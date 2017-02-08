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

public class Usutransnent implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsutransnentPK usutransnentPK;
    private String nomusu;
    
    private Date dtini;
    
    private Date dtfim;
    private String hrini;
    private String hrfim;
    private Integer qtdnota;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double totnota;
    private Character imptranrede;
    private String caminho;
    private Integer nrtransf;
    
    private Date dtrecarq;
    private Character imptranemail;
    private Character imptranline;

    public Usutransnent() {
    }

    public Usutransnent(UsutransnentPK usutransnentPK) {
        this.usutransnentPK = usutransnentPK;
    }

    public Usutransnent(int codfil, Date dttransf, int codusu) {
        this.usutransnentPK = new UsutransnentPK(codfil, dttransf, codusu);
    }

    public UsutransnentPK getUsutransnentPK() {
        return usutransnentPK;
    }

    public void setUsutransnentPK(UsutransnentPK usutransnentPK) {
        this.usutransnentPK = usutransnentPK;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public Date getDtini() {
        return dtini;
    }

    public void setDtini(Date dtini) {
        this.dtini = dtini;
    }

    public Date getDtfim() {
        return dtfim;
    }

    public void setDtfim(Date dtfim) {
        this.dtfim = dtfim;
    }

    public String getHrini() {
        return hrini;
    }

    public void setHrini(String hrini) {
        this.hrini = hrini;
    }

    public String getHrfim() {
        return hrfim;
    }

    public void setHrfim(String hrfim) {
        this.hrfim = hrfim;
    }

    public Integer getQtdnota() {
        return qtdnota;
    }

    public void setQtdnota(Integer qtdnota) {
        this.qtdnota = qtdnota;
    }

    public Double getTotnota() {
        return totnota;
    }

    public void setTotnota(Double totnota) {
        this.totnota = totnota;
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
        hash += (usutransnentPK != null ? usutransnentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usutransnent)) {
            return false;
        }
        Usutransnent other = (Usutransnent) object;
        if ((this.usutransnentPK == null && other.usutransnentPK != null) || (this.usutransnentPK != null && !this.usutransnentPK.equals(other.usutransnentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Usutransnent[ usutransnentPK=" + usutransnentPK + " ]";
    }
    
}
