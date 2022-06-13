package miamigoartificial;

import static funciones.Presentacion.adivinarEdad;
import static funciones.Presentacion.saludar;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class MiAmigoArtificial {
    final static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String a = "Yo soy tu amigo artificial";
        JOptionPane.showMessageDialog(null, "¡Hola!, dejame presentarme: " + a + "\nJarvis");
        
        saludar();
        recordarNombre();
        adivinarEdad();
    }  
    
    public static void recordarNombre(){
        System.out.println("\nBueno ahora es tu turno de decirme como te llamas: ");
        String nombre = entrada.nextLine();
        System.out.println("Que fabuloso nombre tienes " + nombre + ".");
        System.out.println("y sabes algo, seré tu amigo o mejor dicho seremos grandes amigos!!");
        System.out.println("Te acompañaré por mil años asi que necesito que me cuides si quiere "
                + "que te acompañe");
    }
}