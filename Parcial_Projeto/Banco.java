//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco
{   
    //variaveis para os laços
    static boolean continuarcpf = true;
    static boolean continuaridade = true;
    static boolean continuarpeso = true;
    static boolean continuarvalor = true;

    //DECLARACAO obj e lista 

    static Leitura l = new Leitura();
    
    static List<Esportiva> bancoEsportiva = new ArrayList<Esportiva>();
    static List<Offroad> bancoOffroad = new ArrayList<Offroad>();
    static List<Touring> bancoTouring = new ArrayList<Touring>();

    //CADASTRO DE MOTO ESPORTIVA

    public static Esportiva cadEsportiva(Esportiva m1)
    {   
        System.out.println("\n--------Registro_de_Pessoa--------");
        System.out.println("--------Insira_seus_dados--------");
        
        m1.setNome(l.entDados("\nDigite o seu NOME:"));

        continuarcpf = true;
        while(continuarcpf){
            try
            {
                m1.setCpf(Integer.parseInt(l.entDados("\nDigite o seu CPF:")));
                continuarcpf = false;
            }
            catch(CpfPeqException cpe)
            {
                cpe.impCpfPeq();
            }
            catch(CpfGrdException cge)
            {
                cge.impCpfGrd();
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "!O CPF deve ser um valor numerico!", "ATENCAO", 2);
            }
        }

        continuaridade = true;
        while(continuaridade){
            try
            {
                m1.setIdade(Integer.parseInt(l.entDados("\nDigite a sua IDADE:")));
                continuaridade = false;
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "A idade tem que ser um valor numerico", "ATENCAO", 2);
            }
            catch(IdadeGrdException ige)
            {
                ige.impIdaGrd();
            }
            catch(IdadePeqException ipe)
            {
                ipe.impIdaPeq();
            }
        }

        System.out.println("\n--------Registro de Veiculo--------");
        System.out.println("--------Moto_Esportiva--------");

        m1.setPlaca(l.entDados("\nDigite a PLACA da moto:"));
        m1.setMarca(l.entDados("\nDigite a MARCA da moto:"));
        m1.setModelo(l.entDados("\nDigite o MODELO da moto:"));
        m1.setCilindradas(Integer.parseInt(l.entDados("\nDigite quantas CILINDRADA tem a moto:")));
        m1.setCor(l.entDados("\nDigite a COR da moto:"));
        
        continuarpeso = true;
        while(continuarpeso)
        {
            try{
                m1.setPeso(Integer.parseInt(l.entDados("\nDigite o PESO da moto em kg:")));
                continuarpeso = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
            }
        }

        continuarvalor = true;
        while(continuarvalor)
        {
            try{
                m1.setValor(Integer.parseInt(l.entDados("\nDigite o VALOR da moto:")));
                continuarvalor = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
            }
        }
        

        System.out.println("\n\tMenu - Sistema de freio");
        System.out.println("1 - Disco");
        System.out.println("2 - ABS");
        System.out.println("3 - Tambor");

        int opcfreio = Integer.parseInt(l.entDados(""));

        while (opcfreio < 1 || opcfreio > 3)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 3", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Sistema de freio");
                    System.out.println("1 - Disco");
                    System.out.println("2 - ABS");
                    System.out.println("3 - Tambor");
                    
                    opcfreio = Integer.parseInt(l.entDados(""));
                }

        switch (opcfreio)
            {
                case 1:
                    m1.setSistema_freio("DISCO");
                break;

                case 2:
                    m1.setSistema_freio("ABS");
                break;

                case 3:
                    m1.setSistema_freio("TAMBOR");
                break;
            }
        
        boolean continuarvelocidade = true;
        while(continuarvelocidade)
        {
            try{
                m1.setVelocidade_zero_cem(Integer.parseInt(l.entDados("A moto faz de 0 a 100 em quantos segundos:")));
                continuarvelocidade = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
            }
        }

        System.out.println("\n\tMenu - Chassi");
        System.out.println("1 - Trelica");
        System.out.println("2 - Aluminio");
        System.out.println("3 - Fibra de Carbono");
        System.out.println("4 - Dupla Trave");

        int opcchassi = Integer.parseInt(l.entDados(""));

        while (opcchassi < 1 || opcchassi > 4)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 4", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Chassi");
                    System.out.println("1 - Trelica");
                    System.out.println("2 - Aluminio");
                    System.out.println("3 - Fibra de Carbono");
                    System.out.println("4 - Dupla Trave");
                    
                    opcchassi = Integer.parseInt(l.entDados(""));
                }

        switch (opcchassi)
            {
                case 1:
                    m1.setChassi("TRELICA");
                break;

                case 2:
                    m1.setChassi("ALUMINIO");
                break;

                case 3:
                    m1.setChassi("FIBRA DE CARBONO");
                break;

                case 4:
                    m1.setChassi("DUPLA TRAVE");
                break;
            }

        bancoEsportiva.add(m1);
        
        return m1;
    }

    //CADASTRO DE MOTO OFFROAD
    
    public static Offroad cadOffroad(Offroad m2)
    {   
        System.out.println("\n--------Registro_de_Pessoa--------");
        System.out.println("--------Insira_seus_dados--------");
        
        m2.setNome(l.entDados("\nDigite o seu NOME:"));
        
        continuarcpf = true;
        while(continuarcpf){
            try
            {
                m2.setCpf(Integer.parseInt(l.entDados("\nDigite o seu CPF:")));
                continuarcpf = false;
            }
            catch(CpfPeqException cpe)
            {
                cpe.impCpfPeq();
            }
            catch(CpfGrdException cge)
            {
                cge.impCpfGrd();
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "!O CPF deve ser um valor numerico!", "ATENCAO", 2);
            }
        }

        continuaridade = true;
        while(continuaridade){
            try
            {
                m2.setIdade(Integer.parseInt(l.entDados("\nDigite a sua IDADE:")));
                continuaridade = false;
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "A idade tem que ser um valor numerico", "ATENCAO", 2);
            }
            catch(IdadeGrdException ige)
            {
                ige.impIdaGrd();
            }
            catch(IdadePeqException ipe)
            {
                ipe.impIdaPeq();
            }
        }

        System.out.println("\n--------Registro de Veiculo--------");
        System.out.println("--------Moto_OFF_ROAD--------");

        m2.setPlaca(l.entDados("\nDigite a PLACA da moto:"));
        m2.setMarca(l.entDados("\nDigite a MARCA da moto:"));
        m2.setModelo(l.entDados("\nDigite o MODELO da moto:"));
        m2.setCilindradas(Integer.parseInt(l.entDados("\nDigite quantas CILINDRADAS tem a moto:")));
        m2.setCor(l.entDados("\nDigite a COR da moto:"));
        
        continuarpeso = true;
        while(continuarpeso)
        {
            try{
                m2.setPeso(Integer.parseInt(l.entDados("\nDigite o PESO da moto em kg:")));
                continuarpeso = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
            }
        }

        continuarvalor = true;
        while(continuarvalor)
        {
            try{
                m2.setValor(Integer.parseInt(l.entDados("\nDigite o VALOR da moto:")));
                continuarvalor = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
            }
        }

        boolean continuaraltura_solo = true;
                while(continuaraltura_solo)
                {
                    try{
                        m2.setAltura_minima_solo(Integer.parseInt(l.entDados("\nDigite a altura minima da moto em cm:")));
                        continuaraltura_solo = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }
                    
        System.out.println("\n\tMenu - Pneu");
        System.out.println("1 - com cravo ou pinos");
        System.out.println("2 - cravos intermediarios");
        System.out.println("3 - banda de rodagem escalonada");
        System.out.println("4 - banda de rodagem para terreno misto");
        System.out.println("5 - banda de rodagem para enduro");

        int opcpneu = Integer.parseInt(l.entDados(""));

        while (opcpneu < 1 || opcpneu > 5)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 5", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Pneu");
                    System.out.println("1 - com cravo ou pinos");
                    System.out.println("2 - cravos intermediarios");
                    System.out.println("3 - banda de rodagem escalonada");
                    System.out.println("4 - banda de rodagem para terreno misto");
                    System.out.println("5 - banda de rodagem para enduro");
                    
                    opcpneu = Integer.parseInt(l.entDados(""));
                }

        switch (opcpneu)
            {
                case 1:
                    m2.setPneus("Cravos ou Pinos");
                break;
                            
                case 2:
                    m2.setPneus("Cravos Intermediarios");
                break;

                case 3:
                    m2.setPneus("Banda de Rodagem Escalonada");
                break;

                case 4:
                    m2.setPneus("Banda de Rodagem para Terreno Misto");
                break;

                case 5:
                    m2.setPneus("Banda de Rodagem para Enduro");
                break;
            }

        System.out.println("\n\tMenu - Protecao");
        System.out.println("1 - Protetores de mao");
        System.out.println("2 - Protetor de radiador");
        System.out.println("3 - Protetor de motor");
        System.out.println("4 - Protetor de quadro");
        System.out.println("5 - Todas as anteriores");

        int opcprotecao = Integer.parseInt(l.entDados(""));

        while (opcprotecao < 1 || opcprotecao > 5)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 5", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Protecao");
                    System.out.println("1 - Protetores de mao");
                    System.out.println("2 - Protetor de radiador");
                    System.out.println("3 - Protetor de motor");
                    System.out.println("4 - Protetor de quadro");
                    System.out.println("5 - Todas as anteriores");
                    
                    opcprotecao = Integer.parseInt(l.entDados(""));
                }

        switch (opcprotecao)
            {
                case 1:
                    m2.setProtecao("Protetor de Mao");
                break;
                            
                case 2:
                    m2.setProtecao("Protetor de Radiador");
                break;

                case 3:
                    m2.setProtecao("Protetor de Motor");
                break;

                case 4:
                    m2.setProtecao("Protetor de Quadro");
                break;

                case 5:
                    m2.setProtecao("Protetor de Mao, Radiador, Motor e Quadro");
                break;
            }

        bancoOffroad.add(m2);

        return m2;
    }

    //CADASTRO DE MOTO TOURING
    
    public static Touring cadTouring(Touring m3)
    {
        System.out.println("\n--------Registro_de_Pessoa--------");
        System.out.println("--------Insira_seus_dados--------");
        
        m3.setNome(l.entDados("\nDigite o seu NOME:"));
        
        continuarcpf = true;
        while(continuarcpf){
            try
            {
                m3.setCpf(Integer.parseInt(l.entDados("\nDigite o seu CPF:")));
                continuarcpf = false;
            }
            catch(CpfPeqException cpe)
            {
                cpe.impCpfPeq();
            }
            catch(CpfGrdException cge)
            {
                cge.impCpfGrd();
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "!O CPF deve ser um valor numerico!", "ATENCAO", 2);
            }
        }

        continuaridade = true;
        while(continuaridade){
            try
            {
                m3.setIdade(Integer.parseInt(l.entDados("\nDigite a sua IDADE:")));
                continuaridade = false;
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "A idade tem que ser um valor numerico", "ATENCAO", 2);
            }
            catch(IdadeGrdException ige)
            {
                ige.impIdaGrd();
            }
            catch(IdadePeqException ipe)
            {
                ipe.impIdaPeq();
            }
        }

        System.out.println("\n--------Registro do Veiculo--------");
        System.out.println("--------Moto_TOURING--------");

        m3.setPlaca(l.entDados("\nDigite a PLACA da moto:"));
        m3.setMarca(l.entDados("\nDigite a MARCA da moto:"));
        m3.setModelo(l.entDados("\nDigite o MODELO da moto:"));
        m3.setCilindradas(Integer.parseInt(l.entDados("\nDigite quantas CILINDRADA tem a moto:")));
        m3.setCor(l.entDados("\nDigite a COR da moto:"));
        
        continuarpeso = true;
        while(continuarpeso)
        {
            try{
                m3.setPeso(Integer.parseInt(l.entDados("\nDigite o PESO da moto em kg:")));
                continuarpeso = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
            }
        }

        continuarvalor = true;
        while(continuarvalor)
        {
            try{
                m3.setValor(Integer.parseInt(l.entDados("\nDigite o VALOR da moto:")));
                continuarvalor = false;
            }
            catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
            }
        }

        boolean continuarcapacidade = true;
                while(continuarcapacidade)
                {
                    try{
                        m3.setCapacidade_tanque(Integer.parseInt(l.entDados("\nDigite a CAPACIDADE do TANQUE em L:")));
                        continuarcapacidade = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }
                    
        System.out.println("\n\tMenu - Malas");
        System.out.println("\nCompartimentos de Malas");
        System.out.println("1 - Malas laterais");
        System.out.println("2 - Bau traseiro");
        System.out.println("3 - Malas laterais e Bau traseiro");

        int opcmala = Integer.parseInt(l.entDados(""));

        while (opcmala < 1 || opcmala > 3)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 3", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Malas");
                    System.out.println("\nCompartimentos de Malas");
                    System.out.println("1 - Malas laterais");
                    System.out.println("2 - Bau traseiro");
                    System.out.println("3 - Malas laterais e Bau traseiro");
                    
                    opcmala = Integer.parseInt(l.entDados(""));
                }

        switch (opcmala)
            {
                case 1:
                    m3.setMalas("Malas laterais");
                break;

                case 2:
                    m3.setMalas("Bau traseiro");
                break;

                case 3:
                    m3.setMalas("Malas laterais e Bau traseiro");
                break;
            }

        System.out.println("\n\tMenu - Conforto");
        System.out.println("1 - Otimo");
        System.out.println("2 - Mediano");
        System.out.println("3 - Ruim");

        int opcconforto = Integer.parseInt(l.entDados(""));
        
        while (opcconforto < 1 || opcconforto > 3)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 3", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Conforto");
                    System.out.println("1 - Otimo");
                    System.out.println("2 - Mediano");
                    System.out.println("3 - Ruim");
                    
                    opcconforto = Integer.parseInt(l.entDados(""));
                }

        switch (opcconforto)
            {
                case 1:
                    m3.setConforto("Otimo");
                break;

                case 2:
                    m3.setConforto("Mediano");
                break;

                case 3:
                    m3.setConforto("Ruim");
                break;
            }

        System.out.println("\n---!REGISTRO FEITO!--\n");

        bancoTouring.add(m3);

        return m3;
    }

    //CONSULTAR CPF ESPORTIVO

        public static Esportiva consEsportivaCpf(Esportiva m7)
        {
            for(int i = 0; i < bancoEsportiva.size(); i++)
            {
                if(m7.getCpf() == bancoEsportiva.get(i).getCpf())
                    {
                        return bancoEsportiva.get(i);
                    }
            }
            return null;
        }

    //CONSULTAR CPF OFFROAD

    public static Offroad consOffroadCpf(Offroad m8)
    {
        for(int j = 0; j < bancoOffroad.size(); j++)
        {
            if(m8.getCpf() == bancoOffroad.get(j).getCpf())
                {
                    return bancoOffroad.get(j);
                }
        }
        return null;
    }

    //CONSULTAR CPF TOURING

    public static Touring consTouringCpf(Touring m9)
    {
        for(int k = 0; k < bancoTouring.size(); k++)
        {
            if(m9.getCpf() == bancoTouring.get(k).getCpf())
                {
                    return bancoTouring.get(k);
                }
        }
        return null;
    }

    //IMPRIMIR TODAS ESPORTIVA

    public static void imp_All_Esportiva()
    {
        for(Esportiva m1 : bancoEsportiva)
        {
            System.out.println("\n\tDados do Responsavel\n");
            System.out.println("NOME: "+ m1.getNome());
            System.out.println("CPF: "+ m1.getCpf());
            System.out.println("IDADE: "+ m1.getIdade());

            System.out.println("\n\tDados Gerais Moto\n");
            System.out.println("PLACA: "+ m1.getPlaca());
            System.out.println("MARCA: "+ m1.getMarca());
            System.out.println("MODELO: "+ m1.getModelo());
            System.out.println("CILINDRADAS: "+ m1.getCilindradas());
            System.out.println("COR: "+ m1.getCor());
            System.out.println("PESO: "+ m1.getPeso() +" Kg");
            System.out.println("VALOR: "+ m1.getValor() +" $");

            System.out.println("\n\tDados Caracteristicos\n");
            System.out.println("SISTEMA DE FREIO: "+ m1.getSistema_freio());
            System.out.println("0 A 100 EM : "+m1.getVelocidade_zero_cem() +" SEGUNDOS");
            System.out.println("TIPO DO CHASSI: "+ m1.getChassi());
        }
    }

    //IMPRIMIR TODOS OFFROAD

    public static void imp_All_Offroad()
    {
        for(Offroad m2 : bancoOffroad)
        {
            System.out.println("\n\tDados do Responsavel\n");
            System.out.println("NOME: "+ m2.getNome());
            System.out.println("CPF: "+ m2.getCpf());
            System.out.println("IDADE: "+ m2.getIdade());

            System.out.println("\n\tDados Gerais Moto\n");
            System.out.println("PLACA: "+ m2.getPlaca());
            System.out.println("MARCA: "+ m2.getMarca());
            System.out.println("MODELO: "+ m2.getModelo());
            System.out.println("CILINDRADAS: "+ m2.getCilindradas());
            System.out.println("COR: "+ m2.getCor());
            System.out.println("PESO: "+ m2.getPeso() +" Kg");
            System.out.println("VALOR: "+ m2.getValor() +" $");

            System.out.println("\n\tDados Caracteristicos\n");
            System.out.println("ALTURA MINIMA DA MOTO: "+ m2.getsAltura_minima_solo()+ " cm");
            System.out.println("TIPO DE PNEU: "+ m2.getsPneus());
            System.out.println("PROTECOES DA MOTO: "+ m2.getsprotecao());
        }
    }

    //IMPRIMIR TODOS TOURING

    public static void imp_All_Touring()
    {
        for(Touring m3 : bancoTouring)
        {
            System.out.println("\n\tDados do Responsavel\n");
            System.out.println("NOME: "+ m3.getNome());
            System.out.println("CPF: "+ m3.getCpf());
            System.out.println("IDADE: "+ m3.getIdade());

            System.out.println("\n\tDados Gerais Moto\n");
            System.out.println("PLACA: "+ m3.getPlaca());
            System.out.println("MARCA: "+ m3.getMarca());
            System.out.println("MODELO: "+ m3.getModelo());
            System.out.println("CILINDRADAS: "+ m3.getCilindradas());
            System.out.println("COR: "+ m3.getCor());
            System.out.println("PESO: "+ m3.getPeso() +" Kg");
            System.out.println("VALOR: "+ m3.getValor() +" $");

            System.out.println("\n\tDados Caracteristicos\n");
            System.out.println("CAPACIDADE DO TANQUE: "+ m3.getCapacidade_tanque()+" L");
            System.out.println("COMPARTIMENTO DE BAGAGEM: "+ m3.getMalas());
            System.out.println("CONFORTO: "+ m3.getConforto());
        }
    }

    //IMPRIMIR UM ESPORTIVO

    public static void imp_One_Esportiva(Esportiva m4)
    {
        System.out.println("\n\tDados do Responsavel\n");
        System.out.println("NOME: "+ m4.getNome());
        System.out.println("CPF: "+ m4.getCpf());
        System.out.println("IDADE: "+ m4.getIdade());

        System.out.println("\n\tDados Gerais Moto\n");
        System.out.println("PLACA: "+ m4.getPlaca());
        System.out.println("MARCA: "+ m4.getMarca());
        System.out.println("MODELO: "+ m4.getModelo());
        System.out.println("CILINDRADAS: "+ m4.getCilindradas());
        System.out.println("COR: "+ m4.getCor());
        System.out.println("PESO: "+ m4.getPeso() +" Kg");
        System.out.println("VALOR: "+ m4.getValor() +" $");

        System.out.println("\n\tDados Caracteristicos\n");
        System.out.println("SISTEMA DE FREIO: "+ m4.getSistema_freio());
        System.out.println("0 A 100 EM : "+m4.getVelocidade_zero_cem() +" SEGUNDOS");
        System.out.println("TIPO DO CHASSI: "+ m4.getChassi());
    }

    //IMPRIMIR UM OFFROAD

    public static void imp_One_Offroad(Offroad m5)
    {
        System.out.println("\n\tDados do Responsavel\n");
        System.out.println("NOME: "+ m5.getNome());
        System.out.println("CPF: "+ m5.getCpf());
        System.out.println("IDADE: "+ m5.getIdade());

        System.out.println("\n\tDados Gerais Moto\n");
        System.out.println("PLACA: "+ m5.getPlaca());
        System.out.println("MARCA: "+ m5.getMarca());
        System.out.println("MODELO: "+ m5.getModelo());
        System.out.println("CILINDRADAS: "+ m5.getCilindradas());
        System.out.println("COR: "+ m5.getCor());
        System.out.println("PESO: "+ m5.getPeso() +" Kg");
        System.out.println("VALOR: "+ m5.getValor() +" $");

        System.out.println("\n\tDados Caracteristicos\n");
        System.out.println("ALTURA MINIMA DA MOTO: "+ m5.getsAltura_minima_solo()+ " cm");
        System.out.println("TIPO DE PNEU: "+ m5.getsPneus());
        System.out.println("PROTECOES DA MOTO: "+ m5.getsprotecao());
    }

    //IMPRIMIR UM TOURING

    public static void imp_One_Touring(Touring m6)
    {
        System.out.println("\n\tDados do Responsavel\n");
        System.out.println("NOME: "+ m6.getNome());
        System.out.println("CPF: "+ m6.getCpf());
        System.out.println("IDADE: "+ m6.getIdade());

        System.out.println("\n\tDados Gerais Moto\n");
        System.out.println("PLACA: "+ m6.getPlaca());
        System.out.println("MARCA: "+ m6.getMarca());
        System.out.println("MODELO: "+ m6.getModelo());
        System.out.println("CILINDRADAS: "+ m6.getCilindradas());
        System.out.println("COR: "+ m6.getCor());
        System.out.println("PESO: "+ m6.getPeso() +" Kg");
        System.out.println("VALOR: "+ m6.getValor() +" $");

        System.out.println("\n\tDados Caracteristicos\n");
        System.out.println("CAPACIDADE DO TANQUE: "+ m6.getCapacidade_tanque()+ " L");
        System.out.println("COMPARTIMENTO DE BAGAGEM: "+ m6.getMalas());
        System.out.println("CONFORTO: "+ m6.getConforto());
    }

    //ALTERAR ESPORTIVO 
    public static Esportiva alterarEsportiva(Esportiva m10)
    {
        for(int i = 0; i < bancoEsportiva.size(); i++)
        {
            if(m10.getCpf() == bancoEsportiva.get(i).getCpf())
            {

                System.out.println("--------Mudanca de Registro do Veiculo--------");
                System.out.println("--------Moto_Esportiva--------");

                m10.setPlaca(l.entDados("\nDigite a PLACA da moto:"));
                m10.setMarca(l.entDados("\nDigite a MARCA da moto:"));
                m10.setModelo(l.entDados("\nDigite o MODELO da moto:"));
                m10.setCilindradas(Integer.parseInt(l.entDados("\nDigite quantas CILINDRADA tem a moto:")));
                m10.setCor(l.entDados("\nDigite a COR da moto:"));
                
                continuarpeso = true;
                while(continuarpeso)
                    {
                    try{
                        m10.setPeso(Integer.parseInt(l.entDados("\nDigite o PESO da moto em kg:")));
                        continuarpeso = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }

                continuarvalor = true;
                while(continuarvalor)
                {
                    try{
                        m10.setValor(Integer.parseInt(l.entDados("\nDigite o VALOR da moto:")));
                        continuarvalor = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }

                System.out.println("\n\tMenu - Sistema de freio");
                System.out.println("1 - Disco");
                System.out.println("2 - ABS");
                System.out.println("3 - Tambor");

                int opcfreio = Integer.parseInt(l.entDados(""));

                while (opcfreio < 1 || opcfreio > 3)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 3", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Sistema de freio");
                    System.out.println("1 - Disco");
                    System.out.println("2 - ABS");
                    System.out.println("3 - Tambor");
                    
                    opcfreio = Integer.parseInt(l.entDados(""));
                }

                switch (opcfreio)
                    {
                        case 1:
                            m10.setSistema_freio("DISCO");
                        break;

                        case 2:
                            m10.setSistema_freio("ABS");
                        break;

                        case 3:
                            m10.setSistema_freio("TAMBOR");
                        break;
                    }
                
                boolean continuarvelocidade = true;
                while(continuarvelocidade)
                {
                    try{
                        m10.setVelocidade_zero_cem(Integer.parseInt(l.entDados("A moto faz de 0 a 100 em quantos segundos:")));
                        continuarvelocidade = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }

                System.out.println("\n\tMenu - Chassi");
                System.out.println("1 - Trelica");
                System.out.println("2 - Aluminio");
                System.out.println("3 - Fibra de Carbono");
                System.out.println("4 - Dupla Trave");

                int opcchassi = Integer.parseInt(l.entDados(""));

                while (opcchassi < 1 || opcchassi > 4)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 4", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Chassi");
                    System.out.println("1 - Trelica");
                    System.out.println("2 - Aluminio");
                    System.out.println("3 - Fibra de Carbono");
                    System.out.println("4 - Dupla Trave");
                    
                    opcchassi = Integer.parseInt(l.entDados(""));
                }

                switch (opcchassi)
                    {
                        case 1:
                            m10.setChassi("TRELICA");
                        break;

                        case 2:
                            m10.setChassi("ALUMINIO");
                        break;

                        case 3:
                            m10.setChassi("FIBRA DE CARBONO");
                        break;

                        case 4:
                            m10.setChassi("DUPLA TRAVE");
                        break;
                    }

                System.out.println("\n---!AJUSTE FEITO!---\n");
            
            bancoEsportiva.set(i, m10);
            return bancoEsportiva.get(i);
            }
        }

        return null;

    }//fim do alt esportivo

    public static Offroad alterarOffroad(Offroad m11)
    {
        for(int i = 0; i < bancoOffroad.size(); i++)
        {
            if(m11.getCpf() == bancoOffroad.get(i).getCpf())
            {

                System.out.println("--------Mudanca Registro de Veiculo--------");
                System.out.println("--------Moto_OFF_ROAD--------");

                m11.setPlaca(l.entDados("\nDigite a PLACA da moto:"));
                m11.setMarca(l.entDados("\nDigite a MARCA da moto:"));
                m11.setModelo(l.entDados("\nDigite o MODELO da moto:"));
                m11.setCilindradas(Integer.parseInt(l.entDados("\nDigite quantas CILINDRADA tem a moto:")));
                m11.setCor(l.entDados("\nDigite a COR da moto:"));
                
                continuarpeso = true;
                while(continuarpeso)
                {
                    try{
                        m11.setPeso(Integer.parseInt(l.entDados("\nDigite o PESO da moto em kg:")));
                        continuarpeso = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }

                continuarvalor = true;
                while(continuarvalor)
                {
                    try{
                        m11.setValor(Integer.parseInt(l.entDados("\nDigite o VALOR da moto:")));
                        continuarvalor = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }

                boolean continuaraltura_solo = true;
                while(continuaraltura_solo)
                {
                    try{
                        m11.setAltura_minima_solo(Integer.parseInt(l.entDados("\nDigite a altura minima da moto em cm:")));
                        continuaraltura_solo = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }
                
                    
                System.out.println("\n\tMenu - Pneu");
                System.out.println("1 - com cravo ou pinos");
                System.out.println("2 - cravos intermediarios");
                System.out.println("3 - banda de rodagem escalonada");
                System.out.println("4 - banda de rodagem para terreno misto");
                System.out.println("5 - banda de rodagem para enduro");

                int opcpneu = Integer.parseInt(l.entDados(""));

                while (opcpneu < 1 || opcpneu > 5)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 5", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Pneu");
                    System.out.println("1 - com cravo ou pinos");
                    System.out.println("2 - cravos intermediarios");
                    System.out.println("3 - banda de rodagem escalonada");
                    System.out.println("4 - banda de rodagem para terreno misto");
                    System.out.println("5 - banda de rodagem para enduro");
                    
                    opcpneu = Integer.parseInt(l.entDados(""));
                }

                switch (opcpneu)
                    {
                        case 1:
                            m11.setPneus("Cravos ou Pinos");
                        break;
                            
                        case 2:
                            m11.setPneus("Cravos Intermediarios");
                        break;

                        case 3:
                            m11.setPneus("Banda de Rodagem Escalonada");
                        break;

                        case 4:
                            m11.setPneus("Banda de Rodagem para Terreno Misto");
                        break;

                        case 5:
                            m11.setPneus("Banda de Rodagem para Enduro");
                        break;
                    }

                System.out.println("\n\tMenu - Protecao");
                System.out.println("1 - Protetores de mao");
                System.out.println("2 - Protetor de radiador");
                System.out.println("3 - Protetor de motor");
                System.out.println("4 - Protetor de quadro");
                System.out.println("5 - Todas as anteriores");

                int opcprotecao = Integer.parseInt(l.entDados(""));

                while (opcprotecao < 1 || opcprotecao > 5)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 5", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Protecao");
                    System.out.println("1 - Protetores de mao");
                    System.out.println("2 - Protetor de radiador");
                    System.out.println("3 - Protetor de motor");
                    System.out.println("4 - Protetor de quadro");
                    System.out.println("5 - Todas as anteriores");
                    
                    opcprotecao = Integer.parseInt(l.entDados(""));
                }

                switch (opcprotecao)
                    {
                        case 1:
                            m11.setProtecao("Protetor de Mao");
                        break;
                            
                        case 2:
                            m11.setProtecao("Protetor de Radiador");
                        break;

                        case 3:
                            m11.setProtecao("Protetor de Motor");
                        break;

                        case 4:
                            m11.setProtecao("Protetor de Quadro");
                        break;

                        case 5:
                            m11.setProtecao("Protetor de Mao, Radiador, Motor e Quadro");
                        break;
                    }
                
                System.out.println("\n---!AJUSTE FEITO!---\n");

                bancoOffroad.set(i, m11);
                return bancoOffroad.get(i);
            }
        }
        return null;
    }//fim do alt offroad

    public static Touring alterarTouring(Touring m12)
    {
        for(int i = 0; i < bancoTouring.size(); i++)
        {
            if(m12.getCpf() == bancoTouring.get(i).getCpf())
            {

                System.out.println("--------Mudanca Registro do Veiculo--------");
                System.out.println("--------Moto_TOURING--------");
        
                m12.setPlaca(l.entDados("\nDigite a PLACA da moto:"));
                m12.setMarca(l.entDados("\nDigite a MARCA da moto:"));
                m12.setModelo(l.entDados("\nDigite o MODELO da moto:"));
                m12.setCilindradas(Integer.parseInt(l.entDados("\nDigite quantas CILINDRADA tem a moto:")));
                m12.setCor(l.entDados("\nDigite a COR da moto:"));
                
                continuarpeso = true;
                while(continuarpeso)
                {
                    try{
                        m12.setPeso(Integer.parseInt(l.entDados("\nDigite o PESO da moto em kg:")));
                        continuarpeso = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }

                continuarvalor = true;
                while(continuarvalor)
                {
                    try{
                        m12.setValor(Integer.parseInt(l.entDados("\nDigite o VALOR da moto:")));
                        continuarvalor = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }
                
                boolean continuarcapacidade = true;
                while(continuarcapacidade)
                {
                    try{
                        m12.setCapacidade_tanque(Integer.parseInt(l.entDados("\nDigite a CAPACIDADE do TANQUE em L:")));
                        continuarcapacidade = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico ", "ATENCAO", 2);
                    }
                }
                
                            
                System.out.println("\n\tMenu - Malas");
                System.out.println("\nCompartimentos de Malas");
                System.out.println("1 - Malas laterais");
                System.out.println("2 - Bau traseiro");
                System.out.println("3 - Malas laterais e Bau traseiro");
        
                int opcmala = Integer.parseInt(l.entDados(""));

                while (opcmala < 1 || opcmala > 3)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 3", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Malas");
                    System.out.println("\nCompartimentos de Malas");
                    System.out.println("1 - Malas laterais");
                    System.out.println("2 - Bau traseiro");
                    System.out.println("3 - Malas laterais e Bau traseiro");
                    
                    opcmala = Integer.parseInt(l.entDados(""));
                }
        
                switch (opcmala)
                    {
                        case 1:
                            m12.setMalas("Malas laterais");
                        break;
        
                        case 2:
                            m12.setMalas("Bau traseiro");
                        break;
        
                        case 3:
                            m12.setMalas("Malas laterais e Bau traseiro");
                        break;
                    }
        
                System.out.println("\n\tMenu - Conforto");
                System.out.println("1 - Otimo");
                System.out.println("2 - Mediano");
                System.out.println("3 - Ruim");
        
                int opcconforto = Integer.parseInt(l.entDados(""));
                
                while (opcconforto < 1 || opcconforto > 3)
                {
                    JOptionPane.showMessageDialog(null, "So e possivel escolher do 1 ao 3", "ATENCAO", 2);

                    System.out.println("\n\tMenu - Conforto");
                    System.out.println("1 - Otimo");
                    System.out.println("2 - Mediano");
                    System.out.println("3 - Ruim");

                    opcconforto = Integer.parseInt(l.entDados(""));
                }

                switch (opcconforto)
                    {
                        case 1:
                            m12.setConforto("Otimo");
                        break;
        
                        case 2:
                            m12.setConforto("Mediano");
                        break;
        
                        case 3:
                            m12.setConforto("Ruim");
                        break;
                    }
        
                System.out.println("\n---!AJUSTE FEITO!---\n");

                bancoTouring.set(i, m12);
                return bancoTouring.get(i);
            }
        }
        return null;
    }//fim do alt offroad

    //deletar esportiva

    public static Esportiva deletarEsportiva(Esportiva m13)
    {
        for(int i = 0; i < bancoEsportiva.size(); i++)
        {
            if(m13.getCpf() == bancoEsportiva.get(i).getCpf())
            {
                return null;
            }
        }
        return m13;
    }

    //deletar Offroad

    public static Offroad deletarOffroad(Offroad m14)
    {
        for(int i = 0; i < bancoOffroad.size(); i++)
        {
            if(m14.getCpf() == bancoOffroad.get(i).getCpf())
            {
                return null;
            }
        }
        return m14;
    }

    //deletar Turing

    public static Touring deletarTuring(Touring m15)
    {
        for(int i = 0; i < bancoTouring.size(); i++)
        {
            if(m15.getCpf() == bancoTouring.get(i).getCpf())
            {
                return null;
            }
        }
        return m15;
    }

}
