/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;




public class Saidanotav  {
    
    private static final long serialVersionUID = 1L;
    protected SaidanotavPK saidanotavPK;
    private String nrabert;
    private Integer codfil;
    private String codcli;
    private String nomcli;
    private Character entregar;
    private String endentrega;
    private String cidentrega;
    private String baientrega;
    private String estentrega;
    private String refentrega;
    private String foneentrega;
    private String cpfcnpj;
    private String rgie;
    private Integer codven;
    private String nomven;
    private Short codprof;
    private String nomprof;
    private Integer codusu;
    private String usuario;
    private Date dtemissao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percdesc;
    private Double vldescnot;
    private Double totcusto;
    private Double totnota;
    private Double totgeral;
    private Integer nrcaixa;
    private Integer codplan;
    private String descplan;
    private Character especie;
    private Character serie;
    private String nrfiscal;
    private Character situacao;
    private Date dthrlanc;
    private String obsvenda;
    private Integer codrota;
    private String nomrota;
    private Integer codveic;
    private String marca;
    private String modelo;
    private String placa;
    private Short ordemvis;
    private Short ordemrot;
    private Character entregue;
    
    private Saidaveic saidaveic;

    public Saidanotav() {
    }

    public Saidanotav(SaidanotavPK saidanotavPK) {
        this.saidanotavPK = saidanotavPK;
    }

    public Saidanotav(String nrcontr, String nrcontrv) {
        this.saidanotavPK = new SaidanotavPK(nrcontr, nrcontrv);
    }

    public SaidanotavPK getSaidanotavPK() {
        return saidanotavPK;
    }

    public void setSaidanotavPK(SaidanotavPK saidanotavPK) {
        this.saidanotavPK = saidanotavPK;
    }

    public String getNrabert() {
        return nrabert;
    }

    public void setNrabert(String nrabert) {
        this.nrabert = nrabert;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
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

    public Character getEntregar() {
        return entregar;
    }

    public void setEntregar(Character entregar) {
        this.entregar = entregar;
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

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getRgie() {
        return rgie;
    }

    public void setRgie(String rgie) {
        this.rgie = rgie;
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

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Double getPercdesc() {
        return percdesc;
    }

    public void setPercdesc(Double percdesc) {
        this.percdesc = percdesc;
    }

    public Double getVldescnot() {
        return vldescnot;
    }

    public void setVldescnot(Double vldescnot) {
        this.vldescnot = vldescnot;
    }

    public Double getTotcusto() {
        return totcusto;
    }

    public void setTotcusto(Double totcusto) {
        this.totcusto = totcusto;
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

    public Character getEspecie() {
        return especie;
    }

    public void setEspecie(Character especie) {
        this.especie = especie;
    }

    public Character getSerie() {
        return serie;
    }

    public void setSerie(Character serie) {
        this.serie = serie;
    }

    public String getNrfiscal() {
        return nrfiscal;
    }

    public void setNrfiscal(String nrfiscal) {
        this.nrfiscal = nrfiscal;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Date getDthrlanc() {
        return dthrlanc;
    }

    public void setDthrlanc(Date dthrlanc) {
        this.dthrlanc = dthrlanc;
    }

    public String getObsvenda() {
        return obsvenda;
    }

    public void setObsvenda(String obsvenda) {
        this.obsvenda = obsvenda;
    }

    public Integer getCodrota() {
        return codrota;
    }

    public void setCodrota(Integer codrota) {
        this.codrota = codrota;
    }

    public String getNomrota() {
        return nomrota;
    }

    public void setNomrota(String nomrota) {
        this.nomrota = nomrota;
    }

    public Integer getCodveic() {
        return codveic;
    }

    public void setCodveic(Integer codveic) {
        this.codveic = codveic;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Short getOrdemvis() {
        return ordemvis;
    }

    public void setOrdemvis(Short ordemvis) {
        this.ordemvis = ordemvis;
    }

    public Short getOrdemrot() {
        return ordemrot;
    }

    public void setOrdemrot(Short ordemrot) {
        this.ordemrot = ordemrot;
    }

    public Character getEntregue() {
        return entregue;
    }

    public void setEntregue(Character entregue) {
        this.entregue = entregue;
    }

    public Saidaveic getSaidaveic() {
        return saidaveic;
    }

    public void setSaidaveic(Saidaveic saidaveic) {
        this.saidaveic = saidaveic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saidanotavPK != null ? saidanotavPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saidanotav)) {
            return false;
        }
        Saidanotav other = (Saidanotav) object;
        if ((this.saidanotavPK == null && other.saidanotavPK != null) || (this.saidanotavPK != null && !this.saidanotavPK.equals(other.saidanotavPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Saidanotav[ saidanotavPK=" + saidanotavPK + " ]";
    }
    
}
