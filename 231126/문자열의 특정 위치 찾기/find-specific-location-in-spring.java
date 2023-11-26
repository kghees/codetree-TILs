import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a = sc.next().charAt(0);
        int index = 0;
        boolean check = false;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == a){
                check = true;
                index = i;
                break;
            }
        }
        if(check == true)
            System.out.print(index);
        else
            System.out.print("No");
    }
}