import java.util.Scanner;

class FindLengthOfString{
    public static int findLength(String str){
        int count = 0;
        while(true){
            try{
                char ch = str.charAt(count);
                count++;
            }catch(Exception e){
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.next();
        int length = findLength(str);
        int lengthUsingMethod = str.length();
        System.out.println("Length of the string from user defined method : "+length);
        System.out.println("Length of the string from built-in method : "+lengthUsingMethod);
        
    }
}
/*
    Enter the string: Hiii
    Length of the string from user defined method : 4
    Length of the string from built-in method : 4
 */