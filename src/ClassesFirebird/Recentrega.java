/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Recentrega {
    
    private static final long serialVersionUID = 1L;
    protected RecentregaPK recentregaPK;
    private String codcli;
    private String nomcli;
    private String endentrega;
    private String cidentrega;
    private String baientrega;
    private String estentrega;
    private String refentrega;
    private String foneentrega;
    private Integer codven;
    private String nomven;
    private Integer codusu;
    private String usuario;
    private Date dtentrega;
    private Date dthrlanc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double totnota;
    private Double totgeral;
    private Integer nrcaixa;
    private String obsvenda;
    private Date dtemissao;

    public Recentrega() {
    }

    public Recentrega(RecentregaPK recentregaPK) {
        this.recentregaPK = recentregaPK;
    }

    public Recentrega(int nrvia, String nrcontr) {
        this.recentregaPK = new RecentregaPK(nrvia, nrcontr);
    }

    public RecentregaPK getRecentregaPK() {
        return recentregaPK;
    }

    public void setRecentregaPK(RecentregaPK recentregaPK) {
        this.recentregaPK = recentregaPK;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getEndentrega() {
        return endentrega;
    }

    public void setEndentrega(String endentrega) {
        this.endentrega = endentrega;
    }

    public String getCidentrega() {
        return cidentrega;
    }

    public void setCidentrega(String cidentrega) {
        this.cidentrega = cidentrega;
    }

    public String getBaientrega() {
        return baientrega;
    }

    public void setBaientrega(String baientrega) {
        this.baientrega = baientrega;
    }

    public String getEstentrega() {
        return estentrega;
    }

    public void setEstentrega(String estentrega) {
        this.estentrega = estentrega;
    }

    public String getRefentrega() {
        return refentrega;
    }

    public void setRefentrega(String refentrega) {
        this.refentrega = refentrega;
    }

    public String getFoneentrega() {
        return foneentrega;
    }

    public void setFoneentrega(String foneentrega) {
        this.foneentrega = foneentrega;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public String getNomven() {
        return nomven;
    }

    public void setNomven(String nomven) {
        this.nomven = nomven;
    }

    public Integer getCodusu() {
        return codusu;
    }

    public void setCodusu(Integer codusu) {
        this.codusu = codusu;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getDtentrega() {
        return dtentrega;
    }

    public void setDtentrega(Date dtentrega) {
        this.dtentrega = dtentrega;
    }

    public Date getDthrlanc() {
        return dthrlanc;
    }

    public void setDthrlanc(Date dthrlanc) {
        this.dthrlanc = dthrlanc;
    }

    public Double getTotnota() {
        return totnota;
    }

    public void setTotnota(Double totnota) {
        this.totnota = totnota;
    }

    public Double getTotgeral() {
        return totgeral;
    }

    public void setTotgeral(Double totgeral) {
        this.totgeral = totgeral;
    }

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public String getObsvenda() {
        return obsvenda;
    }

    public void setObsvenda(String obsvenda) {
        this.obsvenda = obsvenda;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recentregaPK != null ? recentregaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recentrega)) {
            return false;
        }
        Recentrega other = (Recentrega) object;
        if ((this.recentregaPK == null && other.recentregaPK != null) || (this.recentregaPK != null && !this.recentregaPK.equals(other.recentregaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Recentrega[ recentregaPK=" + recentregaPK + " ]";
    }
    
}
