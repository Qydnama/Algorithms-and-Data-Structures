import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Digits.digits(str);
    }
}



public class Digits {

    public static void digits(String str) {
        digitsHelper(str,0);
    }
    private static void digitsHelper(String str,int index) {
         if (str.length() == index) {
             System.out.println("Yes");
             return;
         }
         char c = str.charAt(index);
         if (c >= '0' && c <= '9') {
             digitsHelper(str,index+1);
         }
         else
             System.out.println("False");
    }

}
