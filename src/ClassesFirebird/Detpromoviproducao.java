/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Detpromoviproducao implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codproducao;
    private Integer coditem;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtde;
    private String codpro;
    private Double prvapro;

    public Detpromoviproducao() {
    }

    public Detpromoviproducao(Integer codproducao) {
        this.codproducao = codproducao;
    }

    public Integer getCodproducao() {
        return codproducao;
    }

    public void setCodproducao(Integer codproducao) {
        this.codproducao = codproducao;
    }

    public Integer getCoditem() {
        return coditem;
    }

    public void setCoditem(Integer coditem) {
        this.coditem = coditem;
    }

    public Double getQtde() {
        return qtde;
    }

    public void setQtde(Double qtde) {
        this.qtde = qtde;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public Double getPrvapro() {
        return prvapro;
    }

    public void setPrvapro(Double prvapro) {
        this.prvapro = prvapro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codproducao != null ? codproducao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detpromoviproducao)) {
            return false;
        }
        Detpromoviproducao other = (Detpromoviproducao) object;
        if ((this.codproducao == null && other.codproducao != null) || (this.codproducao != null && !this.codproducao.equals(other.codproducao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Detpromoviproducao[ codproducao=" + codproducao + " ]";
    }
    
}
