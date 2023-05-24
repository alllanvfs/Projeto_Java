//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;;

public class Esportiva extends Motors{

    //declaracoes

    private String sistema_freio;
    private float velocidade_zero_cem;
    private String chassi;

    //getters

    public String getSistema_freio(){
        return sistema_freio;
    }
    public String getChassi(){
        return chassi;
    }
    public float getVelocidade_zero_cem(){
        return velocidade_zero_cem;
    }

    //setters
    
    public void setSistema_freio(String sistema_freio){
        this.sistema_freio = sistema_freio;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public void setVelocidade_zero_cem(int velocidade_zero_cem){
        while(velocidade_zero_cem < 2.5 || velocidade_zero_cem > 6)
        {   
            JOptionPane.showMessageDialog(null, "So e possivel registrar tempo de 2,5 a 6 segundos", "ATENCAO", 2);
            System.out.println("Digite um tempo valido a seguir:");
            velocidade_zero_cem = Integer.parseInt(System.console().readLine());
        }
        this.velocidade_zero_cem = velocidade_zero_cem;
    }

    public void finalizarRegistro()
    {
        System.out.println("Registro Esportiva finalizado");
    }

}
