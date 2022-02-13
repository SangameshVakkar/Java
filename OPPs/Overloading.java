package OPPs;

/*
        The ability to define more than one method with the same name in a class
*/

class Chaatr {
    String name;
    int age;

    public void printInfo(String name){                         //overloaing with the same method name
        System.out.println("Name : "+name);
    }
    public  void printInfo(int age){                            //overloaing with the same method name
        System.out.println("Age : "+age);
    }
    public void printInfo(String name, int age){                //overloaing with the same method name
        System.out.println("Name : "+name+" "+"Age : "+age);
    }

}

public class Overloading {
    public static void main(String[] args) {
        Chaatr s1= new Chaatr();
        s1.name="Suraj";
        s1.age = 20;

        s1.printInfo(s1.name);                  //use the same method name by initialization different parameters.
        s1.printInfo(s1.age);                   //use the same method name by initialization different parameters.
        s1.printInfo(s1.name, s1.age);          //use the same method name by initialization different parameters.

    }
}
