/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Tabcheqrepassado {
    
    private static final long serialVersionUID = 1L;
    private Integer codrep;
    private Integer codfor;
    private Date datrepas;
    private String obsrepas;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    private Integer codchqr;

    public Tabcheqrepassado() {
    }

    public Tabcheqrepassado(Integer codrep) {
        this.codrep = codrep;
    }

    public Integer getCodrep() {
        return codrep;
    }

    public void setCodrep(Integer codrep) {
        this.codrep = codrep;
    }

    public Integer getCodfor() {
        return codfor;
    }

    public void setCodfor(Integer codfor) {
        this.codfor = codfor;
    }

    public Date getDatrepas() {
        return datrepas;
    }

    public void setDatrepas(Date datrepas) {
        this.datrepas = datrepas;
    }

    public String getObsrepas() {
        return obsrepas;
    }

    public void setObsrepas(String obsrepas) {
        this.obsrepas = obsrepas;
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

    public Character getRgevento() {
        return rgevento;
    }

    public void setRgevento(Character rgevento) {
        this.rgevento = rgevento;
    }

    public Integer getCodchqr() {
        return codchqr;
    }

    public void setCodchqr(Integer codchqr) {
        this.codchqr = codchqr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codrep != null ? codrep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcheqrepassado)) {
            return false;
        }
        Tabcheqrepassado other = (Tabcheqrepassado) object;
        if ((this.codrep == null && other.codrep != null) || (this.codrep != null && !this.codrep.equals(other.codrep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcheqrepassado[ codrep=" + codrep + " ]";
    }
    
}
