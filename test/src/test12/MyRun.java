package test12;

import java.util.concurrent.Callable;

public class MyRun implements Callable {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i + 1;
        }
        return sum;
    }
}
