#include <stdio.h>
 
int main() {
 int num, hr;
 float sl, total;
 
 scanf("%d", &num);
 scanf("%d", &hr);
 scanf("%f", &sl);
 
 total = sl*hr;

printf("NUMBER = %d\n", num);
printf("SALARY = U$ %.2f\n",total);
    return 0;
}
