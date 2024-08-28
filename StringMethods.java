public class StringMethods {
    public static void main(String[] args) {
        String name= "Ayush";
        String name2="   Shrivastava   ";
        String name3="Beebee";

        //length() Method
        System.out.println(name.length());
 
        //toLowerCase() Method 
        System.out.println(name.toLowerCase());
 
        //toUpperCase() Method
        System.out.println(name.toUpperCase());
 
        //trim() Method
        System.out.println(name2.trim());
 
        //substring(int start) Method
        System.out.println(name.substring(2));
 
        //substring(int start,end) Method (Goes upto end-1)
        System.out.println(name.substring(1,4));
 
        //replace() Method (Can replace both character and substring)
        System.out.println(name.replace('u','e'));
        System.out.println(name.replace("ush","e"));
 
        //startsWith() Method (Gives output in Boolean i.e. true or false)
        System.out.println(name.startsWith("Ay"));
        System.out.println(name.startsWith("ay"));
 
        //endsWith() Method (Gives output in boolean)
        System.out.println(name.endsWith("sh"));
        System.out.println(name.endsWith("hh"));
 
        //charAt(index) Method
        System.out.println(name.charAt(4));
 
        //indexOf() Method (Starts scanning from front end i.e. from left to right)
        System.out.println(name3.indexOf("ee"));
        System.out.println(name3.indexOf("sh")); //Gives output -1 if not found (Applicable to all methods)
 
        //lastIndexOf() Method (Starts scanning from back end i.e. right to left)
        System.out.println(name3.lastIndexOf("ee"));
 
        //equals() Method (Returns true or false)
        System.out.println(name.equals("Ayush"));
        System.out.println(name.equals("ayush"));
 
        //equalsIgnoreCase() Method (Returns boolean value i.e. true or false)
        System.out.println(name.equalsIgnoreCase("AYUsH"));

        //compareTo() Method (Compares 2 string lexicographically i.e. which comes first in dictionnary)
        System.out.println("hello".compareTo("java"));
        System.out.println(name.compareTo("Aryan"));
        
        // compareTo() function outputs
        // s1 > s2 : +ve number
        // s1 == s2 : 0
        // s1 < s2: -ve number

        //replaceAll() Method (Double quotes necessary)
        System.out.println(name3.replaceAll("ee","yy"));
        System.out.println(name3.replaceAll("e","y"));

        //split() and join() Method java oracle docs

        //% [flags] [width] [.precision] specifier-character (output formatting using printf)
        //https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/How-to-use-Java-printf-to-format-output
    }
}
