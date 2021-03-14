
import javax.swing.JOptionPane;

public class exemplo1 {
    
    public static void main(String[] args) {
//Aula de algoritmo Exemplo "O maior valor"
        int n1, n2;

        n1 = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Digite o primeiro número", "Número",
                        JOptionPane.INFORMATION_MESSAGE));
        n2 = Integer.parseInt(
                JOptionPane.showInputDialog(null,
                        "Digite o segundo número", "Número",
                        JOptionPane.INFORMATION_MESSAGE));
        if (n1 > n2) {
            System.out.println("O maior  valor é " + n1);
        } else {
            if (n2 > n1) {
                System.out.println("O maior valor é " + n2);
            } else {
                System.out.println("Os valores são iguais");
            }
        }
    }
}
