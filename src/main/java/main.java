
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        String nome = "";
        double peso = 0;
        String input = null;
        boolean EntradaValida = false;
        while (!EntradaValida) {
            JOptionPane.showMessageDialog(null, "vou divinhar seu peso! ");
            nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
            input = JOptionPane.showInputDialog(null, "Digite seu peso: ");
            //em caso de cancelamento
            if (nome == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }
        
        try {
            peso = Double.parseDouble(input);
            if (peso <= 0) {
                JOptionPane.showMessageDialog(null, "Mentirosooo!");
            } else {
                JOptionPane.showMessageDialog(null, "Olá! " + peso + "Kg" + " seu peso é: " + nome);
            }
            EntradaValida = true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
        }
    }
}
