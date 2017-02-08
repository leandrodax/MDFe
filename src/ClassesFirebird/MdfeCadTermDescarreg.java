/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;


public class MdfeCadTermDescarreg implements Serializable {

    
    private Integer codigo;
   
    private String codTermDescarreg;
    
    private String nomTermDescarreg;

    public MdfeCadTermDescarreg() {
    }

    public MdfeCadTermDescarreg(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodTermDescarreg() {
        return codTermDescarreg;
    }

    public void setCodTermDescarreg(String codTermDescarreg) {
        this.codTermDescarreg = codTermDescarreg;
    }

    public String getNomTermDescarreg() {
        return nomTermDescarreg;
    }

    public void setNomTermDescarreg(String nomTermDescarreg) {
        this.nomTermDescarreg = nomTermDescarreg;
    }
    
}
