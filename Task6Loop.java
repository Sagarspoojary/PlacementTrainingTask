class Task6Loop{
    public static void main(String[]args){
        int num=12345;
        int count=0;
        int temp=num;
        while(temp>0){
            temp/=10;
            count++;
        }
        System.out.println("Number of digits in "+num+" is "+count);
    }
}