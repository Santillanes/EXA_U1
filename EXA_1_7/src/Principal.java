
import static java.lang.Math.sqrt;
import java.util.Scanner;

/*
 * Examen unidad 1 - Ejercicio 7
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
        
        System.out.println("PROBLEMA 7: Fórmulas canónicas de la hipérbola.");
        System.out.println("NOTA: Se utilizará la fórmula de la hipérbola horizontal.");
        System.out.println("Necesitamos los datos de la hipérbola.");
        System.out.print("Ingrese el valor en X del centro: ");
        double h = input.nextDouble();
        System.out.print("Ingrese el valor en Y del centro: ");
        double k = input.nextDouble();
        System.out.print("Ingrese el valor del eje mayor (a): ");
        double a = input.nextDouble();
        System.out.print("Ingrese el valor del eje menor (b): ");
        double b = input.nextDouble();
        
        double c = sqrt((Math.pow(a, 2))+(Math.pow(b, 2)));
        System.out.println("La distancia del centro al foco es: "+c);
        
        double xv = h+a;
        double yv = k;
        System.out.println("Las coordenadas de los vértices es: ");
        System.out.println("("+xv+","+yv+")");
        System.out.println("(-"+xv+","+yv+")");
        
        double xf = h+c;
        double yf = k;
        System.out.println("Las coordenadas de los focos es: ");
        System.out.println("("+xf+","+yf+")");
        System.out.println("(-"+xf+","+yf+")");       
    } 
}
