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
public class Tabveic implements Serializable {
    private static final long serialVersionUID = 1L;
    
    
    private Short codveic;
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    private String cidade;
    private String estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double kilomini;
    private Double kilomfim;
    private Double kilocomb;
    private Integer rgcodusu;
    private String rgusuario;
    
    private Date rgdata;
    private String rgevento;
    private Double pesoveic;
    private String rntc;
    private Character propterc;

    public Tabveic() {
    }

    public Tabveic(Short codveic) {
        this.codveic = codveic;
    }

    public Short getCodveic() {
        return codveic;
    }

    public void setCodveic(Short codveic) {
        this.codveic = codveic;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getKilomini() {
        return kilomini;
    }

    public void setKilomini(Double kilomini) {
        this.kilomini = kilomini;
    }

    public Double getKilomfim() {
        return kilomfim;
    }

    public void setKilomfim(Double kilomfim) {
        this.kilomfim = kilomfim;
    }

    public Double getKilocomb() {
        return kilocomb;
    }

    public void setKilocomb(Double kilocomb) {
        this.kilocomb = kilocomb;
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

    public String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }

    public Double getPesoveic() {
        return pesoveic;
    }

    public void setPesoveic(Double pesoveic) {
        this.pesoveic = pesoveic;
    }

    public String getRntc() {
        return rntc;
    }

    public void setRntc(String rntc) {
        this.rntc = rntc;
    }

    public Character getPropterc() {
        return propterc;
    }

    public void setPropterc(Character propterc) {
        this.propterc = propterc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codveic != null ? codveic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tabveic)) {
            return false;
        }
        Tabveic other = (Tabveic) object;
        if ((this.codveic == null && other.codveic != null) || (this.codveic != null && !this.codveic.equals(other.codveic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Tabveic[ codveic=" + codveic + " ]";
    }
    
}
