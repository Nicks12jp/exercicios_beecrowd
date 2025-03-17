#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int maiorAb(int a, int b, int c){
    int maxAb, max;
    maxAb = (a + b + abs(a-b))/2;
    max = (maxAb + c + abs(maxAb-c))/2;
    return max;
}
int main(){
    int a, b, c;
    
    scanf("%d %d %d", &a, &b, &c);
    
    printf("%d eh o maior\n", maiorAb(a, b, c));

    return 0;
}
