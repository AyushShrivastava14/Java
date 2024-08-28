import java.util.HashSet;

public class UniqueSubsequenceRecursion {

    static void print(String str, int index, String newString, HashSet<String> subsequence){
       if(index == str.length()){
          if(subsequence.contains(newString)){
              return;
          }
          else{
              subsequence.add(newString);
              System.out.println(newString);
              return;
          }
       }
       
       char current = str.charAt(index);
       
       // Character included
       print(str, index + 1, newString + current, subsequence);

       // Character not included
       print(str, index + 1, newString, subsequence);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        print(str, 0, "", set);
    }
}