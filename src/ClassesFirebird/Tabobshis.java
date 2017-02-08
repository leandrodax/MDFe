/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Tabobshis implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Integer codobshis;
    private String obshistor;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    
    private Date dtprevisao;
    private Integer codobj;
    private String serieobj;
    private String horarioprevisao;
    private String seguradora;
    private String codcli;

    public Tabobshis() {
    }

    public Tabobshis(Integer codobshis) {
        this.codobshis = codobshis;
    }

    public Integer getCodobshis() {
        return codobshis;
    }

    public void setCodobshis(Integer codobshis) {
        this.codobshis = codobshis;
    }

    public String getObshistor() {
        return obshistor;
    }

    public void setObshistor(String obshistor) {
        this.obshistor = obshistor;
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

    public String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }

    public Date getDtprevisao() {
        return dtprevisao;
    }

    public void setDtprevisao(Date dtprevisao) {
        this.dtprevisao = dtprevisao;
    }

    public Integer getCodobj() {
        return codobj;
    }

    public void setCodobj(Integer codobj) {
        this.codobj = codobj;
    }

    public String getSerieobj() {
        return serieobj;
    }

    public void setSerieobj(String serieobj) {
        this.serieobj = serieobj;
    }

    public String getHorarioprevisao() {
        return horarioprevisao;
    }

    public void setHorarioprevisao(String horarioprevisao) {
        this.horarioprevisao = horarioprevisao;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codobshis != null ? codobshis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabobshis)) {
            return false;
        }
        Tabobshis other = (Tabobshis) object;
        if ((this.codobshis == null && other.codobshis != null) || (this.codobshis != null && !this.codobshis.equals(other.codobshis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabobshis[ codobshis=" + codobshis + " ]";
    }
    
}
