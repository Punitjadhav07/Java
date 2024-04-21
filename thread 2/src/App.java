class AscendingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Ascending: " + i);
        }
    }
}

class DescendingThread extends Thread {
    public void run() {
        for (int i = 50; i >= 1; i--) {
            System.out.println("Descending: " + i);
        }
    }
}

public class App {
    public static void main(String[] args) {
        AscendingThread ascendingThread = new AscendingThread();
        DescendingThread descendingThread = new DescendingThread();

        ascendingThread.start();
        descendingThread.start();
    }
}
