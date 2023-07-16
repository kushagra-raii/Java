package Number1to100;

public class NumberPrinter implements Runnable{
    private int number;
    public NumberPrinter(int value) {
        this.number = value;
    }

    @Override
    public void run() {
        System.out.println("Number Printed : " + number + "on thread :" + Thread.currentThread().getName());
    }
}
