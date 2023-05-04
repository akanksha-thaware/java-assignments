package Question1;
import java.util.*;
public class VampireNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; count < 100; i++) {
            if (isVampire(i)) {
                count++;
                System.out.println(i);
            }
        }
    }

    public static boolean isVampire(int n) {
        if (n % 2 != 0) {
            return false;
        }

        int[] digits = getDigits(n);
        int numDigits = digits.length;

        for (int x = 1; x <= Math.sqrt(n); x++) {
            if (n % x == 0) {
                int y = n / x;

                if (hasTrailingZeroes(x) || hasTrailingZeroes(y)) {
                    continue;
                }

                int[] xyDigits = concatenateDigits(getDigits(x), getDigits(y));

                if (xyDigits.length != numDigits) {
                    continue;
                }

                if (areSameDigits(digits, xyDigits)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int[] getDigits(int n) {
        String s = Integer.toString(n);
        int[] digits = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }

        return digits;
    }

    public static boolean hasTrailingZeroes(int n) {
        return n % 10 == 0;
    }

    public static int[] concatenateDigits(int[] xDigits, int[] yDigits) {
        int[] result = new int[xDigits.length + yDigits.length];

        for (int i = 0; i < xDigits.length; i++) {
            result[i] = xDigits[i];
        }

        for (int i = 0; i < yDigits.length; i++) {
            result[xDigits.length + i] = yDigits[i];
        }

        return result;
    }

    public static boolean areSameDigits(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}

