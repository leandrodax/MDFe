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
public class Confnota implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer ordem;
    private String chave;
    private Integer numero;
    private String detalhe;
    private Integer tiponota;
    private String obscampo;
    private Character situacao;

    public Confnota() {
    }

    public Confnota(Integer ordem) {
        this.ordem = ordem;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Integer getTiponota() {
        return tiponota;
    }

    public void setTiponota(Integer tiponota) {
        this.tiponota = tiponota;
    }

    public String getObscampo() {
        return obscampo;
    }

    public void setObscampo(String obscampo) {
        this.obscampo = obscampo;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordem != null ? ordem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Confnota)) {
            return false;
        }
        Confnota other = (Confnota) object;
        if ((this.ordem == null && other.ordem != null) || (this.ordem != null && !this.ordem.equals(other.ordem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Confnota[ ordem=" + ordem + " ]";
    }
    
}
