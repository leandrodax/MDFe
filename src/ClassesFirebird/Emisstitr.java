/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Emisstitr {
    private static final long serialVersionUID = 1L;
    protected EmisstitrPK emisstitrPK;
    private Integer codmod;
    private Date dteemiss;
    private Integer rgcodusu;
    private String rgusuario;

    public Emisstitr() {
    }

    public Emisstitr(EmisstitrPK emisstitrPK) {
        this.emisstitrPK = emisstitrPK;
    }

    public Emisstitr(int nremiss, String codtit, String codcli) {
        this.emisstitrPK = new EmisstitrPK(nremiss, codtit, codcli);
    }

    public EmisstitrPK getEmisstitrPK() {
        return emisstitrPK;
    }

    public void setEmisstitrPK(EmisstitrPK emisstitrPK) {
        this.emisstitrPK = emisstitrPK;
    }

    public Integer getCodmod() {
        return codmod;
    }

    public void setCodmod(Integer codmod) {
        this.codmod = codmod;
    }

    public Date getDteemiss() {
        return dteemiss;
    }

    public void setDteemiss(Date dteemiss) {
        this.dteemiss = dteemiss;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emisstitrPK != null ? emisstitrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emisstitr)) {
            return false;
        }
        Emisstitr other = (Emisstitr) object;
        if ((this.emisstitrPK == null && other.emisstitrPK != null) || (this.emisstitrPK != null && !this.emisstitrPK.equals(other.emisstitrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Emisstitr[ emisstitrPK=" + emisstitrPK + " ]";
    }
    
}
