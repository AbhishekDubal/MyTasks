import java.util.Scanner;
class FibonacciByWhile {
    public static void main(String[] args) {
        //15. Write a program to print the Fibonacci series up to a given number using a while loop.

        int number1=0, number2=1, number3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Fibonacci series should go up to: ");

        int lenghtOfSeries = sc.nextInt();

        lenghtOfSeries = lenghtOfSeries-2;
        int number = 1;
        while(lenghtOfSeries>0){
            System.out.print(number1+" ");
            number3 = number1+number2;
            number1 = number2;
            number2 = number3;
            number++;
            lenghtOfSeries--;
        }
    }    
}
