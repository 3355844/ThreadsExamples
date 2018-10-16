public class RunRecursion implements Runnable {

    public void start(){
        System.out.println("Start Thread ");
        new Thread(this,"NoNameMain").start();
    }

    @Override
    public void run() {
        System.out.println("Run method...");
        new Thread(this,"Noname1").start();
        new Thread(this,"Noname2").start();
    }
}
