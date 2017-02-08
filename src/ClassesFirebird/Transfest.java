/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vplayer
 */
public class Transfest implements Serializable {
    private static final long serialVersionUID = 1L;
    
   
    private String nrcontr;
   
    private int codfile;
    private String nomfile;
   
    private int codfils;
    private String nomfils;
    
    private Date dtemissao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlcusto;
    private Double vlvenda;
    private Integer codusuent;
    private String nomusuent;
    
    private Date dataent;
    private String situacao;
    private Integer codusufin;
    private String nomusufin;
    
    private Date datafin;
    private String observ;
    private Character tpentsai;
    private Integer cdlocal;
    private String cfops;
    private String nrnota;
    private String sserie;
    private String selo;
    
    private Date dataemi;
    
    private Date datasai;
    private String horasai;
    private Character frete;
    private Double basesubst;
    private Double valorsubs;
    private Character origem;
    private Character tpvenda;
    private String nrvenda;
    private Character sitroma;
    private Character sittrans;
    
    private Date dttrans;
    private Integer nrtransf;
    
    private Collection<Transfestitens> transfestitensCollection;

    public Transfest() {
    }

    public Transfest(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public Transfest(String nrcontr, int codfile, int codfils) {
        this.nrcontr = nrcontr;
        this.codfile = codfile;
        this.codfils = codfils;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public int getCodfile() {
        return codfile;
    }

    public void setCodfile(int codfile) {
        this.codfile = codfile;
    }

    public String getNomfile() {
        return nomfile;
    }

    public void setNomfile(String nomfile) {
        this.nomfile = nomfile;
    }

    public int getCodfils() {
        return codfils;
    }

    public void setCodfils(int codfils) {
        this.codfils = codfils;
    }

    public String getNomfils() {
        return nomfils;
    }

    public void setNomfils(String nomfils) {
        this.nomfils = nomfils;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Double getVlcusto() {
        return vlcusto;
    }

    public void setVlcusto(Double vlcusto) {
        this.vlcusto = vlcusto;
    }

    public Double getVlvenda() {
        return vlvenda;
    }

    public void setVlvenda(Double vlvenda) {
        this.vlvenda = vlvenda;
    }

    public Integer getCodusuent() {
        return codusuent;
    }

    public void setCodusuent(Integer codusuent) {
        this.codusuent = codusuent;
    }

    public String getNomusuent() {
        return nomusuent;
    }

    public void setNomusuent(String nomusuent) {
        this.nomusuent = nomusuent;
    }

    public Date getDataent() {
        return dataent;
    }

    public void setDataent(Date dataent) {
        this.dataent = dataent;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getCodusufin() {
        return codusufin;
    }

    public void setCodusufin(Integer codusufin) {
        this.codusufin = codusufin;
    }

    public String getNomusufin() {
        return nomusufin;
    }

    public void setNomusufin(String nomusufin) {
        this.nomusufin = nomusufin;
    }

    public Date getDatafin() {
        return datafin;
    }

    public void setDatafin(Date datafin) {
        this.datafin = datafin;
    }

    public String getObserv() {
        return observ;
    }

    public void setObserv(String observ) {
        this.observ = observ;
    }

    public Character getTpentsai() {
        return tpentsai;
    }

    public void setTpentsai(Character tpentsai) {
        this.tpentsai = tpentsai;
    }

    public Integer getCdlocal() {
        return cdlocal;
    }

    public void setCdlocal(Integer cdlocal) {
        this.cdlocal = cdlocal;
    }

    public String getCfops() {
        return cfops;
    }

    public void setCfops(String cfops) {
        this.cfops = cfops;
    }

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public String getSserie() {
        return sserie;
    }

    public void setSserie(String sserie) {
        this.sserie = sserie;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

    public Date getDataemi() {
        return dataemi;
    }

    public void setDataemi(Date dataemi) {
        this.dataemi = dataemi;
    }

    public Date getDatasai() {
        return datasai;
    }

    public void setDatasai(Date datasai) {
        this.datasai = datasai;
    }

    public String getHorasai() {
        return horasai;
    }

    public void setHorasai(String horasai) {
        this.horasai = horasai;
    }

    public Character getFrete() {
        return frete;
    }

    public void setFrete(Character frete) {
        this.frete = frete;
    }

    public Double getBasesubst() {
        return basesubst;
    }

    public void setBasesubst(Double basesubst) {
        this.basesubst = basesubst;
    }

    public Double getValorsubs() {
        return valorsubs;
    }

    public void setValorsubs(Double valorsubs) {
        this.valorsubs = valorsubs;
    }

    public Character getOrigem() {
        return origem;
    }

    public void setOrigem(Character origem) {
        this.origem = origem;
    }

    public Character getTpvenda() {
        return tpvenda;
    }

    public void setTpvenda(Character tpvenda) {
        this.tpvenda = tpvenda;
    }

    public String getNrvenda() {
        return nrvenda;
    }

    public void setNrvenda(String nrvenda) {
        this.nrvenda = nrvenda;
    }

    public Character getSitroma() {
        return sitroma;
    }

    public void setSitroma(Character sitroma) {
        this.sitroma = sitroma;
    }

    public Character getSittrans() {
        return sittrans;
    }

    public void setSittrans(Character sittrans) {
        this.sittrans = sittrans;
    }

    public Date getDttrans() {
        return dttrans;
    }

    public void setDttrans(Date dttrans) {
        this.dttrans = dttrans;
    }

    public Integer getNrtransf() {
        return nrtransf;
    }

    public void setNrtransf(Integer nrtransf) {
        this.nrtransf = nrtransf;
    }

    @XmlTransient
    public Collection<Transfestitens> getTransfestitensCollection() {
        return transfestitensCollection;
    }

    public void setTransfestitensCollection(Collection<Transfestitens> transfestitensCollection) {
        this.transfestitensCollection = transfestitensCollection;
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
        if (!(object instanceof Transfest)) {
            return false;
        }
        Transfest other = (Transfest) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Transfest[ nrcontr=" + nrcontr + " ]";
    }
    
}
