public class StringComparison {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "banana";
        int i = 0;
        while (i < str1.length() && i < str2.length()) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println( str1 + " "  + "comes before " + " " + str2 + '"');
                return;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println('"' + str2 +  "comes before" + " " + str1 + '"');
                return;
            }
            i++;
        }
        if (str1.length() < str2.length()) {
            System.out.println(str1 + "comes before " + str2);
        } else if (str1.length() > str2.length()) {
            System.out.println('"' + str2 +" comes before "+ str1 );
        } else {
            System.out.println("Both strings are equal");
        }
    }
}