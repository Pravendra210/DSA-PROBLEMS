// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class pattern {
   

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = 1;
      int var4 = 1;

      for(int var5 = var2 - 1; var3 <= var2; ++var4) {
         for(int var6 = 1; var6 <= var5; ++var6) {
            System.out.print("  ");
         }

         for(int var7 = 1; var7 <= var4; ++var7) {
            System.out.print("* ");
         }

         ++var3;
         System.out.println();
         --var5;
      }

   }
}
