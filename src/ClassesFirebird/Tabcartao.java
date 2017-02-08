/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

 
public class Tabcartao {
    private static final long serialVersionUID = 1L;
    private Integer codcartao;
    private String nomcartao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double percposcre;
    private Double percposdeb;
    private Double percposche;
    private Double perctefcre;
    private Double perctefdeb;
    private Double perctefche;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private String rgevento;
    private String cnpj;
    private String tband;

    public Tabcartao() {
    }

    public Tabcartao(Integer codcartao) {
        this.codcartao = codcartao;
    }

    public Integer getCodcartao() {
        return codcartao;
    }

    public void setCodcartao(Integer codcartao) {
        this.codcartao = codcartao;
    }

    public String getNomcartao() {
        return nomcartao;
    }

    public void setNomcartao(String nomcartao) {
        this.nomcartao = nomcartao;
    }

    public Double getPercposcre() {
        return percposcre;
    }

    public void setPercposcre(Double percposcre) {
        this.percposcre = percposcre;
    }

    public Double getPercposdeb() {
        return percposdeb;
    }

    public void setPercposdeb(Double percposdeb) {
        this.percposdeb = percposdeb;
    }

    public Double getPercposche() {
        return percposche;
    }

    public void setPercposche(Double percposche) {
        this.percposche = percposche;
    }

    public Double getPerctefcre() {
        return perctefcre;
    }

    public void setPerctefcre(Double perctefcre) {
        this.perctefcre = perctefcre;
    }

    public Double getPerctefdeb() {
        return perctefdeb;
    }

    public void setPerctefdeb(Double perctefdeb) {
        this.perctefdeb = perctefdeb;
    }

    public Double getPerctefche() {
        return perctefche;
    }

    public void setPerctefche(Double perctefche) {
        this.perctefche = perctefche;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTband() {
        return tband;
    }

    public void setTband(String tband) {
        this.tband = tband;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcartao != null ? codcartao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcartao)) {
            return false;
        }
        Tabcartao other = (Tabcartao) object;
        if ((this.codcartao == null && other.codcartao != null) || (this.codcartao != null && !this.codcartao.equals(other.codcartao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcartao[ codcartao=" + codcartao + " ]";
    }
    
}
