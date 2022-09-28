import java.util.*;
class AI{
  int totalsticks;
  int currentsticks;
  int player;
  List<Integer> biasmemory = new ArrayList<Integer>();
	List<Integer> bias1 = new ArrayList<Integer>();
	List<Integer> bias2 = new ArrayList<Integer>();
	List<Integer> bias3 = new ArrayList<Integer>();
  public AI(int totalsticks,int Player){
    currentsticks = totalsticks;
    this.totalsticks = totalsticks;
    Init();
    player = Player;
  }
  
public void Init(){
  // method called Init to initalize the 3 arraylists with a for loop make the length the same as the total sticks.
  if(totalsticks > bias1.size()){
  for(int i = 0;i< totalsticks;i++){
    biasmemory.add(0);
    bias1.add(1);
    bias2.add(1);
    bias3.add(1);
  }
  }
}
public void Reset(){
  for(int i = 0;i< biasmemory.size();i++){
    biasmemory.set(i,0);
  }
  
}

public void Learn(boolean addorsub){
  // a method to add or remove the amount of sticks from the barray list after each game depending on if it won or lost
  //List<Integer> temp = new ArrayList<Integer>();
  for(int i = 0;i< totalsticks;i++){
    if(biasmemory.get(i) == 1){
      if(addorsub == true){
         bias1.set(i,bias1.get(i) + 1);
      }
      else{
        if(bias1.get(i) > 1){
          bias1.set(i,bias1.get(i) - 1);
        }
         
      }
     
    }
    if(biasmemory.get(i) == 2){
      if(addorsub == true){
      bias2.set(i,bias2.get(i) + 1);
      }
      else{
         if(bias2.get(i) > 1){
        bias2.set(i,bias2.get(i) - 1);
         }
      }
    }
     if(biasmemory.get(i) == 3){
      if(addorsub == true){
      bias3.set(i,bias3.get(i) + 1);
      }
      else{
         if(bias3.get(i) > 1){
        bias3.set(i,bias3.get(i) - 1);
         }
      }
    }
  }
}

public void biasMem(int stickval){
 for(int i = 0;i< totalsticks;i++){
   if(stickval == 1 && currentsticks == i){
     biasmemory.set(i,1);
   }
   if(stickval == 2 && currentsticks == i){
     biasmemory.set(i,2);
   }
   if(stickval == 3 && currentsticks == i){
     biasmemory.set(i,3);
   }
 }
  // a method to add 1,2,3 for each bias type into the bias memory. 
}
public int input(int currentsticks){
  Random Rand = new Random();
  this.currentsticks = currentsticks;
  List<Integer> temp = new ArrayList<Integer>();
 for(int i = 0; i< bias1.get(currentsticks); i++){
   temp.add(1);
 }
  for(int i = 0; i< bias2.get(currentsticks); i++){
    temp.add(2);
 }
   for(int i = 0; i< bias3.get(currentsticks); i++){
    temp.add(3);
 }
  System.out.println(temp.toString());
  biasMem(temp.get(Rand.nextInt(temp.size())));
  return temp.get(Rand.nextInt(temp.size()));
}





}
