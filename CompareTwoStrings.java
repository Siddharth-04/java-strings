import java.util.Scanner;

class CompareTwoStrings{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first strings to compare: ");
        String str1 = scanner.next();
        System.out.print("Enter second strings to compare: ");
        String str2 = scanner.next();
        if(str1.equals(str2)){
            System.out.println("Both strings are equal using .equals() method");
        }
        else{
            System.out.println("Both strings are not equal using .equals() method");
        }

        for(int i=0 ; i<str1.length() && i<str2.length() ; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                System.out.println("Both strings are not equal using .charAt() method");
                System.exit(1);
            }
        }

        System.out.println("Both strings are equal using .charAt() method");
    }
}