package d.thread;

public class TimerMain {
    public static void main(String[] args){
        TimerThread thread1 = new TimerThread();
        thread1.start();
    }
}
