import java.util.Scanner;
import java.util.Random;

public class RandomMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:-\n0:For Rock\n1:For Paper\n2:For Scissor\n\nChoice:-");
        byte userinput=sc.nextByte();

        Random random=new Random();
        int computer=random.nextInt(3);  //i.e. from 0 to 2
        if(computer==0){
            System.out.println("Computer: Rock");
        }
        else if(computer==1){
            System.out.println("Computer: Paper");
        }
        else{
            System.out.println("Computer: Scissors");
        }

        if(userinput==0 && computer==2 || userinput==1 && computer==0 ||
        userinput==2 && computer==1){
            System.out.println("You Win!");
        }
        else if(userinput==computer){
            System.out.println("Draw!");
        }
        else{
            System.out.println("You Lose!");
        }
        sc.close();
    }
}
