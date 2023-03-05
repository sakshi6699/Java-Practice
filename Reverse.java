import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        int n, rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to reverse:");
        n = sc.nextInt();
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        System.out.println("reverse of number is:" + rev);
    }

}
