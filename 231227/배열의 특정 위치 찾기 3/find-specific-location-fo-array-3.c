#include <stdio.h>

int main() {
    int arr[100];
    int cnt = 0;
    for(int i = 0; i <99; i++){
        scanf("%d",&arr[i]);
        if(arr[i] == 0){
            cnt = i;
            break;
        }
    }
    printf("%d",arr[cnt-3]+arr[cnt-2]+arr[cnt-1]);
    return 0;
}