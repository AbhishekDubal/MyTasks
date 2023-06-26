class whileLoop {
    public static void main(String[] args) {
        //10. Write a program to print the numbers from 1 to 10 using a while loop.

        int number=1;

        while(number<=10){
            System.out.print(number+" ");//1 2 3 4 5 6 7 8 9 10 
            number++;
        }

        //Another way

        System.out.println();
        int number2 =10;int count=0;
        while(number2>0){
            count++;
            System.out.print(count+" ");//1 2 3 4 5 6 7 8 9 10 
            number2--;
        }
    }    
}
