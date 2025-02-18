import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
        // fill the code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int numberOfTeams = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (numberOfTeams < 2) {
            System.out.println(numberOfTeams + " is an invalid input");
            sc.close();
            return;
        }

        String[] teamNames = new String[numberOfTeams];
        float[][] teamTimes = new float[numberOfTeams][4];
        float[] totalTimes = new float[numberOfTeams];

        System.out.println("Enter the details");
        for (int i = 0; i < numberOfTeams; i++) {
            String input = sc.nextLine();
            String[] parts = input.split(":");
            teamNames[i] = parts[0];

            for (int j = 0; j < 4; j++) {
                teamTimes[i][j] = Float.parseFloat(parts[j + 1]);
                if (teamTimes[i][j] < 1) {
                    System.out.println("Invalid number");
                    sc.close();
                    return;
                }
                totalTimes[i] += teamTimes[i][j];
            }
        }

        int winningTeamIndex = 0;
        for (int i = 1; i < numberOfTeams; i++) {
            if (totalTimes[i] < totalTimes[winningTeamIndex]) {
                winningTeamIndex = i;
            }
        }

        System.out.printf("%s team wins the race in %.2f minutes\n", teamNames[winningTeamIndex], totalTimes[winningTeamIndex]);
        sc.close();
    }
    

}
