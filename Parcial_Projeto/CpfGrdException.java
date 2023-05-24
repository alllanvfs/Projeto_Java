//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;

public class CpfGrdException extends Exception
{
    public void impCpfGrd(){
        JOptionPane.showMessageDialog(null, "O CPF deve ser um valor que va ate 100.000.000!", "ATENCAO", 2);
    }
}
