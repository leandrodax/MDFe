/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class MdfeCadEmbarcacao  {

    private Integer codigo;
    
    private String codEmb;
  
    private String codTpEmb;
   
    private String nomeEmb;

    public MdfeCadEmbarcacao() {
    }

    public MdfeCadEmbarcacao(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodEmb() {
        return codEmb;
    }

    public void setCodEmb(String codEmb) {
        this.codEmb = codEmb;
    }

    public String getCodTpEmb() {
        return codTpEmb;
    }

    public void setCodTpEmb(String codTpEmb) {
        this.codTpEmb = codTpEmb;
    }

    public String getNomeEmb() {
        return nomeEmb;
    }

    public void setNomeEmb(String nomeEmb) {
        this.nomeEmb = nomeEmb;
    }
    
}
