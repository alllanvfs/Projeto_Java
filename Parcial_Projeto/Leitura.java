//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura
{
    public String entDados(String dados)
    {
        System.out.println(dados);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        String texto = "";

        try
        {
            texto = buff.readLine();
        }
        catch (IOException e)
        {
            System.out.println("\n");
        }

        return texto;
    }
}
