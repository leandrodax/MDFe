/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class OpcaousuPK  {

    private int codsis;
    private String codop;
    private int codusu;

    public OpcaousuPK() {
    }

    public OpcaousuPK(int codsis, String codop, int codusu) {
        this.codsis = codsis;
        this.codop = codop;
        this.codusu = codusu;
    }

    public int getCodsis() {
        return codsis;
    }

    public void setCodsis(int codsis) {
        this.codsis = codsis;
    }

    public String getCodop() {
        return codop;
    }

    public void setCodop(String codop) {
        this.codop = codop;
    }

    public int getCodusu() {
        return codusu;
    }

    public void setCodusu(int codusu) {
        this.codusu = codusu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codsis;
        hash += (codop != null ? codop.hashCode() : 0);
        hash += (int) codusu;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OpcaousuPK)) {
            return false;
        }
        OpcaousuPK other = (OpcaousuPK) object;
        if (this.codsis != other.codsis) {
            return false;
        }
        if ((this.codop == null && other.codop != null) || (this.codop != null && !this.codop.equals(other.codop))) {
            return false;
        }
        if (this.codusu != other.codusu) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.OpcaousuPK[ codsis=" + codsis + ", codop=" + codop + ", codusu=" + codusu + " ]";
    }
    
}
