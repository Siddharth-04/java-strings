class StringPractice {
    public static void main(String[] args) {
        String str = "Hello World"; //Declare a string variable
        System.out.println(str); //Print the string

        System.out.println(str.toUpperCase());
        System.out.println(str); //Print the string in uppercase

        System.out.println(str.toLowerCase()); //Print the string in lowercase

        /*
         * String is immutable in Java.(we cannot modify it)
         * So when we run str.toUpperCase() or str.toLowerCase(), it will not change the original string.
         * It will return a new string in uppercase or lowercase.
         * if we print str it still remains the same "Hello World";
         */

        System.out.println(str.length()); //Print the length of the string

        //Print the first character of the string
        System.out.println(str.charAt(0)); //charAt() method is used to get the character at a specific index of the string

        //Print the last character of the string
        System.out.println(str.charAt(str.length()-1)); //charAt() method is used to get the character at a specific index of the string

        //Print the index of the character 'W' in the string
        System.out.println(str.indexOf('W')); //indexOf() method is used to get the index of a specific character in the string

        //Print the index of the character 'o' in the string
        System.out.println(str.indexOf('s')); //if character is not found in the string, it will return -1

        //Remove leading and trailing spaces from the string
        String str1 = "  Hello World  ";
        System.out.println(str1.trim()); //trim() method is used to do this

        //Remove all spaces from the string
        System.out.println(str1.replace(" ", "$")); //replace("target","replacement") method is used to do this

        //.equals() method
        String str2 = "Hello World";
        String str3 = "Hello World";
        System.out.println(str2.equals(str3)); //equals() method is used to compare two strings

        //Ascii value of a character
        char ch = 'A';
        System.out.println((int)ch); //type casting 
       
        int value = 97;
        char ch1 = (char)value;
        System.out.println(ch1); //converting int to equivalent charcter in ASCII

    }
}
