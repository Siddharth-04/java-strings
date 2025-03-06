import java.util.Scanner;

public class CharacterFrequency {
    public static int[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256];
        int length = 0;
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
            length++;
        }
        
        int[][] result = new int[length][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] != 0) {
                result[index][0] = currentChar;
                result[index][1] = frequency[currentChar];
                frequency[currentChar] = 0;
                index++;
            }
        }
        
        int[][] finalResult = new int[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[][] frequencies = findCharacterFrequency(text);
        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println((char) frequencies[i][0] + ": " + frequencies[i][1]);
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
