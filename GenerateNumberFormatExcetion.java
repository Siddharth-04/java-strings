import java.util.Scanner;

class GenerateNumberFormatException{
    public static void handleException(Exception e){
        System.out.println("Exception occured: " + e.getMessage() + ", type  : " + e.getClass());
    }
    public static void main(String [] args){
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.next();
        try{
            int num = Integer.parseInt(str);
            System.out.println("Number is: " + num);
        }
        catch(NumberFormatException e){
            handleException(e);
        }
    }
}