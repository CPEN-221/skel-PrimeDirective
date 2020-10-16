package primedirective;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Primes {
    /**
     * Return a list of primes, in order, between 1 and the provided upper bound
     * @param upperBound the value up to which primes are generated, {@code upperBound} > 0
     * @return a list of primes, in order, between 1 and the provided upper bound
     */
    /*
        This implementation uses the Sundaram Sieve method.
     */
    public static List<Integer> getPrimes(int upperBound) {
        List<Integer> primes = new ArrayList<>();
        upperBound++;

        if (upperBound < 2) {
            return primes;
        }

        int n = (upperBound - 2) / 2;
        Set<Integer> candidates = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            candidates.add(i);
        }
        for (int i = 1; i <= n; i++) {
            int j = i;
            while ((i + j + 2 * i * j) <= n) {
                candidates.remove(i + j + 2 * i * j);
                j++;
            }
        }

        primes.add(2);
        for (Integer x: candidates) {
            primes.add(2 * x + 1);
        }
        return primes;
    }

    public static void main(String[] args) {
        List<Integer> primes = getPrimes(100);
        for (Integer x: primes) {
            System.out.println(x);
        }
    }
}
