#include <stdio.h>
 
int main() {
 char nome[20];
 double vendas, salario, total;
 
scanf("%s %lf %lf", nome, &salario , &vendas);

total = (salario + (vendas *0.15));

printf("TOTAL = R$ %.2lf\n",total);
    return 0;
}
