package com.sd.Yutnori;

//import ch.aplu.turtle.*;
import java.util.Scanner;

public class Game {
   private String name1=null;
   private String name2=null;
   int Player1Score=0;
   int Player2Score=0;
   int num1;
   int num2;
   public void setPlayer1(String player1) {
      this.name1=player1;
   }
   public void setPlayer2(String player2) {
      this.name2=player2;
   }
   public void play() {
      Yut y = new Yut();
      while((Player1Score <= 20 || Player2Score<= 20)) {
        y.roll();
        num1 = y.getNum();
        Player1Score = Player1Score + num1;
        y.roll();
        num2 = y.getNum();
        Player2Score = Player2Score + num2;
        System.out.println(name1 + " get score: "+ num1);
        System.out.println(name2 + " get score: " + num2);
        System.out.print("\n");
        if (Player1Score >= 20) {
          System.out.println(name1 + " is winner get score : "+Player1Score);
          break;
        }
        else if (Player2Score >= 20) {
          System.out.println(name2 + " is winner get score : "+Player2Score);
          break;
        }
    }
  }
  public static void main(String[] args) {
    Game g=new Game();
    Scanner sc=new Scanner(System.in);
    System.out.println("Player1 name");
    String Player1=sc.nextLine();
    g.setPlayer1(Player1);
    System.out.println("Player2 name");
    String Player2=sc.nextLine();
    g.setPlayer2(Player2);
    g.play();
  }
}