/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;

/**
 *
 * @author vplayer
 */
public class ChequerPK implements Serializable {
    private String banco;
    private String agen;
    private String conta;
    private String numch;

    public ChequerPK() {
    }

    public ChequerPK(String banco, String agen, String conta, String numch) {
        this.banco = banco;
        this.agen = agen;
        this.conta = conta;
        this.numch = numch;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgen() {
        return agen;
    }

    public void setAgen(String agen) {
        this.agen = agen;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getNumch() {
        return numch;
    }

    public void setNumch(String numch) {
        this.numch = numch;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (banco != null ? banco.hashCode() : 0);
        hash += (agen != null ? agen.hashCode() : 0);
        hash += (conta != null ? conta.hashCode() : 0);
        hash += (numch != null ? numch.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChequerPK)) {
            return false;
        }
        ChequerPK other = (ChequerPK) object;
        if ((this.banco == null && other.banco != null) || (this.banco != null && !this.banco.equals(other.banco))) {
            return false;
        }
        if ((this.agen == null && other.agen != null) || (this.agen != null && !this.agen.equals(other.agen))) {
            return false;
        }
        if ((this.conta == null && other.conta != null) || (this.conta != null && !this.conta.equals(other.conta))) {
            return false;
        }
        if ((this.numch == null && other.numch != null) || (this.numch != null && !this.numch.equals(other.numch))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.ChequerPK[ banco=" + banco + ", agen=" + agen + ", conta=" + conta + ", numch=" + numch + " ]";
    }
    
}
