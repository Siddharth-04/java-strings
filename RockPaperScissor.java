import java.util.Scanner;

class RockPaperScissor{

    public static int computerChoice() {
        int computerChoice = (int)(Math.random()*3);
        return computerChoice;
    }

    public static String winnerDecide(String userChoice, int computerChoice){
        if(userChoice.equals("Rock") && computerChoice == 1){
            return "Computer";
        }
        else if(userChoice.equals("Rock") && computerChoice == 2){
            return "User";
        }
        else if(userChoice.equals("Paper") && computerChoice == 0){
            return "User";
        }
        else if(userChoice.equals("Paper") && computerChoice == 2){
            return "Computer";
        }
        else if(userChoice.equals("Scissor") && computerChoice == 0){
            return "Computer";
        }
        else if(userChoice.equals("Scissor") && computerChoice == 1){
            return "User";
        }

        return "Draw";

    }

    public static String [][] calculateStats(String [] userChoice,String [] choiceStrings){
        int numGames = userChoice.length;
        String [][] result = new String[numGames][3];
        for(int i=0 ; i<numGames ; i++){
            int computerChoice = computerChoice();
            String winner = winnerDecide(userChoice[i], computerChoice);
            result[i][0] = userChoice[i];
            result[i][1] = choiceStrings[computerChoice];
            result[i][2] = winner;
        }
        return result;
    }

    public static void displayStats(String [][] result){
        System.out.println("User Choice    Computer Choice    Winner");

        for(int i=0 ; i<result.length ; i++){
            System.out.println(result[i][0] + "            " + result[i][1] + "             " + result[i][2]);
        }
        
        int userWins = 0;
        int computerWins = 0;
        int numGames = result.length;

        for(int i=0 ; i<result.length ; i++){
            String winner = result[i][2];
            if(winner.equals("User")){
                userWins++;
            }
            else{
                computerWins++;
            }
        }

        double userPercentage = ((double) userWins / numGames) * 100;
        double computerPercentage = ((double) computerWins / numGames) * 100;

        System.out.println("Average percentage of user wins : " + userPercentage);
        System.out.println("Average percentage of computer wins : " + computerPercentage);

    }
    public static void main(String[] args){
        String [] choiceStrings = {"Rock", "Paper", "Scissor"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games : ");
        int numGames = scanner.nextInt();
        System.out.print("Enter your choice: ");

        String [] userChoicesArray = new String[numGames];

        for(int i=0 ; i<numGames ; i++){
            int choice = scanner.nextInt();
            userChoicesArray[i] = choiceStrings[choice-1];
        }

        String [][] result = calculateStats(userChoicesArray,choiceStrings);
        displayStats(result);   
    }
}
/*
    Enter number of games : 3
    Enter your choice: 1
    1
    1
    User Choice    Computer Choice    Winner
    Rock            Paper             Computer
    Rock            Paper             Computer
    Rock            Rock             Draw
    Average percentage of user wins : 0.0
    Average percentage of computer wins : 100.0

 */
