/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m1_assesments;
import java.util.*;
/**
 *
 * @author irabob
 */
public class RockPaperScissors {
    
    static Scanner myScan = new Scanner(System.in);
    static Random rand = new Random();
    
    public static void main(String[] args){
        //boolean variable to check the user response for playAgain
        boolean quit;
        //char for playAgain input
        char playAgain;
        //int for game rounds
        int gameCount;
        //array for rock, paper, scissors
        String[] inputArray = {"rock", "paper", "scissors"};
        int userInput;
        int compInput;
        int tie = 0;
        int win = 0;
        int lose = 0;
        String winner;
        System.out.println("Welcome to Rock Paper Scissors game!!!");
     
        do{
            
            System.out.print("\nHow many rounds you want to play (min=1, max=10): ");
            gameCount = myScan.nextInt();
            
            if(gameCount > 0 && gameCount < 11){
                //for loop is game rounds
                for (int i = 0; i < gameCount; i++) {
                    System.out.println("Choose from following (1 , 2 or 3)");
                    System.out.println("1 = Rock");
                    System.out.println("2 = Paper");
                    System.out.println("3 =  Scissors");
                    System.out.print("You're choosing: ");
                    userInput = myScan.nextInt();
                    if(!(userInput==1 || userInput==2 || userInput==3)){
                        System.out.println("Invalid input. Bye");
                        System.exit(0);
                    }
                    //Assigning a value for compInput 
                    compInput = generateRandNumber();
                    System.out.println("");
                    System.out.println("You choosed " + inputArray[userInput-1]);
                    System.out.println("Comp choosed " + inputArray[compInput]);
                    System.out.println("");
                        //It's nesting switch statement 
                        switch(inputArray[userInput-1]){
                            //if userInput is rock
                            case "rock": {
                                //child Switch statement for compInput
                                switch(inputArray[compInput]){
                                    case "rock": tie++;
                                        break;
                                    case "paper": lose++;
                                        break;
                                    case "scissors": win++;
                                        break;
                                    default: 
                                        break;                                    
                                }
                            }break;
                            //if userInput is paper
                            case "paper": {
                                //child Switch statement for compInput
                                switch(inputArray[compInput]){
                                    case "rock": win++;
                                        break;
                                    case "paper": tie++;
                                        break;
                                    case "scissors": lose++;
                                        break;
                                    default: 
                                        break;   
                                }
                            }break;
                            //if userInput is scissors
                            case "scissors": {
                                //child Switch statement for compInput
                                switch(inputArray[compInput]){
                                    case "rock": lose++;
                                        break;
                                    case "paper": win++;
                                        break;
                                    case "scissors": tie++;
                                        break;
                                    default: 
                                        break;   
                                }
                            }break;
                            
                            default: break;
                        }
                }
            }
            //if input is invalid exit from application
            else{
                System.out.println("Invalid input. Bye");
                System.exit(0);
            }
            //Printing results of the game
            System.out.println("Wins: " + win);
            System.out.println("Loses: " + lose);
            System.out.println("Ties: " + tie);
            winner = declareResult(win, lose, tie);
            System.out.println(winner);
            System.out.print("Do you want to play again ? y/n : ");
            //it's taking char input
            playAgain = myScan.next().charAt(0);
            
            //if user press y or Y reset the win/tie/lose vaules to 0 and quit is false
            if(playAgain == 'y' || playAgain == 'Y'){ 
                win=0;
                lose=0;
                tie=0;
                quit = false;
            }
            else quit = true;
            
            
        }while(!quit);// while quit is false run the do loop
    }
    //Random number generating function for computer input
    public static int generateRandNumber() {
        
        return  rand.nextInt(3);
        
    }
    
    public static String declareResult(int w, int l, int t){
        
        String winner;
        
        if(w > l){
            winner =  "you won";
        }else if(w < l){
            winner = "computer won"; 
        }else{
            winner = "it's tie";
        }
        
        return winner;
    }
}
