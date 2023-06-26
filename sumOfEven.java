class sumOfEven {
    public static void main(String[] args) {
        //5. Write a program to find the sum of all even numbers between 1 and 50.

        int sum =0;
        for (int i = 1; i <=50; i++) {
            if(i%2==0){
                sum = sum+i;
            }
        }
        System.out.println("The of Even Numbers between 1 to 50 is: "+sum);
    }    
    //output:The of Even Numbers between 1 to 50 is: 650
}
