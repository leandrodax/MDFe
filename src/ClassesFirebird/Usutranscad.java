/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Usutranscad implements Serializable {
    private static final long serialVersionUID = 1L;    
    protected UsutranscadPK usutranscadPK;
    private String nomusu;
    private Date dtini;    
    private Date dtfim;
    private String hrini;
    private String hrfim;
    private Character impfilial;
    private Character impformpag;
    private Character impplanpag;
    private Character impgrupo;
    private Character impfabric;
    private Character impproduto;
    private Character impredecli;
    private Character impramoativ;
    private Character implocalrec;
    private Character impsetor;
    private Character impvend;
    private Character impcliente;
    private Character impusuario;
    private Character implocalpag;
    private Character impfornec;
    private Character impprofis;
    private Character impcobrad;
    private Character impcontas;
    private Character impplanocon;
    private Character impnatoper;
    private Character impserv;
    private Character imptabpreco;
    private Character imptranrede;
    private String caminho;
    private Character imptranrota;
    private Integer nrtransf;
    
    private Date dtrecarq;
    private Character imptranemail;
    private Character imptranline;

    public Usutranscad() {
    }

    public Usutranscad(UsutranscadPK usutranscadPK) {
        this.usutranscadPK = usutranscadPK;
    }

    public Usutranscad(int codfil, Date dttransf, int codusu) {
        this.usutranscadPK = new UsutranscadPK(codfil, dttransf, codusu);
    }

    public UsutranscadPK getUsutranscadPK() {
        return usutranscadPK;
    }

    public void setUsutranscadPK(UsutranscadPK usutranscadPK) {
        this.usutranscadPK = usutranscadPK;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public Date getDtini() {
        return dtini;
    }

    public void setDtini(Date dtini) {
        this.dtini = dtini;
    }

    public Date getDtfim() {
        return dtfim;
    }

    public void setDtfim(Date dtfim) {
        this.dtfim = dtfim;
    }

    public String getHrini() {
        return hrini;
    }

    public void setHrini(String hrini) {
        this.hrini = hrini;
    }

    public String getHrfim() {
        return hrfim;
    }

    public void setHrfim(String hrfim) {
        this.hrfim = hrfim;
    }

    public Character getImpfilial() {
        return impfilial;
    }

    public void setImpfilial(Character impfilial) {
        this.impfilial = impfilial;
    }

    public Character getImpformpag() {
        return impformpag;
    }

    public void setImpformpag(Character impformpag) {
        this.impformpag = impformpag;
    }

    public Character getImpplanpag() {
        return impplanpag;
    }

    public void setImpplanpag(Character impplanpag) {
        this.impplanpag = impplanpag;
    }

    public Character getImpgrupo() {
        return impgrupo;
    }

    public void setImpgrupo(Character impgrupo) {
        this.impgrupo = impgrupo;
    }

    public Character getImpfabric() {
        return impfabric;
    }

    public void setImpfabric(Character impfabric) {
        this.impfabric = impfabric;
    }

    public Character getImpproduto() {
        return impproduto;
    }

    public void setImpproduto(Character impproduto) {
        this.impproduto = impproduto;
    }

    public Character getImpredecli() {
        return impredecli;
    }

    public void setImpredecli(Character impredecli) {
        this.impredecli = impredecli;
    }

    public Character getImpramoativ() {
        return impramoativ;
    }

    public void setImpramoativ(Character impramoativ) {
        this.impramoativ = impramoativ;
    }

    public Character getImplocalrec() {
        return implocalrec;
    }

    public void setImplocalrec(Character implocalrec) {
        this.implocalrec = implocalrec;
    }

    public Character getImpsetor() {
        return impsetor;
    }

    public void setImpsetor(Character impsetor) {
        this.impsetor = impsetor;
    }

    public Character getImpvend() {
        return impvend;
    }

    public void setImpvend(Character impvend) {
        this.impvend = impvend;
    }

    public Character getImpcliente() {
        return impcliente;
    }

    public void setImpcliente(Character impcliente) {
        this.impcliente = impcliente;
    }

    public Character getImpusuario() {
        return impusuario;
    }

    public void setImpusuario(Character impusuario) {
        this.impusuario = impusuario;
    }

    public Character getImplocalpag() {
        return implocalpag;
    }

    public void setImplocalpag(Character implocalpag) {
        this.implocalpag = implocalpag;
    }

    public Character getImpfornec() {
        return impfornec;
    }

    public void setImpfornec(Character impfornec) {
        this.impfornec = impfornec;
    }

    public Character getImpprofis() {
        return impprofis;
    }

    public void setImpprofis(Character impprofis) {
        this.impprofis = impprofis;
    }

    public Character getImpcobrad() {
        return impcobrad;
    }

    public void setImpcobrad(Character impcobrad) {
        this.impcobrad = impcobrad;
    }

    public Character getImpcontas() {
        return impcontas;
    }

    public void setImpcontas(Character impcontas) {
        this.impcontas = impcontas;
    }

    public Character getImpplanocon() {
        return impplanocon;
    }

    public void setImpplanocon(Character impplanocon) {
        this.impplanocon = impplanocon;
    }

    public Character getImpnatoper() {
        return impnatoper;
    }

    public void setImpnatoper(Character impnatoper) {
        this.impnatoper = impnatoper;
    }

    public Character getImpserv() {
        return impserv;
    }

    public void setImpserv(Character impserv) {
        this.impserv = impserv;
    }

    public Character getImptabpreco() {
        return imptabpreco;
    }

    public void setImptabpreco(Character imptabpreco) {
        this.imptabpreco = imptabpreco;
    }

    public Character getImptranrede() {
        return imptranrede;
    }

    public void setImptranrede(Character imptranrede) {
        this.imptranrede = imptranrede;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Character getImptranrota() {
        return imptranrota;
    }

    public void setImptranrota(Character imptranrota) {
        this.imptranrota = imptranrota;
    }

    public Integer getNrtransf() {
        return nrtransf;
    }

    public void setNrtransf(Integer nrtransf) {
        this.nrtransf = nrtransf;
    }

    public Date getDtrecarq() {
        return dtrecarq;
    }

    public void setDtrecarq(Date dtrecarq) {
        this.dtrecarq = dtrecarq;
    }

    public Character getImptranemail() {
        return imptranemail;
    }

    public void setImptranemail(Character imptranemail) {
        this.imptranemail = imptranemail;
    }

    public Character getImptranline() {
        return imptranline;
    }

    public void setImptranline(Character imptranline) {
        this.imptranline = imptranline;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usutranscadPK != null ? usutranscadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usutranscad)) {
            return false;
        }
        Usutranscad other = (Usutranscad) object;
        if ((this.usutranscadPK == null && other.usutranscadPK != null) || (this.usutranscadPK != null && !this.usutranscadPK.equals(other.usutranscadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Usutranscad[ usutranscadPK=" + usutranscadPK + " ]";
    }
    
}
