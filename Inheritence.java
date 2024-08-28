class Base {
    int x;
    
    public int getX() {
        System.out.println("Accessed GetX");
        return x;
    }

    public void setX(int a) {
        System.out.println("Accessed SetX");
        this.x = a;
    }

    public void printHello() {
        System.out.println("Hello");
    }
}

class Derived extends Base {
    int y;
    
    public int getY() {
        System.out.println("Accessed GetY");
        return y;
    }

    public void setY(int a) {
        System.out.println("Accessed SetY");
        this.y = a;
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Base obj = new Base();
        obj.setX(5);
        System.out.println(obj.getX());      
        // We can't access Y/Derived class elements/methods/variables from base class but the reverse is possible

        Derived obj2 = new Derived();
        obj2.setY(9);
        System.out.println(obj2.getY());

        obj2.setX(7);
        System.out.println(obj2.getX());
    }
}
