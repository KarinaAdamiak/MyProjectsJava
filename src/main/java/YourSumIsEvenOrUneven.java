import java.util.Scanner;

public class YourSumIsEvenOrUneven {

    static int adding (int number1, int number2) {
        int sum= number1+number2;
        return sum;
    }
        public static void main (String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("What's your first number?");
        int number1 = number.nextInt();
        System.out.println("What's your second number?");
        int number2 = number.nextInt();

        System.out.println("The sum of your two numbers is" + " " +adding(number1,number2));

        if (adding(number1,number2) % 2==0){
        System.out.println("Your sum is an even number.");

        }else{
        System.out.println("Your sum is an uneven number.");

        }}}