package d.thread;

public class RunDaemonThreads {
    public static void main(String[] args){
        RunDaemonThreads sample = new RunDaemonThreads();
        sample.checkThreadPriority();
    }
    public void checkThreadPriority(){
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

        System.out.println("Thread1 id = "+thread1.getId());
        System.out.println("Thread2 id = "+thread2.getId());

        System.out.println("Thread1 name = "+thread1.getName());
        System.out.println("Thread2 name = "+thread2.getName());

        System.out.println("Thread1 priority = "+thread1.getPriority());

        // 데몬쓰레드는 해당 쓰레드가 종료되지 않아도 다른 실행중인 일반 쓰레드가 없으면 종료된다.
        daemonThread.setDaemon(true); // 쓰레드가 수행되기전 데몬 쓰레드로 지정해야만 그 쓰레드가 데몬 쓰레드로 인식된다.
        System.out.println("Thread1 isDaemon = "+thread1.isDaemon());
        System.out.println("daemonThread isDaemon = "+daemonThread.isDaemon());

    }
}
