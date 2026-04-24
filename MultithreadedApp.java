class WorkerThread extends Thread {
    private String taskName;

    public WorkerThread(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " is executing - iteration " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
        System.out.println(taskName + " has finished.");
    }
}

public class MultithreadedApp {
    public static void main(String[] args) {
        WorkerThread thread1 = new WorkerThread("Thread-A");
        WorkerThread thread2 = new WorkerThread("Thread-B");

        thread1.start();
        thread2.start();
    }
}
