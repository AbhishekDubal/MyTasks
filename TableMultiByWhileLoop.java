import java.util.Scanner;
class TableMultiByWhileLoop {
    public static void main(String[] args) {
        //12. Write a program to print the multiplication table of a given number using a while loop.
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number so, that number's table will get printed: ");
        int number = sc.nextInt();

        int count=1;
        while(count<=10){
            System.out.println(number+"*"+count+"="+number*count);
            count++;
        }
    }    
}
/**output:-
 * Enter the number so, that number's table will get printed: 4
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
 * 
 */