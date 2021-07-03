package com.codeit.cardshuffler;

public class BlackjackCard extends Card{

    public BlackjackCard(int suitNumber, int rankNumber) {
        super(suitNumber, rankNumber);
    }
    public int getValue(){
        String rank = super.getRank();
        switch (rank){
            case "Ace":
                return 11;
            case "Jack":
            case "King":
            case "Queen":
                return 10;
            default:
                int iRank = Integer.parseInt(rank);
                return iRank;

        }
    }
    public boolean isAce(){
        if(suitNumber==1) return true;
        else return false;
    }
}
