package miamigoartificial;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class MiAmigoArtificial {
    final static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String a = "Yo soy tu amigo artificial";
        JOptionPane.showMessageDialog(null, "¡Hola!, Bienvenido: " + a + "\nJarvis");
        
        recordarNombre();
    }
    
    public static void recordarNombre(){
        System.out.println("Dime como te llamas");
        String nombre = entrada.nextLine();
        System.out.println("Que gran nombre tienes " + nombre + ".");
    }
}