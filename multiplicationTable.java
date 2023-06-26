import java.util.Scanner;
class multiplicationTable {
    public static void main(String[] args) {
        //3. Write a program to print the multiplication table of a given number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(number+"*"+i+"="+number*i);
        }
    }    
}
/*output:
 * 
4*1=4
4*2=8
4*3=12
4*4=16
4*5=20
4*6=24
4*7=28
4*8=32
4*9=36
4*10=40
*/
