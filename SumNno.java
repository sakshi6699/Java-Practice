import java.util.*;

public class SumNno {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n natural no");
        n = sc.nextInt();
        System.out.println("enter n natural no");
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("sum of natural no is:" + sum);

    }

}
