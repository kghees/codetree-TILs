#include <stdio.h>

int main() {
    char a[6] = {'L', 'E', 'B', 'R','O','S'};
    char x;
    scanf("%c",&x);
    int idx = -1;
    for(int i = 0; i < 6; i++){
        if (a[i] == x){
            idx = i;
        }
    }
    if(idx == -1)
        printf("None");
    else
        printf("%d",idx);
    return 0;
}