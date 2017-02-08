/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


import java.util.Date;


public class Tabage{
    
    private static final long serialVersionUID = 1L;
    private Integer codage;
    private int codban;
    private String codagencia;
    private String nomagencia;
    private String endagencia;
    private String baiagencia;
    private String cidagencia;
    private String cepagencia;
    private String ufagencia;
    private Integer rgcodusu;
    private String rgusuario;
    private Date rgdata;
    private Character rgevento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double desccheque;
    private String nomgerente;
    private String telgerente;
    private String emailgerente;
    private Character tpgerente;

    public Tabage() {
    }

    public Tabage(Integer codage) {
        this.codage = codage;
    }

    public Tabage(Integer codage, int codban) {
        this.codage = codage;
        this.codban = codban;
    }

    public Integer getCodage() {
        return codage;
    }

    public void setCodage(Integer codage) {
        this.codage = codage;
    }

    public int getCodban() {
        return codban;
    }

    public void setCodban(int codban) {
        this.codban = codban;
    }

    public String getCodagencia() {
        return codagencia;
    }

    public void setCodagencia(String codagencia) {
        this.codagencia = codagencia;
    }

    public String getNomagencia() {
        return nomagencia;
    }

    public void setNomagencia(String nomagencia) {
        this.nomagencia = nomagencia;
    }

    public String getEndagencia() {
        return endagencia;
    }

    public void setEndagencia(String endagencia) {
        this.endagencia = endagencia;
    }

    public String getBaiagencia() {
        return baiagencia;
    }

    public void setBaiagencia(String baiagencia) {
        this.baiagencia = baiagencia;
    }

    public String getCidagencia() {
        return cidagencia;
    }

    public void setCidagencia(String cidagencia) {
        this.cidagencia = cidagencia;
    }

    public String getCepagencia() {
        return cepagencia;
    }

    public void setCepagencia(String cepagencia) {
        this.cepagencia = cepagencia;
    }

    public String getUfagencia() {
        return ufagencia;
    }

    public void setUfagencia(String ufagencia) {
        this.ufagencia = ufagencia;
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

    public Double getDesccheque() {
        return desccheque;
    }

    public void setDesccheque(Double desccheque) {
        this.desccheque = desccheque;
    }

    public String getNomgerente() {
        return nomgerente;
    }

    public void setNomgerente(String nomgerente) {
        this.nomgerente = nomgerente;
    }

    public String getTelgerente() {
        return telgerente;
    }

    public void setTelgerente(String telgerente) {
        this.telgerente = telgerente;
    }

    public String getEmailgerente() {
        return emailgerente;
    }

    public void setEmailgerente(String emailgerente) {
        this.emailgerente = emailgerente;
    }

    public Character getTpgerente() {
        return tpgerente;
    }

    public void setTpgerente(Character tpgerente) {
        this.tpgerente = tpgerente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codage != null ? codage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabage)) {
            return false;
        }
        Tabage other = (Tabage) object;
        if ((this.codage == null && other.codage != null) || (this.codage != null && !this.codage.equals(other.codage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabage[ codage=" + codage + " ]";
    }
    
}
