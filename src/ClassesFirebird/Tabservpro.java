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
public class Tabservpro implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabservproPK tabservproPK;
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlunit;
    private Double vlvenda;
    private Integer qtd;

    private Movios movios;

    public Tabservpro() {
    }

    public Tabservpro(TabservproPK tabservproPK) {
        this.tabservproPK = tabservproPK;
    }

    public Tabservpro(int codos, String codpro) {
        this.tabservproPK = new TabservproPK(codos, codpro);
    }

    public TabservproPK getTabservproPK() {
        return tabservproPK;
    }

    public void setTabservproPK(TabservproPK tabservproPK) {
        this.tabservproPK = tabservproPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVlunit() {
        return vlunit;
    }

    public void setVlunit(Double vlunit) {
        this.vlunit = vlunit;
    }

    public Double getVlvenda() {
        return vlvenda;
    }

    public void setVlvenda(Double vlvenda) {
        this.vlvenda = vlvenda;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
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
        hash += (tabservproPK != null ? tabservproPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabservpro)) {
            return false;
        }
        Tabservpro other = (Tabservpro) object;
        if ((this.tabservproPK == null && other.tabservproPK != null) || (this.tabservproPK != null && !this.tabservproPK.equals(other.tabservproPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabservpro[ tabservproPK=" + tabservproPK + " ]";
    }
    
}
