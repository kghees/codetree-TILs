#include <stdio.h>

int main() {
    int a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    if(a > b){
        if(b > c)
            printf("%d",b);
        else if(c > a)
            printf("%d",a);
        else
            printf("%d",c);
    }
   else{
    if(c > b)
        printf("%d",b);
    else if(a > c)
        printf("%d",a);
    else
        printf("%d",c);
   }
    return 0;
}