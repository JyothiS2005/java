
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
public class Student{
   public static void main (String[] args){
    Study s1=new Study("alice" ,19,"06-07-2005");
    s1.display();

   }
    }
