import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = B - A;

        int gcd = getGcd(C, B);

        System.out.println(C/gcd+" "+B/gcd);
    }

    public static int getGcd(int a, int b) {
        if (a % b == 0) return b;
        return getGcd(b, a % b);
    }
}
