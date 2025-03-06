import java.util.Arrays;
import java.util.Scanner;
class SplitWords{

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
    public static String[] splitIntoWords(String str,int spaces,int length){
        String[] words = new String[spaces+1];
        int index = 0;
        int i = 0;
        while(i < length){
            String word = "";
            while(i < length && str.charAt(i) != ' '){
                word += str.charAt(i);
                i++;
            }
            words[index] = word;
            index++;
            i++;
        }

        return words;
    }

    public static boolean compare(String[] words1, String[] words2){
        for(int i=0; i<words1.length; i++){
            if(!words1[i].equals(words2[i])){
                return false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        int length = findLength(str);
        int spaces = 0;

        for(int i=0 ; i<length ; i++){
            if(str.charAt(i) == ' '){
                spaces++;
            }
        }
        String [] words1 = splitIntoWords(str,spaces,length);
        String[] words2 = str.split(" "); //built in method to split the words
        boolean result = compare(words1, words2);
        System.out.println(Arrays.toString(words1));
        System.out.println(Arrays.toString(words2));
        if(result){
            System.out.println("Words are equal");
        }
        else{
            System.out.println("Words are not equal");
        }
    }
}
/*
    Enter the string: My name is this
    [My, name, is, this]
    [My, name, is, this]
    Words are equal
 */