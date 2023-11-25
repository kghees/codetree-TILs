import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i = 0; i < 3; i++){
            char s = sc.next().charAt(0);
            int a = sc.nextInt();
            if(s == 'Y' && a >= 37){
                arr[0] += 1;
            }
            else if(s == 'N' && a >= 37){
                arr[1] += 1;
            }
            else if(s == 'Y' && a < 37){
                arr[2] += 1;
            }
            else{
                arr[3] += 1;
            }
        }
        if(arr[0] >= 2){
            for(int i = 0; i < 4; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.print("E");
        }
        else{
            for(int i = 0; i < 4; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}