class Task5Loop{
    public static void main(String[]args){
        int num=12345;
        int sum=0;
        int temp=num;
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        System.out.println("Sum of digits of "+num+" is "+sum);
    }
}