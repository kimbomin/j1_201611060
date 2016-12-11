package com.sd.Yutnori;

public class Dice {
   private int number=0;
   public void roll() {
      number=(int) (Math.random() * 5+1);
   }
   public int getNum() {
      return this.number;
   }
}