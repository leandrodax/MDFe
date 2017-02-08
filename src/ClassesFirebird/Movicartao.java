/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.util.Date;

public class Movicartao {
    private static final long serialVersionUID = 1L;
    protected MovicartaoPK movicartaoPK;
    private Integer codfil;
    private String codcli;
    private String nomcli;
    private Integer nrcaixa;
    private Integer nrabert;
    private Integer codforma;
    private String nomforma;
    private Integer codcartao;
    private String nomcartao;
    private Character tpparctef;
    private Character operactef;
    private Character tptransac;
    private String tpoperac;
    private String nrautor;
    private Integer nrparcela;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    private Double vlregis;
    private Date dtemissao;
    private String hremissao;
    private Character situacao;
    private Character tpmovcx;
    
    public Movicartao() {
    }

    public Movicartao(MovicartaoPK movicartaoPK) {
        this.movicartaoPK = movicartaoPK;
    }

    public Movicartao(int nrregis, String nrcontr) {
        this.movicartaoPK = new MovicartaoPK(nrregis, nrcontr);
    }

    public MovicartaoPK getMovicartaoPK() {
        return movicartaoPK;
    }

    public void setMovicartaoPK(MovicartaoPK movicartaoPK) {
        this.movicartaoPK = movicartaoPK;
    }

    public Integer getCodfil() {
        return codfil;
    }

    public void setCodfil(Integer codfil) {
        this.codfil = codfil;
    }

    public String getCodcli() {
        return codcli;
    }

    public void setCodcli(String codcli) {
        this.codcli = codcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public Integer getNrcaixa() {
        return nrcaixa;
    }

    public void setNrcaixa(Integer nrcaixa) {
        this.nrcaixa = nrcaixa;
    }

    public Integer getNrabert() {
        return nrabert;
    }

    public void setNrabert(Integer nrabert) {
        this.nrabert = nrabert;
    }

    public Integer getCodforma() {
        return codforma;
    }

    public void setCodforma(Integer codforma) {
        this.codforma = codforma;
    }

    public String getNomforma() {
        return nomforma;
    }

    public void setNomforma(String nomforma) {
        this.nomforma = nomforma;
    }

    public Integer getCodcartao() {
        return codcartao;
    }

    public void setCodcartao(Integer codcartao) {
        this.codcartao = codcartao;
    }

    public String getNomcartao() {
        return nomcartao;
    }

    public void setNomcartao(String nomcartao) {
        this.nomcartao = nomcartao;
    }

    public Character getTpparctef() {
        return tpparctef;
    }

    public void setTpparctef(Character tpparctef) {
        this.tpparctef = tpparctef;
    }

    public Character getOperactef() {
        return operactef;
    }

    public void setOperactef(Character operactef) {
        this.operactef = operactef;
    }

    public Character getTptransac() {
        return tptransac;
    }

    public void setTptransac(Character tptransac) {
        this.tptransac = tptransac;
    }

    public String getTpoperac() {
        return tpoperac;
    }

    public void setTpoperac(String tpoperac) {
        this.tpoperac = tpoperac;
    }

    public String getNrautor() {
        return nrautor;
    }

    public void setNrautor(String nrautor) {
        this.nrautor = nrautor;
    }

    public Integer getNrparcela() {
        return nrparcela;
    }

    public void setNrparcela(Integer nrparcela) {
        this.nrparcela = nrparcela;
    }

    public Double getVlregis() {
        return vlregis;
    }

    public void setVlregis(Double vlregis) {
        this.vlregis = vlregis;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public String getHremissao() {
        return hremissao;
    }

    public void setHremissao(String hremissao) {
        this.hremissao = hremissao;
    }

    public Character getSituacao() {
        return situacao;
    }

    public void setSituacao(Character situacao) {
        this.situacao = situacao;
    }

    public Character getTpmovcx() {
        return tpmovcx;
    }

    public void setTpmovcx(Character tpmovcx) {
        this.tpmovcx = tpmovcx;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (movicartaoPK != null ? movicartaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movicartao)) {
            return false;
        }
        Movicartao other = (Movicartao) object;
        if ((this.movicartaoPK == null && other.movicartaoPK != null) || (this.movicartaoPK != null && !this.movicartaoPK.equals(other.movicartaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Movicartao[ movicartaoPK=" + movicartaoPK + " ]";
    }
    
}
