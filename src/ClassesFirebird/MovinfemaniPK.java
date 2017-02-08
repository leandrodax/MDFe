/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class MovinfemaniPK {
    
    private String chnfe;
    private String tpevento;
    private int nseqevento;

    public MovinfemaniPK() {
    }

    public MovinfemaniPK(String chnfe, String tpevento, int nseqevento) {
        this.chnfe = chnfe;
        this.tpevento = tpevento;
        this.nseqevento = nseqevento;
    }

    public String getChnfe() {
        return chnfe;
    }

    public void setChnfe(String chnfe) {
        this.chnfe = chnfe;
    }

    public String getTpevento() {
        return tpevento;
    }

    public void setTpevento(String tpevento) {
        this.tpevento = tpevento;
    }

    public int getNseqevento() {
        return nseqevento;
    }

    public void setNseqevento(int nseqevento) {
        this.nseqevento = nseqevento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chnfe != null ? chnfe.hashCode() : 0);
        hash += (tpevento != null ? tpevento.hashCode() : 0);
        hash += (int) nseqevento;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MovinfemaniPK)) {
            return false;
        }
        MovinfemaniPK other = (MovinfemaniPK) object;
        if ((this.chnfe == null && other.chnfe != null) || (this.chnfe != null && !this.chnfe.equals(other.chnfe))) {
            return false;
        }
        if ((this.tpevento == null && other.tpevento != null) || (this.tpevento != null && !this.tpevento.equals(other.tpevento))) {
            return false;
        }
        if (this.nseqevento != other.nseqevento) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MovinfemaniPK[ chnfe=" + chnfe + ", tpevento=" + tpevento + ", nseqevento=" + nseqevento + " ]";
    }
    
}
