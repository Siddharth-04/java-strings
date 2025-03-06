import java.util.Scanner;
class CreateSubstring{
    public static String createSubstring(String str){
        String substr = str.substring(3, 5);
        return substr;
    }
    public static String createSubstringUsingCharAt(String str, int start, int end){
        String substr = "";
        for(int i=start ; i<end ; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static boolean compareStrings(String str1, String str2){
        if(str1.equals(str2)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        String substr1 = createSubstring(str); // using substring method
        String substr2 = createSubstringUsingCharAt(str, 3, 5); //using charAt method

        boolean result = compareStrings(substr1, substr2);
        if(result){
            System.out.println("Both substrings are equal");
        }
        else{
            System.out.println("Both substrings are not equal");
        }
        
    }
}