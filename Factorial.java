import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        //4. Write a program to calculate the factorial of a given number.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.println();//just to print the result in other line!
        int factorial = 1;
        for (int i = 1; i <=number; i++) {
            factorial = factorial*i;
        }
        System.out.print("The factorial of "+number+" is: "+factorial);
    }    
}
