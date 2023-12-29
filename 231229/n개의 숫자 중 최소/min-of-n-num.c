#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int arr[100];
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }
    int x = arr[0];
    for(int i = 1; i < n; i++){
        if(x > arr[i])
            x = arr[i];
    }
    int cnt = 0;
    for(int i = 0; i < n; i++){
        if(x == arr[i])
            cnt++;
    }
    printf("%d %d",x,cnt);
    return 0;
}