import java.util.Scanner;

class vowelCountWhile {
    public static void main(String[] args) {
        //18. Write a program to count the number of vowels in a given string using a while loop.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string value: ");
        String text = scanner.nextLine();

        text = text.toLowerCase();
        int i=0;
        int count=0;
        int size = text.length();
        while(size > 0) {
            if (text.charAt(i) == 'a'||text.charAt(i) == 'e'||text.charAt(i) == 'i'||text.charAt(i) == 'o'||text.charAt(i) == 'u') {
                count++;
            }
            i++;
            size--;
        }
        System.out.print("The vowels in "+text+" is: "+count);
    }    
}
/** OUTPUT:
 * Enter the string value:
 * prem bhai 
 * The vowels in prem bhai is: 3
 */