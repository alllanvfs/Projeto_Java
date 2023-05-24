//ALLAN VINICIOS FERRAZ SANTOS RA:2465272

import javax.swing.JOptionPane;

public class IdadeGrdException extends Exception {
        public void impIdaGrd(){
            JOptionPane.showMessageDialog(null, "A Idade maxima aceita e 90 anos", "ATENCAO", 2);
        }
}
