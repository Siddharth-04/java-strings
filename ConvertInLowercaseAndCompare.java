import java.util.Scanner;
class ConvertInLowercaseAndCompare{
    public static String convertInLowercase(String str){
        String s = "";
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                ch = (char)(ch+'a'-'A');
                s += ch;
            }
        }

        return s;
    }

    public static boolean compareStrings(String str1, String str2){
        for(int i=0 ; i<str1.length() ; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }

        return true;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        String convertedString = convertInLowercase(str);
        String convertedByMethod = str.toLowerCase();

        boolean result = compareStrings(convertedString, convertedByMethod);
        System.out.println("Result after comparison : " + result);
    }
}
/*
    Enter a string : HELLO
    Result after comparison : true
 */