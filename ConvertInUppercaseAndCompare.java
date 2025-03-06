import java.util.Scanner;
class ConvertInUppercaseAndCompare{
    public static String convertInUppercase(String str){
        String s = "";
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <='z'){
                ch = (char)(ch+'A'-'a');
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

        String convertedString = convertInUppercase(str);
        String convertedByMethod = str.toUpperCase();

        boolean result = compareStrings(convertedString, convertedByMethod);
        System.out.println("Result after comparison : " + result);
    }
}