import java.util.Scanner;

class vowelCounter {
    public static void main(String[] args) {
        //9. Write a program to count the number of vowels in a given string.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything that is String: ");
        String text=sc.next();

        text=text.toLowerCase();
        System.out.println("Your text is: "+text);
        int size = text.length();
        int count =0;
        for (int i = 0; i < size; i++) {

            if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u'){
                count++;
            }
        }
        System.out.print("The total number of Vowels in the text '"+text+"'= "+count);
    }    
}
/**output:-
 * Enter anything that is String: 
 * abhiDUBALGUNDE
 * The total number of Vowels in the text 'abhidubalgunde'= 6
 */