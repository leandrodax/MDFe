/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class MdfeCadTermCarreg{

   
    private Integer codigo;
    
    private String codTermCarreg;
    
    private String nomTermCarreg;

    public MdfeCadTermCarreg() {
    }

    public MdfeCadTermCarreg(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodTermCarreg() {
        return codTermCarreg;
    }

    public void setCodTermCarreg(String codTermCarreg) {
        this.codTermCarreg = codTermCarreg;
    }

    public String getNomTermCarreg() {
        return nomTermCarreg;
    }

    public void setNomTermCarreg(String nomTermCarreg) {
        this.nomTermCarreg = nomTermCarreg;
    }

    
}
