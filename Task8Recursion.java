class Task8Recursion{
    static int rev(int n,int temp){
        if(n==0){
            return temp;
        }
        temp=(temp*10)+(n%10);
        return rev(n/10,temp);
    }
    public static void main(String[]args){
        int num=121;
        int temp=rev(num,0);
        if(temp==num){
            System.out.println(num+" is a palindrome.");
        }else{
            System.out.println(num+" is not a palindrome.");
        }
    }
}