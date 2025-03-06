class GenerateOutOfBoundsException{
    public static void printString(String str){
        for(int i=0 ; i<=str.length()*2 ; i++){
            System.out.println(str.charAt(i));
        }
    }

    public static void handleException(Exception e){
        System.out.println("Exception caught : " + e.getMessage()); //exception message
    }
    public static void main(String[] args) {
        String str = "Hello";

        try{
            printString(str);
        }
        catch(Exception e){
            handleException(e);
        }
    }
}