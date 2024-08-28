class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        name = newName;
    }
    
}


class Square {
    int a;

    public void side(int n) {
        a=n;
    }

    public int area() {
        return a*a;
    }

    public int perimeter() {
        return 4*a;
    }
}


public class OOPSPractice {
    public static void main(String[] args) {

        // Problem-1
        // Object creation
        Employee obj = new Employee();
        
        // Default values
        System.out.println(obj.getName());
        System.out.println(obj.getSalary());

        // Setting Attributes
        obj.salary = 30;
        obj.name = "Ayush";

        // Printing
        System.out.println(obj.getSalary());
        System.out.println(obj.getName());
        obj.changeName("Piyush");
        System.out.println(obj.getName());
        

        System.out.println();


        // Problem-2
        // Object creation
        Square sq = new Square();

        // Method Calling
        sq.side(3);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}
