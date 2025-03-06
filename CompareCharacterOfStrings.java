import java.util.Scanner;
class CompareCharacterOfStrings{
    public static char[] compareCharacterOfStrings(String str1){
        char[] result = str1.toCharArray();
        return result; 
    }
    public static char[] compareCharacterOfStringsUsingCharAt(String str1){
        char[] result = new char[str1.length()];
        for(int i=0 ; i<str1.length() ; i++){
            result[i] = str1.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(char [] result1, char [] result2){
        for(int i=0 ; i<result1.length ; i++){
            if(result1[i] != result2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();

        char [] result1 = compareCharacterOfStrings(str); // using toCharArray method
        char [] result2 = compareCharacterOfStringsUsingCharAt(str); //using charAt method

        boolean result = compareStrings(result1, result2);
        if(result == true){
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Both strings are not equal");
        }
    }
}