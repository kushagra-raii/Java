public class HelloWorldPrinter implements Runnable{
    public void  run(){
        System.out.println("Hello world! from thread :" + Thread.currentThread().getName());
    }
}
