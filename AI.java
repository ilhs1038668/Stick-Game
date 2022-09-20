import java.util.*;
class AI{
  int totalsticks;
  int currentsticks;
  List<Integer> biasmemory = new ArrayList<Integer>();
	List<Integer> bias1 = new ArrayList<Integer>();
	List<Integer> bias2 = new ArrayList<Integer>();
	List<Integer> bias3 = new ArrayList<Integer>();
  public AI(int totalsticks){
    currentsticks = totalsticks;
    Init();
  }
public void Init(){
  // method called Init to initalize the 3 arraylists with a for loop make the length the same as the total sticks.
}
public Boolean Reset(){
  // method called reset that sets the current sticks to total sticks and reset the bias memory
  return false;
}

public void Learn(){
  // a method to add or remove the amount of sticks from the array list after each game depending on if it won or lost
}

public void biasMem(){
  // a method to add 1,2,3 for each bias type into the bias memory. 
}

}
