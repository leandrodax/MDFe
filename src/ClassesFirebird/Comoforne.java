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
public class Comoforne implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nrcontr;
    private Integer codfil;
    private String codfor;
    private String nomfor;
    private String fanfor;
    private String endfor;
    private String baifor;
    private String cidade;
    private String cepfor;
    private String uf;
    private String perimetro;
    private String fone1;
    private String fone2;
    private String email;
    private String contato;
    private Date dataemis;
    private Date dataentr;
    private Date dataagen;
    private Date datadevo;
    private Integer codusuent;
    private String nomusuent;
    private Date dataent;
    private Integer codusufin;
    private String nomusufin;
    private Date datafin;
    private String situacao;
    private Collection<Comofitens> comofitensCollection;

    public Comoforne() {
    }

    public Comoforne(String nrcontr) {
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

    public String getCodfor() {
        return codfor;
    }

    public void setCodfor(String codfor) {
        this.codfor = codfor;
    }

    public String getNomfor() {
        return nomfor;
    }

    public void setNomfor(String nomfor) {
        this.nomfor = nomfor;
    }

    public String getFanfor() {
        return fanfor;
    }

    public void setFanfor(String fanfor) {
        this.fanfor = fanfor;
    }

    public String getEndfor() {
        return endfor;
    }

    public void setEndfor(String endfor) {
        this.endfor = endfor;
    }

    public String getBaifor() {
        return baifor;
    }

    public void setBaifor(String baifor) {
        this.baifor = baifor;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCepfor() {
        return cepfor;
    }

    public void setCepfor(String cepfor) {
        this.cepfor = cepfor;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public Date getDataemis() {
        return dataemis;
    }

    public void setDataemis(Date dataemis) {
        this.dataemis = dataemis;
    }

    public Date getDataentr() {
        return dataentr;
    }

    public void setDataentr(Date dataentr) {
        this.dataentr = dataentr;
    }

    public Date getDataagen() {
        return dataagen;
    }

    public void setDataagen(Date dataagen) {
        this.dataagen = dataagen;
    }

    public Date getDatadevo() {
        return datadevo;
    }

    public void setDatadevo(Date datadevo) {
        this.datadevo = datadevo;
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

    @XmlTransient
    public Collection<Comofitens> getComofitensCollection() {
        return comofitensCollection;
    }

    public void setComofitensCollection(Collection<Comofitens> comofitensCollection) {
        this.comofitensCollection = comofitensCollection;
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
        if (!(object instanceof Comoforne)) {
            return false;
        }
        Comoforne other = (Comoforne) object;
        if ((this.nrcontr == null && other.nrcontr != null) || (this.nrcontr != null && !this.nrcontr.equals(other.nrcontr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Comoforne[ nrcontr=" + nrcontr + " ]";
    }
    
}
