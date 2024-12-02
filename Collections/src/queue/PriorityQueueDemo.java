package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<>();
		System.out.println(q.peek());
		// System.out.println(q.element());

		for (int i = 20; i <= 30; i++) {
			q.offer(i);//adds to rear, if full returns false(in theory)
		}

		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.remove());
		System.out.println(q);
		
		for (int i = 40; i <= 60; i++) {
			q.offer(i);//adds to rear, if full returns false but the queue grows so no false
		}
		System.out.println(q);
		
	}

}
