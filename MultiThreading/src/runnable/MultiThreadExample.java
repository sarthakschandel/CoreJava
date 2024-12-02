package runnable;

public class MultiThreadExample {
    public static void main(String[] args) {
    	
        // Create two Runnable tasks
        MyTask task1 = new MyTask("Task 1");
        MyTask task2 = new MyTask("Task 2");

        // Create two threads, passing in the Runnable tasks
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start both threads
        thread1.start();
        thread2.start();
        
    }
}
