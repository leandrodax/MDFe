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
public class Tabplacondre implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Integer codplandre;
    
    private String descplandre;

    public Tabplacondre() {
    }

    public Tabplacondre(Integer codplandre) {
        this.codplandre = codplandre;
    }

    public Tabplacondre(Integer codplandre, String descplandre) {
        this.codplandre = codplandre;
        this.descplandre = descplandre;
    }

    public Integer getCodplandre() {
        return codplandre;
    }

    public void setCodplandre(Integer codplandre) {
        this.codplandre = codplandre;
    }

    public String getDescplandre() {
        return descplandre;
    }

    public void setDescplandre(String descplandre) {
        this.descplandre = descplandre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codplandre != null ? codplandre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabplacondre)) {
            return false;
        }
        Tabplacondre other = (Tabplacondre) object;
        if ((this.codplandre == null && other.codplandre != null) || (this.codplandre != null && !this.codplandre.equals(other.codplandre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabplacondre[ codplandre=" + codplandre + " ]";
    }
    
}
