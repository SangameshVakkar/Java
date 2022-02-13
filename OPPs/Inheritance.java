package OPPs;

// Definitions are in below

// Single level inheritance (inheriting the base in derived class)
class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{   // "Triangle is derived class, "Shape" is base class
    public void area(int length, int height){
        System.out.println(1/2*length*height);
    }
}
//multi level inheritance (inheriting the inherited class )  Shape --> Triangle -->  EquilateralTriangle
class EquilateralTriangle extends Triangle{
    public void area  (int length, int height){
        System.out.println(1/2*length*height);
    }
}
// Hierarchical level inheritance ()
//              Shape --> Triangle
//              Shape --> Circle  (Shape is basically inherited by two derived classes. This is called Hierarchical Inheritance)
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }

}
public class Inheritance {
}

/*
        Concept that acquires the properties from one class to other classes
        With the help of inheritance we can reuse the same code of one class in other classes.
        Increases the re-usability

        Types of inheritance
        1. Single level Inheritance --> Inheriting the base class to derived class
        2. Multi level inheritance  --> Inheriting the inherited class
        3. Hierarchical inheritance --> multiple child classes inherit the single class or the single class is inherited by multiple child class.
        4. Hybrid level inheritance -->  a combination of simple, multiple inheritance and hierarchical inheritance
        5. Multiple inheritance     --> the ability of a class to implement more than one interface
            Note: * multiple inheritance does not work in java, instead we use implement to achieve the multiple inheritance
                  * We can use multiple inheritance in C++ programming language.
**/
