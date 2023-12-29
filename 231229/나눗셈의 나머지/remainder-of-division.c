#include <stdio.h>

int main() {
    int a,b;
    scanf("%d %d",&a,&b);
    int arr[10] = {0,};
    int res = 0;
    while(a > 1){
        arr[a % b]++;
        a /= b;
    }
    for(int i = 0; i < b; i++){
        res += arr[i]*arr[i];
    }
    printf("%d",res);
    return 0;
}