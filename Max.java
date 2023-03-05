import java.util.*;
  class Max
  {
     public static void main(String[] args) 
    {
       int a,b;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first no:");
       a=sc.nextInt();
       System.out.println("Enter second no:");
       b=sc.nextInt();
       if(a>b)
       {
         System.out.println("Max number:"+a);
       }
         else
         System.out.println("Max number:"+b);
       

       
    }
  }