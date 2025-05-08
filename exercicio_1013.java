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
   
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int MaiorAb = (A + B + Math.abs(A - B))/2;
    int MaiorAbc = (MaiorAb + C + Math.abs(MaiorAb - C))/2;
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    System.out.println(MaiorAbc + " eh o maior");
    sc.close();
    }
 
}
