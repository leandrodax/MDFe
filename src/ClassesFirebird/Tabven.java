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

public class Tabven implements Serializable {
    private static final long serialVersionUID = 1L;
 
    
    private Short codven;
    private String nomven;
    private String endven;
    private String cidven;
    private String bairro;
    private String cpfven;
    private String rgven;
    private String telven;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percomis;
    private Integer codger;
    private Integer codsup;
    private Double percoomcc;
    private Double percoomap;
    
    private String senhaFp;
   
    private Collection<Tabcli> tabcliCollection;

    public Tabven() {
    }

    public Tabven(Short codven) {
        this.codven = codven;
    }

    public Short getCodven() {
        return codven;
    }

    public void setCodven(Short codven) {
        this.codven = codven;
    }

    public String getNomven() {
        return nomven;
    }

    public void setNomven(String nomven) {
        this.nomven = nomven;
    }

    public String getEndven() {
        return endven;
    }

    public void setEndven(String endven) {
        this.endven = endven;
    }

    public String getCidven() {
        return cidven;
    }

    public void setCidven(String cidven) {
        this.cidven = cidven;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpfven() {
        return cpfven;
    }

    public void setCpfven(String cpfven) {
        this.cpfven = cpfven;
    }

    public String getRgven() {
        return rgven;
    }

    public void setRgven(String rgven) {
        this.rgven = rgven;
    }

    public String getTelven() {
        return telven;
    }

    public void setTelven(String telven) {
        this.telven = telven;
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

    public Double getPercomis() {
        return percomis;
    }

    public void setPercomis(Double percomis) {
        this.percomis = percomis;
    }

    public Integer getCodger() {
        return codger;
    }

    public void setCodger(Integer codger) {
        this.codger = codger;
    }

    public Integer getCodsup() {
        return codsup;
    }

    public void setCodsup(Integer codsup) {
        this.codsup = codsup;
    }

    public Double getPercoomcc() {
        return percoomcc;
    }

    public void setPercoomcc(Double percoomcc) {
        this.percoomcc = percoomcc;
    }

    public Double getPercoomap() {
        return percoomap;
    }

    public void setPercoomap(Double percoomap) {
        this.percoomap = percoomap;
    }

    public String getSenhaFp() {
        return senhaFp;
    }

    public void setSenhaFp(String senhaFp) {
        this.senhaFp = senhaFp;
    }

    @XmlTransient
    public Collection<Tabcli> getTabcliCollection() {
        return tabcliCollection;
    }

    public void setTabcliCollection(Collection<Tabcli> tabcliCollection) {
        this.tabcliCollection = tabcliCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codven != null ? codven.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabven)) {
            return false;
        }
        Tabven other = (Tabven) object;
        if ((this.codven == null && other.codven != null) || (this.codven != null && !this.codven.equals(other.codven))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabven[ codven=" + codven + " ]";
    }
    
}
