
class WordReplace{
    public static String replaceWord(String sentence, String target, String replacement) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            if (word.equals(target)) {
                result.append(replacement).append(" ");
            } else {
                result.append(word).append(" ");
            }
        }
        
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language.";
        String target = "powerful";
        String replacement = "versatile";

        String newSentence = replaceWord(sentence, target, replacement);
        System.out.println("Updated Sentence: " + newSentence);
    }
}