class Student
{
    int i; String n;
    Student(int id,String name)
    {
    i=id; n=name;
    }
    void display()
    {
        System.out.println(i+ "  "+ n);

    }
    
}
class Parameterized
{
    public static void main(String[] args)
    {
        Student s1=new Student(1,"sakshi");
        Student s2=new Student(2,"tanu");
        s1.display();
        s2.display();
        
    }
}
