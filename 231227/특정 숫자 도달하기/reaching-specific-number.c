#include <stdio.h>

int main() {
    int arr[10];
    int sum = 0;
    int cnt = 0;
    for(int i = 0; i < 10; i++){
        scanf("%d",&arr[i]);
        if(arr[i] >= 250)
            break;
        sum += arr[i];
        cnt += 1;
    }
    printf("%d %.1lf",sum, (double)sum/cnt);
    return 0;
}