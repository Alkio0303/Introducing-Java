import java.util.Scanner;
import java.util.logging.Logger;

public class GreatestCommonDivisorOfTwoIntegers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine()); /*getting input from the console */

        System.out.println(GCD(firstNumber, secondNumber));
    }
    /* method for calculating the GCD */
    public static String GCD(int num1, int num2){   /*parameters are the numbers which are read from the console */
        while(num1 != num2) {           /* while loop until the numbers are equal. If the numbers are equal, the GCD is found */

            if(num1 > num2) {           /*By subtracting the smaller number from the bigger at the end the GCD will be found */
                num1 -= num2;
            }
                                        /*Checking which number is smaller*/
            else {
                num2 -= num1;
            }
        }

        return "GCD: " + num1;
    }

    /* method for calculating the LCD */
    public static String LCD(int num1, int num2){
        int numbsMultiplication = num1 * num2;      /*it is needed for the formula for calculating the lcm */
        while(num1 != num2) {                       /*calculating the GCD */

            if(num1 > num2) {
                num1 -= num2;
            }

            else {
                num2 -= num1;
            }
        }
        int lcm = numbsMultiplication / num1;      /*after the loop num1 is the GCD of the two numbers*/
        return "LCM: is " + lcm;
    }
}
