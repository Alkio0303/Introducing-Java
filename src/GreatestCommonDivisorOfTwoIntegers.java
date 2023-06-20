import java.util.Scanner;

//This utility class calculates the greatest common divisor of two integers
public class GreatestCommonDivisorOfTwoIntegers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        System.out.println(GCD(firstNumber, secondNumber));
    }
    /**
     * calculates the GCD of two integers
     * @param num1, num2
     **/
    public static String GCD(int num1, int num2){
        while(num1 != num2) {
            if(num1 > num2) {
                num1 -= num2;
            }
            else {
                num2 -= num1;
            }
        }
        return "GCD: " + num1;
    }

    /**
     * calculates the LCD of two integers
     * @param num1, num2
     **/
    public static String LCD(int num1, int num2){
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
        return "LCM: is " + lcm;
    }
}