import java.util.Random;
import java.util.Scanner;


class Game {
    int compchoice;
    int userchoice;
    int noofguesses = 0;

    public Game() {
        Random random = new Random();
        compchoice = random.nextInt(1, 101);
    }

    public void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:-");
        userchoice = sc.nextInt();       // Can't close scanner as it contains an integer
        return;
    }

    public boolean isCorrectNumber() {
        if(userchoice == compchoice){
            noofguesses++;
            System.out.println("Congo!!!!");
            System.out.println("Score: "+ noofguesses);
            return true;
        }
        else if(userchoice > compchoice) {
            noofguesses++;
            System.out.println("Bigger than computer choice");
            System.out.println("Guess again:-\n");
            return false;
        }
        else {
            noofguesses++;
            System.out.println("Smaller than computer choice");
            System.out.println("Guess again:(\n");
            return false;
        }
    }
}


public class GuessTheNumberOOP {
    public static void main(String[] args) {
        Game obj = new Game();

        boolean z = false;

        while(z == false) {
            // Taking input
            obj.userInput();

            // Checking Number
            z = obj.isCorrectNumber();
        }
    }
}