/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Rgmovios{
    private static final long serialVersionUID = 1L;
    protected RgmoviosPK rgmoviosPK;
    private String usuario;
    private Date dtrgmovios;
    private Character situacao;
    private String obs;
    private Movios movios;

    public Rgmovios() {
    }

    public Rgmovios(RgmoviosPK rgmoviosPK) {
        this.rgmoviosPK = rgmoviosPK;
    }

    public Rgmovios(int codigo, int codos) {
        this.rgmoviosPK = new RgmoviosPK(codigo, codos);
    }

    public RgmoviosPK getRgmoviosPK() {
        return rgmoviosPK;
    }

    public void setRgmoviosPK(RgmoviosPK rgmoviosPK) {
        this.rgmoviosPK = rgmoviosPK;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getDtrgmovios() {
        return dtrgmovios;
    }

    public void setDtrgmovios(Date dtrgmovios) {
        this.dtrgmovios = dtrgmovios;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Movios getMovios() {
        return movios;
    }

    public void setMovios(Movios movios) {
        this.movios = movios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rgmoviosPK != null ? rgmoviosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rgmovios)) {
            return false;
        }
        Rgmovios other = (Rgmovios) object;
        if ((this.rgmoviosPK == null && other.rgmoviosPK != null) || (this.rgmoviosPK != null && !this.rgmoviosPK.equals(other.rgmoviosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Rgmovios[ rgmoviosPK=" + rgmoviosPK + " ]";
    }
    
}
