/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;



public class Tabaluser {
    
    private static final long serialVersionUID = 1L;
    private Integer codaluser;
    private String nomaluser;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;

    public Tabaluser() {
    }

    public Tabaluser(Integer codaluser) {
        this.codaluser = codaluser;
    }

    public Integer getCodaluser() {
        return codaluser;
    }

    public void setCodaluser(Integer codaluser) {
        this.codaluser = codaluser;
    }

    public String getNomaluser() {
        return nomaluser;
    }

    public void setNomaluser(String nomaluser) {
        this.nomaluser = nomaluser;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codaluser != null ? codaluser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabaluser)) {
            return false;
        }
        Tabaluser other = (Tabaluser) object;
        if ((this.codaluser == null && other.codaluser != null) || (this.codaluser != null && !this.codaluser.equals(other.codaluser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabaluser[ codaluser=" + codaluser + " ]";
    }
    
}
