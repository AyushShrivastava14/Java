public class OccurrenceRecursion {

    // More optimized approach
    // public static int first = -1;
    // public static int last = -1;

    // public static void getIndices(String str, char el, int idx) {
    //     if (idx == str.length()) {
    //         return;
    //     }
    //     if (str.charAt(idx) == el) {
    //         if (first == -1) {
    //             first = idx;
    //             last = idx;
    //         } else {
    //             last = idx;
    //         }
    //     }
    //     getIndices(str, el, idx + 1);
    // }

    // public static void main(String args[]) {
    //     String str = "tabcdfghijakkk";
    //     char el = 'c';
    //     getIndices(str, el, 0);
    //     System.out.println("First occurence : " + first);
    //     System.out.println("Last occurence : " + last);
    // }

    // Two pointer approach
    static void firstAndLastOccurrence(char target, String s, int startindex, int endindex) {
        if (s.charAt(startindex) == target) {
            System.out.println("First Occurrence: " + startindex);
        } else if (s.charAt(endindex) == target) {
            System.out.println("Last Occurrence: " + endindex);
            return;
        } else if (startindex == s.length() - 1 || endindex == 0) {
            System.out.println("No Occurrence");
            return;
        }
        firstAndLastOccurrence(target, s, startindex + 1, endindex - 1);
    }

    public static void main(String[] args) {
        char aim = 'a';
        String str = "abaacdaefaah";
        firstAndLastOccurrence(aim, str, 0, str.length() - 1);
    }
}