#include <stdio.h>

int main() {
    int arr[10];
    int cnt;
    for(int i = 0; i < 10; i++){
        scanf("%d",&arr[i]);
        if(arr[i] % 3 == 0){
            cnt = i;
            break;
        }
    }
    printf("%d",arr[cnt-1]);
    return 0;
}