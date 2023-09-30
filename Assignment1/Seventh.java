import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr = sc.nextLine();
        Permutation.permutation(arr);
    }
}





public class Permutation {

    public static void permutation(String str) {
        char[] chars = str.toCharArray();
        permutationHelper(chars, 0);
    }

    private static void permutationHelper(char[] chars, int startIndex) {
        if (startIndex == chars.length - 1) {
            System.out.println(new String(chars));
        } else {
            for (int i = startIndex; i < chars.length; i++) {
                swap(chars, startIndex, i);
                permutationHelper(chars, startIndex + 1);
                swap(chars, startIndex, i);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

}
