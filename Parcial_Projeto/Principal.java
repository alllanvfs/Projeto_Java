//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;

public class Principal
{
    public static void main (String[] args)
    {
        //declrando variavel para o laço

        boolean continuar = true;
        boolean continuarinterface = true;

        //declarando obj

        Leitura l = new Leitura();
        Esportiva m1 = new Esportiva();
        Offroad m2 = new Offroad();
        Touring m3 = new Touring();

        //Intarface

        boolean inface = true;

        while(inface)
        {

            System.out.println("\n------------> CADASTRO DE MOTO <------------\n");
            System.out.println("1 - REGISTRAR MOTO");
            System.out.println("2 - CONSULTAR MOTO PELO CPF");
            System.out.println("3 - ALTERAR REGISTRO DE MOTO PELO CPF");
            System.out.println("4 - EXCLUIR REGISTRO DE MOTO PELO CPF");
            System.out.println("0 - FECHAR PROGRAMA");

            boolean continuarinterfacecad = true;
            while(continuarinterfacecad){

            try{

                int opcinface = Integer.parseInt(l.entDados("Escolha uma opcao:"));
                
                switch(opcinface)
                {

                    case 1:
                        System.out.println("\n\tMENU DE REGISTRO\n");
                        System.out.println("1 - REGISTRAR MOTO ESPORTIVA");
                        System.out.println("2 - REGISTRAR MOTO OFFROAD");
                        System.out.println("3 - REGISTRAR MOTO TOURING");

                        boolean continuarinterfacereg = true;
                        while(continuarinterfacereg)
                        {
                        
                        try{
                        int opcregistro = Integer.parseInt(l.entDados("Escolha uma opcao:"));

                        switch(opcregistro)
                        {
                            case 1:
                                m1 = new Esportiva();
                                m1 = Banco.cadEsportiva(m1);
                                Banco.imp_All_Esportiva();
                            break;
                            //
                            case 2:
                                m2 = new Offroad();
                                m2 = Banco.cadOffroad(m2);
                                Banco.imp_All_Offroad();
                            break;
                            //
                            case 3:
                                m3 = new Touring();
                                m3 = Banco.cadTouring(m3);
                                Banco.imp_All_Touring();
                            break;
                            //
                            default:
                                JOptionPane.showMessageDialog(null, "Escolha uma opcao de 0 a 3", "ATENCAO", 2);
                            break;
                        }
                        continuarinterfacereg = false;
                        }
                        catch(NumberFormatException nfe){
                            JOptionPane.showMessageDialog(null, "Digite um valor numerico", "ATENCAO", 2);
                        }}
                    break;
                    //
                    case 2:
                        System.out.println("\n\tMENU DE CONSULTA\n");
                        System.out.println("1 - CONSULTAR MOTO ESPORTIVA PELO CPF");
                        System.out.println("2 - CONSULTAR MOTO OFFROAD PELO CPF");
                        System.out.println("3 - CONSULTAR MOTO TOURING PELO CPF");

                        boolean continuarinterfacecon = true;
                        while(continuarinterfacecon)
                        {
                        try{

                            int opcconsulta = Integer.parseInt(l.entDados("Escolha uma opcao"));

                            switch(opcconsulta)
                            {
                                case 1:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {   
                                            m1 = new Esportiva();

                                            m1.setCpf(Integer.parseInt(l.entDados("\nCPF cadastrado a ser consultado:")));

                                            m1 = Banco.consEsportivaCpf(m1);
                
                                            if(m1 != null)
                                            {
                                                Banco.imp_One_Esportiva(m1);
                                            }
                                            else
                                            {
                                                l.entDados("\nNao consta nos nossos registros - pressione <ENTER>");
                                            }

                                            continuar = false;
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

                                break;
                                //
                                case 2:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {
                                            m2 = new Offroad();
                                            m2.setCpf(Integer.parseInt(l.entDados("\nCPF cadastrado a ser consultado:")));
                                            m2 = Banco.consOffroadCpf(m2);
                
                                            if(m2 != null)
                                            {
                                                Banco.imp_One_Offroad(m2);
                                            }
                                            else
                                            {
                                                l.entDados("\nNao consta nos nossos registros - pressione <ENTER>");
                                            }
                                            continuar = false;
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
                                break;
                                //
                                case 3:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {

                                            m3 = new Touring();
                                            m3.setCpf(Integer.parseInt(l.entDados("\nCPF cadastrado a ser consultado:")));
                                            m3 = Banco.consTouringCpf(m3);
                
                                            if(m3 != null)
                                            {
                                                Banco.imp_One_Touring(m3);
                                            }
                                            else
                                            {
                                                l.entDados("\nNao consta nos nossos registros - pressione <ENTER>");
                                            }
                                            continuar = false;
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
                                break;
                                //
                                default:
                                    JOptionPane.showMessageDialog(null, "Escolha uma opcao de 0 a 3", "ATENCAO", 2);
                                break;
                            }
                            continuarinterfacecon = false;
                        }
                        catch(NumberFormatException nfe)
                        {
                            JOptionPane.showMessageDialog(null, "Digite um valor numerico", "ATENCAO", 2); 
                        }
                    }
                    break;
                        
                    //
                    case 3:
                        System.out.println("\n\tMENU DE ALTERACAO\n");
                        System.out.println("1 - ALTERAR REGISTRO DE MOTO ESPORTIVA PELO CPF");
                        System.out.println("2 - ALTERAR REGISTRO DE MOTO OFFROAD PELO CPF");
                        System.out.println("3 - ALTERAR REGISTRO DE MOTO TOURING PELO CPF");

                        boolean continuarinterfacealt = true;
                        while(continuarinterfacealt){
                            try{
                            int opcalteracao = Integer.parseInt(l.entDados("Escolha uma opcao"));

                            switch(opcalteracao)
                            {
                                case 1:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {
                                            m1 = new Esportiva();
                                            m1.setCpf(Integer.parseInt(l.entDados("\nInsira o CPF para alterar os dados")));
                                            m1 = Banco.alterarEsportiva(m1);
                                            if(m1 != null)
                                            {
                                                Banco.imp_One_Esportiva(m1);
                                            }
                                            else
                                            {
                                                l.entDados("\nEsse CPF nao consta em nosso banco - pressione <ENTER>");
                                            }
                                            continuar = false;
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
                                break;
                                //
                                case 2:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {
                                            m2 = new Offroad();
                                            m2.setCpf(Integer.parseInt(l.entDados("\nInsira o CPF para alterar os dados")));
                                            m2 = Banco.alterarOffroad(m2);
                                            if(m2 != null)
                                            {
                                                Banco.imp_One_Offroad(m2);
                                            }
                                            else
                                            {
                                                l.entDados("\nEsse CPF nao consta em nosso banco - press <ENTER>");
                                            }
                                            continuar = false;
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
                                break;
                                //
                                case 3:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {
                                            m3 = new Touring();
                                            m2.setCpf(Integer.parseInt(l.entDados("\nInsira o CPF para alterar os dados")));
                                            m3 = Banco.alterarTouring(m3);
                                            if(m3 != null)
                                            {
                                                Banco.imp_One_Touring(m3);
                                            }
                                            else
                                            {
                                                l.entDados("\nEsse CPF nao consta em nosso banco - press <ENTER>");
                                            }
                                            continuar = false;
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
                                break;
                                //
                                default:
                                    JOptionPane.showMessageDialog(null, "Escolha uma opcao de 0 a 3", "ATENCAO", 2);
                                break;
                            }
                            continuarinterfacealt = false;
                    }
                    catch(NumberFormatException nfe){
                        JOptionPane.showMessageDialog(null, "Digite um valor numerico", "ATENCAO", 2);
                    }
                    }
                    break;
                    //
                    case 4:
                        System.out.println("\n\tMENU - DELETAR\n");
                        System.out.println("1 - DELETAR REGISTRO DE MOTO ESPORTIVA PELO CPF");
                        System.out.println("2 - DELETAR REGISTRO DE MOTO OFFROAD PELO CPF");
                        System.out.println("3 - DELETAR REGISTRO DE MOTO TOURING PELO CPF");

                        boolean continuarinterfacedel = true;
                        while(continuarinterfacedel){

                        try{

                            int opcexclusao = Integer.parseInt(l.entDados("Escolha uma opcao"));

                            switch(opcexclusao)
                            {
                                case 1:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {
                                            m1 = new Esportiva();
                                            m1.setCpf(Integer.parseInt(l.entDados("\nInsira o CPF para deletar os dados")));
                                            m1 = Banco.deletarEsportiva(m1);
                                            if(m1 == null)
                                            {
                                                l.entDados("\nRegisto excluido com sucesso - press <ENTER>");
                                            }
                                            else
                                            {
                                                l.entDados("\nNao existe moto registrada nesse CPF - press <ENTER>");
                                            }
                                            continuar = false;
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
                                break;
                                //
                                case 2:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {
                                            m2 = new Offroad();
                                            m2.setCpf(Integer.parseInt(l.entDados("\nInsira o CPF para deletar os dados")));
                                            m2 = Banco.deletarOffroad(m2);
                                            if(m2 == null)
                                            {
                                                l.entDados("\nRegistro excluido com sucesso - press <ENTER>");
                                            }
                                            else
                                            {
                                                l.entDados("\nNao existe moto registrada nesse CPF - press <ENTER>");
                                            }
                                            continuar = false;
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
                                break;
                                //
                                case 3:
                                    continuar = true;
                                    while(continuar){
                                        try
                                        {
                                            m3 = new Touring();
                                            m3.setCpf(Integer.parseInt(l.entDados("\nInsira o CPF para deletar os dados")));
                                            m3 = Banco.deletarTuring(m3);
                                            if(m3 == null)
                                            {
                                                l.entDados("\nRegistro excluido com sucesso - press <ENTER>");
                                            }
                                            else
                                            {
                                                l.entDados("\nNao existe moto registrada nesse CPF - press <ENTER>");
                                            }
                                            continuar = false;
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
                                break;
                                //
                                default:
                                    JOptionPane.showMessageDialog(null, "Escolha uma opcao de 0 a 3", "ATENCAO", 2);
                                break;
                            }
                            continuarinterfacedel = false;
                        }
                        catch(NumberFormatException nfe){
                            JOptionPane.showMessageDialog(null, "Digite um valor numerico", "ATENCAO", 2);
                        }
                    }
                    break;
                    //
                    case 0:
                        System.exit(0);
                    break;
                    //
                    default:
                        JOptionPane.showMessageDialog(null, "Escolha uma opcao de 0 a 4", "ATENCAO", 2);
                    break;
                }//fim do switch interface

                continuarinterface = false;
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(null, "Digite um valor numerico", "ATENCAO", 2);
            }
            }
        }//fim do while interface
    }
}