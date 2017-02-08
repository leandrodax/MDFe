/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Movinfevol {
    
    private static final long serialVersionUID = 1L;
    protected MovinfevolPK movinfevolPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qvol;
    private String esp;
    private String marca;
    private String nvol;
    private Double pesol;
    private Double pesob;

    public Movinfevol() {
    }

    public Movinfevol(MovinfevolPK movinfevolPK) {
        this.movinfevolPK = movinfevolPK;
    }

    public Movinfevol(int keynfe, int nitem) {
        this.movinfevolPK = new MovinfevolPK(keynfe, nitem);
    }

    public MovinfevolPK getMovinfevolPK() {
        return movinfevolPK;
    }

    public void setMovinfevolPK(MovinfevolPK movinfevolPK) {
        this.movinfevolPK = movinfevolPK;
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
        hash += (movinfevolPK != null ? movinfevolPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movinfevol)) {
            return false;
        }
        Movinfevol other = (Movinfevol) object;
        if ((this.movinfevolPK == null && other.movinfevolPK != null) || (this.movinfevolPK != null && !this.movinfevolPK.equals(other.movinfevolPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movinfevol[ movinfevolPK=" + movinfevolPK + " ]";
    }
    
}
