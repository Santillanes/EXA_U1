
import java.util.Scanner;

/*
 * Examen unidad 1 - Ejercicio 2
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
        Scanner input = new Scanner (System.in);
        System.out.println("PROBLEMA 2: Metros cúbicos que fluyen por una tubería.");
        System.out.println("Introduce el radio de la tuberia");
        double rad = input.nextDouble();
        
        System.out.println("Introduce la velocidad del flujo del agua en m/s");
        double vel =  input.nextDouble();
        
        double flujo  = vel * (3.1416 * (rad * rad));
        System.out.println("El flujo de agua de la tuberia en metros cubicos es: "+flujo);
    }
    
}
