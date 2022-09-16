import java.util.*;
import java.io.*;
class Main {
  static Scanner Scan;
  public static void main(String[] args) {
   Scan = new Scanner(System.in);
    Game();
  }
  static int Init(){ // this introduces you to the game of sticks and asks for the amount of sticks that you will be playing with
    System.out.println("Welcome to the game of sticks!");
    int a = 0;
    while (true){
       System.out.println("How many sticks are there on the table initially (10-100)? ");
      a = Scan.nextInt();
      if(a > 100 || a < 10){
        System.out.println("Please enter a number between 10 and 100");
      }
      else{
        break;
      }
    }
    return a;
    
  }
  static int playerInput(int player, int sticks){ // this asks for the amount of sticks you will be taking.
    if(sticks > 1){
       System.out.println("There are "+sticks+" sticks on the board.");
    }
   else{
     System.out.println("There is "+sticks+" sticks on the board.");
   }
    System.out.println("Player " + player + ": How many sticks do you take (1-3)? ");
   int amountSticks = Scan.nextInt();
    
    while (amountSticks > 3 || amountSticks < 1){
      System.out.println("Please enter a number between 1 and 3");
      
      System.out.println("Player " + player + ": How many sticks do you take (1-3)? ");
      amountSticks = Scan.nextInt();
    }
    System.out.println();
    return amountSticks;
  }
  static int playerTurn(int playerTurn){ //figures out whos turn it is in the game based on the playerturn int.
    int player;
     if(playerTurn % 2 == 0){
        player = 1;
      }
      else{
        player = 2;
      }
    return player;
  }
  public static void Game(){
    while (true){
    int sticks = Init();
    int playerTurn = 0;
      while (sticks > 0) {
      int player;
      player = playerTurn(playerTurn);
      sticks = sticks - playerInput(player, sticks);
      playerTurn++;
    }
   System.out.println("Player "+   playerTurn(playerTurn) +" Won!");
      System.out.println("Play again? (yes or no)");
      String playAgain = Scan.next();
      playAgain = playAgain.toLowerCase();
      if(playAgain.equals("no")){
        break;
      }
    }
  }      
}