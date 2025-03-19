#include <stdio.h>
#include <math.h>
void converteSegundos(int seg){
    int horas, minutos, segundos;
    
    horas = seg / 3600;
    seg = seg % 3600;
    
    minutos = seg / 60;
    segundos = seg % 60;
    
    printf("%d:%d:%d\n", horas, minutos, segundos);
}
int main(){
    int seg;
    scanf("%d", &seg);
    converteSegundos(seg);
    
    return 0;
}
