
import java.util.Scanner;

/*
 * Examen unidad 1 - Ejercicio 1
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
        System.out.println("PROBLEMA 1: Conversión entre diferentes escalas de temperatura.");
        System.out.println("Ingrese la temperatura en grados Fahrenheit");
        double Grados;
        Grados = input.nextDouble();
        //Formulas 
        //centígrados = (ºF-32)/1.8  y Kelvin =(ºF+459.67)/1.8
        double Centigrados;
        Centigrados = ( Grados - 32 ) / 1.8;
        double Kelvin;
        Kelvin =( Grados +459.67)/1.8;
        System.out.println("Su temperatura es ºC es " + Centigrados + " , y en ºK es " + Kelvin);
    }
    
}
