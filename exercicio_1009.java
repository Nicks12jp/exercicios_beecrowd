import java.util.Scanner;
public class Main {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        
        
        double SALARY = (A + (B*0.15));
      
        System.out.printf("TOTAL = R$ %.2f\n", SALARY);
        
    }
}
