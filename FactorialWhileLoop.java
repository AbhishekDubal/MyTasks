import java.util.Scanner;
class FactorialWhileLoop {
    public static void main(String[] args) {
        //13. Write a program to calculate the factorial of a given number using a while loop.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = sc.nextInt();

        int copy = number;
        int factorial = 1;
        while(number>0){
            factorial = factorial*number;
            number--;
        }
        System.out.println("The factorial of "+copy+" is: "+factorial);
    }    
}
/**
 * output:
 * Enter the number: 5
 * The factorial of 5 is: 120
 */