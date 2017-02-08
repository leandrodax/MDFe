/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class MdfeLocalCarregamento {

   
    private String numero;
   
    private String uf;
    
    private String codMun;
    
    private String nomeMun;

    public MdfeLocalCarregamento() {
    }

    public MdfeLocalCarregamento(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCodMun() {
        return codMun;
    }

    public void setCodMun(String codMun) {
        this.codMun = codMun;
    }

    public String getNomeMun() {
        return nomeMun;
    }

    public void setNomeMun(String nomeMun) {
        this.nomeMun = nomeMun;
    }

    
    
}
