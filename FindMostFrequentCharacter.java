class FindMostFrequentCharacter{
    public static void main(String [] args){
        String str = "success";
        int [] arr = new int[26];
        int mostFreq = -1234567;
        char ans = '-';

        for(int i=0; i<str.length() ; i++){
            char ch = str.charAt(i);
            arr[ch-'a']++;

            if(arr[ch - 'a'] > mostFreq){
                ans = ch;
            }
        }

        System.out.print("Most Frequenct Character : "+ ans);
    }
}