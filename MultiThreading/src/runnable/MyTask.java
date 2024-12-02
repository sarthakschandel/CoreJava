package runnable;

// Define a class that implements Runnable
class MyTask implements Runnable {
    private String taskName;

    // Constructor to set the name of the task
    public MyTask(String taskName) {
        this.taskName = taskName;
    }

    // The run method that performs the thread's task
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);

            // Sleep to simulate a delay and to make output easier to read
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " was interrupted.");
            }
        }
        System.out.println(taskName + " has completed.");
    }
}