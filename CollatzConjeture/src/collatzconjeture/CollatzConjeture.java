
package collatzconjeture;

import java.util.Scanner;


public class CollatzConjeture {
    public static void main(String[] args) {
      Scanner read = new Scanner(System.in);
      int number1;
      int number2;
      int cycleMax=0;
      int cycleCounter=0;
      int i=0;
      int j=0;
      
      System.out.print("Input first number: ");
      number1 = read.nextInt();
      while(number1 < 0){
          System.out.print("First number should be major than 0.");
          number1 = read.nextInt();
      }
      System.out.print("Input second number: ");
      number2 = read.nextInt();
      while(number2 < number1){
          System.out.print("Second number should be major than first one.\nInput again: ");
          number2 = read.nextInt();
      }
      
      for(i=number1;i<=number2;i++){
          j=i;
          cycleCounter = 0;
          while(j>1){
             System.out.println(j+" ");
              if(j%2==0)
                  j /= 2;
              else
                  j = (j*3)+1;             
              cycleCounter++;
          }
          if(cycleCounter > cycleMax)
              cycleMax = cycleCounter;
      }
      
      
      System.out.println("Number 1: "+number1+" Number 2: "+number2+" Major number of cycle: "+cycleMax);
    }
}
