import java.util.*;

class Even {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    num = sc.nextInt();
    if (num % 2 == 0) {
      System.out.println("num is even");
    } else
      System.out.println("num is odd");
  }
}
