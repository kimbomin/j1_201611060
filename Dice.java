﻿class Dice {
   private int number = 0;
   public void roll() {
      number = (int) (Math.random()*6)+1;
      System.out.println("turns on " +number);
   }
   public int getNum() {
      return this.number;
   }
}
public class Player {
   private String name=null;
   int num=0;
   public Player(String _name) {
      name=_name;
   }
   public void play() {
      dice d=new dice();
      //num=d.roll();
      d.roll();
      num=d.getNum();
   }
   public String getName() {
      return this.name;
   }
   public int getNum() {
      return this.num;
   }
}
class DiceGame {
   Player p1;
   player p2;
   public void startGame() {
      p1 = new Player("A");
      p2 = new Player("B");
      p1.play();
      p2.play();
      if (p1.getNum() > p2.getNum()) {
         System.out.println(p1.getName() + " won!");
      }
      else if (p1.getNum() == p2.getNum()) {
         System.out.println(" draw..");
      }
      else
         System.out.println(p2.getName() + " won!");
   }
}
DiceGame d=new DiceGame();
d.startGame();