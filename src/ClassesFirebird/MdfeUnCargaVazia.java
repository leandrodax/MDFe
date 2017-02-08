/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class MdfeUnCargaVazia{

    
    private Integer codigo;
   
    private String idUnCarga;
    
    private String tpUnCarga;

    public MdfeUnCargaVazia() {
    }

    public MdfeUnCargaVazia(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getIdUnCarga() {
        return idUnCarga;
    }

    public void setIdUnCarga(String idUnCarga) {
        this.idUnCarga = idUnCarga;
    }

    public String getTpUnCarga() {
        return tpUnCarga;
    }

    public void setTpUnCarga(String tpUnCarga) {
        this.tpUnCarga = tpUnCarga;
    }

    
}
