package test13;
import org.jetbrains.annotations.NotNull;
public class thread extends Thread {

    public thread() {
    }

    public thread(@NotNull String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ">>" + i);
        }
    }
}
