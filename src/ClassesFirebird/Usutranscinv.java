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
public class Usutranscinv implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected UsutranscinvPK usutranscinvPK;
    private String nomusu;
    private String nrlote;
    private Integer codusufin;
    private String nomusufin;
    
    private Date datafin;
    private Integer quantreg;
    private Character imptranrede;
    private String caminho;
    private Integer nrtransf;
    
    private Date dtrecarq;
    private Character imptranemail;
    private Character imptranline;

    public Usutranscinv() {
    }

    public Usutranscinv(UsutranscinvPK usutranscinvPK) {
        this.usutranscinvPK = usutranscinvPK;
    }

    public Usutranscinv(int codfil, Date dttransf, int codusu) {
        this.usutranscinvPK = new UsutranscinvPK(codfil, dttransf, codusu);
    }

    public UsutranscinvPK getUsutranscinvPK() {
        return usutranscinvPK;
    }

    public void setUsutranscinvPK(UsutranscinvPK usutranscinvPK) {
        this.usutranscinvPK = usutranscinvPK;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getNrlote() {
        return nrlote;
    }

    public void setNrlote(String nrlote) {
        this.nrlote = nrlote;
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
        hash += (usutranscinvPK != null ? usutranscinvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usutranscinv)) {
            return false;
        }
        Usutranscinv other = (Usutranscinv) object;
        if ((this.usutranscinvPK == null && other.usutranscinvPK != null) || (this.usutranscinvPK != null && !this.usutranscinvPK.equals(other.usutranscinvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Usutranscinv[ usutranscinvPK=" + usutranscinvPK + " ]";
    }
    
}
