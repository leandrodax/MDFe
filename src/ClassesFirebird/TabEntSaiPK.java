/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;



public class TabEntSaiPK  {
    
    private int codseq;
    private String codcli;

    public TabEntSaiPK() {
    }

    public TabEntSaiPK(int codseq, String codcli) {
        this.codseq = codseq;
        this.codcli = codcli;
    }

    public int getCodseq() {
        return codseq;
    }

    public void setCodseq(int codseq) {
        this.codseq = codseq;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codseq;
        hash += (codcli != null ? codcli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabEntSaiPK)) {
            return false;
        }
        TabEntSaiPK other = (TabEntSaiPK) object;
        if (this.codseq != other.codseq) {
            return false;
        }
        if ((this.codcli == null && other.codcli != null) || (this.codcli != null && !this.codcli.equals(other.codcli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabEntSaiPK[ codseq=" + codseq + ", codcli=" + codcli + " ]";
    }
    
}
