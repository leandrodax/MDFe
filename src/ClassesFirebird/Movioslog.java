/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movioslog {
    
    private static final long serialVersionUID = 1L;
    protected MovioslogPK movioslogPK;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    private String ocorrencia;

    public Movioslog() {
    }

    public Movioslog(MovioslogPK movioslogPK) {
        this.movioslogPK = movioslogPK;
    }

    public Movioslog(int codos, int codoslog) {
        this.movioslogPK = new MovioslogPK(codos, codoslog);
    }

    public MovioslogPK getMovioslogPK() {
        return movioslogPK;
    }

    public void setMovioslogPK(MovioslogPK movioslogPK) {
        this.movioslogPK = movioslogPK;
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

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movioslogPK != null ? movioslogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movioslog)) {
            return false;
        }
        Movioslog other = (Movioslog) object;
        if ((this.movioslogPK == null && other.movioslogPK != null) || (this.movioslogPK != null && !this.movioslogPK.equals(other.movioslogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movioslog[ movioslogPK=" + movioslogPK + " ]";
    }
    
}
