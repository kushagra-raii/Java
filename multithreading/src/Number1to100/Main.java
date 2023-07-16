package Number1to100;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
//        for(int i = 1;i<=100;i++){
//            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np);
//            t.start();

//        }

        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for(int i = 1;i<=100;i++){
            if (i==11||i==35){
                System.out.println("debug");
            }
            NumberPrinter np = new NumberPrinter(i);
            executorService.submit(np);
        }
    }
}
