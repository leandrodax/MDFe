

package Utilitarios;

import ClassesFirebird.Tabusu;
import ConexaoDB.Conectar;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.ResolutionSyntax;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaPrintableArea;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.PrinterResolution;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class Utilitarios {

    static Tabusu tabusu = new Tabusu();
    public static String USUARIO = tabusu.getNome(), codteste, sDAD_NUMERO = null;
    public static String DATA = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    public static String sCOD_TRANSPORTE = "", CODTRANSPORTE = "", CODIGOPERI = "", sCODDOC = "", sCOD_CARGA = "", sIND_REENTREGA = "", sTIPO_DOC = "", 
                         sCOD_MUN = "", sMUNICIPIO = "", sUF = "", sCOD_BARRAS = "", sCHAVE_MDFE= "", sDAD_NR_PROT="", XMLCancelamento, XMLIncluirCondutor;
    public static Integer sDAD_CODIGO = null;
      
    //Método para verificar se a String possui valor nulo, se for retorna uma String vazia
    public String VerificaValorNulo(Object valor){
        String str = "";
        
        if(valor != null){
            str = valor.toString();
        }
        
        return str;
    }

    //Método para extrair apenas os numeros de uma string
    public String ExtraiNumeros(String valor) {
        String ValorTemp = "";
        if(valor != null){
            ValorTemp = valor.replaceAll("[^0-9]*", "");
        }
        return ValorTemp;
    }
    
    public String ExtraiNumerosLetra(String valor) {
        String ValorTemp = "";
        if(valor != null){
            ValorTemp = valor.replaceAll("[^a-zA-Z_0-9]", "");
        }
        return ValorTemp;
    }
    
    
    //Método para tiras todos os pontos e trocar por virgulas
    //Usado para formatar um valor antes de inserir no banco
    public String TrocaVirgulaPorPonto(String valor) {
        String ValorTemp = valor.replaceAll("\\.", "");
        return ValorTemp.replace(',', '.');
    }

    //Método para tirar os pontos da String
    public String TiraPontos(String valor) {
        String valorTemp = valor.replaceAll("\\.", "");
        return valorTemp;
    }

    //Formata a valor quando vem do Banco para a Field
    //Insere a virgula da casa de milhar
    public String TrocaPontoPorVirgula(Float valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }

    //Funcao para trocar as caracteres acentuados por caracteres normais
    //Usado antes de mandar a String para impressora em impressoras matriciais
    public String TiraCaracterEspecial(String str) {
        String[] Acento = new String[]{"ç", "Ç", "á", "é", "í", "ó", "ú", "ý", "Á", "É",
            "Í", "Ó", "Ú", "Ý", "à", "è", "ì", "ò", "ù", "À", "È", "Ì", "Ò", "Ù", "ã", "õ", "ñ", "ä",
            "ë", "ï", "ö", "ü", "ÿ", "Ä", "Ë", "Ï", "Ö", "Ü", "Ã", "Õ", "Ñ", "â", "ê", "î", "ô", "û",
            "Â", "Ê", "Î", "Ô", "Û"
        };

        String[] SemAcento = new String[]{"c", "C", "a", "e", "i", "o", "u", "y", "A",
            "E", "I", "O", "U", "Y", "a", "e", "i", "o", "u", "A", "E", "I", "O", "U", "a", "o", "n",
            "a", "e", "i", "o", "u", "y", "A", "E", "I", "O", "U", "A", "O", "N", "a", "e", "i", "o",
            "u", "A", "E", "I", "O", "U"
        };

        for (int i = 0; i < Acento.length; i++) {
            str = str.replaceAll(Acento[i], SemAcento[i]);
        }

        return str;
    }

    //Calcula o valor do produto com o percentual de desconto
    //O primeiro parametro recebe o valor do produto
    //O segundo parametro recebe o percentual de desconto
    public String CalculaValorDesconto(Double valorproduto, Double percdesconto) {
        //Calcula o valor do desconto
        Double ValorDoDesconto = ((valorproduto * percdesconto) / 100);
        //Subtrai o valor do desconto com o valor do produto
        Double ValorComDesconto = valorproduto - ValorDoDesconto;

        return new DecimalFormat("#,##0.00").format(ValorComDesconto);
    }

    //Calcula o percentual de desconto de acordo com o valor com desconto
    public String CalculaPercentualDesconto(Double valorproduto, Double valorcomdesconto) {
        Double ValorDoDesconto = ((valorproduto * valorcomdesconto) / 100) * 4;
        ///Double PercentualDeDesconto = valorproduto - ValorDoDesconto;

        return new DecimalFormat("#,##0.00").format(ValorDoDesconto);
    }

    //Mascara do código de grupos
    public String FormataCodigoGrupos(Object value) {
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("##.##.##");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String FormataCodigoRelatorio(Integer codigo) {
        return new DecimalFormat("000").format(codigo);
    }

    //Máscara de Cep
    public String FormataCep(Object value) {
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("#####-###");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Máscara de CNPJ
    public String FormataCnpj(Object value) {
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("##.###.###/####-##");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Máscara de Cnae
    public String FormataCnae(Object value) {
        MaskFormatter mask;
        try {
            mask = new MaskFormatter("#####-#/##");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //Máscara de Cfop
    public String FormataCfop(Object value) throws ParseException {
        MaskFormatter mask;
        mask = new MaskFormatter("#.###");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(value);

    }

    //Máscara de Lc116
    public String FormataLc116(Object value) throws ParseException {
        MaskFormatter mask;
        mask = new MaskFormatter("##.##");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(value);

    }

    //Máscara do formato padrão de data para formatar na field
    public String FormataMascaraData(Object value) throws ParseException {
        MaskFormatter mask;
        mask = new MaskFormatter("##/##/####");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(value);

    }

    //Máscara de Cpf
    public String FormataCpf(Object value) throws ParseException {
        MaskFormatter mask;
        mask = new MaskFormatter("###.###.###-##");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(value);
    }

    //
    public String FormataNbs(Object value) throws ParseException {
        MaskFormatter mask;
        mask = new MaskFormatter("#########");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(value);
    }

    //Mascára de Telefone
    public String FormataFone(Object value) throws ParseException {
        MaskFormatter mask;
        mask = new MaskFormatter("(##)#-####-####");
        mask.setValueContainsLiteralCharacters(false);
        return mask.valueToString(value);
    }

    //Recebe um valor Date e retorna o valor string formatado
    public String FormataData(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }

    //Recebe um valor Date e retorna o valor string formatado para inserir no Banco de dados
    public String FormataDataBanco(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(data);
    }
    
    public String FormataDataBancoMDFE(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return sdf.format(data);
    }

    public String FormataDataHora(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(data);
    }

    //Recebe um valor String e retorna formatada para inserir no banco
    //Usado para formatar datas de JTextFields
    //Obs: Não usar aspas simples na query quando este método for usado no parametro
    //Ex: util.InserirDataFormatada(JTextFieldDaData.getText());
    //Ex:, "+ DtInserida +", 
    public String InserirDataFormatada(String data) {
        String dataString = null;
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        java.sql.Date DateSql = null;
        if ((data.length() != 0) || (!data.equals(""))) {
            //se nao for, converte a data para sql date e concatena as aspas simples
            dataString = sdf.format(DateSql.parse(data));
            dataString = "'" + dataString + "'";
        }

        return dataString;
        //retorna a data
    }

    //Formata o valor para incluir o sinal de porcentagem
    public String FormataMarcaraPorcentagem(String valor) {
        if (valor.length() == 0) {
            return "0,00 %";
        } else {
            return new DecimalFormat("#,##0.00").format(Double.parseDouble(TrocaVirgulaPorPonto(valor))) + " %";
        }
    }
    
    public static boolean isEmailValid(String email) {
        if ((email == null) || (email.trim().length() == 0))
            return false;

        String emailPattern = "\\b(^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@([A-Za-z0-9-])+(\\.[A-Za-z0-9-]+)*((\\.[A-Za-z0-9]{2,})|(\\.[A-Za-z0-9]{2,}\\.[A-Za-z0-9]{2,}))$)\\b";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public boolean ValidaPlaca(String value) {

      Pattern pattern = Pattern.compile("[A-Z]{3}-[0-9]{4}");
      Matcher matcher = pattern.matcher(value);

      return matcher.matches();
    }
    
    public boolean VerificaCNPJ(String CNPJ) {
// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111")
                || CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333")
                || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777")
                || CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999")
                || (CNPJ.length() != 14)) {
            return (false);
        }

        char dig13, dig14;
        int sm, i, r, num, peso;

// "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
// converte o i-ésimo caractere do CNPJ em um número:
// por exemplo, transforma o caractere '0' no inteiro 0
// (48 eh a posição de '0' na tabela ASCII)
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig13 = '0';
            } else {
                dig13 = (char) ((11 - r) + 48);
            }

// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10) {
                    peso = 2;
                }
            }

            r = sm % 11;
            if ((r == 0) || (r == 1)) {
                dig14 = '0';
            } else {
                dig14 = (char) ((11 - r) + 48);
            }

// Verifica se os dígitos calculados conferem com os dígitos informados.
            if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13))) {
                return (true);
            } else {
                return (false);
            }
        } catch (Exception erro) {
            return (false);
        }
    }
    
    public boolean VerificaCPF(String cpf) {
        int soma = 0;

        if (cpf.length() == 11) {
            for (int i = 0; i < 9; i++) {
                soma += (10 - i) * (cpf.charAt(i) - '0');
            }
            soma = 11 - (soma % 11);
            if (soma > 9) {
                soma = 0;
            }
            if (soma == (cpf.charAt(9) - '0')) {
                soma = 0;
                for (int i = 0; i < 10; i++) {
                    soma += (11 - i) * (cpf.charAt(i) - '0');
                }
                soma = 11 - (soma % 11);
                if (soma > 9) {
                    soma = 0;
                }
                if (soma == (cpf.charAt(10) - '0')) {

                    return true;
                }
            }
        }

        return false;

    }

    /**
     * Método para enviar texto para impressão. Recebe uma String como parametro
     * que será o texto a ser impresso
     */
    public static void Imprimir(String ParaImprimir) throws PrintException {
        try {
            PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
            aset.add(new PrinterResolution(120, 144, ResolutionSyntax.DPI));
            aset.add(OrientationRequested.PORTRAIT);
            aset.add(new MediaPrintableArea(0, 0, 80, 300, MediaPrintableArea.MM));
            aset.add(new JobName("Impressao", null));

            PrintService ImpressoraPadrao = PrintServiceLookup.lookupDefaultPrintService();
            InputStream stream = new ByteArrayInputStream(ParaImprimir.getBytes());
            DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
            Doc doc = new SimpleDoc(stream, flavor, null);

            PrintService[] ImpressorasDoSistema = PrintServiceLookup.lookupPrintServices(DocFlavor.INPUT_STREAM.AUTOSENSE, null);
            for (PrintService printService : ImpressorasDoSistema) {
                System.out.println(ImpressorasDoSistema);
            }
            PrintService service = ServiceUI.printDialog(null, 300, 200, ImpressorasDoSistema, ImpressoraPadrao, flavor, aset);
            if (service != null) {
                DocPrintJob docPrint = service.createPrintJob();
                docPrint.print(doc, aset);
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }

    }
    
     public String LerArquivoXML(String camArquivo){
        StringBuilder xml = new StringBuilder();
        try{
            FileReader reader = new FileReader(camArquivo);
            
            BufferedReader leitor = new BufferedReader(reader);
            
            String linha = null;
            while((linha = leitor.readLine()) != null){
                xml.append(linha);
                xml.append("\n");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao fazer leitura do arquivo XML...\n" + e.getLocalizedMessage());
        }
        
        return xml.toString();
    }

    public static String AlinharADireita(Integer TamCampo, String texto) {
        Integer espacos = TamCampo - texto.length();
        String Texto = "";
        for (int i = 0; i < espacos; i++) {
            Texto = Texto + " ";
        }
        return Texto + texto;
    }

    public static String AlinharAEsquerda(Integer TamCampo, String texto) {
        Integer espacos = TamCampo - texto.length();
        String Texto = "";
        for (int i = 0; i < espacos; i++) {
            Texto = Texto + " ";
        }

        return texto + Texto;
    }

    public static String AlinharZeroAEsquerda(Integer TamCampo, String texto) {
        Integer espacos = TamCampo - texto.length();
        String Texto = "0";
        for (int i = 0; i < espacos; i++) {
            Texto = Texto + "0";
        }

        return texto + Texto;
    }

    public static String Centralizar(Integer TamCampo, String texto) {
        Integer espacos = (TamCampo - texto.length()) / 2;
        String Texto = "";
        for (int i = 0; i < espacos; i++) {
            Texto = Texto + " ";
        }

        return Texto + texto;
    }

    public static Integer TamanhoColuna = 0;
    public static Integer AlturaPagina = 0;
    public static Integer LarguraPagina = 0;

    public static Integer getTamanhoColuna() {
        return TamanhoColuna;
    }

    public static void setTamanhoColuna(Integer TamanhoColunaEmCaracteres) {
        Utilitarios.TamanhoColuna = TamanhoColuna;
    }

    public static Integer getAlturaPagina() {
        return AlturaPagina;
    }

    public static void setAlturaPagina(Integer AlturaPaginaEmLinhas) {
        Utilitarios.AlturaPagina = AlturaPaginaEmLinhas;
    }

    public static Integer getLarguraPagina() {
        return LarguraPagina;
    }

    public static void setLarguraPagina(Integer LarguraPaginaEmCaracteres) {
        Utilitarios.LarguraPagina = LarguraPaginaEmCaracteres;
    }
    
    public Integer GerarDigitoVerificador(String chaveAcesso){
        //Inicia a varivel que irá acumular o valor das multiplicacoes
        int somaTotal = 0;
        //Inicia o multiplicador com valor 2
        int multiplicador = 2; 
        //Transforma a String com o valor da chave de acesso em um array de caracteres
        char[] numeros = chaveAcesso.toCharArray();
        
        //Faz um loop percorrendo o array de trás pra frente
        for (int i = numeros.length -1; i >= 0; i--) {
            //Condicao para o multiplicador ter apenas os valores {2, 3, 4, 5, 6, 7, 8, 9} 
            if(multiplicador > 9){
                multiplicador = 2;
            }
            //A variavel somaTotal somo todos os valores vindo da multiplicaco dos numeros da chave pelos multiplicadores
            somaTotal += ((Integer.parseInt(Character.toString(numeros[i]))) * multiplicador) ;
            //Incrementa o valor do multiplicador
            multiplicador++;
        }
        
        //System.out.println("Soma Total " + somaTotal);
        //Com o valor total das multiplicacoes, pega-se o resto da divisão por 11
        int restoDivisao = somaTotal % 11;
        //O digito vericador é o numero 11 menos o resta da divisao anterior
        
        int DV = 0;
        
        if(restoDivisao == 1 || restoDivisao == 0){
            DV = 0;
        }else {
            DV = 11 - restoDivisao;
        }
        
        return DV;
    }
    
    public static boolean VerificarPermissao(String codop, Integer codusu) {
        boolean Status = false;
        try {
            Conectar.ConectarBD();
            Conectar.result = Conectar.stam.executeQuery("select HABILITA from OPCAOUSU where CODOP = '" + codop + "' and CODUSU = " + codusu + " and CODSIS = 1 ");
            while (Conectar.result.next()) {
                if (Conectar.result.getString("HABILITA").equals("Sim")) {
                    Status = true;
                }
            }
            Conectar.DesconectarBD();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar permissão...\n" + e.getLocalizedMessage());
        }

        return Status;
    }

    public static void AtualizaTabelas() {

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_AGENCIA_NAVEG (\n"
                    + "    COD_AGENCIA  INTEGER NOT NULL,\n"
                    + "    CNPJ         VARCHAR(14),\n"
                    + "    NOME         VARCHAR(60),\n"
                    + "    RGCODUSU     INTEGER,\n"
                    + "    RGUSUARIO    VARCHAR(8),\n"
                    + "    RGDATA       TIMESTAMP,\n"
                    + "    RGEVENTO     VARCHAR(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_AGENCIA_NAVEG ADD CONSTRAINT PK_MDFE_CAD_AGENCIA_NAVEG PRIMARY KEY (COD_AGENCIA);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_RESP_PAG_VALE(\n"
                    + "  CODIGO integer NOT NULL,\n"
                    + "  RESPONSAVEL varchar(60),\n"
                    + "  CNPJ varchar(14),\n"
                    + "  CPF  VARCHAR(11),\n"
                    + "  ENDERECO varchar(80),\n"
                    + "  FONE varchar(20),\n"
                    + "  RGCODUSU integer,\n"
                    + "  RGUSUARIO varchar(8),\n"
                    + "  RGDATA TIMESTAMP,\n"
                    + "  RGEVENTO varchar(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_RESP_PAG_VALE ADD CONSTRAINT PK_MDFE_CAD_RESP_PAG_VALE PRIMARY KEY (CODIGO);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        try {
            Conectar.ConectarBD();//erro
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_FORVALEPEDAGIO (\n"
                    + "    CODFORVALE      INTEGER NOT NULL,\n"
                    + "    FORVALEPEDAGIO  VARCHAR(60),\n"
                    + "    CNPJ            VARCHAR(14),\n"
                    + "    ENDERECO        VARCHAR(60),\n"
                    + "    FONE            VARCHAR(20),\n"
                    + "    RGCODUSU        INTEGER,\n"
                    + "    RGUSUARIO       VARCHAR(8),\n"
                    + "    RGDATA          TIMESTAMP,\n"
                    + "    RGEVENTO        VARCHAR(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_FORVALEPEDAGIO ADD CONSTRAINT PK_MDFE_CAD_FORVALEPEDAGIO PRIMARY KEY (CODFORVALE);");
            Conectar.DesconectarBD();
            
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_EMBARCACAO (\n"
                    + "  CODIGO      INTEGER NOT NULL,\n"
                    + "  COD_EMB     VARCHAR(10),\n"
                    + "  COD_TP_EMB  VARCHAR(2),\n"
                    + "  NOME_EMB    VARCHAR(60),\n"
                    + "  IRIN     VARCHAR(10),\n"
                    + "  RGCODUSU integer,\n"
                    + "  RGUSUARIO varchar(8),\n"
                    + "  RGDATA TIMESTAMP,\n"
                    + "  RGEVENTO varchar(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_EMBARCACAO ADD CONSTRAINT PK_MDFE_CAD_EMBARCACAO PRIMARY KEY (CODIGO);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        
       

//-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_PROPRIETARIO (\n"
                    + "    COD_PROPRIETARIO  INTEGER NOT NULL,\n"
                    + "    PROP_NOME         VARCHAR(60),\n"
                    + "    PROP_RNTRC        VARCHAR(20),\n"
                    + "    PROP_CODTP        INTEGER,\n"
                    + "    PROP_TIPO         VARCHAR(20),\n"
                    + "    PROP_UF           VARCHAR(2),\n"
                    + "    PROP_CPF          VARCHAR(11),\n"
                    + "    PROP_CNPJ         VARCHAR(14),\n"
                    + "    PROP_IE           VARCHAR(14),\n"
                    + "    RGCODUSU          INTEGER,\n"
                    + "    RGDATA            TIMESTAMP,\n"
                    + "    RGEVENTO          CHAR(1),\n"
                    + "    RGUSUARIO         VARCHAR(8)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_PROPRIETARIO ADD CONSTRAINT PK_MDFE_CAD_PROPRIETARIO PRIMARY KEY (COD_PROPRIETARIO);");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            e.printStackTrace();
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
       


//-----------------------------------------------------------------------------------------------

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_CONTRATANTE (\n"
                    + "    COD_CONTRATANTE  INTEGER NOT NULL,\n"
                    + "    CONT_NOME        VARCHAR(60),\n"
                    + "    CONT_CPF         VARCHAR(11),\n"
                    + "    CONT_CNPJ        VARCHAR(14),\n"
                    + "    RGCODUSU         INTEGER, \n"
                    + "    RGUSUSARIO       VARCHAR(8),\n"
                    + "    RGDATA           TIMESTAMP,\n"
                    + "    RGEVENTO         VARCHAR(1)"
                    + ");");

            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_CONTRATANTE ADD CONSTRAINT PK_MDFE_CAD_CONTRATANTE PRIMARY KEY (COD_CONTRATANTE);");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

//---------------------------------------------------------------------------------------


        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_REBOQUE (\n"
                    + "    CODREBOQUE     SMALLINT NOT NULL,\n"
                    + "    MARCA          VARCHAR(15),\n"
                    + "    MODELO         VARCHAR(15),\n"
                    + "    ANO            VARCHAR(4),\n"
                    + "    COR            VARCHAR(10),\n"
                    + "    PLACA          VARCHAR(10),\n"
                    + "    CIDADE         VARCHAR(20),\n"
                    + "    ESTADO         VARCHAR(2),\n"
                    + "    KILOMINI       DOUBLE PRECISION DEFAULT 0,\n"
                    + "    KILOMFIM       DOUBLE PRECISION DEFAULT 0,\n"
                    + "    KILOCOMB       DOUBLE PRECISION DEFAULT 0,\n"
                    + "    RGCODUSU       INTEGER,\n"
                    + "    RGUSUARIO      VARCHAR(8),\n"
                    + "    RGDATA         TIMESTAMP,\n"
                    + "    RGEVENTO       VARCHAR(1),\n"
                    + "    PESOVEIC       DOUBLE PRECISION DEFAULT 0,\n"
                    + "    RNTC           VARCHAR(20),\n"
                    + "    PROPTERC       CHAR(1),\n"
                    + "    TARA           INTEGER,\n"
                    + "    CAPACIDADE_KG  INTEGER,\n"
                    + "    CAPACIDADE_M3  INTEGER,\n"
                    + "    RENAVAM        VARCHAR(11),\n"
                    + "    TP_RODADO      VARCHAR(2),\n"
                    + "    RODADO         VARCHAR(60),\n"
                    + "    TP_CARROCERIA  VARCHAR(2),\n"
                    + "    CARROCERIA     VARCHAR(60),\n"
                    + "    CODPROP        INTEGER,\n"
                    + "    NOMEPROP       VARCHAR(60)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_REBOQUE ADD CONSTRAINT PK_MDFE_CAD_REBOQUE PRIMARY KEY (CODREBOQUE);");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_TERM_CARREG (\n"
                    + "    CODIGO           INTEGER NOT NULL,\n"
                    + "    COD_TERM_CARREG  VARCHAR(8),\n"
                    + "    NOM_TERM_CARREG  VARCHAR(60),\n"
                    + "  RGCODUSU integer,\n"
                    + "  RGUSUARIO varchar(8),\n"
                    + "  RGDATA TIMESTAMP,\n"
                    + "  RGEVENTO varchar(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_TERM_CARREG ADD CONSTRAINT PK_MDFE_CAD_TERM_CARREG PRIMARY KEY (CODIGO);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_TERM_DESCARREG (\n"
                    + "    CODIGO              INTEGER NOT NULL,\n"
                    + "    COD_TERM_DESCARREG  VARCHAR(8),\n"
                    + "    NOM_TERM_DESCARREG  VARCHAR(60),\n"
                    + "  RGCODUSU integer,\n"
                    + "  RGUSUARIO varchar(8),\n"
                    + "  RGDATA TIMESTAMP,\n"
                    + "  RGEVENTO varchar(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_TERM_DESCARREG ADD CONSTRAINT PK_MDFE_CAD_TERM_DESCARREG PRIMARY KEY (CODIGO);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_UN_CARGA_VAZIA (\n"
                    + "  CODIGO       INTEGER NOT NULL,\n"
                    + "  ID_UN_CARGA  VARCHAR(20),\n"
                    + "  TP_UN_CARGA  VARCHAR(1),\n"
                    + "  RGCODUSU integer,\n"
                    + "  RGUSUARIO varchar(8),\n"
                    + "  RGDATA TIMESTAMP,\n"
                    + "  RGEVENTO varchar(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_UN_CARGA_VAZIA ADD CONSTRAINT PK_MDFE_CAD_UN_CARGA_VAZIA PRIMARY KEY (CODIGO);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_PORTO (\n"
                    + "  CODIGO       INTEGER    NOT NULL,\n"
                    + "  ID_PORTO     VARCHAR(5) NOT NULL,\n"
                    + "  NOME_PORTO   VARCHAR(50)NOT NULL,\n"
                    + "  RGCODUSU integer,\n"
                    + "  RGUSUARIO varchar(8),\n"
                    + "  RGDATA TIMESTAMP,\n"
                    + "  RGEVENTO varchar(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_PORTO ADD CONSTRAINT PK_MDFE_CAD_PORTO PRIMARY KEY (ID_PORTO);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_BALSA (\n"
                    + "  CODIGO       INTEGER     NOT NULL,\n"
                    + "  ID_BALSA     VARCHAR(5)  NOT NULL,\n"
                    + "  NOME_BALSA   VARCHAR(50) NOT NULL,\n"
                    + "  RGCODUSU integer,\n"
                    + "  RGUSUARIO varchar(8),\n"
                    + "  RGDATA TIMESTAMP,\n"
                    + "  RGEVENTO varchar(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_BALSA ADD CONSTRAINT PK_MDFE_CAD_BALSA PRIMARY KEY(ID_BALSA);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_DADOS (\n"
                    + "    DAD_CODIGO                 INTEGER NOT NULL,\n"
                    + "    DAD_NUMERO                 VARCHAR(9),\n"
                    + "    DAD_MODELO                 VARCHAR(2),\n"
                    + "    DAD_SERIE                  VARCHAR(3),\n"
                    + "    DAD_DTEMISSAO              TIMESTAMP,\n"
                    + "    DAD_DTINICIO               TIMESTAMP,\n"
                    + "    DAD_CODNUMERICO            VARCHAR(8),\n"
                    + "    DAD_DV                     VARCHAR(1),\n"
                    + "    DAD_UF                     VARCHAR(2),\n"
                    + "    DAD_TP_EMITENTE            VARCHAR(1),\n"
                    + "    DAD_MODALIDADE             VARCHAR(1),\n"
                    + "    DAD_FORMA_EMISSAO          VARCHAR(1),\n"
                    + "    DAD_CHAVE                  VARCHAR(44) NOT NULL,\n"
                    + "    DAD_LOCAL_DESCARREGAMENTO  VARCHAR(2),\n"
                    + "    DAD_SITUACAO               VARCHAR(30),\n"
                    + "    DAD_NR_PROT                VARCHAR(15),\n"
                    + "    DAD_TP_TRANSPORTADOR       VARCHAR(1),\n"
                    + "    EMIT_CODFIL                INTEGER NOT NULL,\n"
                    + "    EMIT_CNPJ                  VARCHAR(14),\n"
                    + "    EMIT_IE                    VARCHAR(14),\n"
                    + "    EMIT_RAZAOSOC              VARCHAR(60),\n"
                    + "    EMIT_FANTASIA              VARCHAR(60),\n"
                    + "    EMIT_LOGRADOURO            VARCHAR(60),\n"
                    + "    EMIT_NR                    VARCHAR(60),\n"
                    + "    EMIT_COMP                  VARCHAR(60),\n"
                    + "    EMIT_BAIRRO                VARCHAR(60),\n"
                    + "    EMIT_CEP                   VARCHAR(8),\n"
                    + "    EMIT_PAIS                  VARCHAR(60),\n"
                    + "    EMIT_UF                    VARCHAR(2),\n"
                    + "    EMIT_COD_MUN               VARCHAR(7),\n"
                    + "    EMIT_MUN                   VARCHAR(20),\n"
                    + "    EMIT_TEL                   VARCHAR(12),\n"
                    + "    EMIT_EMAIL                 VARCHAR(60),\n"
                    + "    EMIT_RNTRC                 VARCHAR(8),\n"
                    + "    ROD_RNTRC                  VARCHAR(8),\n"
                    + "    ROD_COD_AG_PORTO           VARCHAR(16),\n"
                    + "    ROD_COD_INT_VEIC           VARCHAR(10),\n"
                    + "    ROD_TP_CARROCERIA          VARCHAR(2),\n"
                    + "    ROD_PLACA                  VARCHAR(7),\n"
                    + "    ROD_TARA                   INTEGER,\n"
                    + "    ROD_RENAVAM                VARCHAR(11),\n"
                    + "    ROD_UF                     VARCHAR(2),\n"
                    + "    ROD_TP_RODADO              VARCHAR(2),\n"
                    + "    ROD_CAPACIDADE_KG          INTEGER,\n"
                    + "    ROD_CAPACIDADE_M3          INTEGER,\n"
                    + "    PPT_CODPROP                INTEGER,\n"
                    + "    PROPIETARIO                VARCHAR(1),\n"
                    + "    PPT_NOME                   VARCHAR(60),\n"
                    + "    PPT_CPF                    VARCHAR(11),\n"
                    + "    PPT_CNPJ                   VARCHAR(14),\n"
                    + "    PPT_RNTRC                  VARCHAR(8),\n"
                    + "    PPT_IE                     VARCHAR(14),\n"
                    + "    PPT_UF                     VARCHAR(2),\n"
                    + "    AQU_COD_INT_EMB            INTEGER,\n"
                    + "    AQU_COD_EMB                VARCHAR(10),\n"
                    + "    AQU_COD_TP_EMB             VARCHAR(2),\n"
                    + "    AQU_IRIN_EMB               VARCHAR(10),\n"
                    + "    AQU_NOME_EMB               VARCHAR(60),\n"
                    + "    AQU_COD_PORTO_EMB          VARCHAR(5),\n"
                    + "    AQU_NOME_PORTO_EMB         VARCHAR(60),\n"
                    + "    AQU_COD_PORTO_DES          VARCHAR(5),\n"
                    + "    AQU_NOME_PORTO_DES         VARCHAR(60),\n"
                    + "    AQU_COD_PORTO_TRANS        VARCHAR(5),\n"
                    + "    AQU_NOME_PORTO_TRANS       VARCHAR(60),\n"
                    + "    AQU_TP_NAVEGACAO           VARCHAR(1),\n"
                    + "    AQU_NR_VIAGEM              VARCHAR(10),\n"
                    + "    TOT_QTD_CTE                INTEGER,\n"
                    + "    TOT_QTD_NFE                INTEGER,\n"
                    + "    TOT_QTD_MDFE               INTEGER,\n"
                    + "    TOT_QTD_NFE_MOD1           INTEGER,\n"
                    + "    TOT_TOT_MERC_TRANSPORTADA  DOUBLE PRECISION,\n"
                    + "    TOT_UN_MEDIDA_PESO         VARCHAR(3),\n"
                    + "    TOT_PESO_BRUTO             DOUBLE PRECISION,\n"
                    + "    INF_FISCO                  VARCHAR(2000),\n"
                    + "    INF_CONTR                  VARCHAR(2000),\n"
                    + "    RGCODUSU                   INTEGER,\n"
                    + "    RGUSUARIO                  VARCHAR(8),\n"
                    + "    RGDATA                     TIMESTAMP,\n"
                    + "    RGEVENTO                   VARCHAR(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_DADOS ADD CONSTRAINT PK_MDFE_DADOS PRIMARY KEY(DAD_CODIGO);");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela MDFE_DADOS...\n" + e.getMessage());
            
        }
        
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CONDUTORES (\n"
                    + "    CODIGO  INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO  INTEGER NOT NULL,\n"
                    + "    NOME    VARCHAR(60),\n"
                    + "    CPF     VARCHAR(11)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CONDUTORES ADD CONSTRAINT PK_MDFE_CONDUTORES PRIMARY KEY (CODIGO, DAD_CODIGO);");
            Conectar.DesconectarBD();
                       
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CONDUTORES ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
            
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        } 
        
//----------------------------------------------------------------------------------
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CONTRATANTE (\n" +
                    "    DAD_CODIGO       INTEGER NOT NULL,\n" +
                    "    COD_CONTRATANTE  INTEGER NOT NULL,\n" +
                    "    CONT_NOME        VARCHAR(60),\n" +
                    "    CONT_CPF         VARCHAR(11),\n" +
                    "    CONT_CNPJ        VARCHAR(14)\n"  +   
            ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CONTRATANTE ADD CONSTRAINT PK_MDFE_CONTRATANTE PRIMARY KEY (DAD_CODIGO, COD_CONTRATANTE);");
            Conectar.DesconectarBD();
                       
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CONTRATANTE ADD FOREIGN KEY (DAD_CODIGO) REFERENCES MDFE_DADOS (DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
            
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

//----------------------------------------------------------------------------------------

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CIOT (\n"
                    + "    DAD_CODIGO  INTEGER NOT NULL,\n"
                    + "    CIOT        VARCHAR(12) NOT NULL,\n"
                    + "    DOCUMENTO   VARCHAR(14),\n"
                    + "    TIPO        VARCHAR(1)\n"
                    + ");");

            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CIOT ADD CONSTRAINT PK_MDFE_CIOT PRIMARY KEY (DAD_CODIGO, CIOT);");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CIOT ADD FOREIGN KEY (DAD_CODIGO) REFERENCES MDFE_DADOS (DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_DOWNLOAD (\n"
                    + "    DAD_CODIGO INTEGER NOT NULL,\n"
                    + "    DOCUMENTO  VARCHAR(14) NOT NULL,\n"
                    + "    TIPO       VARCHAR(1)"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_DOWNLOAD ADD CONSTRAINT PK_MDFE_DOWNLOAD PRIMARY KEY (DAD_CODIGO, DOCUMENTO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_DOWNLOAD ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_LACRES_TOTALIZADOR (\n"
                    + "    DAD_CODIGO    INTEGER NOT NULL,\n"
                    + "    NR_LACRE  VARCHAR(60) NOT NULL\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LACRES_TOTALIZADOR ADD CONSTRAINT PK_MDFE_LACRES_TOTALIZADOR PRIMARY KEY (DAD_CODIGO, NR_LACRE);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LACRES_TOTALIZADOR ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
       
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_LOCAL_CARREGAMENTO (\n"
                    + "    COD_MUNICIPIO  VARCHAR(7) NOT NULL,\n"
                    + "    DAD_CODIGO     INTEGER    NOT NULL,\n"
                    + "    UF             VARCHAR(2),\n"
                    + "    MUNICIPIO      VARCHAR(60)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LOCAL_CARREGAMENTO ADD CONSTRAINT PK_MDFE_LOCAL_CARREGAMENTO PRIMARY KEY (COD_MUNICIPIO, DAD_CODIGO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LOCAL_CARREGAMENTO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_LOCAL_PERCURSO (\n"
                     + "   CODEST      INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO  INTEGER NOT NULL,"
                    + "    UF          VARCHAR(2)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LOCAL_PERCURSO ADD CONSTRAINT PK_MDFE_LOCAL_PERCURSO PRIMARY KEY (CODEST, DAD_CODIGO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LOCAL_PERCURSO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_MUN_DESCARREG (\n"
                    + "    DAD_CODIGO         INTEGER NOT NULL,\n"
                    + "    COD_MUNICIPIO      VARCHAR(7) NOT NULL,\n"
                     + "   MUNICIPIO          VARCHAR(60),\n"
                    + "    UF                 VARCHAR(2)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_MUN_DESCARREG ADD CONSTRAINT PK_MDFE_MUN_DESCARREG PRIMARY KEY(DAD_CODIGO, COD_MUNICIPIO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_MUN_DESCARREG ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD(); 

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_PEDAGIO (\n"
                    + "    CODIGO                INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO            INTEGER NOT NULL,\n"
                    + "    RAZ_SOC_EMP_FOR_PED   VARCHAR(60),\n"
                    + "    CNPJ_EMP_FOR_PED      VARCHAR(14),\n"
                    + "    RAZ_SOC_RESP_PAG_PED  VARCHAR(60),\n"
                    + "    CNPJ_RESP_PAG_PED     VARCHAR(14),\n"
                    + "    CPF_RESP_PAG_PED      VARCHAR(14),\n"
                    + "    NR_COMPROVANTE        VARCHAR(20),\n"
                    + "    VALOR_VALE            DOUBLE PRECISION"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_PEDAGIO ADD CONSTRAINT PK_MDFE_PEDAGIO PRIMARY KEY (CODIGO, DAD_CODIGO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_PEDAGIO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD(); 

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_LACRES_RODO (\n"
                    + "    DAD_CODIGO    INTEGER NOT NULL,\n"   
                    + "    NR_LACRE      VARCHAR(20) NOT NULL\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LACRES_RODO ADD CONSTRAINT PK_MDFE_LACRES_RODO PRIMARY KEY (DAD_CODIGO, NR_LACRE);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LACRES_RODO ADD FOREIGN KEY (DAD_CODIGO) REFERENCES MDFE_DADOS (DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_REBOQUE (\n"
                    + "    DAD_CODIGO       INTEGER NOT NULL,\n"
                    + "    CODVEIC          INTEGER NOT NULL,\n"
                    + "    PLACA            VARCHAR(10),\n"
                    + "    ESTADO           VARCHAR(2),\n"
                    + "    CIOT             VARCHAR(12),\n"
                    + "    TARA             INTEGER,\n"
                    + "    CAPACIDADE_KG    INTEGER,\n"
                    + "    CAPACIDADE_M3    INTEGER,\n"
                    + "    RENAVAM          VARCHAR(11),\n"
                    + "    TP_RODADO        VARCHAR(2),\n"
                    + "    TP_CARROCERIA    VARCHAR(2),\n"
                    + "    COD_PROPIETARIO  INTEGER,\n"
                    + "    PROP_NOME        VARCHAR(60),\n"
                    + "    PROP_RNTC        VARCHAR(20),\n"
                    + "    PROP_TIPO        VARCHAR(5),\n"
                    + "    PROP_UF          VARCHAR(2),\n"
                    + "    PROP_CPF         VARCHAR(11),\n"
                    + "    PROP_CNPJ        VARCHAR(14),\n"
                    + "    PROP_IE          VARCHAR(14)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_REBOQUE ADD CONSTRAINT PK_MDFE_REBOQUE PRIMARY KEY (DAD_CODIGO, CODVEIC);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_REBOQUE ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD(); 

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());

        }
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();//erro
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_TABFORVALEPEDAGIO (\n"
                    + "    DAD_CODIGO      INTEGER NOT NULL,\n"
                    + "    CODFORVALE      SMALLINT NOT NULL,\n"
                    + "    FORVALEPEDAGIO  VARCHAR(60),\n"
                    + "    CNPJ            VARCHAR(14),\n"
                    + "    ENDERECO        VARCHAR(60),\n"
                    + "    FONE            VARCHAR(20),\n"
                    + "    RGCODUSU        INTEGER,\n"
                    + "    RGUSUARIO       VARCHAR(8),\n"
                    + "    RGDATA          TIMESTAMP,\n"
                    + "    RGEVENTO        VARCHAR(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TABFORVALEPEDAGIO ADD CONSTRAINT PK_MDFE_TABFORVALEPEDAGIO PRIMARY KEY (DAD_CODIGO, CODFORVALE);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TABFORVALEPEDAGIO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD(); 

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_TABRESP_PAGVALEPEDAGIO (\n"
                    + "    DAD_CODIGO  INTEGER NOT NULL,\n"
                    + "    CODRESPAG   SMALLINT NOT NULL,\n"
                    + "    NOMERESPAG  VARCHAR(60),\n"
                    + "    CNPJ        VARCHAR(14),\n"
                    + "    ENDERECO    VARCHAR(60),\n"
                    + "    FONE        VARCHAR(20),\n"
                    + "    RGCODUSU    INTEGER,\n"
                    + "    RGUSUARIO   VARCHAR(8),\n"
                    + "    RGDATA      TIMESTAMP,\n"
                    + "    RGEVENTO    VARCHAR(1)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TABRESP_PAGVALEPEDAGIO ADD CONSTRAINT PK_MDFE_TABRESP_PAGVALEPEDAGIO PRIMARY KEY (DAD_CODIGO, CODRESPAG);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TABRESP_PAGVALEPEDAGIO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD(); 
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //----------------------------------------------------------------------
        
                
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate(" CREATE TABLE MDFE_DOCUMENTO (\n"
                    + "CODDOC         INTEGER     NOT NULL,\n"
                    + "DAD_CODIGO     INTEGER     NOT NULL,\n"
                    + "CHAVE          VARCHAR(44) NOT NULL,\n"
                    + "TP_DOC         VARCHAR(1)  NOT NULL,\n"
                    + "UF             VARCHAR(2),\n"
                    + "COD_MUN        VARCHAR(7) NOT NULL,\n" 
                    + "MUNICIPIO      VARCHAR(60),\n"                     
                    + "QTD_UN_TRANP   INTEGER,\n"
                    + "COD_BARRAS     VARCHAR(36),\n"
                    + "INDREENTREGA   VARCHAR(1))");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_DOCUMENTO ADD CONSTRAINT PK_MDFE_DOCUMENTO PRIMARY KEY(DAD_CODIGO, CODDOC, TP_DOC, COD_MUN);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_DOCUMENTO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
            
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...MDFE_DOCUMENTO\n" + e.getMessage());
        }
        //----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_UN_CARGA ("
                    + "    CODDOC         INTEGER NOT NULL,\n"
                    + "    COD_TRANSP     INTEGER NOT NULL,\n"
                    + "    COD_CARGA      INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO     INTEGER NOT NULL,\n"
                    + "    TP_UN_CARGA    VARCHAR(1),\n"
                    + "    ID_UN_CARGA    VARCHAR(20),\n"
                    + "    QTD_RAT_CARGA  DOUBLE PRECISION,\n"
                    + "    TP_DOC         VARCHAR(1) NOT NULL,\n"
                    + "    COD_MUN        VARCHAR(7) NOT NULL,\n"
                    + "    QTD_LACRE      INTEGER);");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_UN_CARGA ADD CONSTRAINT PK_MDFE_UN_CARGA PRIMARY KEY (DAD_CODIGO, CODDOC, COD_TRANSP, COD_CARGA, TP_DOC, COD_MUN);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_UN_CARGA ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD(); 
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        
        //-----------------------------------------------------------------------------------------------
        
       try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_LACRES_CARGA (\n"
                    + "    CODDOC         INTEGER NOT NULL,\n"                    
                    + "    COD_TRANSP    INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO    INTEGER NOT NULL,\n"   
                    + "    COD_CARGA     INTEGER NOT NULL,\n"
                    + "    TP_DOC        VARCHAR(1) NOT NULL,\n"
                    + "    COD_MUN       VARCHAR(7) NOT NULL,\n"
                    + "    NR_LACRE      VARCHAR(20) NOT NULL\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LACRES_CARGA ADD CONSTRAINT PK_MDFE_LACRES_CARGA PRIMARY KEY(CODDOC, COD_TRANSP, DAD_CODIGO, COD_CARGA, NR_LACRE, TP_DOC, COD_MUN);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LACRES_CARGA ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        //-----------------------------------------------------------------------------------------------
       
        
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_UN_TRANSPORTE ("
                    + "    CODDOC         INTEGER NOT NULL,\n"
                    + "    COD_TRANSP     INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO     INTEGER NOT NULL,\n"
                    + "    COD_MUN        VARCHAR(7) NOT NULL, \n"
                    + "    TP_UN_TRANS    VARCHAR(1),\n"
                    + "    ID_UN_TRANS    VARCHAR(20),\n"
                    + "    QTD_RAT_TRANS  DOUBLE PRECISION,\n"
                    + "    TP_DOC         VARCHAR(1) NOT NULL,\n"
                    + "    QTD_CARGA      INTEGER,\n"
                    + "    QTD_LACRE      INTEGER,\n"
                    + "    CHAVE          VARCHAR(44)"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_UN_TRANSPORTE ADD CONSTRAINT PK_MDFE_UN_TRANSPORTE PRIMARY KEY (CODDOC, COD_TRANSP, DAD_CODIGO, TP_DOC, COD_MUN);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_UN_TRANSPORTE ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD(); 
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
         //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_LACRES_TRANSPORTE (\n"
                    + "    CODDOC        INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO    INTEGER NOT NULL,\n"
                    + "    COD_TRANSP    INTEGER NOT NULL,\n"
                    + "    TP_DOC        VARCHAR(1)  NOT NULL,\n"
                    + "    COD_MUN       VARCHAR(7)  NOT NULL,\n"
                    + "    NR_LACRE      VARCHAR(20) NOT NULL\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LACRES_TRANSPORTE ADD CONSTRAINT PK_MDFE_LACRES_TRANSPORTE PRIMARY KEY(DAD_CODIGO, COD_TRANSP, CODDOC, TP_DOC, COD_MUN, NR_LACRE);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_LACRES_TRANSPORTE ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        //-----------------------------------------------------------------------------------------------

        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_TERMINAL_CARREGAMENTO (\n"
                    + "    CODIGO                   INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO               INTEGER NOT NULL,\n"
                    + "    NOME_TER_CARREGAMENTO    VARCHAR(60)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TERMINAL_CARREGAMENTO ADD CONSTRAINT PK_MDFE_TERMINAL_CARREGAMENTO PRIMARY KEY (CODIGO, DAD_CODIGO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TERMINAL_CARREGAMENTO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------------
        
         try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_TERMINAL_DESCARREGA (\n"
                    + "    CODIGO                      INTEGER NOT NULL,\n"
                    + "    DAD_CODIGO                  INTEGER NOT NULL,\n"
                    + "    NOME_TER_DESCARREGAMENTO    VARCHAR(60)\n"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TERMINAL_DESCARREGA ADD CONSTRAINT PK_MDFE_TERMINAL_DESCARREGA PRIMARY KEY (CODIGO, DAD_CODIGO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TERMINAL_DESCARREGA ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela MDFE_TERMINAL_DESCARREGAMENTO...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
          try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_TERMINAL_COMBOIO (\n"
                    + "    CODIGO_COBOIO               VARCHAR(10) NOT NULL,\n"
                    + "    DAD_CODIGO                  INTEGER NOT NULL,\n"
                    + "    ID_BALSA                    VARCHAR(5),\n"
                    + "    BALSA                       VARCHAR(60)"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TERMINAL_COMBOIO ADD CONSTRAINT PK_MDFE_TERMINAL_COMBOIO PRIMARY KEY (CODIGO_COBOIO, DAD_CODIGO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TERMINAL_COMBOIO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------
       
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_UN_TRANS_VAZIA (\n" +
                    "    CODIGO       INTEGER NOT NULL,  " +
                    "    ID_UN_TRANS   VARCHAR(20) NOT NULL,\n" +
                    "    TIPO         VARCHAR(1),\n" +
                    "    RGCODUSU     INTEGER,\n"
                    + "  RGUSUARIO    VARCHAR(8),\n"
                    + "  RGDATA       TIMESTAMP,\n"
                    + "  RGEVENTO     VARCHAR(1)\n"
                    +");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_UN_TRANS_VAZIA ADD CONSTRAINT PK_MDFE_CAD_UN_TRANS_VAZIA PRIMARY KEY(ID_UN_TRANS);");
            Conectar.DesconectarBD();
                        
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        //------------------------------------------------------------------
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_UN_TRANS_VAZIA (\n" +
                    "    CODIGO_ID   VARCHAR(20) NOT NULL,\n" +
                    "    DAD_CODIGO  INTEGER NOT NULL,\n" +
                    "    TIPO        VARCHAR(1)\n" +
                    ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_UN_TRANS_VAZIA ADD CONSTRAINT PK_MDFE_UN_TRANS_VAZIA PRIMARY KEY (CODIGO_ID, DAD_CODIGO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_UN_TRANS_VAZIA ADD FOREIGN KEY (DAD_CODIGO) REFERENCES MDFE_DADOS (DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
            
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        } 
        
                
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_TERMINAL_UNCARGAVAZIA (\n"
                    + "CODIGO_ID   VARCHAR(20) NOT NULL,\n" +
                      "DAD_CODIGO  INTEGER NOT NULL,\n" +
                      "TIPO        VARCHAR(60)"
                    + ");");
            Conectar.DesconectarBD();

            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TERMINAL_UNCARGAVAZIA ADD CONSTRAINT PK_MDFE_TERMINAL_UNCARGAVAZIA PRIMARY KEY (CODIGO_ID, DAD_CODIGO);");
            Conectar.DesconectarBD();
            
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_TERMINAL_UNCARGAVAZIA ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();
            
        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //----------------------------------------------------------------------
        
        
        









        
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    TARA           INTEGER");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    CAPACIDADE_KG  INTEGER ");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    CAPACIDADE_M3  INTEGER");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    RENAVAM        VARCHAR(11) ");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    TP_RODADO      VARCHAR(2) ");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    RODADO         VARCHAR(60)");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + " TP_CARROCERIA  VARCHAR(2)");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    CARROCERIA     VARCHAR(60)");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    CODPROP        INTEGER");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        //-----------------------------------------------------------------------------------------------

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABVEIC  ADD \n"
                    + "    NOMEPROP       VARCHAR(60)");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
                
        //-----------------------------------------------------------------------------------------------
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABFIL  ADD \n"
                                 + "    RNTRC       VARCHAR(8)");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE TABFIL  ADD \n"
                                 + "    CODMUNFIL       VARCHAR(7)");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
           
        //-------------------------------------seguro----------------------------------------------------------
        
        
        try {
            Conectar.ConectarBD();
            
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_CAD_SEGURADORA (\n" +
                                        "    SEG_CODIGO INTEGER NOT NULL,\n" +
                                        "    SEG_NOME   VARCHAR(30),\n" +
                                        "    SEG_CNPJ   VARCHAR(14),\n" +
                                        "    RGCODUSU   INTEGER,\n" +
                                        "    RGUSUARIO  VARCHAR(8),\n" +
                                        "    RGDATA     TIMESTAMP,\n" +
                                        "    RGEVENTO   VARCHAR(1)\n" +
                                        ");");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...MDFE_CAD_SEGURADORA\n" + e.getMessage());
        }
        
    
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_CAD_SEGURADORA ADD CONSTRAINT PK_MDFE_CAD_SEGURADORA PRIMARY KEY(SEG_CODIGO);");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }


        //-----------------------------------------------------------------------------------------------
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_SEGURO (\n" +
                                    "    CODIGO      INTEGER NOT NULL,\n" +
                                    "    DAD_CODIGO  INTEGER NOT NULL,\n" +
                                    "    TP_RESP     VARCHAR(2),\n" +
                                    "    COD_RESP    VARCHAR(5),\n" +
                                    "    NOME_RESP   VARCHAR(60),\n" +
                                    "    CPF_RESP    VARCHAR(11),\n" +
                                    "    CNPJ_RESP   VARCHAR(14),\n" +
                                    "    COD_SEG     VARCHAR(5), \n" +
                                    "    NOME_SEG    VARCHAR(60),\n" +
                                    "    CNPJ_SEG    VARCHAR(14),\n" +
                                    "    NR_APOL     VARCHAR(20)\n" +
                                    ");");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_SEGURO ADD CONSTRAINT PK_MDFE_SEGURO PRIMARY KEY(DAD_CODIGO, CODIGO);");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_SEGURO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
  
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_AVERBACAO (\n" +
                                    "    DAD_CODIGO  INTEGER NOT NULL,\n" +
                                    "    COD_SEGURO  INTEGER NOT NULL,\n" +
                                    "    NR_AVER     VARCHAR(40) NOT NULL\n" +
                                    ");");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_AVERBACAO ADD CONSTRAINT PK_MDFE_AVERBACAO PRIMARY KEY (DAD_CODIGO, COD_SEGURO, NR_AVER);");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_AVERBACAO ADD FOREIGN KEY (DAD_CODIGO) REFERENCES MDFE_DADOS (DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

//---------------------------------


        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("CREATE TABLE MDFE_PERIGO (\n" +
                                    "    CODIGO         INTEGER NOT NULL,\n" +
                                    "    DAD_CODIGO     INTEGER NOT NULL,\n" +
                                    "    COD_MUN        VARCHAR(7)  NOT NULL,\n" +
                                    "    CODDOC         INTEGER NOT NULL,\n" +
                                    "    TP_DOC         VARCHAR(1)  NOT NULL,\n" +
                                    "    CODTRANSPORTE  INTEGER NOT NULL,\n" + 
                                    "    NRONU          VARCHAR(4),  \n" +
                                    "    NOME_APROP_EMB VARCHAR(150),\n" +
                                    "    CLARISCO       VARCHAR(40), \n" +
                                    "    GREMB          VARCHAR(6),  \n" +
                                    "    QTOTPROD       VARCHAR(20), \n" +
                                    "    VALTIPO        VARCHAR(60)  \n" +
                                    ");");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }

        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_PERIGO ADD CONSTRAINT PK_MDFE_PERIGO PRIMARY KEY(CODIGO, DAD_CODIGO, COD_MUN, CODDOC, TP_DOC);");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }
        
        try {
            Conectar.ConectarBD();
            Conectar.stam.executeUpdate("ALTER TABLE MDFE_PERIGO ADD FOREIGN KEY(DAD_CODIGO) REFERENCES MDFE_DADOS(DAD_CODIGO) ON DELETE CASCADE ON UPDATE CASCADE;");
            Conectar.DesconectarBD();

        } catch (Exception e) {
            //   System.out.println( "Erro na Atualização da Tabela...\n" + e.getLocalizedMessage());
            System.out.println("Erro na Atualização da Tabela...\n" + e.getMessage());
        }





       




       
       //JOptionPane.showMessageDialog(null, "Atualização Finalizada com Sucesso!");
    }

}
