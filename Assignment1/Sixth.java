import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(Degree.degree(a,n));
    }
}





public class Degree {


    public static int degree(int a,int n) {
        if (n==0)
            return 1;

        return a*degree(a,n-1);
    }
}
