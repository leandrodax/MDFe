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
public class Tabservfil implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabservfilPK tabservfilPK;
    private Character tpcom;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double comissao;
    private Character tpcomvend;
    private Double comven;
    private Double vlserv;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private Tabfil tabfil;
    
    private Tabserv tabserv;

    public Tabservfil() {
    }

    public Tabservfil(TabservfilPK tabservfilPK) {
        this.tabservfilPK = tabservfilPK;
    }

    public Tabservfil(int codserv, int codfil) {
        this.tabservfilPK = new TabservfilPK(codserv, codfil);
    }

    public TabservfilPK getTabservfilPK() {
        return tabservfilPK;
    }

    public void setTabservfilPK(TabservfilPK tabservfilPK) {
        this.tabservfilPK = tabservfilPK;
    }

    public Character getTpcom() {
        return tpcom;
    }

    public void setTpcom(Character tpcom) {
        this.tpcom = tpcom;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Character getTpcomvend() {
        return tpcomvend;
    }

    public void setTpcomvend(Character tpcomvend) {
        this.tpcomvend = tpcomvend;
    }

    public Double getComven() {
        return comven;
    }

    public void setComven(Double comven) {
        this.comven = comven;
    }

    public Double getVlserv() {
        return vlserv;
    }

    public void setVlserv(Double vlserv) {
        this.vlserv = vlserv;
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

    public Tabfil getTabfil() {
        return tabfil;
    }

    public void setTabfil(Tabfil tabfil) {
        this.tabfil = tabfil;
    }

    public Tabserv getTabserv() {
        return tabserv;
    }

    public void setTabserv(Tabserv tabserv) {
        this.tabserv = tabserv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabservfilPK != null ? tabservfilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabservfil)) {
            return false;
        }
        Tabservfil other = (Tabservfil) object;
        if ((this.tabservfilPK == null && other.tabservfilPK != null) || (this.tabservfilPK != null && !this.tabservfilPK.equals(other.tabservfilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabservfil[ tabservfilPK=" + tabservfilPK + " ]";
    }
    
}
