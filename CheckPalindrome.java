class CheckPalindrome{
    public static void main(String[] args) {
        String str = "racecar";

        //check palindrome
        int i=0;
        int j=str.length()-1;

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.print("This is not a palindrome !");
                break;
            }

            i++;
            j--;
        }

        System.out.print("This is  a palindrome string !");
        
    }
}
/*
    $ java CheckPalindrome.java
    This is  a palindrome string !

 */