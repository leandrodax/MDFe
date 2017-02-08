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
public class Titulor implements Serializable {
    private static final long serialVersionUID = 1L;
    
    protected TitulorPK titulorPK;
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
    
    private Date dtpagtit;
    private Character sttit;
    private Character tporigem;
    private Double vlduptit;
    private Double vlabatit;
    private Double vlpagtit;
    private Double vldesctit;
    private Character tpcalcjuros;
    private Double calcjuros;
    private Double vljurtit;
    private Double vldescjur;
    private Character tpcalcmulta;
    private Double calcmulta;
    private Double vlmultatit;
    private Double vldescmul;
    private String obstit;
    private Character stcobr;
    private Integer codcob;
    private String nomcob;
    private Double percomcob;
    private Double vlcomcob;
    
    private Date dtentcob;
    private Integer codusucob;
    private String usuarcob;
    private Character stspc;
    
    private Date dtentspc;
    private Integer codususpc;
    private String usuarspc;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    private Character stjurid;
    private Integer codjur;
    private String nomjur;
    
    private Date dtentjur;
    private Integer codusujur;
    private String usuarjur;
    private Double encarpro;
    private Double encarjur;
    private Integer codplan;
    private Integer codusubol;
    private String usuarbol;
    
    private Date dtimpbol;
    private Integer nrconbol;
    private Integer nrlotbol;
    private Integer codconta;
    private String parcela;
    private Character entrada;
    private Integer codusurem;
    private String usuarrem;
    
    private Date dtimprem;
    private Character entregue;
    private String nrconori;
    private Integer codcontratorenegociacao;

    public Titulor() {
    }

    public Titulor(TitulorPK titulorPK) {
        this.titulorPK = titulorPK;
    }

    public Titulor(String codtit, String codcli) {
        this.titulorPK = new TitulorPK(codtit, codcli);
    }

    public TitulorPK getTitulorPK() {
        return titulorPK;
    }

    public void setTitulorPK(TitulorPK titulorPK) {
        this.titulorPK = titulorPK;
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

    public Date getDtpagtit() {
        return dtpagtit;
    }

    public void setDtpagtit(Date dtpagtit) {
        this.dtpagtit = dtpagtit;
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

    public Double getVldescjur() {
        return vldescjur;
    }

    public void setVldescjur(Double vldescjur) {
        this.vldescjur = vldescjur;
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

    public Double getVldescmul() {
        return vldescmul;
    }

    public void setVldescmul(Double vldescmul) {
        this.vldescmul = vldescmul;
    }

    public String getObstit() {
        return obstit;
    }

    public void setObstit(String obstit) {
        this.obstit = obstit;
    }

    public Character getStcobr() {
        return stcobr;
    }

    public void setStcobr(Character stcobr) {
        this.stcobr = stcobr;
    }

    public Integer getCodcob() {
        return codcob;
    }

    public void setCodcob(Integer codcob) {
        this.codcob = codcob;
    }

    public String getNomcob() {
        return nomcob;
    }

    public void setNomcob(String nomcob) {
        this.nomcob = nomcob;
    }

    public Double getPercomcob() {
        return percomcob;
    }

    public void setPercomcob(Double percomcob) {
        this.percomcob = percomcob;
    }

    public Double getVlcomcob() {
        return vlcomcob;
    }

    public void setVlcomcob(Double vlcomcob) {
        this.vlcomcob = vlcomcob;
    }

    public Date getDtentcob() {
        return dtentcob;
    }

    public void setDtentcob(Date dtentcob) {
        this.dtentcob = dtentcob;
    }

    public Integer getCodusucob() {
        return codusucob;
    }

    public void setCodusucob(Integer codusucob) {
        this.codusucob = codusucob;
    }

    public String getUsuarcob() {
        return usuarcob;
    }

    public void setUsuarcob(String usuarcob) {
        this.usuarcob = usuarcob;
    }

    public Character getStspc() {
        return stspc;
    }

    public void setStspc(Character stspc) {
        this.stspc = stspc;
    }

    public Date getDtentspc() {
        return dtentspc;
    }

    public void setDtentspc(Date dtentspc) {
        this.dtentspc = dtentspc;
    }

    public Integer getCodususpc() {
        return codususpc;
    }

    public void setCodususpc(Integer codususpc) {
        this.codususpc = codususpc;
    }

    public String getUsuarspc() {
        return usuarspc;
    }

    public void setUsuarspc(String usuarspc) {
        this.usuarspc = usuarspc;
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

    public Character getStjurid() {
        return stjurid;
    }

    public void setStjurid(Character stjurid) {
        this.stjurid = stjurid;
    }

    public Integer getCodjur() {
        return codjur;
    }

    public void setCodjur(Integer codjur) {
        this.codjur = codjur;
    }

    public String getNomjur() {
        return nomjur;
    }

    public void setNomjur(String nomjur) {
        this.nomjur = nomjur;
    }

    public Date getDtentjur() {
        return dtentjur;
    }

    public void setDtentjur(Date dtentjur) {
        this.dtentjur = dtentjur;
    }

    public Integer getCodusujur() {
        return codusujur;
    }

    public void setCodusujur(Integer codusujur) {
        this.codusujur = codusujur;
    }

    public String getUsuarjur() {
        return usuarjur;
    }

    public void setUsuarjur(String usuarjur) {
        this.usuarjur = usuarjur;
    }

    public Double getEncarpro() {
        return encarpro;
    }

    public void setEncarpro(Double encarpro) {
        this.encarpro = encarpro;
    }

    public Double getEncarjur() {
        return encarjur;
    }

    public void setEncarjur(Double encarjur) {
        this.encarjur = encarjur;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public Integer getCodusubol() {
        return codusubol;
    }

    public void setCodusubol(Integer codusubol) {
        this.codusubol = codusubol;
    }

    public String getUsuarbol() {
        return usuarbol;
    }

    public void setUsuarbol(String usuarbol) {
        this.usuarbol = usuarbol;
    }

    public Date getDtimpbol() {
        return dtimpbol;
    }

    public void setDtimpbol(Date dtimpbol) {
        this.dtimpbol = dtimpbol;
    }

    public Integer getNrconbol() {
        return nrconbol;
    }

    public void setNrconbol(Integer nrconbol) {
        this.nrconbol = nrconbol;
    }

    public Integer getNrlotbol() {
        return nrlotbol;
    }

    public void setNrlotbol(Integer nrlotbol) {
        this.nrlotbol = nrlotbol;
    }

    public Integer getCodconta() {
        return codconta;
    }

    public void setCodconta(Integer codconta) {
        this.codconta = codconta;
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

    public Integer getCodusurem() {
        return codusurem;
    }

    public void setCodusurem(Integer codusurem) {
        this.codusurem = codusurem;
    }

    public String getUsuarrem() {
        return usuarrem;
    }

    public void setUsuarrem(String usuarrem) {
        this.usuarrem = usuarrem;
    }

    public Date getDtimprem() {
        return dtimprem;
    }

    public void setDtimprem(Date dtimprem) {
        this.dtimprem = dtimprem;
    }

    public Character getEntregue() {
        return entregue;
    }

    public void setEntregue(Character entregue) {
        this.entregue = entregue;
    }

    public String getNrconori() {
        return nrconori;
    }

    public void setNrconori(String nrconori) {
        this.nrconori = nrconori;
    }

    public Integer getCodcontratorenegociacao() {
        return codcontratorenegociacao;
    }

    public void setCodcontratorenegociacao(Integer codcontratorenegociacao) {
        this.codcontratorenegociacao = codcontratorenegociacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (titulorPK != null ? titulorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Titulor)) {
            return false;
        }
        Titulor other = (Titulor) object;
        if ((this.titulorPK == null && other.titulorPK != null) || (this.titulorPK != null && !this.titulorPK.equals(other.titulorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Titulor[ titulorPK=" + titulorPK + " ]";
    }
    
}
