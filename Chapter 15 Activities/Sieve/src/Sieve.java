import java.util.*;


/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        Set<Integer> newSet = new HashSet<>();
        // Your work goes here
        for (int i = 2; i <= n; i++) {
            newSet.add(i);
        }

        for (Integer i = 2; i <= n; i++) {
            for (Integer j = i * 2; j <=n; j+=i) {
                newSet.remove(j);
            }
            
        }
        System.out.println(newSet);







    }
}
