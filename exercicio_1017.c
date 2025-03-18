#include <stdio.h>
#include <math.h>

int main(){
    int tempo, velocidade;
    
    scanf("%d %d", &tempo, &velocidade);
    
    printf("%.3lf\n",(double)velocidade * tempo /12);
    return 0;
}
