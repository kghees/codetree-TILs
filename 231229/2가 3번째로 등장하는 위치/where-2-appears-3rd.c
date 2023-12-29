#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int arr[100];
    int cnt = 0;
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
        if(arr[i] == 2){
            cnt++;
        }
        if(cnt == 3){
            printf("%d",i+1);
            break;
        }
    }
    return 0;
}