
package ClassesFirebird;

import java.util.Date;


public class MdfeDados{

    private Integer dadCodigo;
    private String dadNumero;
    private String dadModelo;
    private String dadSerie;
    private Date dadDtemissao;
    private Date dadDtinicio;
    private String dadCodnumerico;
    private String dadDv;
    private String dadUf;
    private String dadTpEmitente;
    private String dadModalidade;
    private String dadFormaEmissao;
    private String dadChave;
    private String dadLocalDescarregamento;
    private String emitCnpj;
    private String emitIe;
    private String emitRazaosoc;
    private String emitFantasia;
    private String emitLogradouro;
    private String emitNr;
    private String emitComp;
    private String emitBairro;
    private String emitCep;
    private String emitPais;
    private String emitUf;
    private String emitCodMun;
    private String emitMun;
    private String emitTel;
    private String emitEmail;
    private String rodRntrc;
    private String rodCiot;
    private String rodCodAgPorto;
    private String rodCodIntVeic;
    private String rodTpCarroceria;
    private String rodPlaca;
    private Double rodTara;
    private String rodRenavam;
    private String rodUf;
    private String rodTpRodado;
    private Double rodCapacidadeKg;
    private Double rodCapacidadeM3;
    private String propietario;
    private String pptNome;
    private String pptCpf;
    private String pptCnpj;
    private String pptRntrc;
    private String pptIe;
    private String pptUf;
    private String aquCnpjAgenciaNav;
    private Integer aquCodIntEmb;
    private String aquCodEmb;
    private String aquCodTpEmb;
    private String aquNomeEmb;
    private String aquNrViagem;
    private String aquCodPortoEmb;
    private String aquCodPortoDes;
    private Integer totQtdCte;
    private Integer totQtdNfe;
    private Integer totQtdNfeMod1;
    private Double totTotMercTransportada;
    private String totUnMedidaPeso;
    private Double totPesoBruto;
    private String infFisco;
    private String infContr;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;

    public MdfeDados() {
    }

    public MdfeDados(Integer dadCodigo) {
        this.dadCodigo = dadCodigo;
    }

    public MdfeDados(Integer dadCodigo, String dadChave) {
        this.dadCodigo = dadCodigo;
        this.dadChave = dadChave;
    }

    public Integer getDadCodigo() {
        return dadCodigo;
    }

    public void setDadCodigo(Integer dadCodigo) {
        this.dadCodigo = dadCodigo;
    }

    public String getDadNumero() {
        return dadNumero;
    }

    public void setDadNumero(String dadNumero) {
        this.dadNumero = dadNumero;
    }

    public String getDadModelo() {
        return dadModelo;
    }

    public void setDadModelo(String dadModelo) {
        this.dadModelo = dadModelo;
    }

    public String getDadSerie() {
        return dadSerie;
    }

    public void setDadSerie(String dadSerie) {
        this.dadSerie = dadSerie;
    }

    public Date getDadDtemissao() {
        return dadDtemissao;
    }

    public void setDadDtemissao(Date dadDtemissao) {
        this.dadDtemissao = dadDtemissao;
    }

    public Date getDadDtinicio() {
        return dadDtinicio;
    }

    public void setDadDtinicio(Date dadDtinicio) {
        this.dadDtinicio = dadDtinicio;
    }

    public String getDadCodnumerico() {
        return dadCodnumerico;
    }

    public void setDadCodnumerico(String dadCodnumerico) {
        this.dadCodnumerico = dadCodnumerico;
    }

    public String getDadDv() {
        return dadDv;
    }

    public void setDadDv(String dadDv) {
        this.dadDv = dadDv;
    }

    public String getDadUf() {
        return dadUf;
    }

    public void setDadUf(String dadUf) {
        this.dadUf = dadUf;
    }

    public String getDadTpEmitente() {
        return dadTpEmitente;
    }

    public void setDadTpEmitente(String dadTpEmitente) {
        this.dadTpEmitente = dadTpEmitente;
    }

    public String getDadModalidade() {
        return dadModalidade;
    }

    public void setDadModalidade(String dadModalidade) {
        this.dadModalidade = dadModalidade;
    }

    public String getDadFormaEmissao() {
        return dadFormaEmissao;
    }

    public void setDadFormaEmissao(String dadFormaEmissao) {
        this.dadFormaEmissao = dadFormaEmissao;
    }

    public String getDadChave() {
        return dadChave;
    }

    public void setDadChave(String dadChave) {
        this.dadChave = dadChave;
    }

    public String getDadLocalDescarregamento() {
        return dadLocalDescarregamento;
    }

    public void setDadLocalDescarregamento(String dadLocalDescarregamento) {
        this.dadLocalDescarregamento = dadLocalDescarregamento;
    }

    public String getEmitCnpj() {
        return emitCnpj;
    }

    public void setEmitCnpj(String emitCnpj) {
        this.emitCnpj = emitCnpj;
    }

    public String getEmitIe() {
        return emitIe;
    }

    public void setEmitIe(String emitIe) {
        this.emitIe = emitIe;
    }

    public String getEmitRazaosoc() {
        return emitRazaosoc;
    }

    public void setEmitRazaosoc(String emitRazaosoc) {
        this.emitRazaosoc = emitRazaosoc;
    }

    public String getEmitFantasia() {
        return emitFantasia;
    }

    public void setEmitFantasia(String emitFantasia) {
        this.emitFantasia = emitFantasia;
    }

    public String getEmitLogradouro() {
        return emitLogradouro;
    }

    public void setEmitLogradouro(String emitLogradouro) {
        this.emitLogradouro = emitLogradouro;
    }

    public String getEmitNr() {
        return emitNr;
    }

    public void setEmitNr(String emitNr) {
        this.emitNr = emitNr;
    }

    public String getEmitComp() {
        return emitComp;
    }

    public void setEmitComp(String emitComp) {
        this.emitComp = emitComp;
    }

    public String getEmitBairro() {
        return emitBairro;
    }

    public void setEmitBairro(String emitBairro) {
        this.emitBairro = emitBairro;
    }

    public String getEmitCep() {
        return emitCep;
    }

    public void setEmitCep(String emitCep) {
        this.emitCep = emitCep;
    }

    public String getEmitPais() {
        return emitPais;
    }

    public void setEmitPais(String emitPais) {
        this.emitPais = emitPais;
    }

    public String getEmitUf() {
        return emitUf;
    }

    public void setEmitUf(String emitUf) {
        this.emitUf = emitUf;
    }

    public String getEmitCodMun() {
        return emitCodMun;
    }

    public void setEmitCodMun(String emitCodMun) {
        this.emitCodMun = emitCodMun;
    }

    public String getEmitMun() {
        return emitMun;
    }

    public void setEmitMun(String emitMun) {
        this.emitMun = emitMun;
    }

    public String getEmitTel() {
        return emitTel;
    }

    public void setEmitTel(String emitTel) {
        this.emitTel = emitTel;
    }

    public String getEmitEmail() {
        return emitEmail;
    }

    public void setEmitEmail(String emitEmail) {
        this.emitEmail = emitEmail;
    }

    public String getRodRntrc() {
        return rodRntrc;
    }

    public void setRodRntrc(String rodRntrc) {
        this.rodRntrc = rodRntrc;
    }

    public String getRodCiot() {
        return rodCiot;
    }

    public void setRodCiot(String rodCiot) {
        this.rodCiot = rodCiot;
    }

    public String getRodCodAgPorto() {
        return rodCodAgPorto;
    }

    public void setRodCodAgPorto(String rodCodAgPorto) {
        this.rodCodAgPorto = rodCodAgPorto;
    }

    public String getRodCodIntVeic() {
        return rodCodIntVeic;
    }

    public void setRodCodIntVeic(String rodCodIntVeic) {
        this.rodCodIntVeic = rodCodIntVeic;
    }

    public String getRodTpCarroceria() {
        return rodTpCarroceria;
    }

    public void setRodTpCarroceria(String rodTpCarroceria) {
        this.rodTpCarroceria = rodTpCarroceria;
    }

    public String getRodPlaca() {
        return rodPlaca;
    }

    public void setRodPlaca(String rodPlaca) {
        this.rodPlaca = rodPlaca;
    }

    public Double getRodTara() {
        return rodTara;
    }

    public void setRodTara(Double rodTara) {
        this.rodTara = rodTara;
    }

    public String getRodRenavam() {
        return rodRenavam;
    }

    public void setRodRenavam(String rodRenavam) {
        this.rodRenavam = rodRenavam;
    }

    public String getRodUf() {
        return rodUf;
    }

    public void setRodUf(String rodUf) {
        this.rodUf = rodUf;
    }

    public String getRodTpRodado() {
        return rodTpRodado;
    }

    public void setRodTpRodado(String rodTpRodado) {
        this.rodTpRodado = rodTpRodado;
    }

    public Double getRodCapacidadeKg() {
        return rodCapacidadeKg;
    }

    public void setRodCapacidadeKg(Double rodCapacidadeKg) {
        this.rodCapacidadeKg = rodCapacidadeKg;
    }

    public Double getRodCapacidadeM3() {
        return rodCapacidadeM3;
    }

    public void setRodCapacidadeM3(Double rodCapacidadeM3) {
        this.rodCapacidadeM3 = rodCapacidadeM3;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getPptNome() {
        return pptNome;
    }

    public void setPptNome(String pptNome) {
        this.pptNome = pptNome;
    }

    public String getPptCpf() {
        return pptCpf;
    }

    public void setPptCpf(String pptCpf) {
        this.pptCpf = pptCpf;
    }

    public String getPptCnpj() {
        return pptCnpj;
    }

    public void setPptCnpj(String pptCnpj) {
        this.pptCnpj = pptCnpj;
    }

    public String getPptRntrc() {
        return pptRntrc;
    }

    public void setPptRntrc(String pptRntrc) {
        this.pptRntrc = pptRntrc;
    }

    public String getPptIe() {
        return pptIe;
    }

    public void setPptIe(String pptIe) {
        this.pptIe = pptIe;
    }

    public String getPptUf() {
        return pptUf;
    }

    public void setPptUf(String pptUf) {
        this.pptUf = pptUf;
    }

    public String getAquCnpjAgenciaNav() {
        return aquCnpjAgenciaNav;
    }

    public void setAquCnpjAgenciaNav(String aquCnpjAgenciaNav) {
        this.aquCnpjAgenciaNav = aquCnpjAgenciaNav;
    }

    public Integer getAquCodIntEmb() {
        return aquCodIntEmb;
    }

    public void setAquCodIntEmb(Integer aquCodIntEmb) {
        this.aquCodIntEmb = aquCodIntEmb;
    }

    public String getAquCodEmb() {
        return aquCodEmb;
    }

    public void setAquCodEmb(String aquCodEmb) {
        this.aquCodEmb = aquCodEmb;
    }

    public String getAquCodTpEmb() {
        return aquCodTpEmb;
    }

    public void setAquCodTpEmb(String aquCodTpEmb) {
        this.aquCodTpEmb = aquCodTpEmb;
    }

    public String getAquNomeEmb() {
        return aquNomeEmb;
    }

    public void setAquNomeEmb(String aquNomeEmb) {
        this.aquNomeEmb = aquNomeEmb;
    }

    public String getAquNrViagem() {
        return aquNrViagem;
    }

    public void setAquNrViagem(String aquNrViagem) {
        this.aquNrViagem = aquNrViagem;
    }

    public String getAquCodPortoEmb() {
        return aquCodPortoEmb;
    }

    public void setAquCodPortoEmb(String aquCodPortoEmb) {
        this.aquCodPortoEmb = aquCodPortoEmb;
    }

    public String getAquCodPortoDes() {
        return aquCodPortoDes;
    }

    public void setAquCodPortoDes(String aquCodPortoDes) {
        this.aquCodPortoDes = aquCodPortoDes;
    }

    public Integer getTotQtdCte() {
        return totQtdCte;
    }

    public void setTotQtdCte(Integer totQtdCte) {
        this.totQtdCte = totQtdCte;
    }

    public Integer getTotQtdNfe() {
        return totQtdNfe;
    }

    public void setTotQtdNfe(Integer totQtdNfe) {
        this.totQtdNfe = totQtdNfe;
    }

    public Integer getTotQtdNfeMod1() {
        return totQtdNfeMod1;
    }

    public void setTotQtdNfeMod1(Integer totQtdNfeMod1) {
        this.totQtdNfeMod1 = totQtdNfeMod1;
    }

    public Double getTotTotMercTransportada() {
        return totTotMercTransportada;
    }

    public void setTotTotMercTransportada(Double totTotMercTransportada) {
        this.totTotMercTransportada = totTotMercTransportada;
    }

    public String getTotUnMedidaPeso() {
        return totUnMedidaPeso;
    }

    public void setTotUnMedidaPeso(String totUnMedidaPeso) {
        this.totUnMedidaPeso = totUnMedidaPeso;
    }

    public Double getTotPesoBruto() {
        return totPesoBruto;
    }

    public void setTotPesoBruto(Double totPesoBruto) {
        this.totPesoBruto = totPesoBruto;
    }

    public String getInfFisco() {
        return infFisco;
    }

    public void setInfFisco(String infFisco) {
        this.infFisco = infFisco;
    }

    public String getInfContr() {
        return infContr;
    }

    public void setInfContr(String infContr) {
        this.infContr = infContr;
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

    
}
