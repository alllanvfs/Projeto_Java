//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;

public class IdadePeqException extends Exception {
    public void impIdaPeq(){
        JOptionPane.showMessageDialog(null, "A Idade minima aceita e 18 anos", "ATENCAO", 2);
    }
}
