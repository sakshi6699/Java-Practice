class Student
{
    int a; int b; String c;
    Student()
    {
        a=100;
    }
    Student(int x,String y)
    {
       b=x; c=y;
    }
    Student(int p,String q)
    {
      a=p; c=q;
    }
}
void display()
{
    System.out.println(s1.a);
    System.out.println(s2.b+""+s2.c);
    System.out.println(s3.a+""+s3.c);
}
class COverloading
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student(20,"abc");
        Student s3=new Student(10,"gfd");
        s1.display();
        s2.display();
        s3.display();
        
    }
}
