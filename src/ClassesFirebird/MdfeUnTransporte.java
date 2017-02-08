
package ClassesFirebird;

public class MdfeUnTransporte{

    private String numero;
    
    private String tpUnTrans;
    
    private String idUnTrans;
    
    private Double qtdRatTrans;
    
    private String tpDoc;
    
    private String chave;

    public MdfeUnTransporte() {
    }

    public MdfeUnTransporte(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTpUnTrans() {
        return tpUnTrans;
    }

    public void setTpUnTrans(String tpUnTrans) {
        this.tpUnTrans = tpUnTrans;
    }

    public String getIdUnTrans() {
        return idUnTrans;
    }

    public void setIdUnTrans(String idUnTrans) {
        this.idUnTrans = idUnTrans;
    }

    public Double getQtdRatTrans() {
        return qtdRatTrans;
    }

    public void setQtdRatTrans(Double qtdRatTrans) {
        this.qtdRatTrans = qtdRatTrans;
    }

    public String getTpDoc() {
        return tpDoc;
    }

    public void setTpDoc(String tpDoc) {
        this.tpDoc = tpDoc;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    
    
}
