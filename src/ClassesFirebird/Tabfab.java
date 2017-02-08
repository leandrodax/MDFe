
package ClassesFirebird;


import java.util.Date;

public class Tabfab {
    
    private static Integer codfab;
    private static String nomfab;
    private static Integer rgcodusu;
    private static String rgusuario;
    private static Date rgdata;
    private static String rgevento;

    public Tabfab() {
    }

    public void Tabfab(Integer codfab) {
        this.codfab = codfab;
    }

    public static Integer getCodfab() {
        return codfab;
    }

    public void setCodfab(Integer codfab) {
        this.codfab = codfab;
    }

    public static String getNomfab() {
        return nomfab;
    }

    public void setNomfab(String nomfab) {
        this.nomfab = nomfab;
    }

    public static Integer getRgcodusu() {
        return rgcodusu;
    }

    public void setRgcodusu(Integer rgcodusu) {
        this.rgcodusu = rgcodusu;
    }

    public static String getRgusuario() {
        return rgusuario;
    }

    public void setRgusuario(String rgusuario) {
        this.rgusuario = rgusuario;
    }

    public static Date getRgdata() {
        return rgdata;
    }

    public void setRgdata(Date rgdata) {
        this.rgdata = rgdata;
    }

    public static String getRgevento() {
        return rgevento;
    }

    public void setRgevento(String rgevento) {
        this.rgevento = rgevento;
    }

}
