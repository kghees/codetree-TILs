import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = sc.next();
        int index = -1;
        if(s.equals(a)){
            index = 0;
        }
        else{
            for(int i = 0; i < (s.length() - a.length() + 1); i++){
                if(s.substring(i,i+a.length()).equals(a)){
                    index = i;
                    break;
                }
            }
        }
        System.out.print(index);
    }
}