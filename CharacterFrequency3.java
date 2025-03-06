import java.util.Scanner;

public class CharacterFrequency3{
    public static String[][] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] frequency = new int[length];
        
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') {
                continue;
            }
            frequency[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }
        
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencies = findCharacterFrequency(text);
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i][0] + ": " + frequencies[i][1]);
        }
    }
}
/*
    Enter a string: Hello
    Character Frequencies:
    H: 1
    e: 1
    l: 2
    o: 1

 */