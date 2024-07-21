import java.util.*;

class rps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int compValue;
        int compScore = 0, userScore = 0;
        boolean endGame = true;

        while (endGame) {
            System.out.print("Choose:\n1 for rock\n2 for paper\n3 for scissors\n4 to end game\n");

            String input = sc.next();

            // Check if the input is an integer
            if (input.matches("\\d+")) {
                int n = Integer.parseInt(input);

                if (n < 1 || n > 4) {
                    System.out.print("Choose a number between 1, 2, 3, and 4.\n");
                    continue;
                }
                if (n == 4) {
                    endGame = false;
                    break;
                }

                compValue = 1 + r.nextInt(3);
                switch (n) {
                    case 1:
                        switch (compValue) {
                            case 1:
                                System.out.print("Computer chose rock. Draw!\n");
                                break;
                            case 2:
                                System.out.print("Computer chose paper. Point for computer\n");
                                compScore++;
                                break;
                            case 3:
                                System.out.print("Computer chose scissors. Point for user\n");
                                userScore++;
                                break;
                        }
                        break;
                    case 2:
                        switch (compValue) {
                            case 1:
                                System.out.print("Computer chose rock. Point for user\n");
                                userScore++;
                                break;
                            case 2:
                                System.out.print("Computer chose paper. Draw!\n");
                                break;
                            case 3:
                                System.out.print("Computer chose scissors. Point for computer\n");
                                compScore++;
                                break;
                        }
                        break;
                    case 3:
                        switch (compValue) {
                            case 1:
                                System.out.print("Computer chose rock. Point for computer\n");
                                compScore++;
                                break;
                            case 2:
                                System.out.print("Computer chose paper. Point for user\n");
                                userScore++;
                                break;
                            case 3:
                                System.out.print("Computer chose scissors. Draw!\n");
                                break;
                        }
                        break;
                }
            } else {
                System.out.print("Invalid input. Please enter a number between 1 and 4.\n");
            }
        }

        System.out.print("Final score is:\nUser: " + userScore + "\nComputer: " + compScore + "\n");
        if (userScore > compScore) {
            System.out.println("USER WINS!!!");
        } else if (compScore > userScore) {
            System.out.println("Computer wins...better luck next time");
        } else {
            System.out.println("It's a draw!");
        }
        sc.close();
    }
}
