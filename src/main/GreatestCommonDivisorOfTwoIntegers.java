import java.util.Scanner;

/**
 * This utility class calculates the greatest common divisor of two integers.
 *
 */
public class GreatestCommonDivisorOfTwoIntegers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        System.out.println(gcd(firstNumber, secondNumber));
        System.out.println(lcd(firstNumber, secondNumber));
    }
    /**
     * Calculates the GCD of two integers.
     *
     * @param num1, num2
     **/
    public static int gcd(int num1, int num2){
        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        }
        while(num1 != num2) {
            if(num1 > num2) {
                num1 -= num2;
            }
            else {
                num2 -= num1;
            }
        }
        return num1;
    }

    /**
     * Calculates the LCD of two integers.
     *
     * @param num1, num2
     **/
    public static int lcd(int num1, int num2){
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        int numbsMultiplication = num1 * num2;
        while(num1 != num2) {
            if(num1 > num2) {
                num1 -= num2;
            }
            else {
                num2 -= num1;
            }
        }
        int lcm = numbsMultiplication / num1;
        return lcm;
    }
}