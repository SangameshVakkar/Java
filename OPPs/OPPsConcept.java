package OPPs;

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // creating constructor
    /*Student(){
        System.out.println("Constructor is called ..");
    }*/


    // creating parameter constructor
    Student(String naam , int umar){
        this.name= naam;
        this.age = umar;
    }
}
public class OPPsConcept {
    public static void main(String[] args) {
        Student s1 = new Student("Suraj", 20);
        /*student() is a constructor. By default java creates conostructor if you didn't create it. Constructor do not return and return type.
        for one object constructors can called once. Constructor is none parameterise.     */


        /*s1.name= "Suraj";
        s1.age= 20;*/

        System.out.println("This is parameterise constructor results: \n");
        s1.printInfo();
    }
}
