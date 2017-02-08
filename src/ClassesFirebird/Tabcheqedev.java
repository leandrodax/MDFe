/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;

 

public class Tabcheqedev {
    
    private static final long serialVersionUID = 1L;
    private Integer codedev;
    private Integer codchqe;
    private Integer codmot;
    private String obsdev;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;

    public Tabcheqedev() {
    }

    public Tabcheqedev(Integer codedev) {
        this.codedev = codedev;
    }

    public Integer getCodedev() {
        return codedev;
    }

    public void setCodedev(Integer codedev) {
        this.codedev = codedev;
    }

    public Integer getCodchqe() {
        return codchqe;
    }

    public void setCodchqe(Integer codchqe) {
        this.codchqe = codchqe;
    }

    public Integer getCodmot() {
        return codmot;
    }

    public void setCodmot(Integer codmot) {
        this.codmot = codmot;
    }

    public String getObsdev() {
        return obsdev;
    }

    public void setObsdev(String obsdev) {
        this.obsdev = obsdev;
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
        hash += (codedev != null ? codedev.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabcheqedev)) {
            return false;
        }
        Tabcheqedev other = (Tabcheqedev) object;
        if ((this.codedev == null && other.codedev != null) || (this.codedev != null && !this.codedev.equals(other.codedev))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabcheqedev[ codedev=" + codedev + " ]";
    }
    
}
