//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;

public abstract class Motors{
    
    //declaracoes da pessoa

    private String nome;
    private int cpf;
    private int idade;

    //declaracoes da moto 

    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float peso;
    private float valor;
    private int cilindradas; 

    public void finalizarRegistro()
    {
        System.out.println("Registro finalizado");
    }

    //Construtor

    public Motors()
    {
        placa = "";
        cor = "";
        modelo = "";
        marca = "";
        peso = 0;
        valor = 0;
        cilindradas = 0;
        nome = "";
        cpf = 0;
        idade = 0;
    }

    //getters

    public String getPlaca(){
        return placa;
    }
    public String getCor(){
        return cor;
    }
    public String getModelo(){
        return modelo;
    }
    public String getMarca(){
        return marca;
    }
    public float getPeso(){
        return peso;
    }
    public float getValor(){
        return valor;
    }
    public int getCilindradas(){
        return cilindradas;
    }
    public String getNome(){
        return nome;
    }
    public int getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }

    //setters

    public void setPlaca(String placa){
        while(placa.length() != 7)
        {
            JOptionPane.showMessageDialog(null, "So e possivel registrar placas com 7 algarismos e letras", "ATENCAO", 2);
            System.out.println("\nDigite uma placa valida a seguir:");
            placa = System.console().readLine();
        }

        this.placa = placa.toUpperCase();
    }

    public void setCor(String cor){
        while(cor.matches(".*\\d.*"))
        {
            JOptionPane.showMessageDialog(null, "Nao existe cor com numero", "ATENCAO", 2);
            System.out.println("\nDigite uma cor valida a seguir:");
            cor = System.console().readLine();
        }
        this.cor = cor.toUpperCase();
    }

    public void setModelo(String modelo){
        this.modelo = modelo.toUpperCase();
    }

    public void setMarca(String marca){
        while(marca.matches(".*\\d.*"))
        {
            JOptionPane.showMessageDialog(null, "Nao existe marca de moto com numero", "ATENCAO", 2);
            System.out.println("\nDigite uma marca valida a seguir:");
            marca = System.console().readLine();
        }
        this.marca = marca.toUpperCase();
    }

    public void setPeso(int peso){
        while(peso < 100 || peso > 400)
        {
            JOptionPane.showMessageDialog(null, "So e possivel registrar motos com peso entre 100 a 400 kg", "ATENCAO", 2);
            System.out.println("\nDigite um peso valido a seguir:");
            peso = Integer.parseInt(System.console().readLine());
        }
        
        this.peso = peso;
    }

    public void setPeso(float peso){
        while(peso < 100 || peso > 400)
        {
            JOptionPane.showMessageDialog(null, "So e possivel registrar motos com peso entre 100 a 400 kg", "ATENCAO", 2);
            System.out.println("\nDigite um peso valido a seguir:");
            peso = Integer.parseInt(System.console().readLine());
        }

        this.peso = peso;
    }

    public void setValor(int valor){
        while(valor < 5000)
        {
            JOptionPane.showMessageDialog(null, "So e possivel registrar motos que valem mais de 5000$", "ATENCAO", 2);
            System.out.println("\nDigite um valor valido a seguir:");
            valor = Integer.parseInt(System.console().readLine());
        }

        this.valor = valor;
    }

    public void setValor(float valor){
        while(valor < 5000)
        {
            JOptionPane.showMessageDialog(null, "So e possivel registrar motos que valem mais de 5000$", "ATENCAO", 2);
            System.out.println("\nDigite um valor valido a seguir:");
            valor = Integer.parseInt(System.console().readLine());
        }

        this.valor = valor;
    }

    public void setCilindradas(int cilindradas){
        while(cilindradas < 50)
        {
            JOptionPane.showMessageDialog(null, "So e possivel registrar motos com mais de 50 cilindradas", "ATENCAO", 2);
            System.out.println("\nDigite um valor valido a seguir:");
            cilindradas = Integer.parseInt(System.console().readLine());
        }

        this.cilindradas = cilindradas;
    }

    public void setNome(String nome){
        while(nome.matches(".*\\d.*"))
        {
            JOptionPane.showMessageDialog(null, "Nao existe nome com numero", "ATENCAO", 2);
            System.out.println("\nDigite um nome valido a seguir:");
            cor = System.console().readLine();
        }
        this.nome = nome.toUpperCase();
    }

    public void setCpf(int cpf) throws CpfPeqException, CpfGrdException{
        if(cpf > 0)
        {
            if(cpf <= 100000000)
            {
            this.cpf = cpf;
            }
            else
            {
                throw new CpfGrdException();
            }
        }
        else
        {
            throw new CpfPeqException();
        }
    }

    public void setIdade(int idade) throws IdadeGrdException, IdadePeqException{
        if(idade >= 18)
        {   
            if(idade <= 90)
            {
                this.idade = idade;
            }
            else
            {
                throw new IdadeGrdException();
            }
        }
        else
        {
            throw new IdadePeqException();
        }

        
    }


}
