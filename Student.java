
class Study{
    String name;
    int age;
    String dob;
    Study(String n, int a, String dob){
        this.name=n;
        this.age=a;
        this.dob=dob;

    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("age:" +age);
        System.out.println("dob:" +dob);
    }
}
class Course{
    void show(){
        System.out.println("maths:021");
        System.out.println("BDA:022");
        System.out.println("Devops:023");

    }
}
public class Student{
    public static void main(String[] args){
        Study S1=new Study("alice",19,"06-07-2005");
        Course C1=new Course();
        S1.display();
        C1.show();
    }
}