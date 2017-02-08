/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;


public class MdfeReboque implements Serializable {

    
    private String numero;
   
    private Integer codveic;
   
    private String placa;
    
    private String estado;
    
    private String ciot;
    
    private String codintveic;
    
    private Double tara;
    
    private Double capacidadeKg;
    
    private Double capacidadeM3;
    
    private String renavam;
    
    private String tpRodado;
    
    private String tpCarroceria;
    
    private Integer codPropietario;
   
    private String propNome;
    
    private String propRntc;
   
    private String propTipo;
    
    private String propUf;
    
    private String propCpf;
    
    private String propCnpj;
    
    private String propIe;

    public MdfeReboque() {
    }

    public MdfeReboque(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getCodveic() {
        return codveic;
    }

    public void setCodveic(Integer codveic) {
        this.codveic = codveic;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiot() {
        return ciot;
    }

    public void setCiot(String ciot) {
        this.ciot = ciot;
    }

    public String getCodintveic() {
        return codintveic;
    }

    public void setCodintveic(String codintveic) {
        this.codintveic = codintveic;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Double getCapacidadeKg() {
        return capacidadeKg;
    }

    public void setCapacidadeKg(Double capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }

    public Double getCapacidadeM3() {
        return capacidadeM3;
    }

    public void setCapacidadeM3(Double capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getTpRodado() {
        return tpRodado;
    }

    public void setTpRodado(String tpRodado) {
        this.tpRodado = tpRodado;
    }

    public String getTpCarroceria() {
        return tpCarroceria;
    }

    public void setTpCarroceria(String tpCarroceria) {
        this.tpCarroceria = tpCarroceria;
    }

    public Integer getCodPropietario() {
        return codPropietario;
    }

    public void setCodPropietario(Integer codPropietario) {
        this.codPropietario = codPropietario;
    }

    public String getPropNome() {
        return propNome;
    }

    public void setPropNome(String propNome) {
        this.propNome = propNome;
    }

    public String getPropRntc() {
        return propRntc;
    }

    public void setPropRntc(String propRntc) {
        this.propRntc = propRntc;
    }

    public String getPropTipo() {
        return propTipo;
    }

    public void setPropTipo(String propTipo) {
        this.propTipo = propTipo;
    }

    public String getPropUf() {
        return propUf;
    }

    public void setPropUf(String propUf) {
        this.propUf = propUf;
    }

    public String getPropCpf() {
        return propCpf;
    }

    public void setPropCpf(String propCpf) {
        this.propCpf = propCpf;
    }

    public String getPropCnpj() {
        return propCnpj;
    }

    public void setPropCnpj(String propCnpj) {
        this.propCnpj = propCnpj;
    }

    public String getPropIe() {
        return propIe;
    }

    public void setPropIe(String propIe) {
        this.propIe = propIe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdfeReboque)) {
            return false;
        }
        MdfeReboque other = (MdfeReboque) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.MdfeReboque[ numero=" + numero + " ]";
    }
    
}
