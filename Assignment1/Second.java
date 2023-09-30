import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        Average.findAverage(a);
    }


}




public class Average {

    private static double findAv(double[] a,int index,double average) {
        if(a.length == index)
            return average/a.length;

        average += a[index];

        return findAv(a,index+1,average);
    }

    public static void findAverage(double[] a) {
        System.out.println(findAv(a,0,0));

    }
}
