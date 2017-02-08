/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class EmisstitrPK {
    private int nremiss;
    private String codtit;
    private String codcli;

    public EmisstitrPK() {
    }

    public EmisstitrPK(int nremiss, String codtit, String codcli) {
        this.nremiss = nremiss;
        this.codtit = codtit;
        this.codcli = codcli;
    }

    public int getNremiss() {
        return nremiss;
    }

    public void setNremiss(int nremiss) {
        this.nremiss = nremiss;
    }

    public String getCodtit() {
        return codtit;
    }

    public void setCodtit(String codtit) {
        this.codtit = codtit;
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
        hash += (int) nremiss;
        hash += (codtit != null ? codtit.hashCode() : 0);
        hash += (codcli != null ? codcli.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmisstitrPK)) {
            return false;
        }
        EmisstitrPK other = (EmisstitrPK) object;
        if (this.nremiss != other.nremiss) {
            return false;
        }
        if ((this.codtit == null && other.codtit != null) || (this.codtit != null && !this.codtit.equals(other.codtit))) {
            return false;
        }
        if ((this.codcli == null && other.codcli != null) || (this.codcli != null && !this.codcli.equals(other.codcli))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.EmisstitrPK[ nremiss=" + nremiss + ", codtit=" + codtit + ", codcli=" + codcli + " ]";
    }
    
}
