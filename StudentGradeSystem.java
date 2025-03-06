public class StudentGradeSystem {
    
    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 100); 
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][3];
        
        for (int i = 0; i < numStudents; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3;
            double percentage = (total / 300) * 100;
            
            results[i][0] = Math.round(total * 100.0) / 100.0;  // Rounding off to 2 decimal places
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results, int numStudents) {
        String[] grades = new String[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B+";
            } else if (percentage >= 60) {
                grades[i] = "B";
            } else if (percentage >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades, int numStudents) {
        System.out.println("Student Scorecard:");
        System.out.println("Student  Physics  Chemistry  Math  Total  Average  Percentage  Grade");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println(
                "S" + (i + 1) + "       " + scores[i][0] + "        " + scores[i][1] + 
                "         " + scores[i][2] + "    " + results[i][0] + "    " + 
                results[i][1] + "    " + results[i][2] + "    " + grades[i]
            );
        }
    }

    public static void main(String[] args) {
        int numStudents = 5;  
        int[][] scores = generateScores(numStudents);  
        double[][] results = calculateResults(scores, numStudents);  
        String[] grades = calculateGrades(results, numStudents);  // Calculate grade
        
        // Display the scorecard
        displayScorecard(scores, results, grades, numStudents);
    }
}

/*
    Student Scorecard:
    Student  Physics  Chemistry  Math  Total  Average  Percentage  Grade
    S1       88        66         14    168.0    56.0    56.0    C
    S2       39        61         92    192.0    64.0    64.0    B
    S3       16        34         23    73.0    24.33    24.33    F
    S4       53        32         9    94.0    31.33    31.33    F
    S5       21        27         96    144.0    48.0    48.0    F

 */
