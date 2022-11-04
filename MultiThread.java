class ThreadEven extends Thread {
  public void run() {
    for (; MultiThread.counter <= 10;) {
      if (MultiThread.counter % 2 == 0) {
        System.out.print("\t" + MultiThread.counter);
        MultiThread.counter++;
      } else {
        Thread.yield();
      }
    }
  }
}
class ThreadOdd extends Thread {
  public void run() {
    for (; MultiThread.counter <= 10;) {
      if (MultiThread.counter % 2 != 0) {
        System.out.print("\t" + MultiThread.counter);
        MultiThread.counter++;
      } else {
        Thread.yield();
      }
    }
  }
}
public class MultiThread {
  static int counter = 0;
  public static void main(String args[]) {
    ThreadEven ET = new ThreadEven();
    ThreadOdd OT = new ThreadOdd();
    ET.start();
    OT.start();
  }
}