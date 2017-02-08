/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notaped {
    
    private static final long serialVersionUID = 1L;
    private Integer nrped;
    private Integer codfil;
    private String nomcli;
    private Date dtemissao;
    private Character entregar;
    private String endereco;
    private String cidade;
    private String bairro;
    private String estado;
    private String referencia;
    private String fone;
    private String cpfcnpj;
    private Integer codven;
    private String nomven;
    private Short codprof;
    private String nomprof;
    private Integer codusu;
    private String usuario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double totnota;
    private Integer nrcaixa;
    private Integer codplan;
    private String descplan;
    private String nomcomp;
    private Date dthrlanc;
    private Character status;
    private Integer nrcxalt;
    private String obsvenda;
    private String codcli;
    private String rgie;
    private Integer codusdes;
    private String usuardes;
    private Double percauto;
    private Double vlpagdin;
    private Double vltroco;
    private Double percdesc;
    private Double valordesc;
    private Double totalpag;
    private String cep;
    private Date dtagenda;
    private String hragenda;
    private Character tporigem;
    private Integer codforma;
    private String nomforma;
    private Date dtpxvisi;
    private Character tipoped;
    private String nrendcli;
    private String cfops;
    private Character bonifica;
    private Character emissbol;
    private Character emitnfe;
    private Double vlfrete;
    private Double vlseguro;
    private Double outrdesp;
    private Integer nrmesa;
    private Date dthrchega;
    private Date dthrsaida;
    private Character sitimpre;
    private Integer nrpedext;
    private Integer nrromaneio;
    private String nrcontr;
    private String nrabert;
    private Integer nrcxfec;
    private String tppagam;
    private Character especie;
    private String nrfiscal;
    private Character impcupom;
    private String serieecf;
    private String nrcaixaecf;
    private String nrcupecf;
    private Date dtemiecf;
    private Double vltotipi;
    private Double totserv;
    private Double percdesfec;
    private Double vldescfec;
    private Double totgeral;
    private Double vlcartacab;
    private Integer totpontos;
    private Integer codusufec;
    private String nomusufec;
    private Character solfech;
    private Character solcham;

    public Notaped() {
    }

    public Notaped(Integer nrped) {
        this.nrped = nrped;
    }

    public Integer getNrped() {
        return nrped;
    }

    public void setNrped(Integer nrped) {
        this.nrped = nrped;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Character getEntregar() {
        return entregar;
    }

    public void setEntregar(Character entregar) {
        this.entregar = entregar;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
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

    public Short getCodprof() {
        return codprof;
    }

    public void setCodprof(Short codprof) {
        this.codprof = codprof;
    }

    public String getNomprof() {
        return nomprof;
    }

    public void setNomprof(String nomprof) {
        this.nomprof = nomprof;
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

    public Double getTotnota() {
        return totnota;
    }

    public void setTotnota(Double totnota) {
        this.totnota = totnota;
    }

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public String getDescplan() {
        return descplan;
    }

    public void setDescplan(String descplan) {
        this.descplan = descplan;
    }

    public String getNomcomp() {
        return nomcomp;
    }

    public void setNomcomp(String nomcomp) {
        this.nomcomp = nomcomp;
    }

    public Date getDthrlanc() {
        return dthrlanc;
    }

    public void setDthrlanc(Date dthrlanc) {
        this.dthrlanc = dthrlanc;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Integer getNrcxalt() {
        return nrcxalt;
    }

    public void setNrcxalt(Integer nrcxalt) {
        this.nrcxalt = nrcxalt;
    }

    public String getObsvenda() {
        return obsvenda;
    }

    public void setObsvenda(String obsvenda) {
        this.obsvenda = obsvenda;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getRgie() {
        return rgie;
    }

    public void setRgie(String rgie) {
        this.rgie = rgie;
    }

    public Integer getCodusdes() {
        return codusdes;
    }

    public void setCodusdes(Integer codusdes) {
        this.codusdes = codusdes;
    }

    public String getUsuardes() {
        return usuardes;
    }

    public void setUsuardes(String usuardes) {
        this.usuardes = usuardes;
    }

    public Double getPercauto() {
        return percauto;
    }

    public void setPercauto(Double percauto) {
        this.percauto = percauto;
    }

    public Double getVlpagdin() {
        return vlpagdin;
    }

    public void setVlpagdin(Double vlpagdin) {
        this.vlpagdin = vlpagdin;
    }

    public Double getVltroco() {
        return vltroco;
    }

    public void setVltroco(Double vltroco) {
        this.vltroco = vltroco;
    }

    public Double getPercdesc() {
        return percdesc;
    }

    public void setPercdesc(Double percdesc) {
        this.percdesc = percdesc;
    }

    public Double getValordesc() {
        return valordesc;
    }

    public void setValordesc(Double valordesc) {
        this.valordesc = valordesc;
    }

    public Double getTotalpag() {
        return totalpag;
    }

    public void setTotalpag(Double totalpag) {
        this.totalpag = totalpag;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDtagenda() {
        return dtagenda;
    }

    public void setDtagenda(Date dtagenda) {
        this.dtagenda = dtagenda;
    }

    public String getHragenda() {
        return hragenda;
    }

    public void setHragenda(String hragenda) {
        this.hragenda = hragenda;
    }

    public Character getTporigem() {
        return tporigem;
    }

    public void setTporigem(Character tporigem) {
        this.tporigem = tporigem;
    }

    public Integer getCodforma() {
        return codforma;
    }

    public void setCodforma(Integer codforma) {
        this.codforma = codforma;
    }

    public String getNomforma() {
        return nomforma;
    }

    public void setNomforma(String nomforma) {
        this.nomforma = nomforma;
    }

    public Date getDtpxvisi() {
        return dtpxvisi;
    }

    public void setDtpxvisi(Date dtpxvisi) {
        this.dtpxvisi = dtpxvisi;
    }

    public Character getTipoped() {
        return tipoped;
    }

    public void setTipoped(Character tipoped) {
        this.tipoped = tipoped;
    }

    public String getNrendcli() {
        return nrendcli;
    }

    public void setNrendcli(String nrendcli) {
        this.nrendcli = nrendcli;
    }

    public String getCfops() {
        return cfops;
    }

    public void setCfops(String cfops) {
        this.cfops = cfops;
    }

    public Character getBonifica() {
        return bonifica;
    }

    public void setBonifica(Character bonifica) {
        this.bonifica = bonifica;
    }

    public Character getEmissbol() {
        return emissbol;
    }

    public void setEmissbol(Character emissbol) {
        this.emissbol = emissbol;
    }

    public Character getEmitnfe() {
        return emitnfe;
    }

    public void setEmitnfe(Character emitnfe) {
        this.emitnfe = emitnfe;
    }

    public Double getVlfrete() {
        return vlfrete;
    }

    public void setVlfrete(Double vlfrete) {
        this.vlfrete = vlfrete;
    }

    public Double getVlseguro() {
        return vlseguro;
    }

    public void setVlseguro(Double vlseguro) {
        this.vlseguro = vlseguro;
    }

    public Double getOutrdesp() {
        return outrdesp;
    }

    public void setOutrdesp(Double outrdesp) {
        this.outrdesp = outrdesp;
    }

    public Integer getNrmesa() {
        return nrmesa;
    }

    public void setNrmesa(Integer nrmesa) {
        this.nrmesa = nrmesa;
    }

    public Date getDthrchega() {
        return dthrchega;
    }

    public void setDthrchega(Date dthrchega) {
        this.dthrchega = dthrchega;
    }

    public Date getDthrsaida() {
        return dthrsaida;
    }

    public void setDthrsaida(Date dthrsaida) {
        this.dthrsaida = dthrsaida;
    }

    public Character getSitimpre() {
        return sitimpre;
    }

    public void setSitimpre(Character sitimpre) {
        this.sitimpre = sitimpre;
    }

    public Integer getNrpedext() {
        return nrpedext;
    }

    public void setNrpedext(Integer nrpedext) {
        this.nrpedext = nrpedext;
    }

    public Integer getNrromaneio() {
        return nrromaneio;
    }

    public void setNrromaneio(Integer nrromaneio) {
        this.nrromaneio = nrromaneio;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrabert() {
        return nrabert;
    }

    public void setNrabert(String nrabert) {
        this.nrabert = nrabert;
    }

    public Integer getNrcxfec() {
        return nrcxfec;
    }

    public void setNrcxfec(Integer nrcxfec) {
        this.nrcxfec = nrcxfec;
    }

    public String getTppagam() {
        return tppagam;
    }

    public void setTppagam(String tppagam) {
        this.tppagam = tppagam;
    }

    public Character getEspecie() {
        return especie;
    }

    public void setEspecie(Character especie) {
        this.especie = especie;
    }

    public String getNrfiscal() {
        return nrfiscal;
    }

    public void setNrfiscal(String nrfiscal) {
        this.nrfiscal = nrfiscal;
    }

    public Character getImpcupom() {
        return impcupom;
    }

    public void setImpcupom(Character impcupom) {
        this.impcupom = impcupom;
    }

    public String getSerieecf() {
        return serieecf;
    }

    public void setSerieecf(String serieecf) {
        this.serieecf = serieecf;
    }

    public String getNrcaixaecf() {
        return nrcaixaecf;
    }

    public void setNrcaixaecf(String nrcaixaecf) {
        this.nrcaixaecf = nrcaixaecf;
    }

    public String getNrcupecf() {
        return nrcupecf;
    }

    public void setNrcupecf(String nrcupecf) {
        this.nrcupecf = nrcupecf;
    }

    public Date getDtemiecf() {
        return dtemiecf;
    }

    public void setDtemiecf(Date dtemiecf) {
        this.dtemiecf = dtemiecf;
    }

    public Double getVltotipi() {
        return vltotipi;
    }

    public void setVltotipi(Double vltotipi) {
        this.vltotipi = vltotipi;
    }

    public Double getTotserv() {
        return totserv;
    }

    public void setTotserv(Double totserv) {
        this.totserv = totserv;
    }

    public Double getPercdesfec() {
        return percdesfec;
    }

    public void setPercdesfec(Double percdesfec) {
        this.percdesfec = percdesfec;
    }

    public Double getVldescfec() {
        return vldescfec;
    }

    public void setVldescfec(Double vldescfec) {
        this.vldescfec = vldescfec;
    }

    public Double getTotgeral() {
        return totgeral;
    }

    public void setTotgeral(Double totgeral) {
        this.totgeral = totgeral;
    }

    public Double getVlcartacab() {
        return vlcartacab;
    }

    public void setVlcartacab(Double vlcartacab) {
        this.vlcartacab = vlcartacab;
    }

    public Integer getTotpontos() {
        return totpontos;
    }

    public void setTotpontos(Integer totpontos) {
        this.totpontos = totpontos;
    }

    public Integer getCodusufec() {
        return codusufec;
    }

    public void setCodusufec(Integer codusufec) {
        this.codusufec = codusufec;
    }

    public String getNomusufec() {
        return nomusufec;
    }

    public void setNomusufec(String nomusufec) {
        this.nomusufec = nomusufec;
    }

    public Character getSolfech() {
        return solfech;
    }

    public void setSolfech(Character solfech) {
        this.solfech = solfech;
    }

    public Character getSolcham() {
        return solcham;
    }

    public void setSolcham(Character solcham) {
        this.solcham = solcham;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrped != null ? nrped.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notaped)) {
            return false;
        }
        Notaped other = (Notaped) object;
        if ((this.nrped == null && other.nrped != null) || (this.nrped != null && !this.nrped.equals(other.nrped))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notaped[ nrped=" + nrped + " ]";
    }
    
}
