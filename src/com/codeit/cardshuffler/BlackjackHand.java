package com.codeit.cardshuffler;

import java.util.ArrayList;

public class BlackjackHand extends Deck<BlackjackCard>{
    private int sum = 0;
    private int value;
    ArrayList<BlackjackCard> cards = getCards();
    public int getValue(){
        for(int i=0;i<cards.size();i++){
            BlackjackCard blackjackCard = cards.get(i);
            value = blackjackCard.getValue();
            sum += value;
            if(sum>21 && blackjackCard.getValue() == 11) sum -= 10;
        }
        return sum;
    }
    public boolean isBusted(){
        if (sum>21) return true;
        else return false;
    }
    public boolean isBlackjack(){
        if(cards.size() == 2 && sum == 21) return true;
        else return false;
    }
    public boolean isTrue(boolean val){
        return val? true:false;
    }
}
