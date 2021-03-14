
import javax.swing.JOptionPane;

public class exemplo2 {
    public static void main(String[] args) {
//Aula de algoritmo Exemplo "if e else"
        float frequencia, nota1, nota2, media;

        frequencia = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a frequencia", "frequencia", JOptionPane.INFORMATION_MESSAGE));
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a primeira nota", "nota 1", JOptionPane.INFORMATION_MESSAGE));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a segunda nota", "nota 2", JOptionPane.INFORMATION_MESSAGE));

        media = ((nota1 + nota2) / 2);
        
        if (frequencia < 75){
            System.out.println("Reprovado");
        }
        else{
        if (media < 6){
        System.out.println("Reprovado");
        }
        else{
        System.out.println("Aprovado");
        }
        }
    }
}
