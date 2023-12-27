#include <stdio.h>

int main() {
    int a,b;
    char c,d;
    scanf("%d %c",&a,&c);
    scanf("%d %c",&b,&d);
    if((a >= 19 && c == 'M') || (b >= 19 && d == 'M'))
        printf("1");
    else
        printf("0");
    return 0;
}