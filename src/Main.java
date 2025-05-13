import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            Random random = new Random();

            String[] rps = {"rock", "paper", "scissors"};
            String cpu = rps[random.nextInt(3)];
            System.out.println("\nPick rock, paper, or scissors: \n");
            System.out.println("Press 'X' to exit program\n");
            String player = in.nextLine().toLowerCase().trim();
            if (player.equalsIgnoreCase("x")){
                break;
            }
            System.out.println("CPU chooses: " + cpu);

            System.out.println("ROCK...PAPER...SCISSORS\n");

            switch (player) {
                case "rock":
                    if (cpu.equalsIgnoreCase("rock")) {
                        System.out.println("It's a Tie!");
                        break;
                    } else if (cpu.equalsIgnoreCase("paper")) {
                        System.out.println("You lose!!");
                        break;
                    } else {
                        System.out.println("You Win!!");
                        break;
                    }
                case "paper":
                    if (cpu.equalsIgnoreCase("paper")) {
                        System.out.println("It's a Tie!");
                        break;
                    } else if (cpu.equalsIgnoreCase("scissors")) {
                        System.out.println("You lose!!");
                        break;
                    } else {
                        System.out.println("You Win!!");
                        break;
                    }
                case "scissors":
                    if (cpu.equalsIgnoreCase("scissors")) {
                        System.out.println("It's a Tie!");
                        break;
                    } else if (cpu.equalsIgnoreCase("rock")) {
                        System.out.println("You lose!!");
                        break;
                    } else {
                        System.out.println("You Win!!");
                        break;
                    }
            }
        }
    }
}