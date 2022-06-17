import java.util.Random;

public class NormalDice {
    public static void main(String [] args) {
        Random nextRoll = new Random();
        int x = nextRoll.nextInt(6) + 1;
        System.out.println("You got a: " + x);
    }
}
