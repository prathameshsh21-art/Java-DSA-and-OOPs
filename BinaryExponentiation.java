// Binary Exponentiation
// Time Complexity: O(log y)

public class BinaryExponentiation {

    public static long power(long x, long y) {
        long result = 1;

        while (y > 0) {
            if (y % 2 == 1) {
                result = result * x;
            }

            x = x * x;
            y = y / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("2^3 = " + power(2, 3));
    }
}
