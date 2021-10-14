package concurrency.racecondition;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

  public static void main(String[] args) throws InterruptedException {

    Demo3 dm3 = new Demo3();
    dm3.release(5000, 3);
    dm3.release(7000, 2);
    dm3.main();
    System.out.println("main");
  }
}

class Demo3 {
  Semaphore sm = new Semaphore(5);

  void main() throws InterruptedException {
    for (int i = 0; i < 10; i++) {
      sm.acquire();
      System.out.println(i);
    }
  }

  public void release(int timeout, int permits) {

    Thread thread1 = new Thread(new Runnable() {

      @Override
      public void run() {
        try {
          Thread.sleep(timeout);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("release");
        sm.release(permits);
      }
    });

    thread1.start();
  }
}
