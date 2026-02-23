
 import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class GussGame {



    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int number=rand.nextInt(100)+1; //1to 100
        int Guss=0;
        int attempts=0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number Between 1 to 100");
        while (Guss!=number) {
            System.out.print("Enter your guess: ");
            Guss=sc.nextInt();
            attempts++;
           if(Guss<number){
            System.out.println("The number is low");
           }
           else if(Guss>number){
            System.out.println("The number is high");
           }
           else{
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
           }
            
        }
        
    }
}


