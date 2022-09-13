import java.util.*;
class Main {
  static Scanner Scan = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Hello world!");
   int sticks = Init();
    int playerTurn = 0;
      while (sticks > 0) {
      int player;
      player = playerTurn(playerTurn);
      sticks = sticks - playerInput(player, sticks);
      playerTurn++;
    }
   System.out.println("Player "+ playerTurn(playerTurn) +" Won!");
  }
  static int Init(){
    System.out.println("Welcome to the game of sticks!");
    int a = 0;
    while (true){
       System.out.print("How many sticks are there on the table initially (10-100)? ");
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
  static int playerInput(int player, int sticks){
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
  static int playerTurn(int playerTurn){
    int player;
     if(playerTurn % 2 == 0){
        player = 1;
      }
      else{
        player = 2;
      }
    return player;
  }
  
    
    
}
