import java.io.PrintStream;
import java.util.Arrays;

class VotingEligibilty{
    public static int[] generateArray(){
        int [] arr = new int[10];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static String[][] create2dArray(int [] ages){
        String [][] result = new String[ages.length][2];

        for(int i=0 ; i<ages.length ; i++){
            if(ages[i] >= 18){
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "true";
            }
            else{
                result[i][0] = String.valueOf(ages[i]);
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void print2dArray(String [][] arr){
        PrintStream out = System.out;
        out.println("Age    Eligible");
        for(int i=0 ; i<arr.length ; i++){
            out.println(arr[i][0] + "    " + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        int [] ages = generateArray();
        String [][] result = create2dArray(ages);
        print2dArray(result);
    }
}