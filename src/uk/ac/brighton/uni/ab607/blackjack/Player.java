package uk.ac.brighton.uni.ab607.blackjack;

public class Player extends Hand {

    private int money = 100;
    
    public boolean placeBet(int bet) {
        if (bet > money) {
            return false;
        }
        
        money -= bet;
        return true;
    }
}