
import java.util.Scanner;

/*
 * Exámen unidad 1 - Ejercicio 6
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
        // y = x^2
        System.out.println("PROBLEMA 6: Programa con base en la fórmula y=x^2");
        System.out.print("Ingrese un valor de X para conocer su pendiente: ");
        double x = input.nextDouble();
        //DERIVADA ES = 2x
        double m = 2*x;
        System.out.println("La pendiente del punto elegido es: "+m);
        //==========================================================================
        System.out.println("");//Salto de linea
        System.out.println("Ahora calcularemos el aréa entre dos valores de x.");
        System.out.print("Ingrese el valor de x1: ");
        double x1 = input.nextDouble();
        System.out.print("Ingrese el valor de x2: ");
        double x2 = input.nextDouble();
        
        double y1 = Math.pow(x1, 2);
        double y2 = Math.pow(x2, 2);
        
        if(x1>x2){
            double xr = x1 - x2;
            double yr = y1 - y2;
            double area = xr * yr;
            System.out.println("El área es: "+area);
        }else{
            double xr = x2 - x1;
            double yr = y2 - y1;
            double area = xr * yr;
            System.out.println("El área es: "+area);
        }       
    }
}
