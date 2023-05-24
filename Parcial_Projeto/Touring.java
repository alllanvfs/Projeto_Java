//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;

public class Touring extends Motors{

    //declaracoes

    private int capacidade_tanque;
    private String malas;
    private String conforto;

    //getters

    public int getCapacidade_tanque(){
        return capacidade_tanque;
    }
    public String getMalas(){
        return malas;
    }
    public String getConforto(){
        return conforto;
    }

    //setters
    
    public void setCapacidade_tanque(int capacidade_tanque){
        while(capacidade_tanque < 15 || capacidade_tanque > 30)
        {   
            JOptionPane.showMessageDialog(null, "So e possivel registrar tanques de 15 a 30 Litros", "ATENCAO", 3);
            System.out.println("Digite um valor valido a seguir:");
            capacidade_tanque = Integer.parseInt(System.console().readLine());
        }

        this.capacidade_tanque = capacidade_tanque;
    }
    public void setMalas(String malas){
        this.malas = malas;
    }
    public void setConforto(String conforto){
        this.conforto = conforto;
    }

    public void finalizarRegistro()
    {
        System.out.println("Registro Touring finalizado");
    }

}
