import java.util.Scanner;
class LargestArrayElement {
    public static void main(String[] args) {
        //8. Write a program to find the largest number in an array.

        Scanner sc = new Scanner(System.in);
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
        }
        
        for (int i = 1; i < array.length; i++) {
            if(array[0]<array[i]){
                array[0]=array[i];
            }
        }System.out.println();
        System.out.println(array[0]+" is biggest element!");
    }    
}
/**output:-
Enter array elements  size:
6
Enter the array elements:
10
22
77
14
65
22
The array elements that you've entered are: 10 22 77 14 65 22
77 is biggest element!
 */