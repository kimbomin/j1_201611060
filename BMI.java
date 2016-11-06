public class BMI { 
   public String bmi(float height, float weight) { 
   float bmi = weight/(height*height); 
   String result;
   System.out.printf("BMI = %.1f",bmi); 			
   if (bmi <= 20){ 
      result="Underweight";
   } 
   else if (bmi > 20 && bmi < 26) { 
      result="Normal weight"; 
   } 
   else if (bmi >= 26 && bmi < 30) {
      result="Slightly Overweight"; 
   } 
   else if (bmi >= 30 && bmi < 40) {
      result="Overweight"; 
   } 
   else if (bmi >= 40) {
      result="Extremely Overweight"; 
   } 
   else {
      result="Error"; 
   } 
      return result;
   }
   public static void main(String[] args) { 
      float weight=(float)75;
      float height=(float)1.75;
      System.out.print("BMI result : "+new BMI().bmi(height,weight)); 
   } 
} 