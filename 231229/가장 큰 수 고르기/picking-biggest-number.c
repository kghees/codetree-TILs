#include <stdio.h>

int main() {
    int arr[1000];
    int res = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d",&arr[i]);
        if(res < arr[i])
            res = arr[i];
    }
    printf("%d",res);
    return 0;
}