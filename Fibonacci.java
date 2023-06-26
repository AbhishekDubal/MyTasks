import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        //6. Write a program to print the Fibonacci series up to a given number.

        int number1 = 0,number2=1, number3;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number of Range: ");
        int number = sc.nextInt();

        for (int i = 1; i <=number-2; i++) {
            System.out.print(number1+" ");
            number3 = number1+number2;
            number1 = number2;
            number2 = number3;
        }
        /*output:-
        Enter the Number of Range: 10
        0 1 1 2 3 5 8 13
        */
    }    
}
