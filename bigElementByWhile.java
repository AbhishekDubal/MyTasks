import java.util.Scanner;
class bigElementByWhile {
    public static void main(String[] args) {
        //17. Write a program to find the largest number in an array using a while loop.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your ARRAY: ");
        int size = scanner.nextInt();

        int array[]=new int[size];

        int sizeCopy = size;
        int i=0;
        while(size>0){
            array[i]=scanner.nextInt();
            size--;
            i++;
        }

        System.out.print("The elements that you've entered are: ");
        int j=0;
        while(sizeCopy>0){
            System.out.print(array[j]+" ");
            j++;
            sizeCopy--;
        }
        
        int x=1; int arrayLength = array.length;
        while(arrayLength>x){
            if (array[0] < array[x] && x< arrayLength) {
                array[0] = array[x];
            }
            x++;
        }
        System.out.print("The Largest number among the elements from the array is: "+array[0]);
    }    
}
/** Output:
 * Enter the length of your ARRAY: 4
 * 36 
 * 85
 * 99
 * 45
 * The elements that you've entered are: 36 85 99 45 The Largest number among the elements from the array is: 99
 */