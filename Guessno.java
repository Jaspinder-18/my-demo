import java.util.Scanner;
public class Guessno {
   // Source code is decompiled from a .class file using FernFlower decompiler.


   public static void main(String[] var0) {
      int var1 = (int)(Math.random() * 100.0);
      Scanner var2 = new Scanner(System.in);
      int var4 = 0;

      int var3;
      do {
         ++var4;
         System.out.print("Guess number between 0 to 100: ");
         var3 = var2.nextInt();
         if (var3 == var1) {
            System.out.println("You are Winner");
            System.out.println("Total number of attempts are " + var4);
            break;
         }

         if (var3 > var1) {
            System.out.println("Number is to high");
         } else if (var3 < var1) {
            System.out.println("Number is to low");
         } else if (var3 <= 101 && var3 >= 0) {
            System.out.println("Enter right number");
         } else {
            System.out.println("Enter the number less than 100 and greater than 0");
         }
      } while(var3 != var1);

   }
}
 
