class GenerateException{
    public static int findLength(String str){
        return str.length();
    }
    public static void main(String [] args){
        String str = null;
        try{
            int length = findLength(str);
            System.out.println("Length of the string is: " + length);
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException occured ");
        }
    }
}