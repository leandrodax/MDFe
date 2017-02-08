/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Tabpecaproblema implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabpecaproblemaPK tabpecaproblemaPK;
    private String referencia;
    private String nome;
    private String obs;
     private Movios movios;

    public Tabpecaproblema() {
    }

    public Tabpecaproblema(TabpecaproblemaPK tabpecaproblemaPK) {
        this.tabpecaproblemaPK = tabpecaproblemaPK;
    }

    public Tabpecaproblema(int codpeca, int codos) {
        this.tabpecaproblemaPK = new TabpecaproblemaPK(codpeca, codos);
    }

    public TabpecaproblemaPK getTabpecaproblemaPK() {
        return tabpecaproblemaPK;
    }

    public void setTabpecaproblemaPK(TabpecaproblemaPK tabpecaproblemaPK) {
        this.tabpecaproblemaPK = tabpecaproblemaPK;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        hash += (tabpecaproblemaPK != null ? tabpecaproblemaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabpecaproblema)) {
            return false;
        }
        Tabpecaproblema other = (Tabpecaproblema) object;
        if ((this.tabpecaproblemaPK == null && other.tabpecaproblemaPK != null) || (this.tabpecaproblemaPK != null && !this.tabpecaproblemaPK.equals(other.tabpecaproblemaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabpecaproblema[ tabpecaproblemaPK=" + tabpecaproblemaPK + " ]";
    }
    
}
