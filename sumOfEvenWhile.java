class sumOfEvenWhile{
        public static void main(String[] args) {
        //14. Write a program to find the sum of all even numbers between 1 and 50 using a while loop.

        int add=0;

        int number=1;
        while(number<=50){
            if(number%2==0){
                add=add+number;
            }
            number++;
        }
        System.out.println("The sum of all even numbers between 1-50 is: "+add);
    }    
}
//The sum of all even numbers between 1-50 is: 650