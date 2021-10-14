package concurrency.racecondition;

class ThreadJoin {

  public static void main(String args[]) throws InterruptedException {
    RaceCondition2.runTest();
  }
}

class RaceCondition2 {

  void printer() throws InterruptedException {
    Thread.sleep(3000);

    System.out.println("printer");
  }

  void modifier() throws InterruptedException {
    Thread.sleep(5000);

    System.out.println("modifier");
  }

  public static void runTest() throws InterruptedException {

    final RaceCondition2 rc = new RaceCondition2();

    Thread thread1 = new Thread(() -> {
      try {
        rc.printer();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    Thread thread2 = new Thread(() -> {
      try {
        rc.modifier();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });

    thread1.start();
    thread2.start();

    thread1.join();

    System.out.println("between");
    thread2.join();
  }
}