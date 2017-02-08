package ClassesFirebird;


public class Movientref {
    private static final long serialVersionUID = 1L;
    protected MovientrefPK movientrefPK;
    private String tpref;
    private String refnfe;
    private String cuf;
    private String aamm;
    private String cnpj;
    private String mod;
    private String serie;
    private String nnf;

    public Movientref() {
    }

    public Movientref(MovientrefPK movientrefPK) {
        this.movientrefPK = movientrefPK;
    }

    public Movientref(int keynfe, int nitem) {
        this.movientrefPK = new MovientrefPK(keynfe, nitem);
    }

    public MovientrefPK getMovientrefPK() {
        return movientrefPK;
    }

    public void setMovientrefPK(MovientrefPK movientrefPK) {
        this.movientrefPK = movientrefPK;
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
        hash += (movientrefPK != null ? movientrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movientref)) {
            return false;
        }
        Movientref other = (Movientref) object;
        if ((this.movientrefPK == null && other.movientrefPK != null) || (this.movientrefPK != null && !this.movientrefPK.equals(other.movientrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movientref[ movientrefPK=" + movientrefPK + " ]";
    }
    
}
