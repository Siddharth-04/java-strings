import java.util.Arrays;
import java.util.Scanner;
class SplitAndStoreIn2dArray{

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

    public static String[][] create2dArray(String[] words,int spaces){
        String[][] words2d = new String[spaces+1][2];
        
        for(int i=0 ; i<words.length ; i++){
            String word = words[i];
            int length = findLength(word);
            words2d[i][0] = words[i];
            words2d[i][1] = String.valueOf(length);
        }
        return words2d;
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
        System.out.println(Arrays.toString(words1));
        String[][] words2d = create2dArray(words1,spaces);

        for(int i=0 ; i<words2d.length ; i++){
            System.out.println(words2d[i][0] + "    :    " + words2d[i][1]);
        }
    }
}
/*
    Enter the string: Hello from this side
    [Hello, from, this, side]
    Hello    :    5
    from    :    4
    this    :    4
    side    :    4

 */