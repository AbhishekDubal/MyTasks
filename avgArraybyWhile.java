import java.util.Scanner;
class avgArraybyWhile {
    public static void main(String[] args) {
        //16. Write a program to calculate the average of a given array of numbers using a while loop.

        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the lenght: ");
        int size = ref.nextInt();

        int sum =0;
        int array[] = new int[size];
        int copySize = size;
        int i = 0;

        while (size > 0) {
            array[i] = ref.nextInt();
            i++;
            size--;
        }

        size =copySize;
        int j = 0;

        while (size > 0) {
            System.out.print(array[j]+" ");
            sum+=array[j];
            j++;
            size--;
        }
        
        double average = sum/copySize;
        System.out.println("The total of all elements is: "+sum+" and the average is: "+average);
    }    
}
