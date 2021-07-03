package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
    public static void main(String[] args){
        RandomNumberMaker maker = new RandomNumberMaker();
        for(int i=0;i<10;i++)
            System.out.println(maker.getSixNumber());
    }
    public HashSet<Integer> getSixNumber(){
        HashSet<Integer> numSet = new HashSet<>();
        Random random = new Random();

        int tempNumber;
        while(true){
            if(numSet.size()==6) break;
            tempNumber = random.nextInt(45);
            numSet.add(tempNumber);
        }
        return numSet;
    }
}
