import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Leitura do primeiro item
        int cod1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        // Leitura do segundo item
        int cod2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double valor2 = sc.nextDouble();

        double total = (qtd1 * valor1) + (qtd2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
