class Task10Recursion{
    static int getSum(int[]arr,int n){
        if(n<=0){
            return 0;
        }
        return getSum(arr,n-1)+arr[n-1];
    }
    public static void main(String[]args){
        int[]arr={1,2,3,4,5};
        int sum=getSum(arr,arr.length);
        System.out.println("Sum of array elements is: "+sum);
    }
}