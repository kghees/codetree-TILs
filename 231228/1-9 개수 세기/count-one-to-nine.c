#include <stdio.h>

int main() {
    int n;
    scanf("%d",&n);
    int arr[100];
    int cnt[10] = {0, };
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
        cnt[arr[i]]++;
    }
    for(int i = 1; i < 10; i++){
        printf("%d\n",cnt[i]);
    }
    return 0;
}