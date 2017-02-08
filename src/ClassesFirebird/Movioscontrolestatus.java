/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movioscontrolestatus {
    private static final long serialVersionUID = 1L;
    protected MovioscontrolestatusPK movioscontrolestatusPK;
    private Integer rgcodusu;
    private String rgusuario;
    private Character rgevento;
    private Date horainicio;
    private Date horafim;
    private Movios movios;

    public Movioscontrolestatus() {
    }

    public Movioscontrolestatus(MovioscontrolestatusPK movioscontrolestatusPK) {
        this.movioscontrolestatusPK = movioscontrolestatusPK;
    }

    public Movioscontrolestatus(int codos, int codstatus, Date rgdata) {
        this.movioscontrolestatusPK = new MovioscontrolestatusPK(codos, codstatus, rgdata);
    }

    public MovioscontrolestatusPK getMovioscontrolestatusPK() {
        return movioscontrolestatusPK;
    }

    public void setMovioscontrolestatusPK(MovioscontrolestatusPK movioscontrolestatusPK) {
        this.movioscontrolestatusPK = movioscontrolestatusPK;
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

    public Character getRgevento() {
        return rgevento;
    }

    public void setRgevento(Character rgevento) {
        this.rgevento = rgevento;
    }

    public Date getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(Date horainicio) {
        this.horainicio = horainicio;
    }

    public Date getHorafim() {
        return horafim;
    }

    public void setHorafim(Date horafim) {
        this.horafim = horafim;
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
        hash += (movioscontrolestatusPK != null ? movioscontrolestatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movioscontrolestatus)) {
            return false;
        }
        Movioscontrolestatus other = (Movioscontrolestatus) object;
        if ((this.movioscontrolestatusPK == null && other.movioscontrolestatusPK != null) || (this.movioscontrolestatusPK != null && !this.movioscontrolestatusPK.equals(other.movioscontrolestatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movioscontrolestatus[ movioscontrolestatusPK=" + movioscontrolestatusPK + " ]";
    }
    
}
