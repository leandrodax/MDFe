/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;


public class TabfpagfilPK {
    
    private int codforma;
    private int codfil;

    public TabfpagfilPK() {
    }

    public TabfpagfilPK(int codforma, int codfil) {
        this.codforma = codforma;
        this.codfil = codfil;
    }

    public int getCodforma() {
        return codforma;
    }

    public void setCodforma(int codforma) {
        this.codforma = codforma;
    }

    public int getCodfil() {
        return codfil;
    }

    public void setCodfil(int codfil) {
        this.codfil = codfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codforma;
        hash += (int) codfil;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabfpagfilPK)) {
            return false;
        }
        TabfpagfilPK other = (TabfpagfilPK) object;
        if (this.codforma != other.codforma) {
            return false;
        }
        if (this.codfil != other.codfil) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.TabfpagfilPK[ codforma=" + codforma + ", codfil=" + codfil + " ]";
    }
    
}
