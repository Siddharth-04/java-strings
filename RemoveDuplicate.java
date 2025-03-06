class RemoveDuplicate{
    public static String removeDuplicate(String s) {
        int[] arr = new int[26+26];
        String result = "";
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                if(arr[s.charAt(i) -'A'] >= 1){
                    continue;
                }
                else {
                    result += s.charAt(i);
                    arr[s.charAt(i) -'A']++;
                }
            }
            else{
                if(arr[s.charAt(i) -'a'] >= 1){
                    continue;
                }
                else{
                    result += s.charAt(i);
                    arr[s.charAt(i) -'a']++;
                }
            }
        }
        
        return result;
        
    }
    public static void main(String[] args) {
        String s = "Thisistring";
        System.out.println(removeDuplicate(s));
    }
}
//Output : Thisrng
