import java.util.Scanner;
class avgOfArrayElement {
    public static void main(String[] args) {
        // 7. Write a program to calculate the average of a given array of numbers.

        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter array elements  size:");
        int size = sc.nextInt();
        int array[] = new int[size];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int sum =0;
        System.out.print("The array elements that you've entered are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            sum=sum+array[i];
        }

        double result = sum/size;
        System.out.print("\nSo the average of given array elements is: "+result);
    }    
}
/**output:
 * Enter the array elements: 
1
2
3
4
5
The array elements that you've entered are: 1 2 3 4 5
So the average of given array elements is: 3.0
 */