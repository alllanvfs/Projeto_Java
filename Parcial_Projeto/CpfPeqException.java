//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;

public class CpfPeqException extends Exception
{
    public void impCpfPeq(){
        JOptionPane.showMessageDialog(null, "O CPF deve ser um valor positivo!", "ATENCAO", 2);
    }
}
