/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Osotica  {
    
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private String codcli;
    private String nomcli;
    private String respon;
    private String endcli;
    private String baicli;
    private String cidade;
    private String cepcli;
    private String uf;
    private String fone1;
    private String email;
    private Date dataemis;
    private Date dataagen;
    private String horaagen;
    private String cpf;
    private String rg;
    private String codplen;
    private String descplen;
    private String codparm;
    private String descparm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double lodesfh;
    private Double lodcil;
    private Double lodeixo;
    private Double loddp;
    private Double loeesfh;
    private Double loecil;
    private Double loeeixo;
    private Double loedp;
    private Double podesfh;
    private Double podcil;
    private Double podeixo;
    private Double poddp;
    private Double poeesfh;
    private Double poecil;
    private Double poeeixo;
    private Double poedp;
    private Integer codusuent;
    private String nomusuent;
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;
    private Date datafin;
    private String situacao;
    private String codplesq;
    private String descpesq;
    private String codpser;
    private String descpser;
    private Double valpdir;
    private Double valpesq;
    private Double valparm;
    private Double valpser;
    private Double vltotal;
    private Double lodaco;
    private Double lodadi;
    private Double loeaco;
    private Double loeadi;
    private Double podaco;
    private Double podadi;
    private Double poeaco;
    private Double poeadi;
    private String obsotica;

    public Osotica() {
    }

    public Osotica(String nrcontr) {
        this.nrcontr = nrcontr;
    }

    public String getNrcontr() {
        return nrcontr;
    }

    public void setNrcontr(String nrcontr) {
        this.nrcontr = nrcontr;
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

    public String getRespon() {
        return respon;
    }

    public void setRespon(String respon) {
        this.respon = respon;
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

    public String getCepcli() {
        return cepcli;
    }

    public void setCepcli(String cepcli) {
        this.cepcli = cepcli;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataemis() {
        return dataemis;
    }

    public void setDataemis(Date dataemis) {
        this.dataemis = dataemis;
    }

    public Date getDataagen() {
        return dataagen;
    }

    public void setDataagen(Date dataagen) {
        this.dataagen = dataagen;
    }

    public String getHoraagen() {
        return horaagen;
    }

    public void setHoraagen(String horaagen) {
        this.horaagen = horaagen;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCodplen() {
        return codplen;
    }

    public void setCodplen(String codplen) {
        this.codplen = codplen;
    }

    public String getDescplen() {
        return descplen;
    }

    public void setDescplen(String descplen) {
        this.descplen = descplen;
    }

    public String getCodparm() {
        return codparm;
    }

    public void setCodparm(String codparm) {
        this.codparm = codparm;
    }

    public String getDescparm() {
        return descparm;
    }

    public void setDescparm(String descparm) {
        this.descparm = descparm;
    }

    public Double getLodesfh() {
        return lodesfh;
    }

    public void setLodesfh(Double lodesfh) {
        this.lodesfh = lodesfh;
    }

    public Double getLodcil() {
        return lodcil;
    }

    public void setLodcil(Double lodcil) {
        this.lodcil = lodcil;
    }

    public Double getLodeixo() {
        return lodeixo;
    }

    public void setLodeixo(Double lodeixo) {
        this.lodeixo = lodeixo;
    }

    public Double getLoddp() {
        return loddp;
    }

    public void setLoddp(Double loddp) {
        this.loddp = loddp;
    }

    public Double getLoeesfh() {
        return loeesfh;
    }

    public void setLoeesfh(Double loeesfh) {
        this.loeesfh = loeesfh;
    }

    public Double getLoecil() {
        return loecil;
    }

    public void setLoecil(Double loecil) {
        this.loecil = loecil;
    }

    public Double getLoeeixo() {
        return loeeixo;
    }

    public void setLoeeixo(Double loeeixo) {
        this.loeeixo = loeeixo;
    }

    public Double getLoedp() {
        return loedp;
    }

    public void setLoedp(Double loedp) {
        this.loedp = loedp;
    }

    public Double getPodesfh() {
        return podesfh;
    }

    public void setPodesfh(Double podesfh) {
        this.podesfh = podesfh;
    }

    public Double getPodcil() {
        return podcil;
    }

    public void setPodcil(Double podcil) {
        this.podcil = podcil;
    }

    public Double getPodeixo() {
        return podeixo;
    }

    public void setPodeixo(Double podeixo) {
        this.podeixo = podeixo;
    }

    public Double getPoddp() {
        return poddp;
    }

    public void setPoddp(Double poddp) {
        this.poddp = poddp;
    }

    public Double getPoeesfh() {
        return poeesfh;
    }

    public void setPoeesfh(Double poeesfh) {
        this.poeesfh = poeesfh;
    }

    public Double getPoecil() {
        return poecil;
    }

    public void setPoecil(Double poecil) {
        this.poecil = poecil;
    }

    public Double getPoeeixo() {
        return poeeixo;
    }

    public void setPoeeixo(Double poeeixo) {
        this.poeeixo = poeeixo;
    }

    public Double getPoedp() {
        return poedp;
    }

    public void setPoedp(Double poedp) {
        this.poedp = poedp;
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCodplesq() {
        return codplesq;
    }

    public void setCodplesq(String codplesq) {
        this.codplesq = codplesq;
    }

    public String getDescpesq() {
        return descpesq;
    }

    public void setDescpesq(String descpesq) {
        this.descpesq = descpesq;
    }

    public String getCodpser() {
        return codpser;
    }

    public void setCodpser(String codpser) {
        this.codpser = codpser;
    }

    public String getDescpser() {
        return descpser;
    }

    public void setDescpser(String descpser) {
        this.descpser = descpser;
    }

    public Double getValpdir() {
        return valpdir;
    }

    public void setValpdir(Double valpdir) {
        this.valpdir = valpdir;
    }

    public Double getValpesq() {
        return valpesq;
    }

    public void setValpesq(Double valpesq) {
        this.valpesq = valpesq;
    }

    public Double getValparm() {
        return valparm;
    }

    public void setValparm(Double valparm) {
        this.valparm = valparm;
    }

    public Double getValpser() {
        return valpser;
    }

    public void setValpser(Double valpser) {
        this.valpser = valpser;
    }

    public Double getVltotal() {
        return vltotal;
    }

    public void setVltotal(Double vltotal) {
        this.vltotal = vltotal;
    }

    public Double getLodaco() {
        return lodaco;
    }

    public void setLodaco(Double lodaco) {
        this.lodaco = lodaco;
    }

    public Double getLodadi() {
        return lodadi;
    }

    public void setLodadi(Double lodadi) {
        this.lodadi = lodadi;
    }

    public Double getLoeaco() {
        return loeaco;
    }

    public void setLoeaco(Double loeaco) {
        this.loeaco = loeaco;
    }

    public Double getLoeadi() {
        return loeadi;
    }

    public void setLoeadi(Double loeadi) {
        this.loeadi = loeadi;
    }

    public Double getPodaco() {
        return podaco;
    }

    public void setPodaco(Double podaco) {
        this.podaco = podaco;
    }

    public Double getPodadi() {
        return podadi;
    }

    public void setPodadi(Double podadi) {
        this.podadi = podadi;
    }

    public Double getPoeaco() {
        return poeaco;
    }

    public void setPoeaco(Double poeaco) {
        this.poeaco = poeaco;
    }

    public Double getPoeadi() {
        return poeadi;
    }

    public void setPoeadi(Double poeadi) {
        this.poeadi = poeadi;
    }

    public String getObsotica() {
        return obsotica;
    }

    public void setObsotica(String obsotica) {
        this.obsotica = obsotica;
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
        if (!(object instanceof Osotica)) {
            return false;
        }
        Osotica other = (Osotica) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Osotica[ nrcontr=" + nrcontr + " ]";
    }
    
}
