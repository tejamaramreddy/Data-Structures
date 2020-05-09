package code;
class block{
	public int data;
	public block next;
	block(int data){
		this.next = null;
		this.data = data;
	}
}
public class Queue {
	public block front = null,rear = null;
	int count = 0;
	
	public void enqueue(int data) {
		block new_node = new block(data);
		if(front == null) {
			front = new_node;
			rear = new_node;
		}
		else {
			rear.next = new_node;
			rear = new_node;
		}
		count++;
		
	}
	public void dequeue() {
		if(front == null) {
			System.out.print("Queue is empty");
		}
		else {
			int x = front.data;
			front = front.next;
			System.out.print(x + " is dequeued");
		}
		count--;
		System.out.println();
	}
	public void display() {
		block temp = front;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
			
		}
		System.out.println();
	}
	public void size() {
		System.out.println(count  + " Elements in the Queue");
	}
	public void peek() {
		System.out.println(front.data+ " is peek element");
	}
	
	public static void main(String[] args) {
		Queue Q = new Queue();
		Q.enqueue(1);
		Q.display();
		Q.enqueue(2);
		Q.enqueue(3);
		Q.enqueue(4);
		Q.peek();
		Q.display();
		Q.dequeue();
		Q.display();
		Q.peek();
		Q.size();
	}

}
