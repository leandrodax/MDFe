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
public class Tabobscli implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabobscliPK tabobscliPK;
    private String descobs;
    private Integer rgcodusu;
    private String rgusuario;
    private String situacao;
    
    private Date dthrreg;
    private Integer codobshis;
    private Tabcli tabcli;

    public Tabobscli() {
    }

    public Tabobscli(TabobscliPK tabobscliPK) {
        this.tabobscliPK = tabobscliPK;
    }

    public Tabobscli(String codcli, Date dtagenda, String hragenda) {
        this.tabobscliPK = new TabobscliPK(codcli, dtagenda, hragenda);
    }

    public TabobscliPK getTabobscliPK() {
        return tabobscliPK;
    }

    public void setTabobscliPK(TabobscliPK tabobscliPK) {
        this.tabobscliPK = tabobscliPK;
    }

    public String getDescobs() {
        return descobs;
    }

    public void setDescobs(String descobs) {
        this.descobs = descobs;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Date getDthrreg() {
        return dthrreg;
    }

    public void setDthrreg(Date dthrreg) {
        this.dthrreg = dthrreg;
    }

    public Integer getCodobshis() {
        return codobshis;
    }

    public void setCodobshis(Integer codobshis) {
        this.codobshis = codobshis;
    }

    public Tabcli getTabcli() {
        return tabcli;
    }

    public void setTabcli(Tabcli tabcli) {
        this.tabcli = tabcli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabobscliPK != null ? tabobscliPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabobscli)) {
            return false;
        }
        Tabobscli other = (Tabobscli) object;
        if ((this.tabobscliPK == null && other.tabobscliPK != null) || (this.tabobscliPK != null && !this.tabobscliPK.equals(other.tabobscliPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabobscli[ tabobscliPK=" + tabobscliPK + " ]";
    }
    
}
