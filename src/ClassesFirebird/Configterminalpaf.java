/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Configterminalpaf implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codterminal;
    private String nomterminal;
    private String dirterminal;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Configterminalpaf() {
    }

    public Configterminalpaf(Integer codterminal) {
        this.codterminal = codterminal;
    }

    public Integer getCodterminal() {
        return codterminal;
    }

    public void setCodterminal(Integer codterminal) {
        this.codterminal = codterminal;
    }

    public String getNomterminal() {
        return nomterminal;
    }

    public void setNomterminal(String nomterminal) {
        this.nomterminal = nomterminal;
    }

    public String getDirterminal() {
        return dirterminal;
    }

    public void setDirterminal(String dirterminal) {
        this.dirterminal = dirterminal;
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

    public Character getRgevento() {
        return rgevento;
    }

    public void setRgevento(Character rgevento) {
        this.rgevento = rgevento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codterminal != null ? codterminal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Configterminalpaf)) {
            return false;
        }
        Configterminalpaf other = (Configterminalpaf) object;
        if ((this.codterminal == null && other.codterminal != null) || (this.codterminal != null && !this.codterminal.equals(other.codterminal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Configterminalpaf[ codterminal=" + codterminal + " ]";
    }
    
}
