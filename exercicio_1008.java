import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double C = sc.nextDouble();
        
        double SALARY = (C*B);
        
        System.out.printf("NUMBER = %d\n",A);
        
        System.out.printf("SALARY = U$ %.2f\n", SALARY);
        
    }
}
