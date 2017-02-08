/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import ConexaoDB.Conectar;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author vplayer
 */

public class Tabprof implements Serializable {

    


   
    private static  int    codprof;
    private static  String nomprof;
    private static  String endprof;
    private static  String cidprof;
    private static  String bairro;
    private static  String cpfprof;
    private static  String rgprof;
    private static  String telprof;
    private static  Integer rgcodusu;
    private static  String rgusuario;
    private static  Date   rgdata;
    private static  String rgevento;
    private static  String cargo;
    private static  String funcao;
    private static  Double perccomis;
    private static  Double percomiss;
    private static  Double perccomav;
    private static  Double percoomcc;
    private static  Double percoomap;
    private static  Integer codconta;
    private static  Double salprof;
    private static  Integer codven;    
    private static  Date dtadmissao;
    private static  Double folhavt;
    private static  Double folhainss;
    private static  Double folhaoutros;

    public Tabprof() {
    }

    public static String getBairro() {
        return bairro;
    }

    public static void setBairro(String bairro) {
        Tabprof.bairro = bairro;
    }

    public static String getCargo() {
        return cargo;
    }

    public static void setCargo(String cargo) {
        Tabprof.cargo = cargo;
    }

    public static String getCidprof() {
        return cidprof;
    }

    public static void setCidprof(String cidprof) {
        Tabprof.cidprof = cidprof;
    }

    public static Integer getCodconta() {
        return codconta;
    }

    public static void setCodconta(Integer codconta) {
        Tabprof.codconta = codconta;
    }

    public static int getCodprof() {
        return codprof;
    }

    public static void setCodprof(int codprof) {
        Tabprof.codprof = codprof;
    }

    public static Integer getCodven() {
        return codven;
    }

    public static void setCodven(Integer codven) {
        Tabprof.codven = codven;
    }

    public static String getCpfprof() {
        return cpfprof;
    }

    public static void setCpfprof(String cpfprof) {
        Tabprof.cpfprof = cpfprof;
    }

    public static Date getDtadmissao() {
        return dtadmissao;
    }

    public static void setDtadmissao(Date dtadmissao) {
        Tabprof.dtadmissao = dtadmissao;
    }

    public static String getEndprof() {
        return endprof;
    }

    public static void setEndprof(String endprof) {
        Tabprof.endprof = endprof;
    }

    public static Double getFolhainss() {
        return folhainss;
    }

    public static void setFolhainss(Double folhainss) {
        Tabprof.folhainss = folhainss;
    }

    public static Double getFolhaoutros() {
        return folhaoutros;
    }

    public static void setFolhaoutros(Double folhaoutros) {
        Tabprof.folhaoutros = folhaoutros;
    }

    public static Double getFolhavt() {
        return folhavt;
    }

    public static void setFolhavt(Double folhavt) {
        Tabprof.folhavt = folhavt;
    }

    public static String getFuncao() {
        return funcao;
    }

    public static void setFuncao(String funcao) {
        Tabprof.funcao = funcao;
    }

    public static String getNomprof() {
        return nomprof;
    }

    public static void setNomprof(String nomprof) {
        Tabprof.nomprof = nomprof;
    }

    public static Double getPerccomav() {
        return perccomav;
    }

    public static void setPerccomav(Double perccomav) {
        Tabprof.perccomav = perccomav;
    }

    public static Double getPerccomis() {
        return perccomis;
    }

    public static void setPerccomis(Double perccomis) {
        Tabprof.perccomis = perccomis;
    }

    public static Double getPercomiss() {
        return percomiss;
    }

    public static void setPercomiss(Double percomiss) {
        Tabprof.percomiss = percomiss;
    }

    public static Double getPercoomap() {
        return percoomap;
    }

    public static void setPercoomap(Double percoomap) {
        Tabprof.percoomap = percoomap;
    }

    public static Double getPercoomcc() {
        return percoomcc;
    }

    public static void setPercoomcc(Double percoomcc) {
        Tabprof.percoomcc = percoomcc;
    }

    public static Integer getRgcodusu() {
        return rgcodusu;
    }

    public static void setRgcodusu(Integer rgcodusu) {
        Tabprof.rgcodusu = rgcodusu;
    }

    public static Date getRgdata() {
        return rgdata;
    }

    public static void setRgdata(Date rgdata) {
        Tabprof.rgdata = rgdata;
    }

    public static String getRgevento() {
        return rgevento;
    }

    public static void setRgevento(String rgevento) {
        Tabprof.rgevento = rgevento;
    }

    public static String getRgprof() {
        return rgprof;
    }

    public static void setRgprof(String rgprof) {
        Tabprof.rgprof = rgprof;
    }

    public static String getRgusuario() {
        return rgusuario;
    }

    public static void setRgusuario(String rgusuario) {
        Tabprof.rgusuario = rgusuario;
    }

    public static Double getSalprof() {
        return salprof;
    }

    public static void setSalprof(Double salprof) {
        Tabprof.salprof = salprof;
    }

    public static String getTelprof() {
        return telprof;
    }

    public static void setTelprof(String telprof) {
        Tabprof.telprof = telprof;
    }


  

   

    public static  void getDadosTabprof() {
     /*    try {
           
                    setCodprof(Conectar.result.getInt("codprof"));
                    setNomprof(Conectar.result.getString("nomprof"));
                    setEndprof(Conectar.result.getString("endprof"));            
                    setCidprof(Conectar.result.getString("cidprof"));
                    setBairro(Conectar.result.getString("bairro"));
                    setCpfprof(Conectar.result.getString("cpfprof"));
                    setRgprof(Conectar.result.getString("rgprof"));
                    setTelprof(Conectar.result.getString("telprof"));
                    setRgcodusu(Conectar.result.getInt("rgcodusu"));
                    setRgusuario(Conectar.result.getString("rgusuario"));
                    setRgdata(Conectar.result.getDate("rgdata"));
                    setRgevento(Conectar.result.getString("rgevento"));
                    setCargo(Conectar.result.getString("cargo"));
                    setFuncao(Conectar.result.getString("funcao"));
                    setPerccomis(Conectar.result.getDouble("perccomis"));
                    setPercomiss(Conectar.result.getDouble("percomiss"));
                    setPerccomav(Conectar.result.getDouble("perccomav"));
                    setPercoomcc(Conectar.result.getDouble("percoomcc"));
                    setPercoomap(Conectar.result.getDouble(""));
                    setCodconta(Conectar.result.getInt("codconta"));
                    setSalprof(Conectar.result.getDouble("salprof"));
                    setCodven(Conectar.result.getInt("codven"));
                    setDtadmissao(Conectar.result.getDate("dtadmissao"));
                    setFolhavt(Conectar.result.getDouble("folhavt"));
                    setFolhainss(Conectar.result.getDouble("folhainss"));
                    setFolhaoutros(Conectar.result.getDouble("folhaoutros"));
            
            
        } catch (SQLException e) {
            
        }*/
    }
}


   