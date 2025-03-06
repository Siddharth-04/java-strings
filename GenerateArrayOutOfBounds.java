import java.util.Scanner;
class GenerateArrayOutOfBounds{
    public static void generateArrayOutOfBounds(String [] names, int size){
        for(int i=0 ; i<size*2 ; i++){
			System.out.print(names[i] + " ");
		}
    }
    public static void handleException(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception occured " + e.getMessage() + ", type: " + e.getClass());
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        String [] names = new String[size];
		
		for(int i=0 ; i<size ; i++){
			String name = scanner.next();
			names[i] = name;
		}
		
		try{
			generateArrayOutOfBounds(names, size);
		}catch(ArrayIndexOutOfBoundsException e){
			handleException(e);
		}
	}
}