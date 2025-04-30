import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double PI=3.14159;
        
        double R = sc.nextDouble();

        double calculo =(4/3.0 * PI * R*R*R);

        System.out.printf("VOLUME = %.3f\n", calculo);
    }
}
