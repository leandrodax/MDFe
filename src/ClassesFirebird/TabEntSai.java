/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;


public class TabEntSai{
    
    private static final long serialVersionUID = 1L;
    protected TabEntSaiPK tabEntSaiPK;
    private Date dtEntrada;
    private Date dtSaida;

    public TabEntSai() {
    }

    public TabEntSai(TabEntSaiPK tabEntSaiPK) {
        this.tabEntSaiPK = tabEntSaiPK;
    }

    public TabEntSai(int codseq, String codcli) {
        this.tabEntSaiPK = new TabEntSaiPK(codseq, codcli);
    }

    public TabEntSaiPK getTabEntSaiPK() {
        return tabEntSaiPK;
    }

    public void setTabEntSaiPK(TabEntSaiPK tabEntSaiPK) {
        this.tabEntSaiPK = tabEntSaiPK;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabEntSaiPK != null ? tabEntSaiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabEntSai)) {
            return false;
        }
        TabEntSai other = (TabEntSai) object;
        if ((this.tabEntSaiPK == null && other.tabEntSaiPK != null) || (this.tabEntSaiPK != null && !this.tabEntSaiPK.equals(other.tabEntSaiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabEntSai[ tabEntSaiPK=" + tabEntSaiPK + " ]";
    }
    
}
