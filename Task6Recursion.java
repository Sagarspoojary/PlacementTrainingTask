class Task6Recursion{
    static int countDigits(int n){
        if(n==0){
            return 0;
        }
        return 1+countDigits(n/10);
    }
    public static void main(String[]args){
        int num=12345;
        int count=countDigits(num);
        System.out.println("Number of digits in "+num+" is "+count);
    }
}