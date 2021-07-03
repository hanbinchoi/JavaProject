package d.thread;

public class RunThreads {
    public static void main(String[] args){
        RunThreads threads = new RunThreads();
        threads.runBasic();
    }
    public void runBasic(){
        RunnableSample runnable = new RunnableSample(); // 상속을 받아야하는 클래스들은 인터페이스로 다중 상속
        new Thread(runnable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();
        System.out.println("RunThreads.runBasic() is ended");
    }
}
