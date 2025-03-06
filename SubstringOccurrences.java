public class SubstringOccurrences {
    public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = str.indexOf(sub);
        while (index != -1) {
            count++;
            index = str.indexOf(sub, index + sub.length());
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "abcabcabc";
        String sub = "abc";
        System.out.println("Occurrences: " + countOccurrences(str, sub));
    }
}
/*
    Occurrences: 3
 */
