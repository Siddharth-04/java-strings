import java.util.Scanner;

class CountVowelsAndConsonants{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = scanner.nextLine();

        int vowel = 0;
        int consonant = 0;

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

        System.out.println("Number of vowels : " + vowel);
        System.out.println("Number of consonants : " + consonant);
    }
}
/*
    Enter the string :
    hello guys
    Number of vowels : 3

 */