/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;


public class Tabdigcli {
    private static final long serialVersionUID = 1L;
    private Integer iddig;
    private String nomcli;
    private byte[] template1;
    private byte[] template2;
    private byte[] template3;
    private String parentesco;
    private Date dtnascdep;
    private String cpfdep;
    private String rgdep;
    private Character sexo;
    private Character sitbaixa;
    private Date dtbaixa;
    private Tabcli codcli;

    public Tabdigcli() {
    }

    public Tabdigcli(Integer iddig) {
        this.iddig = iddig;
    }

    public Integer getIddig() {
        return iddig;
    }

    public void setIddig(Integer iddig) {
        this.iddig = iddig;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public byte[] getTemplate1() {
        return template1;
    }

    public void setTemplate1(byte[] template1) {
        this.template1 = template1;
    }

    public byte[] getTemplate2() {
        return template2;
    }

    public void setTemplate2(byte[] template2) {
        this.template2 = template2;
    }

    public byte[] getTemplate3() {
        return template3;
    }

    public void setTemplate3(byte[] template3) {
        this.template3 = template3;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Date getDtnascdep() {
        return dtnascdep;
    }

    public void setDtnascdep(Date dtnascdep) {
        this.dtnascdep = dtnascdep;
    }

    public String getCpfdep() {
        return cpfdep;
    }

    public void setCpfdep(String cpfdep) {
        this.cpfdep = cpfdep;
    }

    public String getRgdep() {
        return rgdep;
    }

    public void setRgdep(String rgdep) {
        this.rgdep = rgdep;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getSitbaixa() {
        return sitbaixa;
    }

    public void setSitbaixa(Character sitbaixa) {
        this.sitbaixa = sitbaixa;
    }

    public Date getDtbaixa() {
        return dtbaixa;
    }

    public void setDtbaixa(Date dtbaixa) {
        this.dtbaixa = dtbaixa;
    }

    public Tabcli getCodcli() {
        return codcli;
    }

    public void setCodcli(Tabcli codcli) {
        this.codcli = codcli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddig != null ? iddig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabdigcli)) {
            return false;
        }
        Tabdigcli other = (Tabdigcli) object;
        if ((this.iddig == null && other.iddig != null) || (this.iddig != null && !this.iddig.equals(other.iddig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabdigcli[ iddig=" + iddig + " ]";
    }
    
}
