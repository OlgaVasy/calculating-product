// Ex.5.12: CalculatingTheProduct class
// Calculates the product of the odd integers from 1 to 15

public class CalculatingTheProduct {

   public static void main(String[] args) {
      int product=1;

      for (int integer=1; integer<=15; ++integer){
         if (integer % 2 != 0){
            product=product*integer;         }
               }
   System.out.println("The product of the odd integers from 1 to 15 is: " + product);

   }}