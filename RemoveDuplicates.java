public class RemoveDuplicates {

    static boolean[] map = new boolean[26];  //since there are 26 alphabets

    static void duplicates(String s, int index, String newString){
        if(index == s.length()-1){
            System.out.print(newString);
            return;
        }
        
        char current = s.charAt(index);
        if(map[current - 'a']){       //it will enter if the value is true
            duplicates(s, index+1, newString);
        }
        else{
            newString += current;
            map[current - 'a'] = true;
            duplicates(s, index+1, newString);
        }
    }

    public static void main(String[] args) {
        String str ="aabbcddc";
        duplicates(str, 0, "");
    }
}

// Trick
// There is a property
// 'a' - 'a' = 0
// 'b' - 'a' = 1
// 'c' - 'a' = 2
//  |     |
// 'z' - 'a' = 25