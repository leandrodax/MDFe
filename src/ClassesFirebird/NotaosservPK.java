/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class NotaosservPK {
    
    private int nros;
    private int codserv;
    private int codprof;

    public NotaosservPK() {
    }

    public NotaosservPK(int nros, int codserv, int codprof) {
        this.nros = nros;
        this.codserv = codserv;
        this.codprof = codprof;
    }

    public int getNros() {
        return nros;
    }

    public void setNros(int nros) {
        this.nros = nros;
    }

    public int getCodserv() {
        return codserv;
    }

    public void setCodserv(int codserv) {
        this.codserv = codserv;
    }

    public int getCodprof() {
        return codprof;
    }

    public void setCodprof(int codprof) {
        this.codprof = codprof;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nros;
        hash += (int) codserv;
        hash += (int) codprof;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaosservPK)) {
            return false;
        }
        NotaosservPK other = (NotaosservPK) object;
        if (this.nros != other.nros) {
            return false;
        }
        if (this.codserv != other.codserv) {
            return false;
        }
        if (this.codprof != other.codprof) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.NotaosservPK[ nros=" + nros + ", codserv=" + codserv + ", codprof=" + codprof + " ]";
    }
    
}
