import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = sc.next();
        int index = -1;
        for(int i = 0; i < (s.length() - a.length() + 1); i++){
            if(s.substring(i,i+2).equals(a)){
                index = i;
                break;
            }
        }
        System.out.print(index);
    }
}