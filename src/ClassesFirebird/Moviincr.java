/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Moviincr {
    
    private static final long serialVersionUID = 1L;
    private Integer nrcont;
    private String codtit;
    private String codcli;
    private String nrnota;
    private String nomcli;
    private Integer codven;
    private String nomven;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percomven;
    private Double vlcomven;
    private Integer codrec;
    private Integer codfil;
    private Date dtemitit;
    private Date dtventit;
    private Character sttit;
    private Character tporigem;
    private Double vlduptit;
    private Character tpcalcjuros;
    private Double calcjuros;
    private Character tpcalcmulta;
    private Double calcmulta;
    private String obstit;
    private Integer rgcodusu;
    private String rgusuario;
    private Character tpentsai;
    private Date dtentsai;
    private String nrabert;
    private Integer cdlocal;
    private Integer chaveserv;
    private Integer nrcaixa;
    private String nrlote;
    private Integer codplan;
    private String parcela;
    private Character entrada;

    public Moviincr() {
    }

    public Moviincr(Integer nrcont) {
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

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
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

    public Double getPercomven() {
        return percomven;
    }

    public void setPercomven(Double percomven) {
        this.percomven = percomven;
    }

    public Double getVlcomven() {
        return vlcomven;
    }

    public void setVlcomven(Double vlcomven) {
        this.vlcomven = vlcomven;
    }

    public Integer getCodrec() {
        return codrec;
    }

    public void setCodrec(Integer codrec) {
        this.codrec = codrec;
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

    public String getObstit() {
        return obstit;
    }

    public void setObstit(String obstit) {
        this.obstit = obstit;
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

    public Character getTpentsai() {
        return tpentsai;
    }

    public void setTpentsai(Character tpentsai) {
        this.tpentsai = tpentsai;
    }

    public Date getDtentsai() {
        return dtentsai;
    }

    public void setDtentsai(Date dtentsai) {
        this.dtentsai = dtentsai;
    }

    public String getNrabert() {
        return nrabert;
    }

    public void setNrabert(String nrabert) {
        this.nrabert = nrabert;
    }

    public Integer getCdlocal() {
        return cdlocal;
    }

    public void setCdlocal(Integer cdlocal) {
        this.cdlocal = cdlocal;
    }

    public Integer getChaveserv() {
        return chaveserv;
    }

    public void setChaveserv(Integer chaveserv) {
        this.chaveserv = chaveserv;
    }

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public String getNrlote() {
        return nrlote;
    }

    public void setNrlote(String nrlote) {
        this.nrlote = nrlote;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public Character getEntrada() {
        return entrada;
    }

    public void setEntrada(Character entrada) {
        this.entrada = entrada;
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
        if (!(object instanceof Moviincr)) {
            return false;
        }
        Moviincr other = (Moviincr) object;
        if ((this.nrcont == null && other.nrcont != null) || (this.nrcont != null && !this.nrcont.equals(other.nrcont))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Moviincr[ nrcont=" + nrcont + " ]";
    }
    
}
