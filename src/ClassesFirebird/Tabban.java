/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;


public class Tabban {
    
    private static final long serialVersionUID = 1L;
    private Integer codban;
    private String codbanco;
    private String descbanco;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Tabban() {
    }

    public Tabban(Integer codban) {
        this.codban = codban;
    }

    public Integer getCodban() {
        return codban;
    }

    public void setCodban(Integer codban) {
        this.codban = codban;
    }

    public String getCodbanco() {
        return codbanco;
    }

    public void setCodbanco(String codbanco) {
        this.codbanco = codbanco;
    }

    public String getDescbanco() {
        return descbanco;
    }

    public void setDescbanco(String descbanco) {
        this.descbanco = descbanco;
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
        hash += (codban != null ? codban.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabban)) {
            return false;
        }
        Tabban other = (Tabban) object;
        if ((this.codban == null && other.codban != null) || (this.codban != null && !this.codban.equals(other.codban))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabban[ codban=" + codban + " ]";
    }
    
}
