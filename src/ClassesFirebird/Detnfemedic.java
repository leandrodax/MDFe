/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Detnfemedic {
    private static final long serialVersionUID = 1L;
    protected DetnfemedicPK detnfemedicPK;
    private String nlote;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qlote;
    
    private Double vpmc;

    public Detnfemedic() {
    }

    public Detnfemedic(DetnfemedicPK detnfemedicPK) {
        this.detnfemedicPK = detnfemedicPK;
    }

    public Detnfemedic(DetnfemedicPK detnfemedicPK, String nlote) {
        this.detnfemedicPK = detnfemedicPK;
        this.nlote = nlote;
    }

    public Detnfemedic(int keynfe, int nitemdet, int nitem) {
        this.detnfemedicPK = new DetnfemedicPK(keynfe, nitemdet, nitem);
    }

    public DetnfemedicPK getDetnfemedicPK() {
        return detnfemedicPK;
    }

    public void setDetnfemedicPK(DetnfemedicPK detnfemedicPK) {
        this.detnfemedicPK = detnfemedicPK;
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

    public Double getVpmc() {
        return vpmc;
    }

    public void setVpmc(Double vpmc) {
        this.vpmc = vpmc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detnfemedicPK != null ? detnfemedicPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detnfemedic)) {
            return false;
        }
        Detnfemedic other = (Detnfemedic) object;
        if ((this.detnfemedicPK == null && other.detnfemedicPK != null) || (this.detnfemedicPK != null && !this.detnfemedicPK.equals(other.detnfemedicPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detnfemedic[ detnfemedicPK=" + detnfemedicPK + " ]";
    }
    
}
