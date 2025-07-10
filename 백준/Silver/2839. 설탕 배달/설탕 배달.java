import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i = 0;

        while(N>0){
            if(N%5 == 0){
                i += N/5;
                System.out.println(i);
                return;
            }
            if(N<3){
                System.out.println("-1");
                return;
            }
            N -= 3;
            i++;
        }
        System.out.println(i);
    }
}
