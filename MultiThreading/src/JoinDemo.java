import java.util.Scanner;

public class JoinDemo extends Thread {

	static int n, sum = 0;

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		System.out.println("Sum of first 'N' numbers");
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);//takes the input stream called System.in
		JoinDemo.n = sc.nextInt();

		JoinDemo jd = new JoinDemo();
		jd.start();//we start the thread
		
		try {
			jd.join();//wait for this thread to die
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//but we dont wanna let this print till the thread is complete hence we use join()
		//since the JVM's main method thread can print it, hence the join()
		System.out.println("Sum of first " + JoinDemo.n + " Numbers is " + JoinDemo.sum);
		
		long end = System.currentTimeMillis();
		
		System.out.println("The total time taken is " + (end - start) / 1000 + " Seconds.");
		System.out.println("The total time taken is " + (end - start) + " Milli-Seconds.");

	}

	public void run() {
		for (int i = 1; i <= JoinDemo.n; i++) {
			JoinDemo.sum += i;
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
