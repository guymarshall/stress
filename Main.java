import java.util.stream.LongStream;
import java.util.Random;

public class Main {
	private static final Random RNG = new Random();

	public static boolean isPrime(long number) {
	    if (number < 2) {
	        return false;
	    }

	    if (number == 2) {
	        return true;
	    }

	    for (long i = 3; i < number; i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }

	    return true;
	}

	public static void main(String[] args) {
		LongStream.range(0, 1_000_000L)
				.parallel()
				.map(i -> RNG.nextLong() & Long.MAX_VALUE)
				.forEach(number -> System.out.printf("%d is prime: %b%n", number, isPrime(number)));
	}
}