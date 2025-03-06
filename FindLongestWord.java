import java.util.Scanner;

class FindLongestWord{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
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