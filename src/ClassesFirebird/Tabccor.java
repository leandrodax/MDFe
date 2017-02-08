/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;


public class Tabccor{
    
    private static final long serialVersionUID = 1L;
    private Integer codccor;
    private int codban;
    private int codage;
    private String nrccor;
    private Character atvccor;
    private String titccor;
    private Integer rgcodusu;
    private Integer codfil;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    private Integer codconta;
    private Character tpccor;

    public Tabccor() {
    }

    public Tabccor(Integer codccor) {
        this.codccor = codccor;
    }

    public Tabccor(Integer codccor, int codban, int codage) {
        this.codccor = codccor;
        this.codban = codban;
        this.codage = codage;
    }

    public Integer getCodccor() {
        return codccor;
    }

    public void setCodccor(Integer codccor) {
        this.codccor = codccor;
    }

    public int getCodban() {
        return codban;
    }

    public void setCodban(int codban) {
        this.codban = codban;
    }

    public int getCodage() {
        return codage;
    }

    public void setCodage(int codage) {
        this.codage = codage;
    }

    public String getNrccor() {
        return nrccor;
    }

    public void setNrccor(String nrccor) {
        this.nrccor = nrccor;
    }

    public Character getAtvccor() {
        return atvccor;
    }

    public void setAtvccor(Character atvccor) {
        this.atvccor = atvccor;
    }

    public String getTitccor() {
        return titccor;
    }

    public void setTitccor(String titccor) {
        this.titccor = titccor;
    }

    public Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
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

    public Integer getCodconta() {
        return codconta;
    }

    public void setCodconta(Integer codconta) {
        this.codconta = codconta;
    }

    public Character getTpccor() {
        return tpccor;
    }

    public void setTpccor(Character tpccor) {
        this.tpccor = tpccor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codccor != null ? codccor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabccor)) {
            return false;
        }
        Tabccor other = (Tabccor) object;
        if ((this.codccor == null && other.codccor != null) || (this.codccor != null && !this.codccor.equals(other.codccor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabccor[ codccor=" + codccor + " ]";
    }
    
}
