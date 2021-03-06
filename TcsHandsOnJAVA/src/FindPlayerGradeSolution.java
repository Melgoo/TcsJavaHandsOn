import java.util.Arrays;
import java.util.Scanner;

public class FindPlayerGradeSolution{
	 public static void main(String[] args)
	 {
	  //code to read values 
	    Player[] player = new Player[4];
		   Scanner sc=new Scanner(System.in);
			  for(int i=0;i<player.length;i++){
		 System.out.println("Enter the playerId");
	   int playerId = sc.nextInt();
	   String playerName = sc.next();
	   int iccRank = sc.nextInt();
	   int noOfMatchesPlayed = sc.nextInt();
	    int totalRunsScored = sc.nextInt();
	   player[i] = new Player(playerId, playerName, iccRank,noOfMatchesPlayed, totalRunsScored);
	  }
			  //search the values......
	    int target = sc.nextInt();
       sc.close();
       
	  //code to call required method.........
	   double[] averageRunRate = findAverageScoreOfPlayers(player, target);
	   
	 //code to calculate Grade and display the results.........
	  for(int i=0;i<averageRunRate.length;i++){
	if(averageRunRate[i] >=80)
	{
	  System.out.println("Grade A Player");
	}
	else if(averageRunRate[i]>=50 && averageRunRate[i]<=79)
	{
	  System.out.println("Grade B Player");
	  }
	else{
	  System.out.println("Grade C Player");
	  }
	  }
	 }
	 public static double[] findAverageScoreOfPlayers(Player[] player,int target)
	 {
	  //method logic
	      double[] averageRunRate =new double[0];
	 	  for(int i=0;i<player.length;i++) {
	      if(player[i].getNoOfMatchesPlayed()>=(target))
	    	{
	    	  averageRunRate=Arrays.copyOf(averageRunRate,averageRunRate.length+1);
	    	  averageRunRate[averageRunRate.length-1]=player[i].getTotalRunsScored()/player[i].getNoOfMatchesPlayed();
	    	}
	 	  }
	   return averageRunRate;
	 }
}
	class Player
	{
		//code to build player class
	int playerId;
	  String playerName;
	  int iccRank; 
	  int noOfMatchesPlayed;
	  int totalRunsScored; 
	  Player(int playerId,String playerName,int iccRank,int noOfMatchesPlayed,int totalRunsScored)
	  {
	  this.playerId=playerId;
	  this.playerName=playerName;
	  //this.iccRank=iccRank;
	  this.noOfMatchesPlayed=noOfMatchesPlayed;
	  this.totalRunsScored=totalRunsScored;
	  }
	  public int getPlayerId()
	  {
	    return playerId;
	  } 
	   public int getNoOfMatchesPlayed ()
	  {
	    return noOfMatchesPlayed;
	  } 
	   public int getTotalRunsScored ()
	  {
	    return totalRunsScored;
	  }
	}



