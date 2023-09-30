First variant:


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial.factorial(n));
    }
}





public class Factorial {


    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
}









Second:





import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Kobeytu.Kobeytu(n);
    }


}




public class Kobeytu {

    private static int KobeytuHelp(int n, int sum, int i) {
        if (i == n) {
            return sum;
        }

        return sum* KobeytuHelp(n, sum+1,i+1);
    }

    public static void Kobeytu(int n) {
        System.out.println(KobeytuHelp(n, 1, 1));
    }
}





