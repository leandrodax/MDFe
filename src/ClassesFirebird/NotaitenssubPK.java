/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class NotaitenssubPK {
    
    private int codfil;
    private int codfor;
    private String nrnota;
    private int nritem;
    private String codpro;
    private String referencia;
    private String modelo;
    private String cor;
    private String tamanho;

    public NotaitenssubPK() {
    }

    public NotaitenssubPK(int codfil, int codfor, String nrnota, int nritem, String codpro, String referencia, String modelo, String cor, String tamanho) {
        this.codfil = codfil;
        this.codfor = codfor;
        this.nrnota = nrnota;
        this.nritem = nritem;
        this.codpro = codpro;
        this.referencia = referencia;
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    public int getCodfor() {
        return codfor;
    }

    public void setCodfor(int codfor) {
        this.codfor = codfor;
    }

    public String getNrnota() {
        return nrnota;
    }

    public void setNrnota(String nrnota) {
        this.nrnota = nrnota;
    }

    public int getNritem() {
        return nritem;
    }

    public void setNritem(int nritem) {
        this.nritem = nritem;
    }

    public String getCodpro() {
        return codpro;
    }

    public void setCodpro(String codpro) {
        this.codpro = codpro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codfil;
        hash += (int) codfor;
        hash += (nrnota != null ? nrnota.hashCode() : 0);
        hash += (int) nritem;
        hash += (codpro != null ? codpro.hashCode() : 0);
        hash += (referencia != null ? referencia.hashCode() : 0);
        hash += (modelo != null ? modelo.hashCode() : 0);
        hash += (cor != null ? cor.hashCode() : 0);
        hash += (tamanho != null ? tamanho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NotaitenssubPK)) {
            return false;
        }
        NotaitenssubPK other = (NotaitenssubPK) object;
        if (this.codfil != other.codfil) {
            return false;
        }
        if (this.codfor != other.codfor) {
            return false;
        }
        if ((this.nrnota == null && other.nrnota != null) || (this.nrnota != null && !this.nrnota.equals(other.nrnota))) {
            return false;
        }
        if (this.nritem != other.nritem) {
            return false;
        }
        if ((this.codpro == null && other.codpro != null) || (this.codpro != null && !this.codpro.equals(other.codpro))) {
            return false;
        }
        if ((this.referencia == null && other.referencia != null) || (this.referencia != null && !this.referencia.equals(other.referencia))) {
            return false;
        }
        if ((this.modelo == null && other.modelo != null) || (this.modelo != null && !this.modelo.equals(other.modelo))) {
            return false;
        }
        if ((this.cor == null && other.cor != null) || (this.cor != null && !this.cor.equals(other.cor))) {
            return false;
        }
        if ((this.tamanho == null && other.tamanho != null) || (this.tamanho != null && !this.tamanho.equals(other.tamanho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.NotaitenssubPK[ codfil=" + codfil + ", codfor=" + codfor + ", nrnota=" + nrnota + ", nritem=" + nritem + ", codpro=" + codpro + ", referencia=" + referencia + ", modelo=" + modelo + ", cor=" + cor + ", tamanho=" + tamanho + " ]";
    }
    
}
