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

public class Tipo60a implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected Tipo60aPK tipo60aPK;
    
    private String nrcontr;
    private Integer codfil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vltotparc;
    private Integer codusuent;
    private String nomusuent;
    
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;
    
    private Date datafin;
    private String nrlote;
    private String situacao;
    private Tipo60m tipo60m;

    public Tipo60a() {
    }

    public Tipo60a(Tipo60aPK tipo60aPK) {
        this.tipo60aPK = tipo60aPK;
    }

    public Tipo60a(Tipo60aPK tipo60aPK, String nrcontr) {
        this.tipo60aPK = tipo60aPK;
        this.nrcontr = nrcontr;
    }

    public Tipo60a(Date dtemissao, String nrserie, String indice) {
        this.tipo60aPK = new Tipo60aPK(dtemissao, nrserie, indice);
    }

    public Tipo60aPK getTipo60aPK() {
        return tipo60aPK;
    }

    public void setTipo60aPK(Tipo60aPK tipo60aPK) {
        this.tipo60aPK = tipo60aPK;
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

    public Double getVltotparc() {
        return vltotparc;
    }

    public void setVltotparc(Double vltotparc) {
        this.vltotparc = vltotparc;
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

    public Tipo60m getTipo60m() {
        return tipo60m;
    }

    public void setTipo60m(Tipo60m tipo60m) {
        this.tipo60m = tipo60m;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tipo60aPK != null ? tipo60aPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipo60a)) {
            return false;
        }
        Tipo60a other = (Tipo60a) object;
        if ((this.tipo60aPK == null && other.tipo60aPK != null) || (this.tipo60aPK != null && !this.tipo60aPK.equals(other.tipo60aPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tipo60a[ tipo60aPK=" + tipo60aPK + " ]";
    }
    
}
