import java.util.*;

 class Check {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a = sc.nextInt();
        if (a < 0) {
            System.out.println("number is negative");
        } else if (a > 0) {
            System.out.println("num is positive");
        } else {
            System.out.println("num is equal to 0");
        }
    }

}
