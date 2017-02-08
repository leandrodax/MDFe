/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;


public class Arquivo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer codlib;
    private Date dtArqLib;
    private String arquivo;
    private Date dtdownload;
    private String cnpjemp;
    private String codcli;

    public Arquivo() {
    }

    public Arquivo(Integer codlib) {
        this.codlib = codlib;
    }

    public Arquivo(Integer codlib, Date dtArqLib, String arquivo) {
        this.codlib = codlib;
        this.dtArqLib = dtArqLib;
        this.arquivo = arquivo;
    }

    public Integer getCodlib() {
        return codlib;
    }

    public void setCodlib(Integer codlib) {
        this.codlib = codlib;
    }

    public Date getDtArqLib() {
        return dtArqLib;
    }

    public void setDtArqLib(Date dtArqLib) {
        this.dtArqLib = dtArqLib;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public Date getDtdownload() {
        return dtdownload;
    }

    public void setDtdownload(Date dtdownload) {
        this.dtdownload = dtdownload;
    }

    public String getCnpjemp() {
        return cnpjemp;
    }

    public void setCnpjemp(String cnpjemp) {
        this.cnpjemp = cnpjemp;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codlib != null ? codlib.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arquivo)) {
            return false;
        }
        Arquivo other = (Arquivo) object;
        if ((this.codlib == null && other.codlib != null) || (this.codlib != null && !this.codlib.equals(other.codlib))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Arquivo[ codlib=" + codlib + " ]";
    }
    
}
