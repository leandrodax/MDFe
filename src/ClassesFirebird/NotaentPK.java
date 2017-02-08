/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class NotaentPK {
    
    private int codfil;
    private String nrnota;
    private int codfor;

    public NotaentPK() {
    }

    public NotaentPK(int codfil, String nrnota, int codfor) {
        this.codfil = codfil;
        this.nrnota = nrnota;
        this.codfor = codfor;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public int getCodfor() {
        return codfor;
    }

    public void setCodfor(int codfor) {
        this.codfor = codfor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codfil;
        hash += (nrnota != null ? nrnota.hashCode() : 0);
        hash += (int) codfor;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaentPK)) {
            return false;
        }
        NotaentPK other = (NotaentPK) object;
        if (this.codfil != other.codfil) {
            return false;
        }
        if ((this.nrnota == null && other.nrnota != null) || (this.nrnota != null && !this.nrnota.equals(other.nrnota))) {
            return false;
        }
        if (this.codfor != other.codfor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.NotaentPK[ codfil=" + codfil + ", nrnota=" + nrnota + ", codfor=" + codfor + " ]";
    }
    
}
