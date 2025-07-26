import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        //noinspection InfiniteLoopStatement
        while (true) {
            IntStream.range(0, Runtime.getRuntime().availableProcessors())
                    .parallel()
                    .forEach(_ -> {
                        BigInteger number = new BigInteger("999999999999999999999999999999");
                        for (int j = 0; j < 1000; j++) {
                            number = number.nextProbablePrime();
                        }
                    });
        }
    }
}