/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;

/**
 *
 * @author vplayer
 */
public class Detpromovios implements Serializable {
    private static final long serialVersionUID = 1L;
    protected DetpromoviosPK detpromoviosPK;
    private String codpro;
    private Integer codven;
    private Character reservaestoque;
    private String descpro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double prvapro;
    private String indice;
    private Double vldesacrite;
    private Character tpdesacrite;
    private Integer codtiposervico;
    private String prazohoras;
    private Movios movios;

    public Detpromovios() {
    }

    public Detpromovios(DetpromoviosPK detpromoviosPK) {
        this.detpromoviosPK = detpromoviosPK;
    }

    public Detpromovios(int codos, int nritem) {
        this.detpromoviosPK = new DetpromoviosPK(codos, nritem);
    }

    public DetpromoviosPK getDetpromoviosPK() {
        return detpromoviosPK;
    }

    public void setDetpromoviosPK(DetpromoviosPK detpromoviosPK) {
        this.detpromoviosPK = detpromoviosPK;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public Character getReservaestoque() {
        return reservaestoque;
    }

    public void setReservaestoque(Character reservaestoque) {
        this.reservaestoque = reservaestoque;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Double getPrvapro() {
        return prvapro;
    }

    public void setPrvapro(Double prvapro) {
        this.prvapro = prvapro;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public Double getVldesacrite() {
        return vldesacrite;
    }

    public void setVldesacrite(Double vldesacrite) {
        this.vldesacrite = vldesacrite;
    }

    public Character getTpdesacrite() {
        return tpdesacrite;
    }

    public void setTpdesacrite(Character tpdesacrite) {
        this.tpdesacrite = tpdesacrite;
    }

    public Integer getCodtiposervico() {
        return codtiposervico;
    }

    public void setCodtiposervico(Integer codtiposervico) {
        this.codtiposervico = codtiposervico;
    }

    public String getPrazohoras() {
        return prazohoras;
    }

    public void setPrazohoras(String prazohoras) {
        this.prazohoras = prazohoras;
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
        hash += (detpromoviosPK != null ? detpromoviosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detpromovios)) {
            return false;
        }
        Detpromovios other = (Detpromovios) object;
        if ((this.detpromoviosPK == null && other.detpromoviosPK != null) || (this.detpromoviosPK != null && !this.detpromoviosPK.equals(other.detpromoviosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detpromovios[ detpromoviosPK=" + detpromoviosPK + " ]";
    }
    
}
