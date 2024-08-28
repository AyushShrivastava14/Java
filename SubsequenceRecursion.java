public class SubsequenceRecursion {

    static void subsequence(String s, int index, String newString) {
        if(index == s.length()){
            System.out.println(newString);
        }

        // Tree traversal approach i.e. first left then right
        char currentchar = s.charAt(index);
        // Character included
        subsequence(s, index + 1, newString + currentchar);

        // Character not included
        subsequence(s, index + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
        subsequence(str, 0, "");
    }
}
