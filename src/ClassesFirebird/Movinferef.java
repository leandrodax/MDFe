/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Movinferef {
    
    private static final long serialVersionUID = 1L;
    protected MovinferefPK movinferefPK;
    private String tpref;
    private String refnfe;
    private String cuf;
    private String aamm;
    private String cnpj;
    private String mod;
    private String serie;
    private String nnf;

    public Movinferef() {
    }

    public Movinferef(MovinferefPK movinferefPK) {
        this.movinferefPK = movinferefPK;
    }

    public Movinferef(int keynfe, int nitem) {
        this.movinferefPK = new MovinferefPK(keynfe, nitem);
    }

    public MovinferefPK getMovinferefPK() {
        return movinferefPK;
    }

    public void setMovinferefPK(MovinferefPK movinferefPK) {
        this.movinferefPK = movinferefPK;
    }

    public String getTpref() {
        return tpref;
    }

    public void setTpref(String tpref) {
        this.tpref = tpref;
    }

    public String getRefnfe() {
        return refnfe;
    }

    public void setRefnfe(String refnfe) {
        this.refnfe = refnfe;
    }

    public String getCuf() {
        return cuf;
    }

    public void setCuf(String cuf) {
        this.cuf = cuf;
    }

    public String getAamm() {
        return aamm;
    }

    public void setAamm(String aamm) {
        this.aamm = aamm;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNnf() {
        return nnf;
    }

    public void setNnf(String nnf) {
        this.nnf = nnf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movinferefPK != null ? movinferefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movinferef)) {
            return false;
        }
        Movinferef other = (Movinferef) object;
        if ((this.movinferefPK == null && other.movinferefPK != null) || (this.movinferefPK != null && !this.movinferefPK.equals(other.movinferefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movinferef[ movinferefPK=" + movinferefPK + " ]";
    }
    
}
