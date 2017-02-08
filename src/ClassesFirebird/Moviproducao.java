/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Moviproducao {

    private static final long serialVersionUID = 1L;
    private Integer codproducao;
    private Integer codprocesso;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Moviproducao() {
    }

    public Moviproducao(Integer codproducao) {
        this.codproducao = codproducao;
    }

    public Integer getCodproducao() {
        return codproducao;
    }

    public void setCodproducao(Integer codproducao) {
        this.codproducao = codproducao;
    }

    public Integer getCodprocesso() {
        return codprocesso;
    }

    public void setCodprocesso(Integer codprocesso) {
        this.codprocesso = codprocesso;
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
        hash += (codproducao != null ? codproducao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Moviproducao)) {
            return false;
        }
        Moviproducao other = (Moviproducao) object;
        if ((this.codproducao == null && other.codproducao != null) || (this.codproducao != null && !this.codproducao.equals(other.codproducao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Moviproducao[ codproducao=" + codproducao + " ]";
    }
    
}
