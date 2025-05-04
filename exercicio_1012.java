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
        
    double PI = 3.14159;
    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();
    
    System.out.printf("TRIANGULO: %.3f\n",(A*C/2));
    System.out.printf("CIRCULO: %.3f\n",(PI*C*C));
    System.out.printf("TRAPEZIO: %.3f\n",((A+B)*C)/2);
    System.out.printf("QUADRADO: %.3f\n",(B*B));
    System.out.printf("RETANGULO: %.3f\n",(A*B));
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    sc.close();
    }
}
