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
public class Detentmedic implements Serializable {
    private static final long serialVersionUID = 1L;
    protected DetentmedicPK detentmedicPK;
    private String nlote;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qlote;
    private Date dfab;
    private Date dval;
    private Double vpmc;

    public Detentmedic() {
    }

    public Detentmedic(DetentmedicPK detentmedicPK) {
        this.detentmedicPK = detentmedicPK;
    }

    public Detentmedic(DetentmedicPK detentmedicPK, String nlote) {
        this.detentmedicPK = detentmedicPK;
        this.nlote = nlote;
    }

    public Detentmedic(int keynfe, int nitemdet, int nitem) {
        this.detentmedicPK = new DetentmedicPK(keynfe, nitemdet, nitem);
    }

    public DetentmedicPK getDetentmedicPK() {
        return detentmedicPK;
    }

    public void setDetentmedicPK(DetentmedicPK detentmedicPK) {
        this.detentmedicPK = detentmedicPK;
    }

    public String getNlote() {
        return nlote;
    }

    public void setNlote(String nlote) {
        this.nlote = nlote;
    }

    public Double getQlote() {
        return qlote;
    }

    public void setQlote(Double qlote) {
        this.qlote = qlote;
    }

    public Date getDfab() {
        return dfab;
    }

    public void setDfab(Date dfab) {
        this.dfab = dfab;
    }

    public Date getDval() {
        return dval;
    }

    public void setDval(Date dval) {
        this.dval = dval;
    }

    public Double getVpmc() {
        return vpmc;
    }

    public void setVpmc(Double vpmc) {
        this.vpmc = vpmc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detentmedicPK != null ? detentmedicPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detentmedic)) {
            return false;
        }
        Detentmedic other = (Detentmedic) object;
        if ((this.detentmedicPK == null && other.detentmedicPK != null) || (this.detentmedicPK != null && !this.detentmedicPK.equals(other.detentmedicPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detentmedic[ detentmedicPK=" + detentmedicPK + " ]";
    }
    
}
