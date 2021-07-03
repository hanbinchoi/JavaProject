package d.collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args){

        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "A","A","A","A"
        };
        System.out.println(sample.getCar(cars));

    }
    public int getCar(String[] cars){
        if(cars==null) return 0;
        if(cars.length==1) return 1;
        Set<String> carSet = new HashSet<>();
        for(String car: cars){
            carSet.add(car);
        }
        return carSet.size();
    }
}
