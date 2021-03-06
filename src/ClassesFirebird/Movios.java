/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movios {
    private static final long serialVersionUID = 1L;
    private Integer codos;
    private int codobj;
    private String codcli;
    private Date dtaberto;
    private Date dtlaboratorio;
    private Date dtbaixa;
    private Date praso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double orcamento;
    private String identificador;
    private String numlacre;
    private String ocorrencia;
    private String obsequipamento;
    private String solucao;
    private String motivoespera;
    private Character situacao;
    private Integer codfil;
    private String modalidade;
    private String tipoatend;
    private String horaatend;
    private Character tipoos;
    private String nomcli;
    private String cgc;
    private String fancli;
    private String endcli;
    private String baicli;
    private String cidade;
    private String uf;
    private String descrobj;
    private String marcaobj;
    private String modelobj;
    private String serieobj;
    private String cor;
    private String obserobj;
    private String hokm;
    private String seguradora;
    private Character geroupedido;
    private Date dtcompra;
    private String nrnfcompra;
    private String pontoref;
    private String nrendcli;
    private String fone1;
    private String fone2;
    private String cep;
    private Integer nrped;
    private Integer rgcodusu;
    private Date rgdata;
    private Character rgevento;
    private String rgusuario;
    private String rgusuariofecha;
    private String rgusuarioreabre;
    private String rgusuariocancelou;
    private Integer codven;
    private String revendedor;
    private String voltagem;
    private Integer codmarca;
    private Integer codmodelo;
    private String chassi;
    private Integer codstatusos;
    private Integer coddefeitoos;
    private String nomdefeitoos;
    private Integer codproforc;
    private Integer codproffim;
    private Character impressao;
    private Date dtautorizacaoorcamento;
    private String respautorizacaoorcamento;
    private String fabricante;
    private String motor;
    private String ano;
    private Double franquiaseguro;
    private Integer codseguradora;
    private Character tiposeguroos;
    private String statuspadrao;

    public Movios() {
    }

    public Movios(Integer codos) {
        this.codos = codos;
    }

    public Movios(Integer codos, int codobj, String codcli) {
        this.codos = codos;
        this.codobj = codobj;
        this.codcli = codcli;
    }

    public Integer getCodos() {
        return codos;
    }

    public void setCodos(Integer codos) {
        this.codos = codos;
    }

    public int getCodobj() {
        return codobj;
    }

    public void setCodobj(int codobj) {
        this.codobj = codobj;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public Date getDtaberto() {
        return dtaberto;
    }

    public void setDtaberto(Date dtaberto) {
        this.dtaberto = dtaberto;
    }

    public Date getDtlaboratorio() {
        return dtlaboratorio;
    }

    public void setDtlaboratorio(Date dtlaboratorio) {
        this.dtlaboratorio = dtlaboratorio;
    }

    public Date getDtbaixa() {
        return dtbaixa;
    }

    public void setDtbaixa(Date dtbaixa) {
        this.dtbaixa = dtbaixa;
    }

    public Date getPraso() {
        return praso;
    }

    public void setPraso(Date praso) {
        this.praso = praso;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNumlacre() {
        return numlacre;
    }

    public void setNumlacre(String numlacre) {
        this.numlacre = numlacre;
    }

    public String getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(String ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getObsequipamento() {
        return obsequipamento;
    }

    public void setObsequipamento(String obsequipamento) {
        this.obsequipamento = obsequipamento;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public String getMotivoespera() {
        return motivoespera;
    }

    public void setMotivoespera(String motivoespera) {
        this.motivoespera = motivoespera;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getTipoatend() {
        return tipoatend;
    }

    public void setTipoatend(String tipoatend) {
        this.tipoatend = tipoatend;
    }

    public String getHoraatend() {
        return horaatend;
    }

    public void setHoraatend(String horaatend) {
        this.horaatend = horaatend;
    }

    public Character getTipoos() {
        return tipoos;
    }

    public void setTipoos(Character tipoos) {
        this.tipoos = tipoos;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getCgc() {
        return cgc;
    }

    public void setCgc(String cgc) {
        this.cgc = cgc;
    }

    public String getFancli() {
        return fancli;
    }

    public void setFancli(String fancli) {
        this.fancli = fancli;
    }

    public String getEndcli() {
        return endcli;
    }

    public void setEndcli(String endcli) {
        this.endcli = endcli;
    }

    public String getBaicli() {
        return baicli;
    }

    public void setBaicli(String baicli) {
        this.baicli = baicli;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getDescrobj() {
        return descrobj;
    }

    public void setDescrobj(String descrobj) {
        this.descrobj = descrobj;
    }

    public String getMarcaobj() {
        return marcaobj;
    }

    public void setMarcaobj(String marcaobj) {
        this.marcaobj = marcaobj;
    }

    public String getModelobj() {
        return modelobj;
    }

    public void setModelobj(String modelobj) {
        this.modelobj = modelobj;
    }

    public String getSerieobj() {
        return serieobj;
    }

    public void setSerieobj(String serieobj) {
        this.serieobj = serieobj;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getObserobj() {
        return obserobj;
    }

    public void setObserobj(String obserobj) {
        this.obserobj = obserobj;
    }

    public String getHokm() {
        return hokm;
    }

    public void setHokm(String hokm) {
        this.hokm = hokm;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public Character getGeroupedido() {
        return geroupedido;
    }

    public void setGeroupedido(Character geroupedido) {
        this.geroupedido = geroupedido;
    }

    public Date getDtcompra() {
        return dtcompra;
    }

    public void setDtcompra(Date dtcompra) {
        this.dtcompra = dtcompra;
    }

    public String getNrnfcompra() {
        return nrnfcompra;
    }

    public void setNrnfcompra(String nrnfcompra) {
        this.nrnfcompra = nrnfcompra;
    }

    public String getPontoref() {
        return pontoref;
    }

    public void setPontoref(String pontoref) {
        this.pontoref = pontoref;
    }

    public String getNrendcli() {
        return nrendcli;
    }

    public void setNrendcli(String nrendcli) {
        this.nrendcli = nrendcli;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNrped() {
        return nrped;
    }

    public void setNrped(Integer nrped) {
        this.nrped = nrped;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
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

    public String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public String getRgusuariofecha() {
        return rgusuariofecha;
    }

    public void setRgusuariofecha(String rgusuariofecha) {
        this.rgusuariofecha = rgusuariofecha;
    }

    public String getRgusuarioreabre() {
        return rgusuarioreabre;
    }

    public void setRgusuarioreabre(String rgusuarioreabre) {
        this.rgusuarioreabre = rgusuarioreabre;
    }

    public String getRgusuariocancelou() {
        return rgusuariocancelou;
    }

    public void setRgusuariocancelou(String rgusuariocancelou) {
        this.rgusuariocancelou = rgusuariocancelou;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public String getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(String revendedor) {
        this.revendedor = revendedor;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public Integer getCodmarca() {
        return codmarca;
    }

    public void setCodmarca(Integer codmarca) {
        this.codmarca = codmarca;
    }

    public Integer getCodmodelo() {
        return codmodelo;
    }

    public void setCodmodelo(Integer codmodelo) {
        this.codmodelo = codmodelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Integer getCodstatusos() {
        return codstatusos;
    }

    public void setCodstatusos(Integer codstatusos) {
        this.codstatusos = codstatusos;
    }

    public Integer getCoddefeitoos() {
        return coddefeitoos;
    }

    public void setCoddefeitoos(Integer coddefeitoos) {
        this.coddefeitoos = coddefeitoos;
    }

    public String getNomdefeitoos() {
        return nomdefeitoos;
    }

    public void setNomdefeitoos(String nomdefeitoos) {
        this.nomdefeitoos = nomdefeitoos;
    }

    public Integer getCodproforc() {
        return codproforc;
    }

    public void setCodproforc(Integer codproforc) {
        this.codproforc = codproforc;
    }

    public Integer getCodproffim() {
        return codproffim;
    }

    public void setCodproffim(Integer codproffim) {
        this.codproffim = codproffim;
    }

    public Character getImpressao() {
        return impressao;
    }

    public void setImpressao(Character impressao) {
        this.impressao = impressao;
    }

    public Date getDtautorizacaoorcamento() {
        return dtautorizacaoorcamento;
    }

    public void setDtautorizacaoorcamento(Date dtautorizacaoorcamento) {
        this.dtautorizacaoorcamento = dtautorizacaoorcamento;
    }

    public String getRespautorizacaoorcamento() {
        return respautorizacaoorcamento;
    }

    public void setRespautorizacaoorcamento(String respautorizacaoorcamento) {
        this.respautorizacaoorcamento = respautorizacaoorcamento;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getFranquiaseguro() {
        return franquiaseguro;
    }

    public void setFranquiaseguro(Double franquiaseguro) {
        this.franquiaseguro = franquiaseguro;
    }

    public Integer getCodseguradora() {
        return codseguradora;
    }

    public void setCodseguradora(Integer codseguradora) {
        this.codseguradora = codseguradora;
    }

    public Character getTiposeguroos() {
        return tiposeguroos;
    }

    public void setTiposeguroos(Character tiposeguroos) {
        this.tiposeguroos = tiposeguroos;
    }

    public String getStatuspadrao() {
        return statuspadrao;
    }

    public void setStatuspadrao(String statuspadrao) {
        this.statuspadrao = statuspadrao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codos != null ? codos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movios)) {
            return false;
        }
        Movios other = (Movios) object;
        if ((this.codos == null && other.codos != null) || (this.codos != null && !this.codos.equals(other.codos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movios[ codos=" + codos + " ]";
    }
    
}
