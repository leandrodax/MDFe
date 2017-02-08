/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class NotaentitensPK {
    
    private int codfil;
    private int codfor;
    private String nrnota;
    private int nritem;

    public NotaentitensPK() {
    }

    public NotaentitensPK(int codfil, int codfor, String nrnota, int nritem) {
        this.codfil = codfil;
        this.codfor = codfor;
        this.nrnota = nrnota;
        this.nritem = nritem;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    public int getCodfor() {
        return codfor;
    }

    public void setCodfor(int codfor) {
        this.codfor = codfor;
    }

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codfil;
        hash += (int) codfor;
        hash += (nrnota != null ? nrnota.hashCode() : 0);
        hash += (int) nritem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaentitensPK)) {
            return false;
        }
        NotaentitensPK other = (NotaentitensPK) object;
        if (this.codfil != other.codfil) {
            return false;
        }
        if (this.codfor != other.codfor) {
            return false;
        }
        if ((this.nrnota == null && other.nrnota != null) || (this.nrnota != null && !this.nrnota.equals(other.nrnota))) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.NotaentitensPK[ codfil=" + codfil + ", codfor=" + codfor + ", nrnota=" + nrnota + ", nritem=" + nritem + " ]";
    }
    
}
