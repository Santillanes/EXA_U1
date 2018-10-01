
import java.util.Scanner;

/*
 * Examen unidad 1 - Ejercicio 4
 */

/**
 *
 *      Equipo Donut 
 * Carrillo Ortiz Paola Xcchitl 18550693
 * Diaz Lopez Elena Guadalupe 18550623
 * Monsivais Vargas Luis Arturo 18550667
 * Santillanes Loya Luis Carlos 18550694 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("PROBLEMA 4: El angulo de disparo del objeto es de 45 grados.");
        System.out.println("Introduce la velocidad inicial (metros/segundos): ");
        double vInicial;        
        vInicial = input.nextDouble();
        double seno45;        
        seno45 = 0.707107;
        int gravedad;        
        gravedad = (int) 9.81;
        int altura;
        altura = (int) (Math.pow(vInicial, 2) * Math.pow(seno45, 2) / 2 * gravedad);
        System.out.println("La altura máxima que el objeto alcanza es ");
        System.out.println(altura);
        int seno90;
        seno90 = 1;
        int distancia;        
        distancia = (int) (Math.pow(vInicial, 2) * seno90 / 10);
        System.out.println("La distancia que el objeto alcanza al caer es " + distancia);
    }
    
}
