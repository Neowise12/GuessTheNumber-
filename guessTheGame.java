import java.util.Random;
import java.util.Scanner;

class Game {

    int youchoose, Compchose, CHOICESMADE = 1;

    Scanner sc = new Scanner(System.in);

    public Game() {

        Random rand = new Random();

        Compchose = rand.nextInt(10);
    }

    public void userInput() {

        youchoose = sc.nextInt();

    }

    public void isCorrectNumber() {

        while (Compchose != youchoose) {

            if (youchoose > Compchose) {
                System.out.println("its greater");
            } else {
                System.out.println("its smaller ");
            }

            youchoose = sc.nextInt();
            CHOICESMADE = CHOICESMADE + 1;

        }
        System.out.println("hey right choice");
        System.out.println("you took " + CHOICESMADE + " attempts");

    }
}

public class guessTheGame {

    public static void main(String[] args) {

        Game ani = new Game();
        System.out.println("choose a number(0-9) ");
        ani.userInput();
        ani.isCorrectNumber();

    }

}
