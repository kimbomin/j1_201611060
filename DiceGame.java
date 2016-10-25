package com.sd.DiceGame;
import java.util.Scanner;

public class DiceGame {
   Player p1;
   Player p2;
   public void startGame(String name1,String name2) {
      p1=newPlayer(name1);
      p2=newPlayer(name2);
      p1.play();
      p2.play();
      if (p1.getNum() > p2.getNum()) {
         p1.getScore();
         System.out.println("Congraturation! "+p1.getName()+" won!");
      }
      else if (p1.getNum() < p2.getNum()) {
         p2.getScore();
         System.out.println("Congraturation! "+p2.getName()+" won!");
      }
      else
         System.out.println("Draw...");
      }
      public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("player1 name");
         String name1=sc.nextLine();
         System.out.println("player2 name");
         String name2=sc.nextLine();
         new DiceGame().startGame(name1,name2);
      }
   }
