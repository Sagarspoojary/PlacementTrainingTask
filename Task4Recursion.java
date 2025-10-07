class Task4Recursion{
    static int getSum(int n){
        if(n==0){
            return 0;
        }
        return n+getSum(n-1);
    }
    public static void main(String[]args){
        int sum=getSum(10);
        System.out.println("Sum="+sum);
    }
}