/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movinfemani {

    private static final long serialVersionUID = 1L;
    protected MovinfemaniPK movinfemaniPK;
    private String versaoleia;
    private Integer idlote;
    private String versaoleiaenv;
    private String id;
    private String corgao;
    private String tpamb;
    private String cnpjcnpf;
    private Date dhtevento;
    private String verevento;
    private String versao;
    private String descevento;
    private String xjust;
    private String situacao;
    private String sitautor;
    private String cstart;
    private String xmotivo;
    private String cstartman;
    private String xmotivoman;
    private String nprot;
    private Date dhregevento;
    private String xmlenvio;
    private String xmlretorno;
    private Integer codfil;

    public Movinfemani() {
    }

    public Movinfemani(MovinfemaniPK movinfemaniPK) {
        this.movinfemaniPK = movinfemaniPK;
    }

    public Movinfemani(MovinfemaniPK movinfemaniPK, String id) {
        this.movinfemaniPK = movinfemaniPK;
        this.id = id;
    }

    public Movinfemani(String chnfe, String tpevento, int nseqevento) {
        this.movinfemaniPK = new MovinfemaniPK(chnfe, tpevento, nseqevento);
    }

    public MovinfemaniPK getMovinfemaniPK() {
        return movinfemaniPK;
    }

    public void setMovinfemaniPK(MovinfemaniPK movinfemaniPK) {
        this.movinfemaniPK = movinfemaniPK;
    }

    public String getVersaoleia() {
        return versaoleia;
    }

    public void setVersaoleia(String versaoleia) {
        this.versaoleia = versaoleia;
    }

    public Integer getIdlote() {
        return idlote;
    }

    public void setIdlote(Integer idlote) {
        this.idlote = idlote;
    }

    public String getVersaoleiaenv() {
        return versaoleiaenv;
    }

    public void setVersaoleiaenv(String versaoleiaenv) {
        this.versaoleiaenv = versaoleiaenv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorgao() {
        return corgao;
    }

    public void setCorgao(String corgao) {
        this.corgao = corgao;
    }

    public String getTpamb() {
        return tpamb;
    }

    public void setTpamb(String tpamb) {
        this.tpamb = tpamb;
    }

    public String getCnpjcnpf() {
        return cnpjcnpf;
    }

    public void setCnpjcnpf(String cnpjcnpf) {
        this.cnpjcnpf = cnpjcnpf;
    }

    public Date getDhtevento() {
        return dhtevento;
    }

    public void setDhtevento(Date dhtevento) {
        this.dhtevento = dhtevento;
    }

    public String getVerevento() {
        return verevento;
    }

    public void setVerevento(String verevento) {
        this.verevento = verevento;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getDescevento() {
        return descevento;
    }

    public void setDescevento(String descevento) {
        this.descevento = descevento;
    }

    public String getXjust() {
        return xjust;
    }

    public void setXjust(String xjust) {
        this.xjust = xjust;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSitautor() {
        return sitautor;
    }

    public void setSitautor(String sitautor) {
        this.sitautor = sitautor;
    }

    public String getCstart() {
        return cstart;
    }

    public void setCstart(String cstart) {
        this.cstart = cstart;
    }

    public String getXmotivo() {
        return xmotivo;
    }

    public void setXmotivo(String xmotivo) {
        this.xmotivo = xmotivo;
    }

    public String getCstartman() {
        return cstartman;
    }

    public void setCstartman(String cstartman) {
        this.cstartman = cstartman;
    }

    public String getXmotivoman() {
        return xmotivoman;
    }

    public void setXmotivoman(String xmotivoman) {
        this.xmotivoman = xmotivoman;
    }

    public String getNprot() {
        return nprot;
    }

    public void setNprot(String nprot) {
        this.nprot = nprot;
    }

    public Date getDhregevento() {
        return dhregevento;
    }

    public void setDhregevento(Date dhregevento) {
        this.dhregevento = dhregevento;
    }

    public String getXmlenvio() {
        return xmlenvio;
    }

    public void setXmlenvio(String xmlenvio) {
        this.xmlenvio = xmlenvio;
    }

    public String getXmlretorno() {
        return xmlretorno;
    }

    public void setXmlretorno(String xmlretorno) {
        this.xmlretorno = xmlretorno;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movinfemaniPK != null ? movinfemaniPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movinfemani)) {
            return false;
        }
        Movinfemani other = (Movinfemani) object;
        if ((this.movinfemaniPK == null && other.movinfemaniPK != null) || (this.movinfemaniPK != null && !this.movinfemaniPK.equals(other.movinfemaniPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movinfemani[ movinfemaniPK=" + movinfemaniPK + " ]";
    }
    
}
