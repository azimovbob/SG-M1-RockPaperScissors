/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesments_m1;
import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author irabob
 */
public class HealthyHeart {
    
    static DecimalFormat df = new DecimalFormat("0");
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("What's your age? ");
        int age;
        age = scan.nextInt();
        int maxRate =220;
        int maxRateUser = maxRate - age;
            //Check for user age
            if(age < 110 && age > 0){
                System.out.println("Your maximum heart rate should be " +  maxRateUser + " beats per minute");
            }else{
                System.out.println("Invalid input");
                System.exit(0);
            }
        calculateRate(maxRateUser);
        
    }
    
    public static void calculateRate(int m){
        
        String a1 = df.format(m * 0.5);
        String a2 = df.format(m * 0.85);
        
        
        System.out.println("Your target HR Zone is " +  85  + " - " +  "145" + " beats per minute");
    }
}
