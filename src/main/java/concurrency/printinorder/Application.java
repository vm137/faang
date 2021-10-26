package concurrency.printinorder;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Application {

  public static void main(String[] args) {
    Foo foo = new Foo();

    Lock lock = new ReentrantLock();

    Runnable thA = new Runnable() {
      @Override
      public void run() {
//        foo.first();
      }
    };
  }
}

class Foo {
  AtomicInteger firstJobDone;
  AtomicInteger secondJobDone;

  public Foo() {
    firstJobDone = new AtomicInteger(0);
    secondJobDone = new AtomicInteger(0);
  }

  public void first(Runnable printFirst) throws InterruptedException {
    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    firstJobDone.incrementAndGet();
  }

  public void second(Runnable printSecond) throws InterruptedException {

    // printSecond.run() outputs "second". Do not change or remove this line.
    printSecond.run();
  }

  public void third(Runnable printThird) throws InterruptedException {

    // printThird.run() outputs "third". Do not change or remove this line.
    printThird.run();
  }
}