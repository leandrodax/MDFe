/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


/**
 *
 * @author vplayer
 */
public class Detmovios {
    private static final long serialVersionUID = 1L;
    protected DetmoviosPK detmoviosPK;
    private Movios movios;

    public Detmovios() {
    }

    public Detmovios(DetmoviosPK detmoviosPK) {
        this.detmoviosPK = detmoviosPK;
    }

    public Detmovios(int codos, int codprof) {
        this.detmoviosPK = new DetmoviosPK(codos, codprof);
    }

    public DetmoviosPK getDetmoviosPK() {
        return detmoviosPK;
    }

    public void setDetmoviosPK(DetmoviosPK detmoviosPK) {
        this.detmoviosPK = detmoviosPK;
    }

    public Movios getMovios() {
        return movios;
    }

    public void setMovios(Movios movios) {
        this.movios = movios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detmoviosPK != null ? detmoviosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detmovios)) {
            return false;
        }
        Detmovios other = (Detmovios) object;
        if ((this.detmoviosPK == null && other.detmoviosPK != null) || (this.detmoviosPK != null && !this.detmoviosPK.equals(other.detmoviosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detmovios[ detmoviosPK=" + detmoviosPK + " ]";
    }
    
}
