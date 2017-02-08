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
public class Usutranscrec implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsutranscrecPK usutranscrecPK;
    private String nomusu;
    private Integer qtdnota;
    private Character impincl;
    private Character impalte;
    private Character impexcl;
    private Character imppago;
    private Character imptranrede;
    private String caminho;
    private String nrlote;
    private Integer nrtransf;
    
    private Date dtrecarq;
    private Character imptranemail;
    private Character imptranline;

    public Usutranscrec() {
    }

    public Usutranscrec(UsutranscrecPK usutranscrecPK) {
        this.usutranscrecPK = usutranscrecPK;
    }

    public Usutranscrec(int codfil, Date dttransf, int codusu) {
        this.usutranscrecPK = new UsutranscrecPK(codfil, dttransf, codusu);
    }

    public UsutranscrecPK getUsutranscrecPK() {
        return usutranscrecPK;
    }

    public void setUsutranscrecPK(UsutranscrecPK usutranscrecPK) {
        this.usutranscrecPK = usutranscrecPK;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public Integer getQtdnota() {
        return qtdnota;
    }

    public void setQtdnota(Integer qtdnota) {
        this.qtdnota = qtdnota;
    }

    public Character getImpincl() {
        return impincl;
    }

    public void setImpincl(Character impincl) {
        this.impincl = impincl;
    }

    public Character getImpalte() {
        return impalte;
    }

    public void setImpalte(Character impalte) {
        this.impalte = impalte;
    }

    public Character getImpexcl() {
        return impexcl;
    }

    public void setImpexcl(Character impexcl) {
        this.impexcl = impexcl;
    }

    public Character getImppago() {
        return imppago;
    }

    public void setImppago(Character imppago) {
        this.imppago = imppago;
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

    public String getNrlote() {
        return nrlote;
    }

    public void setNrlote(String nrlote) {
        this.nrlote = nrlote;
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
        hash += (usutranscrecPK != null ? usutranscrecPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usutranscrec)) {
            return false;
        }
        Usutranscrec other = (Usutranscrec) object;
        if ((this.usutranscrecPK == null && other.usutranscrecPK != null) || (this.usutranscrecPK != null && !this.usutranscrecPK.equals(other.usutranscrecPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Usutranscrec[ usutranscrecPK=" + usutranscrecPK + " ]";
    }
    
}
