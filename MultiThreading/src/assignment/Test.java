package assignment;

public class Test extends Thread{

	public static void main(String[] args) {

	    EventNumberThread ent = new EventNumberThread();
	    Thread th1 = new Thread(ent);
	    
	    OddNumberThread ont = new OddNumberThread();
	    Thread th2 = new Thread(ont);
	    
	    th1.start();
	    th2.start();
	    
	    for(int i=0;i<=10;i++){
	        System.out.print(i+" ");
	    }
	    System.out.println();
	}

}//yahi same program udemy ke chomu ide mein nahi chal raha; isme sexy chal raha hai

