import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[100];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < q; i++){
            int x = sc.nextInt();

            if(x == 1){
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            }

            else if(x == 2){
                int a = sc.nextInt();
                int k = 0;
                for(int j = 0; j < n; j++){
                    if(arr[j] == a){
                        k = j;
                        break;
                    }
                }
                if(k == 0){
                    System.out.println(0);
                }
                else{
                    System.out.println(k+1);
                }
            }
            else{
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int j = a-1; j < b; j++){
                    System.out.print(arr[j] + " ");
                }
                System.out.print("\n");
            }
        }

    }
}