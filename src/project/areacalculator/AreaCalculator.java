package project.areacalculator;
 import java.util.Scanner;
  public class AreaCalculator {

    public static void AreaRetangulo(){
        
        Scanner input = new Scanner(System.in);
        
       double A, B, C, Triangle, Circle, Trapeze, Square, Retangle;
       double Pi = 3.14159;
     
              System.out.print("Insert the A value: ");
              A = input.nextDouble();
              System.out.print("Insert the B value: ");
              B = input.nextDouble();
              System.out.print("Insert the C value: ");
              C = input.nextDouble();
              
              Triangle = (A * C)/2;
              Circle = Pi * ( C * C);
              Trapeze = ((A + B)/2) * C;
              Square = B * B;
              Retangle = A * B;
                      
              System.out.printf("TRIANGLE: %.3f\n", Triangle);
              System.out.printf("CICLE: %.3f\n", Circle);
              System.out.printf("TRAPEZE: %.3f\n", Trapeze);
              System.out.printf("SQUARE: %.3f\n", Square);
              System.out.printf("RETANGLE: %.3f\n", Retangle);         
    }       
    
           public static void main(String[] args){
             
              System.out.println(" ---------------- "
                                 + "|Calculating Area|"
                                 + " ---------------- "
                                 + "                 ");
              
                          AreaRetangulo();                   
   } 
  }
    
