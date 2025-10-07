class Task1Recursion{
    static void printName(String name,int count){
        if(count<=0){
            return;
        }
        System.out.println(name);
        printName(name,count-1);
    }
    public static void main(String[]args){
        String name="Sagar";
        printName(name,5);
    }
}
