/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Nfecst {
    
    private static final long serialVersionUID = 1L;
    private Integer codcst;
    private String sigcst;
    private String nomcst;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    private String cstsai;
    private String cstent;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percirrf;
    private Double perccsll;
    private Double percpis;
    private Double perccofins;
    private Double percicms;
    private String indecf;

    public Nfecst() {
    }

    public Nfecst(Integer codcst) {
        this.codcst = codcst;
    }

    public Integer getCodcst() {
        return codcst;
    }

    public void setCodcst(Integer codcst) {
        this.codcst = codcst;
    }

    public String getSigcst() {
        return sigcst;
    }

    public void setSigcst(String sigcst) {
        this.sigcst = sigcst;
    }

    public String getNomcst() {
        return nomcst;
    }

    public void setNomcst(String nomcst) {
        this.nomcst = nomcst;
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

    public Character getRgevento() {
        return rgevento;
    }

    public void setRgevento(Character rgevento) {
        this.rgevento = rgevento;
    }

    public String getCstsai() {
        return cstsai;
    }

    public void setCstsai(String cstsai) {
        this.cstsai = cstsai;
    }

    public String getCstent() {
        return cstent;
    }

    public void setCstent(String cstent) {
        this.cstent = cstent;
    }

    public Double getPercirrf() {
        return percirrf;
    }

    public void setPercirrf(Double percirrf) {
        this.percirrf = percirrf;
    }

    public Double getPerccsll() {
        return perccsll;
    }

    public void setPerccsll(Double perccsll) {
        this.perccsll = perccsll;
    }

    public Double getPercpis() {
        return percpis;
    }

    public void setPercpis(Double percpis) {
        this.percpis = percpis;
    }

    public Double getPerccofins() {
        return perccofins;
    }

    public void setPerccofins(Double perccofins) {
        this.perccofins = perccofins;
    }

    public Double getPercicms() {
        return percicms;
    }

    public void setPercicms(Double percicms) {
        this.percicms = percicms;
    }

    public String getIndecf() {
        return indecf;
    }

    public void setIndecf(String indecf) {
        this.indecf = indecf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcst != null ? codcst.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nfecst)) {
            return false;
        }
        Nfecst other = (Nfecst) object;
        if ((this.codcst == null && other.codcst != null) || (this.codcst != null && !this.codcst.equals(other.codcst))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Nfecst[ codcst=" + codcst + " ]";
    }
    
}
