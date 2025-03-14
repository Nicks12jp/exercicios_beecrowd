#include <stdio.h>
int main() {
 int cod1, cod2, qtd1, qtd2; 
 double valor1, valor2, total;
 
//Entrada de dados:
 scanf("%d %d %lf", &cod1, &qtd1, &valor1);
 
 scanf("%d %d %lf", &cod2, &qtd2, &valor2);

//Calculo total: 
 total =(qtd1*valor1)+(qtd2*valor2);

//Saida de dados: 
 printf("VALOR A PAGAR : R$ %.2lf\n",total);

    return 0;
}
