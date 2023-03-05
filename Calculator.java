import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        int a, b, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        a = sc.nextInt();
        System.out.println("enter second number");
        b = sc.nextInt();
        System.out.println(
                "Enter your choice: 1->Add  2->subtract  3->multiplication  4->division \n Enter your choice:");
        ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Add:" + (a + b));
        } else if (ch == 2) {
            System.out.println("Subtract:" + (a - b));
        } else if (ch == 3) {
            System.out.println("multiplication:" + (a * b));
        } else if (ch == 4) {
            System.out.println("Division:" + (a / b));
        } else {
            System.out.println("invalid choice");
        }
    }

}
