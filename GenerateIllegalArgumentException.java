import java.util.Scanner;
class GenerateIllegalArgumentException{
    public static void handleException(Exception e){
        System.out.println("Exception occured: " + e.getMessage() + ", type of exception : " + e.getClass());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        int start = 1;
        int end = str.length()-1;
        try {
            String substr = str.substring(start + end, end); //this will generate exception    
        } catch (Exception e) {
            handleException(e);
        }
    }
}