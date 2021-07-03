package d.collection.practice;

import java.util.Hashtable;
import java.util.Random;

public class RandomNumberStatistics {
    private final int DATA_BOUNDARY = 50;
    Hashtable<Integer,Integer> hashtable = new Hashtable<>();
    public static void main(String[] args){
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistics();
        int size =0;

    }
    public void getRandomNumberStatistics(){
        Random random = new Random();
        int tempNumber;
        int i=0;
        while(i<5000){
            tempNumber = random.nextInt(DATA_BOUNDARY)+1;
            putCurrentNumber(tempNumber);
            i++;
        }
        printStatistics();
    }
    public void putCurrentNumber(int tempNumber){
        if(hashtable.containsKey(tempNumber)){
            hashtable.put(tempNumber,hashtable.get(tempNumber)+1);
        }else{
            hashtable.put(tempNumber,1);
        }
    }
    public void printStatistics(){
        for(Integer key : hashtable.keySet()){
            System.out.print(key+"="+hashtable.get(key)+" ");
            if(key%10-1==0) System.out.println();
        }
    }
}
