#include <stdio.h>
#include <math.h>
int main(){
    int valor;
    int c100, c50, c20, c10, c5, c2, c1;
    
    scanf("%d", &valor);
    printf("%d\n", valor); 

c100 = valor / 100;
valor = valor % 100;

c50 = valor / 50;
valor = valor % 50;

c20 = valor / 20;
valor = valor % 20;

c10 = valor / 10;
valor = valor % 10;

c5 = valor / 5;
valor = valor % 5;

c2 = valor / 2;
valor = valor % 2;

c1 = valor / 1;
valor = valor % 1;
printf("%d nota(s) de R$ 100,00\n", c100);
printf("%d nota(s) de R$ 50,00\n", c50);
printf("%d nota(s) de R$ 20,00\n", c20);
printf("%d nota(s) de R$ 10,00\n", c10);
printf("%d nota(s) de R$ 5,00\n", c5);
printf("%d nota(s) de R$ 2,00\n", c2);
printf("%d nota(s) de R$ 1,00\n", c1);
    return 0;
}
