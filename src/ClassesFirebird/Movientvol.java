/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Movientvol {
    private static final long serialVersionUID = 1L;
    protected MovientvolPK movientvolPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qvol;
    private String esp;
    private String marca;
    private String nvol;
    private Double pesol;
    private Double pesob;

    public Movientvol() {
    }

    public Movientvol(MovientvolPK movientvolPK) {
        this.movientvolPK = movientvolPK;
    }

    public Movientvol(int keynfe, int nitem) {
        this.movientvolPK = new MovientvolPK(keynfe, nitem);
    }

    public MovientvolPK getMovientvolPK() {
        return movientvolPK;
    }

    public void setMovientvolPK(MovientvolPK movientvolPK) {
        this.movientvolPK = movientvolPK;
    }

    public Double getQvol() {
        return qvol;
    }

    public void setQvol(Double qvol) {
        this.qvol = qvol;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNvol() {
        return nvol;
    }

    public void setNvol(String nvol) {
        this.nvol = nvol;
    }

    public Double getPesol() {
        return pesol;
    }

    public void setPesol(Double pesol) {
        this.pesol = pesol;
    }

    public Double getPesob() {
        return pesob;
    }

    public void setPesob(Double pesob) {
        this.pesob = pesob;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movientvolPK != null ? movientvolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movientvol)) {
            return false;
        }
        Movientvol other = (Movientvol) object;
        if ((this.movientvolPK == null && other.movientvolPK != null) || (this.movientvolPK != null && !this.movientvolPK.equals(other.movientvolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movientvol[ movientvolPK=" + movientvolPK + " ]";
    }
    
}
