public class Methods {

    // A function doesn't need any object and is independent, while the method is a function, which is linked with any object.

    /* int logic2(int a, int b){
        int c=0;
        c=a+b;
        return c;
    } */
    
    static int logic(int a, int b){
        int c=0;
        c=a+b;
        return c;
    }
    
    public static void main(String[] args) {
        int a=10, b=10, c=0;

        /* if we need to call a non static function from static function 
        then we need to call it by using a object */
        /* Methods obj = new Methods();
        c=obj.logic2(a,b); */ 
        
        // This is used when we call a static function from a static function
        c=logic(a,b);
        System.out.println(c);
    }
}
