class sumOfNumByWhileLoop {
    public static void main(String[] args) {
        //11. Write a program to calculate the sum of all numbers from 1 to 100 using a while loop.

        int number1 = 1, number2=100;
 
        int total=0;
        while(number1<=number2){
            total = total+number1;
            number1++;
        }
        System.out.println("The total sum of 1 to 100 is: "+total);
    }    
}
/**output:
 * The total sum of 1 to 100 is: 5050
 */
