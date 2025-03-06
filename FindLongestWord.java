class FindLongestWord{
    public static void main(String[] args) {
        String str = "Find the longest word";
        String [] stringArray = str.split(" ");
        
        String ans = "";
        int longest = -1234567;
        for(int i=0 ; i<stringArray.length ; i++){
            if(stringArray[i].length() > longest){
                longest = stringArray[i].length();
                ans = stringArray[i];
            }
        }

        System.out.println("Longest string : "+ans);
    }
}