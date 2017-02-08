/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movialtp {
    private static final long serialVersionUID = 1L;
    private Integer nrcont;
    private String codtit;
    private Integer codfor;
    private String nrnota;
    private String nomfor;
    private Integer codpag;
    private Integer codfil;
    private Date dtemitit;
    private Date dtventit;
    private Date dtpagtit;
    private Date dtmovtit;
    private Character sttit;
    private Character tporigem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlduptit;
    private Double vlabatit;
    private Double vlpagtit;
    private Double vldesctit;
    private Character tpcalcjuros;
    private Double calcjuros;
    private Double vljurtit;
    private Character tpcalcmulta;
    private Double calcmulta;
    private Double vlmultatit;
    private String obstit;
    private String obstit2;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String banco;
    private String agen;
    private String conta;
    private String numch;
    private String codtitold;
    private Integer codforold;
    private Double vloutenc;
    private Integer codplan;

    public Movialtp() {
    }

    public Movialtp(Integer nrcont) {
        this.nrcont = nrcont;
    }

    public Integer getNrcont() {
        return nrcont;
    }

    public void setNrcont(Integer nrcont) {
        this.nrcont = nrcont;
    }

    public String getCodtit() {
        return codtit;
    }

    public void setCodtit(String codtit) {
        this.codtit = codtit;
    }

    public Integer getCodfor() {
        return codfor;
    }

    public void setCodfor(Integer codfor) {
        this.codfor = codfor;
    }

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public String getNomfor() {
        return nomfor;
    }

    public void setNomfor(String nomfor) {
        this.nomfor = nomfor;
    }

    public Integer getCodpag() {
        return codpag;
    }

    public void setCodpag(Integer codpag) {
        this.codpag = codpag;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public Date getDtemitit() {
        return dtemitit;
    }

    public void setDtemitit(Date dtemitit) {
        this.dtemitit = dtemitit;
    }

    public Date getDtventit() {
        return dtventit;
    }

    public void setDtventit(Date dtventit) {
        this.dtventit = dtventit;
    }

    public Date getDtpagtit() {
        return dtpagtit;
    }

    public void setDtpagtit(Date dtpagtit) {
        this.dtpagtit = dtpagtit;
    }

    public Date getDtmovtit() {
        return dtmovtit;
    }

    public void setDtmovtit(Date dtmovtit) {
        this.dtmovtit = dtmovtit;
    }

    public Character getSttit() {
        return sttit;
    }

    public void setSttit(Character sttit) {
        this.sttit = sttit;
    }

    public Character getTporigem() {
        return tporigem;
    }

    public void setTporigem(Character tporigem) {
        this.tporigem = tporigem;
    }

    public Double getVlduptit() {
        return vlduptit;
    }

    public void setVlduptit(Double vlduptit) {
        this.vlduptit = vlduptit;
    }

    public Double getVlabatit() {
        return vlabatit;
    }

    public void setVlabatit(Double vlabatit) {
        this.vlabatit = vlabatit;
    }

    public Double getVlpagtit() {
        return vlpagtit;
    }

    public void setVlpagtit(Double vlpagtit) {
        this.vlpagtit = vlpagtit;
    }

    public Double getVldesctit() {
        return vldesctit;
    }

    public void setVldesctit(Double vldesctit) {
        this.vldesctit = vldesctit;
    }

    public Character getTpcalcjuros() {
        return tpcalcjuros;
    }

    public void setTpcalcjuros(Character tpcalcjuros) {
        this.tpcalcjuros = tpcalcjuros;
    }

    public Double getCalcjuros() {
        return calcjuros;
    }

    public void setCalcjuros(Double calcjuros) {
        this.calcjuros = calcjuros;
    }

    public Double getVljurtit() {
        return vljurtit;
    }

    public void setVljurtit(Double vljurtit) {
        this.vljurtit = vljurtit;
    }

    public Character getTpcalcmulta() {
        return tpcalcmulta;
    }

    public void setTpcalcmulta(Character tpcalcmulta) {
        this.tpcalcmulta = tpcalcmulta;
    }

    public Double getCalcmulta() {
        return calcmulta;
    }

    public void setCalcmulta(Double calcmulta) {
        this.calcmulta = calcmulta;
    }

    public Double getVlmultatit() {
        return vlmultatit;
    }

    public void setVlmultatit(Double vlmultatit) {
        this.vlmultatit = vlmultatit;
    }

    public String getObstit() {
        return obstit;
    }

    public void setObstit(String obstit) {
        this.obstit = obstit;
    }

    public String getObstit2() {
        return obstit2;
    }

    public void setObstit2(String obstit2) {
        this.obstit2 = obstit2;
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

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgen() {
        return agen;
    }

    public void setAgen(String agen) {
        this.agen = agen;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNumch() {
        return numch;
    }

    public void setNumch(String numch) {
        this.numch = numch;
    }

    public String getCodtitold() {
        return codtitold;
    }

    public void setCodtitold(String codtitold) {
        this.codtitold = codtitold;
    }

    public Integer getCodforold() {
        return codforold;
    }

    public void setCodforold(Integer codforold) {
        this.codforold = codforold;
    }

    public Double getVloutenc() {
        return vloutenc;
    }

    public void setVloutenc(Double vloutenc) {
        this.vloutenc = vloutenc;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrcont != null ? nrcont.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movialtp)) {
            return false;
        }
        Movialtp other = (Movialtp) object;
        if ((this.nrcont == null && other.nrcont != null) || (this.nrcont != null && !this.nrcont.equals(other.nrcont))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movialtp[ nrcont=" + nrcont + " ]";
    }
    
}
