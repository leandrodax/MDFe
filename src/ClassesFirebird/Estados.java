/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class Estados {
    private static final long serialVersionUID = 1L;
    private String sigla;
    private short codigo;
    private String nome;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double acicms;
    private Double alicms;
    private Double amicms;
    private Double apicms;
    private Double baicms;
    private Double ceicms;
    private Double dficms;
    private Double esicms;
    private Double goicms;
    private Double maicms;
    private Double mticms;
    private Double msicms;
    private Double mgicms;
    private Double paicms;
    private Double pbicms;
    private Double pricms;
    private Double peicms;
    private Double piicms;
    private Double rnicms;
    private Double rsicms;
    private Double rjicms;
    private Double roicms;
    private Double rricms;
    private Double scicms;
    private Double spicms;
    private Double seicms;
    private Double toicms;

    public Estados() {
    }

    public Estados(String sigla) {
        this.sigla = sigla;
    }

    public Estados(String sigla, short codigo, String nome) {
        this.sigla = sigla;
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAcicms() {
        return acicms;
    }

    public void setAcicms(Double acicms) {
        this.acicms = acicms;
    }

    public Double getAlicms() {
        return alicms;
    }

    public void setAlicms(Double alicms) {
        this.alicms = alicms;
    }

    public Double getAmicms() {
        return amicms;
    }

    public void setAmicms(Double amicms) {
        this.amicms = amicms;
    }

    public Double getApicms() {
        return apicms;
    }

    public void setApicms(Double apicms) {
        this.apicms = apicms;
    }

    public Double getBaicms() {
        return baicms;
    }

    public void setBaicms(Double baicms) {
        this.baicms = baicms;
    }

    public Double getCeicms() {
        return ceicms;
    }

    public void setCeicms(Double ceicms) {
        this.ceicms = ceicms;
    }

    public Double getDficms() {
        return dficms;
    }

    public void setDficms(Double dficms) {
        this.dficms = dficms;
    }

    public Double getEsicms() {
        return esicms;
    }

    public void setEsicms(Double esicms) {
        this.esicms = esicms;
    }

    public Double getGoicms() {
        return goicms;
    }

    public void setGoicms(Double goicms) {
        this.goicms = goicms;
    }

    public Double getMaicms() {
        return maicms;
    }

    public void setMaicms(Double maicms) {
        this.maicms = maicms;
    }

    public Double getMticms() {
        return mticms;
    }

    public void setMticms(Double mticms) {
        this.mticms = mticms;
    }

    public Double getMsicms() {
        return msicms;
    }

    public void setMsicms(Double msicms) {
        this.msicms = msicms;
    }

    public Double getMgicms() {
        return mgicms;
    }

    public void setMgicms(Double mgicms) {
        this.mgicms = mgicms;
    }

    public Double getPaicms() {
        return paicms;
    }

    public void setPaicms(Double paicms) {
        this.paicms = paicms;
    }

    public Double getPbicms() {
        return pbicms;
    }

    public void setPbicms(Double pbicms) {
        this.pbicms = pbicms;
    }

    public Double getPricms() {
        return pricms;
    }

    public void setPricms(Double pricms) {
        this.pricms = pricms;
    }

    public Double getPeicms() {
        return peicms;
    }

    public void setPeicms(Double peicms) {
        this.peicms = peicms;
    }

    public Double getPiicms() {
        return piicms;
    }

    public void setPiicms(Double piicms) {
        this.piicms = piicms;
    }

    public Double getRnicms() {
        return rnicms;
    }

    public void setRnicms(Double rnicms) {
        this.rnicms = rnicms;
    }

    public Double getRsicms() {
        return rsicms;
    }

    public void setRsicms(Double rsicms) {
        this.rsicms = rsicms;
    }

    public Double getRjicms() {
        return rjicms;
    }

    public void setRjicms(Double rjicms) {
        this.rjicms = rjicms;
    }

    public Double getRoicms() {
        return roicms;
    }

    public void setRoicms(Double roicms) {
        this.roicms = roicms;
    }

    public Double getRricms() {
        return rricms;
    }

    public void setRricms(Double rricms) {
        this.rricms = rricms;
    }

    public Double getScicms() {
        return scicms;
    }

    public void setScicms(Double scicms) {
        this.scicms = scicms;
    }

    public Double getSpicms() {
        return spicms;
    }

    public void setSpicms(Double spicms) {
        this.spicms = spicms;
    }

    public Double getSeicms() {
        return seicms;
    }

    public void setSeicms(Double seicms) {
        this.seicms = seicms;
    }

    public Double getToicms() {
        return toicms;
    }

    public void setToicms(Double toicms) {
        this.toicms = toicms;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sigla != null ? sigla.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estados)) {
            return false;
        }
        Estados other = (Estados) object;
        if ((this.sigla == null && other.sigla != null) || (this.sigla != null && !this.sigla.equals(other.sigla))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Estados[ sigla=" + sigla + " ]";
    }
    
}
