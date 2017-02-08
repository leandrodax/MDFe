/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Tabfpagfil {
    
    private static final long serialVersionUID = 1L;
    protected TabfpagfilPK tabfpagfilPK;
    private Character ativo;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private Integer maxparc;
    private Character bonifica;
    private Character contrlim;
    private Character contrtit;
    private Character emissbol;
    private Integer codplano;
    private Integer codrec;
    private Tabfil tabfil;
    private Tabforma tabforma;

    public Tabfpagfil() {
    }

    public Tabfpagfil(TabfpagfilPK tabfpagfilPK) {
        this.tabfpagfilPK = tabfpagfilPK;
    }

    public Tabfpagfil(int codforma, int codfil) {
        this.tabfpagfilPK = new TabfpagfilPK(codforma, codfil);
    }

    public TabfpagfilPK getTabfpagfilPK() {
        return tabfpagfilPK;
    }

    public void setTabfpagfilPK(TabfpagfilPK tabfpagfilPK) {
        this.tabfpagfilPK = tabfpagfilPK;
    }

    public Character getAtivo() {
        return ativo;
    }

    public void setAtivo(Character ativo) {
        this.ativo = ativo;
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

    public Integer getMaxparc() {
        return maxparc;
    }

    public void setMaxparc(Integer maxparc) {
        this.maxparc = maxparc;
    }

    public Character getBonifica() {
        return bonifica;
    }

    public void setBonifica(Character bonifica) {
        this.bonifica = bonifica;
    }

    public Character getContrlim() {
        return contrlim;
    }

    public void setContrlim(Character contrlim) {
        this.contrlim = contrlim;
    }

    public Character getContrtit() {
        return contrtit;
    }

    public void setContrtit(Character contrtit) {
        this.contrtit = contrtit;
    }

    public Character getEmissbol() {
        return emissbol;
    }

    public void setEmissbol(Character emissbol) {
        this.emissbol = emissbol;
    }

    public Integer getCodplano() {
        return codplano;
    }

    public void setCodplano(Integer codplano) {
        this.codplano = codplano;
    }

    public Integer getCodrec() {
        return codrec;
    }

    public void setCodrec(Integer codrec) {
        this.codrec = codrec;
    }

    public Tabfil getTabfil() {
        return tabfil;
    }

    public void setTabfil(Tabfil tabfil) {
        this.tabfil = tabfil;
    }

    public Tabforma getTabforma() {
        return tabforma;
    }

    public void setTabforma(Tabforma tabforma) {
        this.tabforma = tabforma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabfpagfilPK != null ? tabfpagfilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabfpagfil)) {
            return false;
        }
        Tabfpagfil other = (Tabfpagfil) object;
        if ((this.tabfpagfilPK == null && other.tabfpagfilPK != null) || (this.tabfpagfilPK != null && !this.tabfpagfilPK.equals(other.tabfpagfilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabfpagfil[ tabfpagfilPK=" + tabfpagfilPK + " ]";
    }
    
}
