public class RunColors implements Runnable {
    Thread thread;
    String threadName;

    public RunColors(String threadName) {
        this.threadName = threadName;
        System.out.println("RunColors Class created with name " + threadName);
    }

    public void start() {
        System.out.println("Start Thread " + threadName);
        if (thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }

    @Override
    public void run() {
        System.out.println("Start thread: " + threadName);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread Name: " + threadName + ", iterator " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
