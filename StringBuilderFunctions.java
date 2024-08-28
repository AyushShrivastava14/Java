public class StringBuilderFunctions {
    public static void main(String[] args) {

        // StringBuilder is a mutable class and we this in place of string class when we need to make changes
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);

        // charAt(index) Function
        // System.out.println(str.charAt(4));

        // setCharAt(index,char) Function
        // str.setCharAt(0,'M');
        // System.out.println(str);

        // insert(index,char) Function
        // str.insert(0,'F');
        // System.out.println(str);

        // delete(start,end-1) Function
        // str.delete(1,2);
        // System.out.println(str);

        // append(char/string) Function (appends value at the end)
        // str.append("Hello");
        // str.append("o");
        // System.out.println(str);

        // length() Function
        // System.out.println(str.length());

        // reverse() Function
        // System.out.println(str.reverse());

        // Reversing without reverse() Function
        for(int i=0;i<str.length()/2;i++){
            int front=i;
            int back=str.length()-1-i;

            char frontchar=str.charAt(front);
            char backchar=str.charAt(back);

            str.setCharAt(front,backchar);
            str.setCharAt(back,frontchar);
        }
        System.out.println(str);
    }
}
