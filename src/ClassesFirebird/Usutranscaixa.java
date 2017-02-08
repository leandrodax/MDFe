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
public class Usutranscaixa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsutranscaixaPK usutranscaixaPK;
    private Integer nrtransf;
    
    private Date dtrecarq;
    private Integer nrcaixa;
    private Integer nrabert;
    private Character imptranrede;
    private Character imptranemail;
    private Character imptranline;
    private String caminho;

    public Usutranscaixa() {
    }

    public Usutranscaixa(UsutranscaixaPK usutranscaixaPK) {
        this.usutranscaixaPK = usutranscaixaPK;
    }

    public Usutranscaixa(int codfil, Date dttransf) {
        this.usutranscaixaPK = new UsutranscaixaPK(codfil, dttransf);
    }

    public UsutranscaixaPK getUsutranscaixaPK() {
        return usutranscaixaPK;
    }

    public void setUsutranscaixaPK(UsutranscaixaPK usutranscaixaPK) {
        this.usutranscaixaPK = usutranscaixaPK;
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

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public Integer getNrabert() {
        return nrabert;
    }

    public void setNrabert(Integer nrabert) {
        this.nrabert = nrabert;
    }

    public Character getImptranrede() {
        return imptranrede;
    }

    public void setImptranrede(Character imptranrede) {
        this.imptranrede = imptranrede;
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

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usutranscaixaPK != null ? usutranscaixaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usutranscaixa)) {
            return false;
        }
        Usutranscaixa other = (Usutranscaixa) object;
        if ((this.usutranscaixaPK == null && other.usutranscaixaPK != null) || (this.usutranscaixaPK != null && !this.usutranscaixaPK.equals(other.usutranscaixaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Usutranscaixa[ usutranscaixaPK=" + usutranscaixaPK + " ]";
    }
    
}
