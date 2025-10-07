class Task3Recursion{
    static void printOdd(int start){
        if(start<1){
            return;
        }
        if(start%2!=0){
            System.out.println(start);
        }
        printOdd(start-1);
    }
    public static void main(String[]args){
        printOdd(10);
    }
}