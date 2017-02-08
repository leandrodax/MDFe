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
public class ConfigFp implements Serializable {
    private static final long serialVersionUID = 1L;
    private String codfil;
    private String cnpjFarmacia;
    private String ativo;
    private String razaoSocial;
    private String usuFarmacia;
    private String senFarmacia;
    private String ambiente;

    public ConfigFp() {
    }

    public ConfigFp(String codfil) {
        this.codfil = codfil;
    }

    public String getCodfil() {
        return codfil;
    }

    public void setCodfil(String codfil) {
        this.codfil = codfil;
    }

    public String getCnpjFarmacia() {
        return cnpjFarmacia;
    }

    public void setCnpjFarmacia(String cnpjFarmacia) {
        this.cnpjFarmacia = cnpjFarmacia;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getUsuFarmacia() {
        return usuFarmacia;
    }

    public void setUsuFarmacia(String usuFarmacia) {
        this.usuFarmacia = usuFarmacia;
    }

    public String getSenFarmacia() {
        return senFarmacia;
    }

    public void setSenFarmacia(String senFarmacia) {
        this.senFarmacia = senFarmacia;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codfil != null ? codfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfigFp)) {
            return false;
        }
        ConfigFp other = (ConfigFp) object;
        if ((this.codfil == null && other.codfil != null) || (this.codfil != null && !this.codfil.equals(other.codfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.ConfigFp[ codfil=" + codfil + " ]";
    }
    
}
