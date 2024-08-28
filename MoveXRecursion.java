public class MoveXRecursion {

    static void moveAllX(String s, int index, int count, String newString){
        if(index == s.length()){
            for(int i=0;i<count;i++){
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        
        char currchar =s.charAt(index);
        if(currchar == 'x'){
            count++;
            moveAllX(s, index+1, count, newString);
        }
        else{
            newString += currchar;
            moveAllX(s, index+1, count, newString);
        }
    }

    public static void main(String[] args) {
        String str="axbcxdxx";
        moveAllX(str, 0, 0, "");
    }
}
