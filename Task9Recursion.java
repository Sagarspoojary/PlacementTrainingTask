class Task9Recursion{
    static boolean isPal(String s,int i,int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isPal(s,i+1,j-1);
    }
    public static void main(String[]args){
        String str="madam";
        if(isPal(str,0,str.length()-1)){
            System.out.println(str+" is a palindrome.");
        }else{
            System.out.println(str+" is not a palindrome.");
        }
    }
}