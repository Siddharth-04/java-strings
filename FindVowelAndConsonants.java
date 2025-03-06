import java.util.Scanner;
class FindVowelAndConsonants{
    public static int[] findVowelAndConsonants(String str) {
        int vowel = 0;
        int consonant = 0;
        int [] result = new int[2];

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
        }

        result[0] = vowel;
        result[1] = consonant;

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        int [] result = findVowelAndConsonants(str);

        System.out.println("Number of vowels : " + result[0]);
        System.out.println("Number of consonants : " + result[1]);
    }
}

/*
    Enter the string: U need to find vowels and consonants
    Number of vowels : 11
    Number of consonants : 19

 */