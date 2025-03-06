class RemoveSpecificCharacter{
    public static void main(String[] args) {
        String str = "success";
        char characterToRemove = 's';
        String result = "";

        for(int i=0 ; i<str.length() ; i++){
            if(str.charAt(i) != characterToRemove){
                result += str.charAt(i); 
            }
        }

        System.out.print("String after removal of character : " + result);
    }
}
// String after removal of character : ucce