/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notasaidev {
    
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private Integer codfil;
    private String codcli;
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
    private String rgie;
    private Integer codven;
    private String nomven;
    private Short codprof;
    private String nomprof;
    private Integer codusu;
    private String usuario;
    private Integer nrcaixa;
    private Integer codplan;
    private String descplan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double totalatu;
    private Double vlpagdin;
    private Double vltroco;
    private Double totnota;
    private Double percdesc;
    private Double vldescnot;
    private Double totgeral;
    private Date dthrlanc;
    private String nomcomp;
    private Integer nrcxalt;
    private Character status;
    private String obsvenda;
    private String cep;
    private Date dtagenda;
    private String hragenda;
    private String nrendcli;
    private Integer codforma;
    private String nomforma;
    private String cfops;
    private Character bonifica;
    private Character emissbol;
    private Character emitnfe;
    private Double vlfrete;
    private Double vlseguro;
    private Double outrdesp;
    
    public Notasaidev() {
    }

    public Notasaidev(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
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

    public Double getTotalatu() {
        return totalatu;
    }

    public void setTotalatu(Double totalatu) {
        this.totalatu = totalatu;
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

    public Double getTotnota() {
        return totnota;
    }

    public void setTotnota(Double totnota) {
        this.totnota = totnota;
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

    public Double getTotgeral() {
        return totgeral;
    }

    public void setTotgeral(Double totgeral) {
        this.totgeral = totgeral;
    }

    public Date getDthrlanc() {
        return dthrlanc;
    }

    public void setDthrlanc(Date dthrlanc) {
        this.dthrlanc = dthrlanc;
    }

    public String getNomcomp() {
        return nomcomp;
    }

    public void setNomcomp(String nomcomp) {
        this.nomcomp = nomcomp;
    }

    public Integer getNrcxalt() {
        return nrcxalt;
    }

    public void setNrcxalt(Integer nrcxalt) {
        this.nrcxalt = nrcxalt;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getObsvenda() {
        return obsvenda;
    }

    public void setObsvenda(String obsvenda) {
        this.obsvenda = obsvenda;
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

    public String getNrendcli() {
        return nrendcli;
    }

    public void setNrendcli(String nrendcli) {
        this.nrendcli = nrendcli;
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


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrcontr != null ? nrcontr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notasaidev)) {
            return false;
        }
        Notasaidev other = (Notasaidev) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notasaidev[ nrcontr=" + nrcontr + " ]";
    }
    
}
