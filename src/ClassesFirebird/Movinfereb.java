/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Movinfereb {
    
    private static final long serialVersionUID = 1L;
    protected MovinferebPK movinferebPK;
    private String placa;
    private String uf;
    private String rntc;

    public Movinfereb() {
    }

    public Movinfereb(MovinferebPK movinferebPK) {
        this.movinferebPK = movinferebPK;
    }

    public Movinfereb(int keynfe, int nitem) {
        this.movinferebPK = new MovinferebPK(keynfe, nitem);
    }

    public MovinferebPK getMovinferebPK() {
        return movinferebPK;
    }

    public void setMovinferebPK(MovinferebPK movinferebPK) {
        this.movinferebPK = movinferebPK;
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
        hash += (movinferebPK != null ? movinferebPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movinfereb)) {
            return false;
        }
        Movinfereb other = (Movinfereb) object;
        if ((this.movinferebPK == null && other.movinferebPK != null) || (this.movinferebPK != null && !this.movinferebPK.equals(other.movinferebPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movinfereb[ movinferebPK=" + movinferebPK + " ]";
    }
    
}
