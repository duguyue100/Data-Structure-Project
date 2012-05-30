
public class LinkedQueueTest {
	public static void main(String[] args)
	{
		LinkedQueue<Integer> q=new LinkedQueue<Integer>();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		
		System.out.println(q.toString());
		
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		
		System.out.println(q.toString());
		
		System.out.println(q.size());
	}
}
