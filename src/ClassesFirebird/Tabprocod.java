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
public class Tabprocod implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String codigo;
    
    private String unid;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double qtdun;
    private Double vldesconto;
    private Tabpro codpro;

    public Tabprocod() {
    }

    public Tabprocod(String codigo) {
        this.codigo = codigo;
    }

    public Tabprocod(String codigo, String unid) {
        this.codigo = codigo;
        this.unid = unid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Double getQtdun() {
        return qtdun;
    }

    public void setQtdun(Double qtdun) {
        this.qtdun = qtdun;
    }

    public Double getVldesconto() {
        return vldesconto;
    }

    public void setVldesconto(Double vldesconto) {
        this.vldesconto = vldesconto;
    }

    public Tabpro getCodpro() {
        return codpro;
    }

    public void setCodpro(Tabpro codpro) {
        this.codpro = codpro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabprocod)) {
            return false;
        }
        Tabprocod other = (Tabprocod) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabprocod[ codigo=" + codigo + " ]";
    }
    
}
