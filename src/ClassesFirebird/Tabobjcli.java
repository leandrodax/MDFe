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
public class Tabobjcli implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TabobjcliPK tabobjcliPK;
    private String descrobj;
    private String serieobj;
    private String modelobj;
    private String marcaobj;
    private Character situaobj;
    private String obserobj;
    private String hokm;
    private String seguradora;
    private String cor;
    
    private Date dtcompra;
    private String nrnfcompra;
    private Integer rgcodusu;
    
    private Date rgdata;
    private Character rgevento;
    private String rgusuario;
    private String revendedor;
    private String voltagem;
    private Integer codmarca;
    private Integer codmodelo;
    private String chassi;
    private String fabricante;
    private String motor;
    private String ano;
    private Tabcli tabcli;

    public Tabobjcli() {
    }

    public Tabobjcli(TabobjcliPK tabobjcliPK) {
        this.tabobjcliPK = tabobjcliPK;
    }

    public Tabobjcli(String codcli, int codobj) {
        this.tabobjcliPK = new TabobjcliPK(codcli, codobj);
    }

    public TabobjcliPK getTabobjcliPK() {
        return tabobjcliPK;
    }

    public void setTabobjcliPK(TabobjcliPK tabobjcliPK) {
        this.tabobjcliPK = tabobjcliPK;
    }

    public String getDescrobj() {
        return descrobj;
    }

    public void setDescrobj(String descrobj) {
        this.descrobj = descrobj;
    }

    public String getSerieobj() {
        return serieobj;
    }

    public void setSerieobj(String serieobj) {
        this.serieobj = serieobj;
    }

    public String getModelobj() {
        return modelobj;
    }

    public void setModelobj(String modelobj) {
        this.modelobj = modelobj;
    }

    public String getMarcaobj() {
        return marcaobj;
    }

    public void setMarcaobj(String marcaobj) {
        this.marcaobj = marcaobj;
    }

    public Character getSituaobj() {
        return situaobj;
    }

    public void setSituaobj(Character situaobj) {
        this.situaobj = situaobj;
    }

    public String getObserobj() {
        return obserobj;
    }

    public void setObserobj(String obserobj) {
        this.obserobj = obserobj;
    }

    public String getHokm() {
        return hokm;
    }

    public void setHokm(String hokm) {
        this.hokm = hokm;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Date getDtcompra() {
        return dtcompra;
    }

    public void setDtcompra(Date dtcompra) {
        this.dtcompra = dtcompra;
    }

    public String getNrnfcompra() {
        return nrnfcompra;
    }

    public void setNrnfcompra(String nrnfcompra) {
        this.nrnfcompra = nrnfcompra;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public Character getRgevento() {
        return rgevento;
    }

    public void setRgevento(Character rgevento) {
        this.rgevento = rgevento;
    }

    public String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public String getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(String revendedor) {
        this.revendedor = revendedor;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public Integer getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    public Integer getCodmodelo() {
        return codmodelo;
    }

    public void setCodmodelo(Integer codmodelo) {
        this.codmodelo = codmodelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
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
        hash += (tabobjcliPK != null ? tabobjcliPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabobjcli)) {
            return false;
        }
        Tabobjcli other = (Tabobjcli) object;
        if ((this.tabobjcliPK == null && other.tabobjcliPK != null) || (this.tabobjcliPK != null && !this.tabobjcliPK.equals(other.tabobjcliPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabobjcli[ tabobjcliPK=" + tabobjcliPK + " ]";
    }
    
}
