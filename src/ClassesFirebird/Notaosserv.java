/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

public class Notaosserv {
    
    private static final long serialVersionUID = 1L;
    protected NotaosservPK notaosservPK;
    private String descserv;
    private String nomprof;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlcomprof;
    private Double qtdserv;
    private Double vlserv;
    private Character tpdesacrnot;
    private Double vldesacrnot;
    private Character tpdesacrite;
    private Double vldesacrite;
    private String indice;
    private Double aliss;
    private Double vliss;
    private Double total;
    private Integer codven;
    private Double vlcomvend;
    private Notaos notaos;

    public Notaosserv() {
    }

    public Notaosserv(NotaosservPK notaosservPK) {
        this.notaosservPK = notaosservPK;
    }

    public Notaosserv(int nros, int codserv, int codprof) {
        this.notaosservPK = new NotaosservPK(nros, codserv, codprof);
    }

    public NotaosservPK getNotaosservPK() {
        return notaosservPK;
    }

    public void setNotaosservPK(NotaosservPK notaosservPK) {
        this.notaosservPK = notaosservPK;
    }

    public String getDescserv() {
        return descserv;
    }

    public void setDescserv(String descserv) {
        this.descserv = descserv;
    }

    public String getNomprof() {
        return nomprof;
    }

    public void setNomprof(String nomprof) {
        this.nomprof = nomprof;
    }

    public Double getVlcomprof() {
        return vlcomprof;
    }

    public void setVlcomprof(Double vlcomprof) {
        this.vlcomprof = vlcomprof;
    }

    public Double getQtdserv() {
        return qtdserv;
    }

    public void setQtdserv(Double qtdserv) {
        this.qtdserv = qtdserv;
    }

    public Double getVlserv() {
        return vlserv;
    }

    public void setVlserv(Double vlserv) {
        this.vlserv = vlserv;
    }

    public Character getTpdesacrnot() {
        return tpdesacrnot;
    }

    public void setTpdesacrnot(Character tpdesacrnot) {
        this.tpdesacrnot = tpdesacrnot;
    }

    public Double getVldesacrnot() {
        return vldesacrnot;
    }

    public void setVldesacrnot(Double vldesacrnot) {
        this.vldesacrnot = vldesacrnot;
    }

    public Character getTpdesacrite() {
        return tpdesacrite;
    }

    public void setTpdesacrite(Character tpdesacrite) {
        this.tpdesacrite = tpdesacrite;
    }

    public Double getVldesacrite() {
        return vldesacrite;
    }

    public void setVldesacrite(Double vldesacrite) {
        this.vldesacrite = vldesacrite;
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }

    public Double getAliss() {
        return aliss;
    }

    public void setAliss(Double aliss) {
        this.aliss = aliss;
    }

    public Double getVliss() {
        return vliss;
    }

    public void setVliss(Double vliss) {
        this.vliss = vliss;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getCodven() {
        return codven;
    }

    public void setCodven(Integer codven) {
        this.codven = codven;
    }

    public Double getVlcomvend() {
        return vlcomvend;
    }

    public void setVlcomvend(Double vlcomvend) {
        this.vlcomvend = vlcomvend;
    }

    public Notaos getNotaos() {
        return notaos;
    }

    public void setNotaos(Notaos notaos) {
        this.notaos = notaos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notaosservPK != null ? notaosservPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notaosserv)) {
            return false;
        }
        Notaosserv other = (Notaosserv) object;
        if ((this.notaosservPK == null && other.notaosservPK != null) || (this.notaosservPK != null && !this.notaosservPK.equals(other.notaosservPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Notaosserv[ notaosservPK=" + notaosservPK + " ]";
    }
    
}
