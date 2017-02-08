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
public class Tabproducao implements Serializable {
    private static final long serialVersionUID = 1L;

    protected TabproducaoPK tabproducaoPK;
    private String descpro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdcomp;
    private Character matprima;
    private Tabpro tabpro;
    private Tabpro tabpro1;

    public Tabproducao() {
    }

    public Tabproducao(TabproducaoPK tabproducaoPK) {
        this.tabproducaoPK = tabproducaoPK;
    }

    public Tabproducao(String refpro, String codpro) {
        this.tabproducaoPK = new TabproducaoPK(refpro, codpro);
    }

    public TabproducaoPK getTabproducaoPK() {
        return tabproducaoPK;
    }

    public void setTabproducaoPK(TabproducaoPK tabproducaoPK) {
        this.tabproducaoPK = tabproducaoPK;
    }

    public String getDescpro() {
        return descpro;
    }

    public void setDescpro(String descpro) {
        this.descpro = descpro;
    }

    public Double getQtdcomp() {
        return qtdcomp;
    }

    public void setQtdcomp(Double qtdcomp) {
        this.qtdcomp = qtdcomp;
    }

    public Character getMatprima() {
        return matprima;
    }

    public void setMatprima(Character matprima) {
        this.matprima = matprima;
    }

    public Tabpro getTabpro() {
        return tabpro;
    }

    public void setTabpro(Tabpro tabpro) {
        this.tabpro = tabpro;
    }

    public Tabpro getTabpro1() {
        return tabpro1;
    }

    public void setTabpro1(Tabpro tabpro1) {
        this.tabpro1 = tabpro1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabproducaoPK != null ? tabproducaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabproducao)) {
            return false;
        }
        Tabproducao other = (Tabproducao) object;
        if ((this.tabproducaoPK == null && other.tabproducaoPK != null) || (this.tabproducaoPK != null && !this.tabproducaoPK.equals(other.tabproducaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabproducao[ tabproducaoPK=" + tabproducaoPK + " ]";
    }
    
}
