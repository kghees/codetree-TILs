#include <stdio.h>

int main() {
    int a,b;
    scanf("%d %d",&a,&b);
    if(a == 0){
        if(b >= 19)
            printf("MAN");
        else
            printf("BOY");
    }
    else{
        if(b >= 19)
            printf("WOMAN");
        else
            printf("GIRL");
    }
    return 0;
}