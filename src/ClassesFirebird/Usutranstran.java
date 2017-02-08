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

public class Usutranstran implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsutranstranPK usutranstranPK;
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

    public Usutranstran() {
    }

    public Usutranstran(UsutranstranPK usutranstranPK) {
        this.usutranstranPK = usutranstranPK;
    }

    public Usutranstran(int codfil, Date dttransf, int codusu) {
        this.usutranstranPK = new UsutranstranPK(codfil, dttransf, codusu);
    }

    public UsutranstranPK getUsutranstranPK() {
        return usutranstranPK;
    }

    public void setUsutranstranPK(UsutranstranPK usutranstranPK) {
        this.usutranstranPK = usutranstranPK;
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
        hash += (usutranstranPK != null ? usutranstranPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usutranstran)) {
            return false;
        }
        Usutranstran other = (Usutranstran) object;
        if ((this.usutranstranPK == null && other.usutranstranPK != null) || (this.usutranstranPK != null && !this.usutranstranPK.equals(other.usutranstranPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Usutranstran[ usutranstranPK=" + usutranstranPK + " ]";
    }
    
}
