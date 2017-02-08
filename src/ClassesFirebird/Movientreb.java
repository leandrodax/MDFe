/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class Movientreb {
    private static final long serialVersionUID = 1L;
    protected MovientrebPK movientrebPK;
    private String placa;
    private String uf;
    private String rntc;

    public Movientreb() {
    }

    public Movientreb(MovientrebPK movientrebPK) {
        this.movientrebPK = movientrebPK;
    }

    public Movientreb(int keynfe, int nitem) {
        this.movientrebPK = new MovientrebPK(keynfe, nitem);
    }

    public MovientrebPK getMovientrebPK() {
        return movientrebPK;
    }

    public void setMovientrebPK(MovientrebPK movientrebPK) {
        this.movientrebPK = movientrebPK;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getRntc() {
        return rntc;
    }

    public void setRntc(String rntc) {
        this.rntc = rntc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movientrebPK != null ? movientrebPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movientreb)) {
            return false;
        }
        Movientreb other = (Movientreb) object;
        if ((this.movientrebPK == null && other.movientrebPK != null) || (this.movientrebPK != null && !this.movientrebPK.equals(other.movientrebPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movientreb[ movientrebPK=" + movientrebPK + " ]";
    }
    
}
