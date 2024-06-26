import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("SAT DATA!!!!");

    // create data structure to store all total scores
    ArrayList<Integer> totalScore = new ArrayList<Integer>();
    
    try{
      Scanner s = new Scanner(new File("total.txt"));

      while(s.hasNext()){
        int score = Integer.parseInt(s.nextLine());
        totalScore.add(score);
      }
      s.close();
    }

    catch(Exception e){
      System.out.println("file not found");
    }

    // make sure all data entered the ArrayList
    System.out.println(totalScore);
    System.out.println(totalScore.size());
    int total = 0;
    int numThatHaveAboveThousand = 0; 
    int highest = 0;
    int numberOfPeopleWhoTookSat = 0;
    int lowest = 0;
    for(int score : totalScore){
      numberOfPeopleWhoTookSat++;
      total += score;
      if(score > 1000){
        numThatHaveAboveThousand++;
      }
      if(score > highest){
        highest = score;
      }
      if(lowest > score){
        lowest = score;
      }
    }
    double average = (double)total/totalScore.size();
    double averageOfAboveThousand = (double) numThatHaveAboveThousand/totalScore.size();
    System.out.println(average);
    System.out.println(numThatHaveAboveThousand);
    System.out.println(highest);
    System.out.println(averageOfAboveThousand * 100);
    System.out.println(numberOfPeopleWhoTookSat);
    System.out.println(lowest);


  }
}
