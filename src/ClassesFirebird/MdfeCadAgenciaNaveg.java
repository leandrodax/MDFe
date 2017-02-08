
package ClassesFirebird;

public class MdfeCadAgenciaNaveg {
 
    private Integer codAgencia;
   
    private String cnpj;
    
    private String nome;

    public MdfeCadAgenciaNaveg() {
    }

    public MdfeCadAgenciaNaveg(Integer codAgencia) {
        this.codAgencia = codAgencia;
    }

    public Integer getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(Integer codAgencia) {
        this.codAgencia = codAgencia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
