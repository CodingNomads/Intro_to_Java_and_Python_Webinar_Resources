
import java.util.Random;

public class Prime {

    public static void main(String[] args) {
        printPrimes(500);
    }

    private static void printPrimes(int high) {

        Random random = new Random();

        for (int i = 1; i < high; i++){
            boolean isPrime = true;
            for (int x = 2; x < i; x++){
                if (i % x == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}

