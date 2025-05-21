import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        Random random = new Random();
        String[] rps = {"rock", "paper", "scissors"};
        int playerScore = 0;
        int cpuScore = 0;

        while (true) {
            String cpu = rps[random.nextInt(3)];

            System.out.println("\nChoose rock, paper, or scissors: \n");
            System.out.println("Press 'X' to exit program\n");

            String player = in.nextLine().toLowerCase().trim();
            if (player.equalsIgnoreCase("x")) break;

            System.out.println("\nCPU chooses: " + cpu);

            System.out.println("ROCK...PAPER...SCISSORS\n");

            if (player.equals(cpu)) {
                System.out.println("It's a Tie!");
                System.out.println("Player: " + playerScore);
                System.out.println("CPU " + cpuScore);
            } else if (
                    (player.equals("rock") && cpu.equals("scissors")) ||
                            (player.equals("paper") && cpu.equals("rock")) ||
                            (player.equals("scissors") && cpu.equals("paper"))
            ) {
                System.out.println("You Win!!");
                playerScore++;
                System.out.println("Player: " + playerScore);
                System.out.println("CPU " + cpuScore);
            } else if (
                    player.equals("rock") || player.equals("paper") || player.equals("scissors")
            ) {
                System.out.println("You lose!!");
                cpuScore++;
                System.out.println("Player: " + playerScore);
                System.out.println("CPU " + cpuScore);
            } else {
                System.out.println("Invalid input. Try again.");
            }
            if (playerScore >= 5 || cpuScore >= 5){
                System.out.println("Play again? Y/N");
                String choice = inp.nextLine();
                if (choice.equalsIgnoreCase("Y")){
                    playerScore = 0;
                    cpuScore = 0;
                }
                else
                    break;
            }
        }

            in.close();
    }
}