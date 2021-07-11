package d.thread;

public class TimerMain {
    static class InterruptTest extends Thread {

        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(i + 1 + ". before sleep...");
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException 발생");
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            InterruptTest t = new InterruptTest();
            t.start();
            t.interrupt();
            //t 스레드가 종료할 때 까지 main Thread가 기다림
            // join이 생략되면 "Main Thread 종료"가 제일 먼저 출력됨
            t.join();
            System.out.println("Main Thread 종료...");

        }

    }
}
