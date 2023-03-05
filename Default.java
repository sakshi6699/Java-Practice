class A
{
    int rollno; String name;
    A()
    {
        rollno=1; name="sakshi";

    }
    void display()
    {
        System.out.println(rollno  +"   " +name); 
        
    }
}
class Default
{
    public static void main(String[] args)
    {
        A a1=new A();
        a1.display();
        
    }
}