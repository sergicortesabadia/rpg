package classes;
import java.util.Random;

public class RandomUtils {
    private static final Random r = new Random();

    public static int getRandomIntInRange(int max, int min) {
        return r.nextInt((max - min) + 1) + min;
    }
}
