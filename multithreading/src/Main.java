public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! from thread :" + Thread.currentThread().getName());
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t1 = new Thread(hwp);
        t1.start();
        Thread t2 = new Thread(hwp);
        t2.start();

        t1.run();
        t2.run();

    }
}

// t1.start();