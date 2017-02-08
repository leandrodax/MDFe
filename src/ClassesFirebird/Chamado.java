/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;

public class Chamado implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private String codcli;
    private String nomcli;
    private String endcli;
    private String baicli;
    private String cepcli;
    private String perimetro;
    private String fone1;
    private String fone2;
    private String email;
    private String contato;
    private Short codprof;
    private String nomprof;
    private Integer codobj;
    private String descrobj;
    private String serieobj;
    private String modelobj;
    private String marcaobj;
    private Character situaobj;
    private String obserobj;
    private Date dataemis;
    private Date datacheg;
    private Date datasaid;
    private Integer codusuent;
    private String nomusuent;
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;
    private Date datafin;
    private String situacao;
    private String descricao;
    private String resolucao;
    private String material;
    private Date dataagen;
    private String horaagen;
    private String obschamado;

    public Chamado() {
    }

    public Chamado(String nrcontr) {
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

    public String getCepcli() {
        return cepcli;
    }

    public void setCepcli(String cepcli) {
        this.cepcli = cepcli;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(String perimetro) {
        this.perimetro = perimetro;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
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

    public Integer getCodobj() {
        return codobj;
    }

    public void setCodobj(Integer codobj) {
        this.codobj = codobj;
    }

    public String getDescrobj() {
        return descrobj;
    }

    public void setDescrobj(String descrobj) {
        this.descrobj = descrobj;
    }

    public String getSerieobj() {
        return serieobj;
    }

    public void setSerieobj(String serieobj) {
        this.serieobj = serieobj;
    }

    public String getModelobj() {
        return modelobj;
    }

    public void setModelobj(String modelobj) {
        this.modelobj = modelobj;
    }

    public String getMarcaobj() {
        return marcaobj;
    }

    public void setMarcaobj(String marcaobj) {
        this.marcaobj = marcaobj;
    }

    public Character getSituaobj() {
        return situaobj;
    }

    public void setSituaobj(Character situaobj) {
        this.situaobj = situaobj;
    }

    public String getObserobj() {
        return obserobj;
    }

    public void setObserobj(String obserobj) {
        this.obserobj = obserobj;
    }

    public Date getDataemis() {
        return dataemis;
    }

    public void setDataemis(Date dataemis) {
        this.dataemis = dataemis;
    }

    public Date getDatacheg() {
        return datacheg;
    }

    public void setDatacheg(Date datacheg) {
        this.datacheg = datacheg;
    }

    public Date getDatasaid() {
        return datasaid;
    }

    public void setDatasaid(Date datasaid) {
        this.datasaid = datasaid;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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

    public String getObschamado() {
        return obschamado;
    }

    public void setObschamado(String obschamado) {
        this.obschamado = obschamado;
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
        if (!(object instanceof Chamado)) {
            return false;
        }
        Chamado other = (Chamado) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Chamado[ nrcontr=" + nrcontr + " ]";
    }
    
}
