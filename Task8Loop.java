class Task8Loop{
    public static void main(String[]args){
        int num=121,rev=0,rem;
        int temp=num;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        if(num==rev){
            System.out.println(num+" is a palindrome.");
        }else{
            System.out.println(num+" is not a palindrome.");
        }
    }
}