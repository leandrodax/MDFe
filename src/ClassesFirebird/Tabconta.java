/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;


public class Tabconta{
    private static final long serialVersionUID = 1L;
    private Integer codconta;
    private String descconta;
    private String agencia;
    private String banco;
    private String nrconta;
    private Integer codfil;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double saldoini;
    private String grconta;
    private String modboleto;
    private String localpag01;
    private String localpag02;
    private String mensagem01;
    private String mensagem02;
    private String mensagem03;
    private String mensagem04;
    private String mensagem05;
    private String nossonumer;
    private String nrcarteira;
    private String especmoeda;
    private String especdocum;
    private String aceite;
    private Integer codrec;
    private String codempresa;
    private Integer codplan;
    private Character tpconta;
    private Integer xlocalpag;
    private Integer ylocalpag;
    private Integer xdtvencim;
    private Integer ydtvencim;
    private Integer xdtdocum;
    private Integer ydtdocum;
    private Integer xnosnume;
    private Integer ynosnume;
    private Integer xespecie;
    private Integer yespecie;
    private Integer xaceite;
    private Integer yaceite;
    private Integer xdtproces;
    private Integer ydtproces;
    private Integer xvldoc;
    private Integer yvldoc;
    private Integer iniinst;
    private Integer inisacd;
    private Integer quantlinhas;
    private String tpimpressao;
    private String nrconvenio;

    public Tabconta() {
    }

    public Tabconta(Integer codconta) {
        this.codconta = codconta;
    }

    public Tabconta(Integer codconta, String descconta) {
        this.codconta = codconta;
        this.descconta = descconta;
    }

    public Integer getCodconta() {
        return codconta;
    }

    public void setCodconta(Integer codconta) {
        this.codconta = codconta;
    }

    public String getDescconta() {
        return descconta;
    }

    public void setDescconta(String descconta) {
        this.descconta = descconta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNrconta() {
        return nrconta;
    }

    public void setNrconta(String nrconta) {
        this.nrconta = nrconta;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
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

    public Double getSaldoini() {
        return saldoini;
    }

    public void setSaldoini(Double saldoini) {
        this.saldoini = saldoini;
    }

    public String getGrconta() {
        return grconta;
    }

    public void setGrconta(String grconta) {
        this.grconta = grconta;
    }

    public String getModboleto() {
        return modboleto;
    }

    public void setModboleto(String modboleto) {
        this.modboleto = modboleto;
    }

    public String getLocalpag01() {
        return localpag01;
    }

    public void setLocalpag01(String localpag01) {
        this.localpag01 = localpag01;
    }

    public String getLocalpag02() {
        return localpag02;
    }

    public void setLocalpag02(String localpag02) {
        this.localpag02 = localpag02;
    }

    public String getMensagem01() {
        return mensagem01;
    }

    public void setMensagem01(String mensagem01) {
        this.mensagem01 = mensagem01;
    }

    public String getMensagem02() {
        return mensagem02;
    }

    public void setMensagem02(String mensagem02) {
        this.mensagem02 = mensagem02;
    }

    public String getMensagem03() {
        return mensagem03;
    }

    public void setMensagem03(String mensagem03) {
        this.mensagem03 = mensagem03;
    }

    public String getMensagem04() {
        return mensagem04;
    }

    public void setMensagem04(String mensagem04) {
        this.mensagem04 = mensagem04;
    }

    public String getMensagem05() {
        return mensagem05;
    }

    public void setMensagem05(String mensagem05) {
        this.mensagem05 = mensagem05;
    }

    public String getNossonumer() {
        return nossonumer;
    }

    public void setNossonumer(String nossonumer) {
        this.nossonumer = nossonumer;
    }

    public String getNrcarteira() {
        return nrcarteira;
    }

    public void setNrcarteira(String nrcarteira) {
        this.nrcarteira = nrcarteira;
    }

    public String getEspecmoeda() {
        return especmoeda;
    }

    public void setEspecmoeda(String especmoeda) {
        this.especmoeda = especmoeda;
    }

    public String getEspecdocum() {
        return especdocum;
    }

    public void setEspecdocum(String especdocum) {
        this.especdocum = especdocum;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public Integer getCodrec() {
        return codrec;
    }

    public void setCodrec(Integer codrec) {
        this.codrec = codrec;
    }

    public String getCodempresa() {
        return codempresa;
    }

    public void setCodempresa(String codempresa) {
        this.codempresa = codempresa;
    }

    public Integer getCodplan() {
        return codplan;
    }

    public void setCodplan(Integer codplan) {
        this.codplan = codplan;
    }

    public Character getTpconta() {
        return tpconta;
    }

    public void setTpconta(Character tpconta) {
        this.tpconta = tpconta;
    }

    public Integer getXlocalpag() {
        return xlocalpag;
    }

    public void setXlocalpag(Integer xlocalpag) {
        this.xlocalpag = xlocalpag;
    }

    public Integer getYlocalpag() {
        return ylocalpag;
    }

    public void setYlocalpag(Integer ylocalpag) {
        this.ylocalpag = ylocalpag;
    }

    public Integer getXdtvencim() {
        return xdtvencim;
    }

    public void setXdtvencim(Integer xdtvencim) {
        this.xdtvencim = xdtvencim;
    }

    public Integer getYdtvencim() {
        return ydtvencim;
    }

    public void setYdtvencim(Integer ydtvencim) {
        this.ydtvencim = ydtvencim;
    }

    public Integer getXdtdocum() {
        return xdtdocum;
    }

    public void setXdtdocum(Integer xdtdocum) {
        this.xdtdocum = xdtdocum;
    }

    public Integer getYdtdocum() {
        return ydtdocum;
    }

    public void setYdtdocum(Integer ydtdocum) {
        this.ydtdocum = ydtdocum;
    }

    public Integer getXnosnume() {
        return xnosnume;
    }

    public void setXnosnume(Integer xnosnume) {
        this.xnosnume = xnosnume;
    }

    public Integer getYnosnume() {
        return ynosnume;
    }

    public void setYnosnume(Integer ynosnume) {
        this.ynosnume = ynosnume;
    }

    public Integer getXespecie() {
        return xespecie;
    }

    public void setXespecie(Integer xespecie) {
        this.xespecie = xespecie;
    }

    public Integer getYespecie() {
        return yespecie;
    }

    public void setYespecie(Integer yespecie) {
        this.yespecie = yespecie;
    }

    public Integer getXaceite() {
        return xaceite;
    }

    public void setXaceite(Integer xaceite) {
        this.xaceite = xaceite;
    }

    public Integer getYaceite() {
        return yaceite;
    }

    public void setYaceite(Integer yaceite) {
        this.yaceite = yaceite;
    }

    public Integer getXdtproces() {
        return xdtproces;
    }

    public void setXdtproces(Integer xdtproces) {
        this.xdtproces = xdtproces;
    }

    public Integer getYdtproces() {
        return ydtproces;
    }

    public void setYdtproces(Integer ydtproces) {
        this.ydtproces = ydtproces;
    }

    public Integer getXvldoc() {
        return xvldoc;
    }

    public void setXvldoc(Integer xvldoc) {
        this.xvldoc = xvldoc;
    }

    public Integer getYvldoc() {
        return yvldoc;
    }

    public void setYvldoc(Integer yvldoc) {
        this.yvldoc = yvldoc;
    }

    public Integer getIniinst() {
        return iniinst;
    }

    public void setIniinst(Integer iniinst) {
        this.iniinst = iniinst;
    }

    public Integer getInisacd() {
        return inisacd;
    }

    public void setInisacd(Integer inisacd) {
        this.inisacd = inisacd;
    }

    public Integer getQuantlinhas() {
        return quantlinhas;
    }

    public void setQuantlinhas(Integer quantlinhas) {
        this.quantlinhas = quantlinhas;
    }

    public String getTpimpressao() {
        return tpimpressao;
    }

    public void setTpimpressao(String tpimpressao) {
        this.tpimpressao = tpimpressao;
    }

    public String getNrconvenio() {
        return nrconvenio;
    }

    public void setNrconvenio(String nrconvenio) {
        this.nrconvenio = nrconvenio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codconta != null ? codconta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabconta)) {
            return false;
        }
        Tabconta other = (Tabconta) object;
        if ((this.codconta == null && other.codconta != null) || (this.codconta != null && !this.codconta.equals(other.codconta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabconta[ codconta=" + codconta + " ]";
    }
    
}
