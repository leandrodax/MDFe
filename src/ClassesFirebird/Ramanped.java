/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Ramanped {
    
    private static final long serialVersionUID = 1L;
    private Integer nrromaneio;
    private Integer quantnotas;
    private Integer quantitens;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double quantpecas;
    private Double pesoliqui;
    private Double pesobruto;
    private Double totcusto;
    private Double totgeral;
    private Double totfrete;
    private Integer codusu;
    private String nomusu;
    private Date dataent;

    public Ramanped() {
    }

    public Ramanped(Integer nrromaneio) {
        this.nrromaneio = nrromaneio;
    }

    public Integer getNrromaneio() {
        return nrromaneio;
    }

    public void setNrromaneio(Integer nrromaneio) {
        this.nrromaneio = nrromaneio;
    }

    public Integer getQuantnotas() {
        return quantnotas;
    }

    public void setQuantnotas(Integer quantnotas) {
        this.quantnotas = quantnotas;
    }

    public Integer getQuantitens() {
        return quantitens;
    }

    public void setQuantitens(Integer quantitens) {
        this.quantitens = quantitens;
    }

    public Double getQuantpecas() {
        return quantpecas;
    }

    public void setQuantpecas(Double quantpecas) {
        this.quantpecas = quantpecas;
    }

    public Double getPesoliqui() {
        return pesoliqui;
    }

    public void setPesoliqui(Double pesoliqui) {
        this.pesoliqui = pesoliqui;
    }

    public Double getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(Double pesobruto) {
        this.pesobruto = pesobruto;
    }

    public Double getTotcusto() {
        return totcusto;
    }

    public void setTotcusto(Double totcusto) {
        this.totcusto = totcusto;
    }

    public Double getTotgeral() {
        return totgeral;
    }

    public void setTotgeral(Double totgeral) {
        this.totgeral = totgeral;
    }

    public Double getTotfrete() {
        return totfrete;
    }

    public void setTotfrete(Double totfrete) {
        this.totfrete = totfrete;
    }

    public Integer getCodusu() {
        return codusu;
    }

    public void setCodusu(Integer codusu) {
        this.codusu = codusu;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public Date getDataent() {
        return dataent;
    }

    public void setDataent(Date dataent) {
        this.dataent = dataent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrromaneio != null ? nrromaneio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ramanped)) {
            return false;
        }
        Ramanped other = (Ramanped) object;
        if ((this.nrromaneio == null && other.nrromaneio != null) || (this.nrromaneio != null && !this.nrromaneio.equals(other.nrromaneio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Ramanped[ nrromaneio=" + nrromaneio + " ]";
    }
    
}
