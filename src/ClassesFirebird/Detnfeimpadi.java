/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class Detnfeimpadi {
    private static final long serialVersionUID = 1L;
    protected DetnfeimpadiPK detnfeimpadiPK;
    private String nadicao;
    private String nseqadic;
    private String cfabricante;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vdescdi;
    private String xped;
    private String nitemped;

    public Detnfeimpadi() {
    }

    public Detnfeimpadi(DetnfeimpadiPK detnfeimpadiPK) {
        this.detnfeimpadiPK = detnfeimpadiPK;
    }

    public Detnfeimpadi(int keynfe, int nitemdet, int nitemimp, int nitem) {
        this.detnfeimpadiPK = new DetnfeimpadiPK(keynfe, nitemdet, nitemimp, nitem);
    }

    public DetnfeimpadiPK getDetnfeimpadiPK() {
        return detnfeimpadiPK;
    }

    public void setDetnfeimpadiPK(DetnfeimpadiPK detnfeimpadiPK) {
        this.detnfeimpadiPK = detnfeimpadiPK;
    }

    public String getNadicao() {
        return nadicao;
    }

    public void setNadicao(String nadicao) {
        this.nadicao = nadicao;
    }

    public String getNseqadic() {
        return nseqadic;
    }

    public void setNseqadic(String nseqadic) {
        this.nseqadic = nseqadic;
    }

    public String getCfabricante() {
        return cfabricante;
    }

    public void setCfabricante(String cfabricante) {
        this.cfabricante = cfabricante;
    }

    public Double getVdescdi() {
        return vdescdi;
    }

    public void setVdescdi(Double vdescdi) {
        this.vdescdi = vdescdi;
    }

    public String getXped() {
        return xped;
    }

    public void setXped(String xped) {
        this.xped = xped;
    }

    public String getNitemped() {
        return nitemped;
    }

    public void setNitemped(String nitemped) {
        this.nitemped = nitemped;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detnfeimpadiPK != null ? detnfeimpadiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detnfeimpadi)) {
            return false;
        }
        Detnfeimpadi other = (Detnfeimpadi) object;
        if ((this.detnfeimpadiPK == null && other.detnfeimpadiPK != null) || (this.detnfeimpadiPK != null && !this.detnfeimpadiPK.equals(other.detnfeimpadiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detnfeimpadi[ detnfeimpadiPK=" + detnfeimpadiPK + " ]";
    }
    
}
