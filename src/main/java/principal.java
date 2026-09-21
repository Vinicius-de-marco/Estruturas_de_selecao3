
import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        if ((numero % 10) == 0) {
            JOptionPane.showMessageDialog(null, "É multiplo de 10! ");
        } else {
            if ((numero % 2) == 0) {
                JOptionPane.showMessageDialog(null, "É multiplo de 2! ");
            } else {
                if ((numero % 5) == 0) {
                    JOptionPane.showMessageDialog(null, "É multiplo de 5! ");
                } else {
                    JOptionPane.showMessageDialog(null, "Não é multiplo destes! ");

                }
            }
        }
    }
}
