import java.util.*;

class rps 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int compValue;
        char choice;
        int compScore=0, userScore=0,n;
        boolean b1=true;
        do
        {
            System.out.print("choose:\n1 for rock\n2 for paper\n3 for scizzors\n4 to end game\n");
            n=sc.nextInt();
            compValue=1+r.nextInt(3);
            switch(n)
            {       
                case 1:
                switch(compValue)
                {
                    case 1:
                        System.out.print("Computer chose rock. Draw!\n");
                        break;

                    case 2:
                        System.out.print("Computer chose paper. point computer\n");
                        compScore++;
                        break;
                    
                    case 3:
                        System.out.print("Computer chose scizzors. point user\n");
                        userScore++;
                        break;
                }
                break;

                case 2:
                switch(compValue)
                {
                    case 1:
                        System.out.print("Computer chose rock. point user\n");
                        userScore++;
                        break;

                    case 2:
                        System.out.print("Computer chose paper. Draw!\n");
                        break;
                    
                    case 3:
                        System.out.print("Computer chose scizzors. point computer\n");
                        compScore++;
                        break;
                }
                break;

                case 3:
                switch(compValue)
                {
                    case 1:
                        System.out.print("Computer chose rock. point computer\n");
                        compScore++;
                        break;

                    case 2:
                        System.out.print("Computer chose paper. point user\n");
                        userScore++;
                        break;
                    
                    case 3:
                        System.out.print("Computer chose scizzors. Draw!\n");
                        break;
                }
                break;

                case 4:
                    b1=false;
                    break;

                default:
                System.out.print("choose a number between 1, 2,3 and 4......\n");
            }
        } while (b1);
        System.out.print("Final score is :\nUser: "+userScore+"\nComputer: "+compScore+"\n");
        if (userScore>compScore) {
            System.out.println("USER WINS!!!");
        }
        else if(compScore>userScore) {
            System.out.println("computer wins....better luck next time");
        }
        else {
            System.out.println("It's a draw!");
        }
    }
}