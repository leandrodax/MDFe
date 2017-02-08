
package ConexaoDB;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conectar {
    
    public static final String caminho  = "jdbc:odbc:INTEGRADO";
    public static final String driver   = "sun.jdbc.odbc.JdbcOdbcDriver";
    public static final String user     = "SYSDBA";
    public static final String password = "masterkey";
    public static String Banco          = "F";
    /*
    public static String tipo = "1";
    public static final String url      = "jdbc:odbc:INTEGRADO";
    public static final String driver   = "sun.jdbc.odbc.JdbcOdbcDriver";
    public static final String user     = "SYSDBA";
    public static final String password = "masterkey";
    */
    
    public static Statement stam,stam2, st;
    public static ResultSet result,result2,result3,result4,result4_1,result5, result5_1,result6,result6_1,result6_2,result7,result8,result9,result10,result11,result12,result13,result14,result15,result15_1,result16,result16_1,result16_2,result17,result18,result19,result20, MeuState;
    public static Connection con, con2;
        
    public Conectar() {
        
    }
    
    public static void ConectarBD() throws SQLException, InstantiationException, IllegalAccessException {
        if (Banco.equals("F")) {
            ConectarFirebird();
        } else if (Banco.equals("P")) {
            ConectarPostgre();
        }
            
    }
    
    public static void DesconectarBD() throws SQLException, InstantiationException, IllegalAccessException{
        if (Banco.equals("F")){
            CloseFireBird();
            System.out.println("BD Firebird desconectado.");
        } else if (Banco.equals("P")){
            ClosePostgre();
            System.out.println("BD PostgreSQL desconectado.");
        }
    }
    
    
    public static void ConectarFirebird(){
        try {   
                Class.forName("org.firebirdsql.jdbc.FBDriver");
                con = DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:"+ VerificaRaizSistema() +"/InterageSE/DADOS/INTEGRADO.GDB?encoding=ISO8859_1",
                        "SYSDBA", "masterkey");
                
                
                stam = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE, ResultSet.HOLD_CURSORS_OVER_COMMIT);
                st = con.createStatement();
                

                System.out.println("Sucesso! BD Firebird conectado.");
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não encontrado!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Problemas na conexao com a fonte de dados:\n" + e.getLocalizedMessage());
            }
    }
    
    public static void ConectarPostgre() throws InstantiationException, IllegalAccessException{
        try {
                
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/integrado",
                        "postgres", "1234");
                
                stam = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                st = con.createStatement();

                System.out.println("Sucesso! BD Postgre Conectado.");
                
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não encontrado!");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Problemas na conexao com a fonte de dados:\n" + e.getLocalizedMessage());
            }
        }
    
    public static void CloseFireBird() throws SQLException, InstantiationException, IllegalAccessException {
        try {

            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:"+ VerificaRaizSistema() +"/InterageSE/DADOS/INTEGRADO.GDB",
                    "SYSDBA", "masterkey");

            
            con.close();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas na conexao com a fonte de dados:\n" + e.getLocalizedMessage());
        }
    }
    
    public static void ClosePostgre(){
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/integrado",
                    "postgres", "1234");

           
            con.close();
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problemas na conexao com a fonte de dados:\n" + e.getLocalizedMessage());
        }
    }
    
    private static String VerificaRaizSistema(){
        String raiz = "";
        if(System.getProperty("os.name").equals("Linux")){
            raiz = "/home";
        }else{
            raiz = "C:";
        }
        
        return raiz;
    }
    
    
   
    //?defautResultSetHoldable=True
}

