public class Grade {
   String score;
   String grade(double marks) {  
      if (90<=marks && marks<=100) {  
      score="A";
      } 
      else if (80<=marks && marks<90) {  
      score="B"; 
      } 
      else if (70<=marks && marks<80) {  
      score="C";  
      } 
      else if (60<=marks && marks<70) {  
      score="D";  
      } 
      else {  
      score="F or input error";
      }      
      return score;
   }
public static void main(String[] args) {
   System.out.printf("Your grade is %s",new Grade().grade(80)); 
   }
}