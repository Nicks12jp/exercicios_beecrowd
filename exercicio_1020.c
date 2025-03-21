#include <stdio.h>
void idade_dias(int dias){
    int ano, mes, dia;
    
    ano = dias /365;
    dias = dias % 365;
    
    mes = dias / 30;
    
    dia = dias % 30;
    printf("%d ano(s)\n", ano);
    printf("%d mes(es)\n", mes);
    printf("%d dia(s)\n", dia);
}

int main()
{
    int dias;
    scanf("%d", &dias);
    idade_dias(dias);

    return 0;
}
