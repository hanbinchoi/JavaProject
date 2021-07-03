package d.thread.sync;

public class CommonCalculate {
    private int amount;
    public CommonCalculate(){
        amount=0;
    }
    public void plus(int value){
        synchronized (this){

            amount += value;
        }
    }
    public void minus(int value){
        synchronized (this){

            amount -= value;
        }
    }
    public int getAmount(){
        return amount;
    }
//    public synchronized void plus(int value){
//        amount += value;
//    }
//    public synchronized void minus(int value){
//        amount -= value;
//    }


}
