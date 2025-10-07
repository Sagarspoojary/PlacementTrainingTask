class Task5Recursion{
    static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main(String[]args){
        int num=12345;
        int sum=sumOfDigits(num);
        System.out.println("Sum of digits of "+num+" is "+sum);
    }
}