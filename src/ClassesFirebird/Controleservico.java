/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vplayer
 */
public class Controleservico implements Serializable {
    private static final long serialVersionUID = 1L;
    protected ControleservicoPK controleservicoPK;
    private String codpro;
    private short codprof2;
    private Date dtcs;
    private String obs;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlmaodeobra;
    private Collection<Tabhodiaservico> tabhodiaservicoCollection;
    private Movios movios;

    public Controleservico() {
    }

    public Controleservico(ControleservicoPK controleservicoPK) {
        this.controleservicoPK = controleservicoPK;
    }

    public Controleservico(ControleservicoPK controleservicoPK, String codpro, short codprof2) {
        this.controleservicoPK = controleservicoPK;
        this.codpro = codpro;
        this.codprof2 = codprof2;
    }

    public Controleservico(int cscod, int codos) {
        this.controleservicoPK = new ControleservicoPK(cscod, codos);
    }

    public ControleservicoPK getControleservicoPK() {
        return controleservicoPK;
    }

    public void setControleservicoPK(ControleservicoPK controleservicoPK) {
        this.controleservicoPK = controleservicoPK;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public short getCodprof2() {
        return codprof2;
    }

    public void setCodprof2(short codprof2) {
        this.codprof2 = codprof2;
    }

    public Date getDtcs() {
        return dtcs;
    }

    public void setDtcs(Date dtcs) {
        this.dtcs = dtcs;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Double getVlmaodeobra() {
        return vlmaodeobra;
    }

    public void setVlmaodeobra(Double vlmaodeobra) {
        this.vlmaodeobra = vlmaodeobra;
    }

    @XmlTransient
    public Collection<Tabhodiaservico> getTabhodiaservicoCollection() {
        return tabhodiaservicoCollection;
    }

    public void setTabhodiaservicoCollection(Collection<Tabhodiaservico> tabhodiaservicoCollection) {
        this.tabhodiaservicoCollection = tabhodiaservicoCollection;
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
        hash += (controleservicoPK != null ? controleservicoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controleservico)) {
            return false;
        }
        Controleservico other = (Controleservico) object;
        if ((this.controleservicoPK == null && other.controleservicoPK != null) || (this.controleservicoPK != null && !this.controleservicoPK.equals(other.controleservicoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Controleservico[ controleservicoPK=" + controleservicoPK + " ]";
    }
    
}
