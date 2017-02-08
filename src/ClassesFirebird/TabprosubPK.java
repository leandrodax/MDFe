/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;


/**
 *
 * @author vplayer
 */
public class TabprosubPK implements Serializable {
    
    private String codpro;
    
    private int codfil;
    
    private String referencia;
    
    private String modelo;
    
    private String cor;
    
    private String tamanho;

    public TabprosubPK() {
    }

    public TabprosubPK(String codpro, int codfil, String referencia, String modelo, String cor, String tamanho) {
        this.codpro = codpro;
        this.codfil = codfil;
        this.referencia = referencia;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpro != null ? codpro.hashCode() : 0);
        hash += (int) codfil;
        hash += (referencia != null ? referencia.hashCode() : 0);
        hash += (modelo != null ? modelo.hashCode() : 0);
        hash += (cor != null ? cor.hashCode() : 0);
        hash += (tamanho != null ? tamanho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabprosubPK)) {
            return false;
        }
        TabprosubPK other = (TabprosubPK) object;
        if ((this.codpro == null && other.codpro != null) || (this.codpro != null && !this.codpro.equals(other.codpro))) {
            return false;
        }
        if (this.codfil != other.codfil) {
            return false;
        }
        if ((this.referencia == null && other.referencia != null) || (this.referencia != null && !this.referencia.equals(other.referencia))) {
            return false;
        }
        if ((this.modelo == null && other.modelo != null) || (this.modelo != null && !this.modelo.equals(other.modelo))) {
            return false;
        }
        if ((this.cor == null && other.cor != null) || (this.cor != null && !this.cor.equals(other.cor))) {
            return false;
        }
        if ((this.tamanho == null && other.tamanho != null) || (this.tamanho != null && !this.tamanho.equals(other.tamanho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabprosubPK[ codpro=" + codpro + ", codfil=" + codfil + ", referencia=" + referencia + ", modelo=" + modelo + ", cor=" + cor + ", tamanho=" + tamanho + " ]";
    }
    
}
