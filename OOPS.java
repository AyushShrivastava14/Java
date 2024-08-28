
// Class and object logic with this keyword
// class Person {
//     String name;
//     int age;

//     public void printDetails() {
//         System.out.println(this.name + " " + this.age);
//     }
// }


// Constructors and constructor copy with this keyword
// class ObjectConstructors {
//     String name;
//     int age;

//     ObjectConstructors() {
//         System.out.println("Constructor is accessed");
//     }

//     ObjectConstructors(ObjectConstructors copy) {
//         System.out.println("Copy is made");
//         this.name = copy.name;
//         this.age = copy.age;
//     }

//     public void printDetails() {
//         System.out.println(this.name + " " + this.age);
//     }
// }


// Polymorphism (Two types: 1. Compile time polymorphism/Function overloading    2. Runtime polymorphism/Overriding (Refer Inheritence constructors and super java program file))
// class PolymorphismOverloading {
//     public void details() {
//         System.out.println("No details");
//     }
//     public void details(String name) {
//         System.out.println("Name: " + name);
//     }
//     public void details(String name, int age) {
//         System.out.println("Name: " + name + "Age: " + age);
//     }
// }

// Overriding Polymorphism
// class Shape {
//     public void area() {
//         System.out.print("Displays Area of Shape ");
//     }
//  }
//  class Triangle extends Shape {
//     public void area(int h, int b) {
//         System.out.println("Triangle:-");
//         System.out.println((b*h)/2);
//     }  
//  }
//  class Circle extends Shape {
//     public void area(int r) {
//         System.out.println("Circle:-");
//         System.out.println((3.14)*r*r);
//     }  
//  }



public class OOPS {
    public static void main(String[] args) {
        
        // Class and object logic with this keyword
        // Person person1 = new Person();
        // person1.name = "Ayush";
        // person1.age = 19;

        // person1.printDetails();

        // Person person2 = new Person();
        // person2.name = "Piyush";
        // person2.age = 24;

        // person2.printDetails();



        // Constructors and constructor copy with this keyword
        // ObjectConstructors owner = new ObjectConstructors();
        // owner.name = "Ayush";
        // owner.age = 19;
        // owner.printDetails();

        // ObjectConstructors copy = new ObjectConstructors(owner);
        // copy.printDetails();



        // Polymorphism (Two types: 1. Compile time polymorphism/Function overloading    2. Runtime polymorphism/Overriding)
        // Type - 1 (Overloading)
        // PolymorphismOverloading owner = new PolymorphismOverloading();

        // owner.details();
        // owner.details("Ayush");
        // owner.details("Piyush", 24);

        // Type - 2
        // Circle areacircle = new Circle();
        // areacircle.area();
        // areacircle.area(2);

        // Triangle areatriangle = new Triangle();
        // areatriangle.area();
        // areatriangle.area(2,50);
    }
}

// Package (Package is a group of similar types of classes, interfaces and sub-packages. Packages can be built-in or user defined.Built-in packages - java, util, io etc.)

// See below topics in apna college/google 

// Inheritence (Three types: 1. Single level Inheritence    2. Multi-level inheritence     3. Hierarchical inheritence     4. Hybrid Inheritence)
// Access modifies (four types: 1. Public   2. Private (With getters and setters)   3. Protected     4. Default) 
// Encapsulation
// Abstraction
// Interfaces
// Static Keyword