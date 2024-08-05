import java.util.Scanner;

class Guesser{
    int Guessernum;

    public int takeNumberGuesser(){
        System.out.println("Guesser guess a Number : ");
        Scanner sc = new Scanner(System.in);
        Guessernum = sc.nextInt();

        return Guessernum;
    }

    }
   class player {
    int playernum;

    public int takeNumberGuesser(){
        System.out.println("Player Guess a Number : ");
        Scanner sc = new Scanner(System.in);
        playernum = sc.nextInt();

        return playernum;

    }
 }

    class Empire{
    int numfromGuesser;
    int numformplayer1;
    int numformplayer2;
    int numformplayer3;

    void CollectfromGuesser(){
        Guesser g = new Guesser();
        numfromGuesser = g.takeNumberGuesser();

    }
    void Collectfromplayer(){
        player p1 = new player();
        numformplayer1 = p1.takeNumberGuesser();

        player p2 = new player();
        numformplayer2 = p2.takeNumberGuesser();

        player p3 = new player();
        numformplayer3 = p3.takeNumberGuesser();
    }

    void Compare(){
        if(numformplayer1 == numfromGuesser){
            if(numformplayer2 == numfromGuesser && numformplayer3 == numformplayer3){
                System.out.println("All players won");
            }
            else if(numformplayer2 == numfromGuesser){
                System.out.println("Player 1 and 2 won");
            }
            else if(numformplayer3 == numformplayer3){
                System.out.println("player1 and player3 won the game ");
            }
            else{
                System.out.println("Only player 1 won the game");
            }
            }
            else if(numformplayer2 == numfromGuesser){
                if(numformplayer3 == numfromGuesser){
                    System.out.println("Only player 2 and 3 won the game");
                }
                else{
                    System.out.println("only player 2 won the game");
                }
            }
            else if(numformplayer3 == numfromGuesser){
                System.out.println("Only player 3 won the game ");
            }
            else{
                System.out.println("No player won the game ");
            }
        }
        
}

class GuesserGame{
    public static void main(String[] args) {
        Empire e = new Empire();
        e.CollectfromGuesser();
        e.Collectfromplayer();
        e.Compare();

        
    }
}