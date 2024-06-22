import java.util.*;

class numberGenerator{
    private int randomNum;
    private int score;
    private int input;

    public numberGenerator(){
        Random rand = new Random();
        this.randomNum = rand.nextInt(0,101);
        this.score = 10;
    }

    public int result(){
        if (this.input == this.randomNum){
            System.out.println("You have guessed correctly");
            return 1;
        }
        else if (this.input > this.randomNum) {
            System.out.println("Your guess is higher than the number");
        }
        else {
            System.out.println("Your guess is lower");
        }
        return 0;
    }

    public void chances(){
        Scanner sc = new Scanner(System.in);
        System.out.println("This is your chance number :" + (10 - this.score + 1));
        System.out.println("What is your guess ?");
        System.out.println();


        while (this.score > 0){
            try{
                this.input = sc.nextInt();
            }
            catch (Exception e){
                System.out.println("Enter a integer");
            }
            int val = result();
            if (val == 1){
                System.out.println("Your score is :" + this.score*10  +"/100");
                break;
            }
            this.score--;
        }
    }

    public void gameMainLoop(){
        System.out.println("You have to guess a number between 1 and 100 (both included)");
        chances();
    }

}

public class oopsGuessTheNumber {
    public static void main(String[] args) {
        numberGenerator game = new numberGenerator();
        game.gameMainLoop();
    }
}
