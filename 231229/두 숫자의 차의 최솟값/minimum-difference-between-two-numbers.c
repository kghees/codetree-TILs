#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int arr[100];
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
    int res = arr[1]-arr[0];
    for(int i = 2; i < n; i++){
        if(res > arr[i]-arr[i-1])
            res = arr[i] - arr[i-1];
    }
    printf("%d",res);
    return 0;
}