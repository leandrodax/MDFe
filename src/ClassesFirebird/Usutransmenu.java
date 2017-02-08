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

public class Usutransmenu implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsutransmenuPK usutransmenuPK;
    private String nomusu;
    private Character imptranrede;
    private String caminho;
    private Integer nrtransf;
    
    private Date dtrecarq;
    private Character imptranemail;
    private Character imptranline;

    public Usutransmenu() {
    }

    public Usutransmenu(UsutransmenuPK usutransmenuPK) {
        this.usutransmenuPK = usutransmenuPK;
    }

    public Usutransmenu(int codfil, Date dttransf, int codusu) {
        this.usutransmenuPK = new UsutransmenuPK(codfil, dttransf, codusu);
    }

    public UsutransmenuPK getUsutransmenuPK() {
        return usutransmenuPK;
    }

    public void setUsutransmenuPK(UsutransmenuPK usutransmenuPK) {
        this.usutransmenuPK = usutransmenuPK;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
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
        hash += (usutransmenuPK != null ? usutransmenuPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usutransmenu)) {
            return false;
        }
        Usutransmenu other = (Usutransmenu) object;
        if ((this.usutransmenuPK == null && other.usutransmenuPK != null) || (this.usutransmenuPK != null && !this.usutransmenuPK.equals(other.usutransmenuPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Usutransmenu[ usutransmenuPK=" + usutransmenuPK + " ]";
    }
    
}
