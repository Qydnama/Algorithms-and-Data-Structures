import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime.isPrime(n);
    }


}




public class Prime {

    private static String isPrim(int n, int i, String a) {
        if (n % i == 0) {
            a = "Composite";
            return a;
        }
        if (n / 2 <= i)
            return a;

        return isPrim(n, i + 1, a);
    }

    public static void isPrime(int n) {
        System.out.println(isPrim(n, 2, "Prime"));
    }
}
