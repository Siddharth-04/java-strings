import java.util.Scanner;
class FindVowelAndConsonant2d{
    public static int[][] findVowelAndConsonants(String str) {
        int vowel = 0;
        int consonant = 0;
        int notALetter = 0;
        int [][] result = new int[1][3];

        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch >= 'A' &&  ch <='Z'){
                ch = (char)('a' + (ch - 'A'));
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }else if((ch >= 'a' && ch <= 'z')){
                consonant++;
            }
            else{
                notALetter++;
            }
        }

        result[0][0] = vowel;
        result[0][1] = consonant;
        result[0][2] = notALetter;

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        int [][] result = findVowelAndConsonants(str);

        System.out.println("Vowel    Consonant    Not a Letter ");
        System.out.println( result[0][1] +"          " + result[0][1] + "          " + result[0][2]);

    }
}

/*
    Enter the string: find vowel and consonants
    Vowel    Consonant    Not a Letter
    15          15          3


 */