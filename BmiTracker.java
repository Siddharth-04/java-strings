import java.util.Scanner;

public class BMITracker {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }
    
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }
    
    public static String[][] computeBMI(double[][] data) {
        String[][] results = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);
            results[i][0] = String.format("%.2f", height); //2 decimal places
            results[i][1] = String.format("%.2f", weight);
            results[i][2] = String.format("%.2f", bmi);
            results[i][3] = status;
        }
        return results;
    }
    
    public static void displayResults(String[][] results) {
        System.out.println("Height    Weight    BMI         Status");
        for (String[] row : results) {
            System.out.println(row[0] + "         " + row[1] + "         " + row[2] + "         " + row[3]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }
        
        String[][] results = computeBMI(data);
        displayResults(results);
    }
}
