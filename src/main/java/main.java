import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        String nome; double peso;
        JOptionPane.showMessageDialog(null,"vou divinhar seu peso! ");
        nome = JOptionPane.showInputDialog(null,"Digite seu nome: ");
        peso = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu peso: "));
        
        if(peso <= 0) {
            JOptionPane.showMessageDialog(null,"Mentirosooo!");
        } else {
             JOptionPane.showMessageDialog(null,"Olá! "+ peso + "Kg" + " seu peso é: " + nome);
        }
    }
}
