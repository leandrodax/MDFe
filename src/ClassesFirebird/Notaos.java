/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Notaos {
    private static final long serialVersionUID = 1L;
    private Integer nros;
    private Integer codfil;
    private String nomcli;
    private Date dtentobj;
    private Date dtsaiobj;
    private Integer codobj;
    private String ideobj;
    private String descobj;
    private String gruobj;
    private String marcobj;
    private String respobj;
    private String obsobj;
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
    private Double totserv;
    private Double totgeral;
    private Integer nrcaixa;
    private Integer codplan;
    private String descplan;
    private String nomcomp;
    private Date dthrlanc;
    private Character stos;
    private String obsvenda;
    private String codcli;
    private String rgie;

    public Notaos() {
    }

    public Notaos(Integer nros) {
        this.nros = nros;
    }

    public Integer getNros() {
        return nros;
    }

    public void setNros(Integer nros) {
        this.nros = nros;
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

    public Date getDtentobj() {
        return dtentobj;
    }

    public void setDtentobj(Date dtentobj) {
        this.dtentobj = dtentobj;
    }

    public Date getDtsaiobj() {
        return dtsaiobj;
    }

    public void setDtsaiobj(Date dtsaiobj) {
        this.dtsaiobj = dtsaiobj;
    }

    public Integer getCodobj() {
        return codobj;
    }

    public void setCodobj(Integer codobj) {
        this.codobj = codobj;
    }

    public String getIdeobj() {
        return ideobj;
    }

    public void setIdeobj(String ideobj) {
        this.ideobj = ideobj;
    }

    public String getDescobj() {
        return descobj;
    }

    public void setDescobj(String descobj) {
        this.descobj = descobj;
    }

    public String getGruobj() {
        return gruobj;
    }

    public void setGruobj(String gruobj) {
        this.gruobj = gruobj;
    }

    public String getMarcobj() {
        return marcobj;
    }

    public void setMarcobj(String marcobj) {
        this.marcobj = marcobj;
    }

    public String getRespobj() {
        return respobj;
    }

    public void setRespobj(String respobj) {
        this.respobj = respobj;
    }

    public String getObsobj() {
        return obsobj;
    }

    public void setObsobj(String obsobj) {
        this.obsobj = obsobj;
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

    public Double getTotserv() {
        return totserv;
    }

    public void setTotserv(Double totserv) {
        this.totserv = totserv;
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

    public Character getStos() {
        return stos;
    }

    public void setStos(Character stos) {
        this.stos = stos;
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


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nros != null ? nros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notaos)) {
            return false;
        }
        Notaos other = (Notaos) object;
        if ((this.nros == null && other.nros != null) || (this.nros != null && !this.nros.equals(other.nros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notaos[ nros=" + nros + " ]";
    }
    
}
