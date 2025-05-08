import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    double Y = sc.nextDouble();
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    double CalculaDistancia = (X / Y);
    
    System.out.printf("%.3f km/l\n",CalculaDistancia);
    
    sc.close();
    }
 
}
