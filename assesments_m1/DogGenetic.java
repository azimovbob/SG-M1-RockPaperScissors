/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assesments_m1;
import java.util.*;

/**
 *
 * @author irabob
 */
public class DogGenetic {
    
    static Random rand = new Random();
    
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        
        String dogName;
        System.out.println("What is your dog's name? ");
        dogName = sc.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.  ");
        System.out.println(dogName + "  is: ");
        String[] dogBreed = {"Tibetan Mastiff", "Lhasa Apso", "German Shepherd", "Golden Retriever", "Siberian Huskey"};
        int percent = 0, track=0;
        int sum = 100;
        
        
        
        for (int i = 0; i < 4; i++) {
            if(percent <= 100){
            //passing the sum
            percent = generateNumber(sum);
            //tracking the totalSum
            track=track+percent;
            //sum equals to the  generated number subtracated from remainder
            sum = sum-percent;
                System.out.println(percent + "% " + dogBreed[i]);
            }
        }
        //if totalSum is still less than 100 print remainder
        if(track<100){
            System.out.println(100-track + "% " + dogBreed[4]);
        //if remainder equals to zero last dogBreed precentage is 0
        }else{
            System.out.println("0% " + dogBreed[4]);
        }
        System.out.println("Wow, that's QUITE the dog!");
    }
    
    //Generating number 
    public static int generateNumber(int s){
        return rand.nextInt(s)+1;
    }
}
