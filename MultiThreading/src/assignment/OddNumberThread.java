package assignment;

public class OddNumberThread implements Runnable {

	@Override
	public void run() {

        for(int i=1;i<=10;i+=2){
		    System.out.print(i+" ");
		}
		System.out.println();

	}

}