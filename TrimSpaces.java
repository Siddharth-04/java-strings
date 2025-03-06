class TrimSpaces{
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length()-1;
        int [] result = new int[2];
        while(start < str.length() && str.charAt(start) == ' '){
            start++;
        }
        while(end >= 0 && str.charAt(end) == ' '){
            end--;
        }
        result[0] = start;
        result[1] = end;
        return result;  
    }

    public static String subString(String str, int start, int end){
        String result = "";
        for(int i=start ; i<=end ; i++){
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String str1, String str2){
        for(int i=0 ; i<str1.length() ; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "  hello  ";
        int[] index = trimSpaces(str);

        String str1 = str.trim();
        String str2 = subString(str, index[0], index[1]);
        System.out.println(index[0] + " " + index[1]);
        System.out.println(str2);
        boolean resultByCompare = compareStrings(str1, str2);
        System.out.println(resultByCompare);
    }
}