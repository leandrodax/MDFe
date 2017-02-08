/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Saidaveic {

    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private String tpsaida;
    private Integer codfil;
    private Integer codrota;
    private Integer codveic;
    private Integer codmoto;
    private Integer codaju1;
    private Integer codaju2;
    private Integer coddesp;
    private Integer codconf;
    private Date dataemis;
    private Date dthrsaida;
    private Date dthrentra;
    private Integer codusuent;
    private String nomusuent;
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;
    private Date datafin;
    private String situacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double kilomini;
    private Double kilomfim;
    private Double kilocomb;
    private String observ;

    public Saidaveic() {
    }

    public Saidaveic(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getTpsaida() {
        return tpsaida;
    }

    public void setTpsaida(String tpsaida) {
        this.tpsaida = tpsaida;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public Integer getCodrota() {
        return codrota;
    }

    public void setCodrota(Integer codrota) {
        this.codrota = codrota;
    }

    public Integer getCodveic() {
        return codveic;
    }

    public void setCodveic(Integer codveic) {
        this.codveic = codveic;
    }

    public Integer getCodmoto() {
        return codmoto;
    }

    public void setCodmoto(Integer codmoto) {
        this.codmoto = codmoto;
    }

    public Integer getCodaju1() {
        return codaju1;
    }

    public void setCodaju1(Integer codaju1) {
        this.codaju1 = codaju1;
    }

    public Integer getCodaju2() {
        return codaju2;
    }

    public void setCodaju2(Integer codaju2) {
        this.codaju2 = codaju2;
    }

    public Integer getCoddesp() {
        return coddesp;
    }

    public void setCoddesp(Integer coddesp) {
        this.coddesp = coddesp;
    }

    public Integer getCodconf() {
        return codconf;
    }

    public void setCodconf(Integer codconf) {
        this.codconf = codconf;
    }

    public Date getDataemis() {
        return dataemis;
    }

    public void setDataemis(Date dataemis) {
        this.dataemis = dataemis;
    }

    public Date getDthrsaida() {
        return dthrsaida;
    }

    public void setDthrsaida(Date dthrsaida) {
        this.dthrsaida = dthrsaida;
    }

    public Date getDthrentra() {
        return dthrentra;
    }

    public void setDthrentra(Date dthrentra) {
        this.dthrentra = dthrentra;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Double getKilomini() {
        return kilomini;
    }

    public void setKilomini(Double kilomini) {
        this.kilomini = kilomini;
    }

    public Double getKilomfim() {
        return kilomfim;
    }

    public void setKilomfim(Double kilomfim) {
        this.kilomfim = kilomfim;
    }

    public Double getKilocomb() {
        return kilocomb;
    }

    public void setKilocomb(Double kilocomb) {
        this.kilocomb = kilocomb;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }




    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saidaveic)) {
            return false;
        }
        Saidaveic other = (Saidaveic) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Saidaveic[ nrcontr=" + nrcontr + " ]";
    }
    
}
