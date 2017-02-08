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
public class Tabppagfil implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabppagfilPK tabppagfilPK;
    private Character tpdiacli;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double peracrdes;
    private Double vlminimo;
    private Double vlmaximo;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    private Double vlminacres;
    private Double vlmaxacres;
    private Character contrlim;
    private Character emissbol;
    private Integer codplano;
    private Integer codrec;
    private Character vendafil;
    private Double percacre;
    
    private Tabfil tabfil;
     private Tabplanpag tabplanpag;

    public Tabppagfil() {
    }

    public Tabppagfil(TabppagfilPK tabppagfilPK) {
        this.tabppagfilPK = tabppagfilPK;
    }

    public Tabppagfil(int codplan, int codfil) {
        this.tabppagfilPK = new TabppagfilPK(codplan, codfil);
    }

    public TabppagfilPK getTabppagfilPK() {
        return tabppagfilPK;
    }

    public void setTabppagfilPK(TabppagfilPK tabppagfilPK) {
        this.tabppagfilPK = tabppagfilPK;
    }

    public Character getTpdiacli() {
        return tpdiacli;
    }

    public void setTpdiacli(Character tpdiacli) {
        this.tpdiacli = tpdiacli;
    }

    public Double getPeracrdes() {
        return peracrdes;
    }

    public void setPeracrdes(Double peracrdes) {
        this.peracrdes = peracrdes;
    }

    public Double getVlminimo() {
        return vlminimo;
    }

    public void setVlminimo(Double vlminimo) {
        this.vlminimo = vlminimo;
    }

    public Double getVlmaximo() {
        return vlmaximo;
    }

    public void setVlmaximo(Double vlmaximo) {
        this.vlmaximo = vlmaximo;
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

    public Double getVlminacres() {
        return vlminacres;
    }

    public void setVlminacres(Double vlminacres) {
        this.vlminacres = vlminacres;
    }

    public Double getVlmaxacres() {
        return vlmaxacres;
    }

    public void setVlmaxacres(Double vlmaxacres) {
        this.vlmaxacres = vlmaxacres;
    }

    public Character getContrlim() {
        return contrlim;
    }

    public void setContrlim(Character contrlim) {
        this.contrlim = contrlim;
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

    public Character getVendafil() {
        return vendafil;
    }

    public void setVendafil(Character vendafil) {
        this.vendafil = vendafil;
    }

    public Double getPercacre() {
        return percacre;
    }

    public void setPercacre(Double percacre) {
        this.percacre = percacre;
    }

    public Tabfil getTabfil() {
        return tabfil;
    }

    public void setTabfil(Tabfil tabfil) {
        this.tabfil = tabfil;
    }

    public Tabplanpag getTabplanpag() {
        return tabplanpag;
    }

    public void setTabplanpag(Tabplanpag tabplanpag) {
        this.tabplanpag = tabplanpag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabppagfilPK != null ? tabppagfilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabppagfil)) {
            return false;
        }
        Tabppagfil other = (Tabppagfil) object;
        if ((this.tabppagfilPK == null && other.tabppagfilPK != null) || (this.tabppagfilPK != null && !this.tabppagfilPK.equals(other.tabppagfilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabppagfil[ tabppagfilPK=" + tabppagfilPK + " ]";
    }
    
}
