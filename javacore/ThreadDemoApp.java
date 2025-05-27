class MessagePrinter extends Thread {
    private String message;
    private int repeatCount;

    public MessagePrinter(String msg, int times) {
        this.message = msg;
        this.repeatCount = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(message + " [" + (i + 1) + "]");
            try {
                Thread.sleep(100); // Pause for clarity
            } catch (InterruptedException ignored) {}
        }
    }
}

public class ThreadDemoApp {
    public static void main(String[] args) {
        MessagePrinter threadAlpha = new MessagePrinter("Alpha says hi", 5);
        MessagePrinter threadBeta = new MessagePrinter("Beta greets you", 5);

        threadAlpha.start();
        threadBeta.start();
    }
}
