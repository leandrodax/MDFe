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
public class Tipo60m implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected Tipo60mPK tipo60mPK;
    
    private String nrcontr;
    private Integer codfil;
    private String nrordem;
    private String modelo;
    private String nrcontini;
    private String nrcontfin;
    private String nrcontz;
    private String cro;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlvenbruta;
    private Double vltotgeral;
    private Integer codusuent;
    private String nomusuent;    
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;    
    private Date datafin;
    private String nrlote;
    private String situacao;
    
    private Collection<Tipo60a> tipo60aCollection;

    public Tipo60m() {
    }

    public Tipo60m(Tipo60mPK tipo60mPK) {
        this.tipo60mPK = tipo60mPK;
    }

    public Tipo60m(Tipo60mPK tipo60mPK, String nrcontr) {
        this.tipo60mPK = tipo60mPK;
        this.nrcontr = nrcontr;
    }

    public Tipo60m(Date dtemissao, String nrserie) {
        this.tipo60mPK = new Tipo60mPK(dtemissao, nrserie);
    }

    public Tipo60mPK getTipo60mPK() {
        return tipo60mPK;
    }

    public void setTipo60mPK(Tipo60mPK tipo60mPK) {
        this.tipo60mPK = tipo60mPK;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getNrordem() {
        return nrordem;
    }

    public void setNrordem(String nrordem) {
        this.nrordem = nrordem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNrcontini() {
        return nrcontini;
    }

    public void setNrcontini(String nrcontini) {
        this.nrcontini = nrcontini;
    }

    public String getNrcontfin() {
        return nrcontfin;
    }

    public void setNrcontfin(String nrcontfin) {
        this.nrcontfin = nrcontfin;
    }

    public String getNrcontz() {
        return nrcontz;
    }

    public void setNrcontz(String nrcontz) {
        this.nrcontz = nrcontz;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public Double getVlvenbruta() {
        return vlvenbruta;
    }

    public void setVlvenbruta(Double vlvenbruta) {
        this.vlvenbruta = vlvenbruta;
    }

    public Double getVltotgeral() {
        return vltotgeral;
    }

    public void setVltotgeral(Double vltotgeral) {
        this.vltotgeral = vltotgeral;
    }

    public Integer getCodusuent() {
        return codusuent;
    }

    public void setCodusuent(Integer codusuent) {
        this.codusuent = codusuent;
    }

    public String getNomusuent() {
        return nomusuent;
    }

    public void setNomusuent(String nomusuent) {
        this.nomusuent = nomusuent;
    }

    public Date getDataent() {
        return dataent;
    }

    public void setDataent(Date dataent) {
        this.dataent = dataent;
    }

    public Integer getCodusufin() {
        return codusufin;
    }

    public void setCodusufin(Integer codusufin) {
        this.codusufin = codusufin;
    }

    public String getNomusufin() {
        return nomusufin;
    }

    public void setNomusufin(String nomusufin) {
        this.nomusufin = nomusufin;
    }

    public Date getDatafin() {
        return datafin;
    }

    public void setDatafin(Date datafin) {
        this.datafin = datafin;
    }

    public String getNrlote() {
        return nrlote;
    }

    public void setNrlote(String nrlote) {
        this.nrlote = nrlote;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @XmlTransient
    public Collection<Tipo60a> getTipo60aCollection() {
        return tipo60aCollection;
    }

    public void setTipo60aCollection(Collection<Tipo60a> tipo60aCollection) {
        this.tipo60aCollection = tipo60aCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipo60mPK != null ? tipo60mPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo60m)) {
            return false;
        }
        Tipo60m other = (Tipo60m) object;
        if ((this.tipo60mPK == null && other.tipo60mPK != null) || (this.tipo60mPK != null && !this.tipo60mPK.equals(other.tipo60mPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tipo60m[ tipo60mPK=" + tipo60mPK + " ]";
    }
    
}
