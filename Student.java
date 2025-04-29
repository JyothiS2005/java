
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
    puSystem.out.println("Creating a new Study object..."); 
Study S1=new Study("alice",19,"06-07-2005"); 
Course c1=new Course();

System.out.println("Study object created successfully!"); 
S1.display();blic static void main(String[] args){
        Study S1=new Study("alice",19,"06-07-2005");
        S1.display();
        c1.show();
    }
}