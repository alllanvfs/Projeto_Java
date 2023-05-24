//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;

public class Offroad extends Motors implements Interface{

    //declaracao

    private int altura_minima_solo;
    private String pneus;
    private String protecao;

    //getters

    public int getsAltura_minima_solo(){
        return altura_minima_solo;
    }
    public String getsPneus(){
        return pneus;
    }
    public String getsprotecao(){
        return protecao;
    }

    //setters

    public void setAltura_minima_solo(int altura_minima_solo){
        while(altura_minima_solo < 25 || altura_minima_solo > 35)
        {   
            JOptionPane.showMessageDialog(null, "So e possivel registrar altura entre 25 a 35 cm", "ATENCAO", 3);
            System.out.println("Digite uma altura valida a seguir:");
            altura_minima_solo = Integer.parseInt(System.console().readLine());
        }

        this.altura_minima_solo = altura_minima_solo;
    }
    public void setPneus(String pneus){
        this.pneus = pneus;
    }
    public void setProtecao(String protecao){
        this.protecao = protecao;
    }

    public void finalizarRegistro()
    {
        System.out.println("Registro Offroad finalizado");
    }

    @Override
    public void calc() {
        throw new UnsupportedOperationException("chamada da interface 'calc'");
    }
    
}
