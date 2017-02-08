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
public class Tabstatuspadrao implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer codstatus;
    private String nomstatus;
    private Integer prazohoras;
    private Integer prazominutos;
    private Integer prazosegundos;

    public Tabstatuspadrao() {
    }

    public Tabstatuspadrao(Integer codstatus) {
        this.codstatus = codstatus;
    }

    public Integer getCodstatus() {
        return codstatus;
    }

    public void setCodstatus(Integer codstatus) {
        this.codstatus = codstatus;
    }

    public String getNomstatus() {
        return nomstatus;
    }

    public void setNomstatus(String nomstatus) {
        this.nomstatus = nomstatus;
    }

    public Integer getPrazohoras() {
        return prazohoras;
    }

    public void setPrazohoras(Integer prazohoras) {
        this.prazohoras = prazohoras;
    }

    public Integer getPrazominutos() {
        return prazominutos;
    }

    public void setPrazominutos(Integer prazominutos) {
        this.prazominutos = prazominutos;
    }

    public Integer getPrazosegundos() {
        return prazosegundos;
    }

    public void setPrazosegundos(Integer prazosegundos) {
        this.prazosegundos = prazosegundos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codstatus != null ? codstatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabstatuspadrao)) {
            return false;
        }
        Tabstatuspadrao other = (Tabstatuspadrao) object;
        if ((this.codstatus == null && other.codstatus != null) || (this.codstatus != null && !this.codstatus.equals(other.codstatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabstatuspadrao[ codstatus=" + codstatus + " ]";
    }
    
}
