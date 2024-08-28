class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "Ayush"; --> Throws an error due to private access modifier 
        
        // We need to use getters and setters to access or modify private attributes

        // getters and setters do not have a particular syntax or function name we can use any name for function, getters and setters are just the behaviours of the function i.e whether it is getting the value or setting it
        harry.setName("Ayush");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
