/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reading.user.input.challenge;
import java.util.Scanner;
/**
 *
 * @author Ihartley
 */

public class ReadingUserInputChallenge {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int i=0;
        int sum = 0;
 
        while ( i < 5)
        {
            System.out.println("\nChoose five integer numbers: ");
            String nxt = num.nextLine();
            double nxtnum = Double.parseDouble(nxt);
            if ((nxtnum%1)!=0)
            {
                System.out.println("\nInvalid number");
            }
            else{
                sum += ((int)nxtnum);
               i++;
            }
            
        System.out.print("The total is: "+ sum);
        }
        
           

    }
}
