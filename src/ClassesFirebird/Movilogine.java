/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movilogine {
    
    private static final long serialVersionUID = 1L;
    private Integer codigo;
    private Date dtterminal;
    private Date dtserver;
    private Date dtultlogin;
    private Integer tpsistema;
    private String codmaq;
    private String motivo;
    private Integer rgcodusu;
    private String rgusuario;

    public Movilogine() {
    }

    public Movilogine(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getDtterminal() {
        return dtterminal;
    }

    public void setDtterminal(Date dtterminal) {
        this.dtterminal = dtterminal;
    }

    public Date getDtserver() {
        return dtserver;
    }

    public void setDtserver(Date dtserver) {
        this.dtserver = dtserver;
    }

    public Date getDtultlogin() {
        return dtultlogin;
    }

    public void setDtultlogin(Date dtultlogin) {
        this.dtultlogin = dtultlogin;
    }

    public Integer getTpsistema() {
        return tpsistema;
    }

    public void setTpsistema(Integer tpsistema) {
        this.tpsistema = tpsistema;
    }

    public String getCodmaq() {
        return codmaq;
    }

    public void setCodmaq(String codmaq) {
        this.codmaq = codmaq;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movilogine)) {
            return false;
        }
        Movilogine other = (Movilogine) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movilogine[ codigo=" + codigo + " ]";
    }
    
}
