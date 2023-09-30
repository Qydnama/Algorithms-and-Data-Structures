import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for(int i = 0;i<n;i++) {
            a[i] = sc.nextDouble();
        }
        Minimum.findMinimum(a);
    }


}




public class Minimum {

    public static double findMin(double[] a,int index,double min) {
        if(a.length==index)
            return min;
        min=Math.min(a[index],min);
        return findMin(a,index+1,min);
    }

    public static void findMinimum(double[] a) {
        System.out.println(findMin(a,0,a[0]));

    }
}