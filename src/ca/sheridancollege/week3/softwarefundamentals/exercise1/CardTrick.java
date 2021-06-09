/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author asidhu3
 * @modifier yaozhong zhang
 * student number:991593005
 */
import java.util.Scanner;
public class CardTrick {
    public static int getRandomNumber(int min, int max) {
                return (int) ((Math.random()*(max - min)) + min);
            }
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++){
        
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(getRandomNumber(1,14));
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[getRandomNumber(0,4)]);
            magicHand [i] = c;
        }
        //ask the user for Card value and suit, create their card
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of card: ");
        int cardValue = Integer.parseInt(input.nextLine());
        System.out.println("Enter the suit of card: ");
        String cardSuit = input.nextLine();
        Card luckyCard = new Card();
        luckyCard.setValue(cardValue);
        luckyCard.setSuit(cardSuit);
        
        // and search magicHand here
        boolean cardInHand = false;
        for (int i=0; i < magicHand.length; i++){
             if (magicHand[i].getValue()==cardValue&&
                 magicHand[i].getSuit().equals(cardSuit)){
                cardInHand = true;
                break;
            }
        }
    
        //Then report the result here
        if (cardInHand){
            System.out.println("You are right");
        } else{
            System.out.println("You are wrong");
        }
        
        //Print card
        System.out.printf("Your magic card is: %s %n", luckyCard.getSuit(), luckyCard.getValue());
    
    }
}
      
        
        
       
    
    

