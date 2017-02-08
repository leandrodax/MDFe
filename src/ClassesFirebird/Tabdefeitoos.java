/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

/**
 *
 * @author vplayer
 */
public class Tabdefeitoos {
    private static final long serialVersionUID = 1L;
    private Integer coddefeitoos;
    private String nomdefeitoos;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Tabdefeitoos() {
    }

    public Tabdefeitoos(Integer coddefeitoos) {
        this.coddefeitoos = coddefeitoos;
    }

    public Integer getCoddefeitoos() {
        return coddefeitoos;
    }

    public void setCoddefeitoos(Integer coddefeitoos) {
        this.coddefeitoos = coddefeitoos;
    }

    public String getNomdefeitoos() {
        return nomdefeitoos;
    }

    public void setNomdefeitoos(String nomdefeitoos) {
        this.nomdefeitoos = nomdefeitoos;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coddefeitoos != null ? coddefeitoos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabdefeitoos)) {
            return false;
        }
        Tabdefeitoos other = (Tabdefeitoos) object;
        if ((this.coddefeitoos == null && other.coddefeitoos != null) || (this.coddefeitoos != null && !this.coddefeitoos.equals(other.coddefeitoos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabdefeitoos[ coddefeitoos=" + coddefeitoos + " ]";
    }
    
}
