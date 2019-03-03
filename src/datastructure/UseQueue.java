package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


		Queue<String> queue = new LinkedList();
		System.out.println("__________________Original Queue__________________");
		queue.add("HAWAII");
		queue.add("JAMAICA");
		queue.add("MEXICO");
		queue.add("DUBAI");

		Iterator it = queue.iterator();


		System.out.println("LinkedList elements:");
		while(it.hasNext()){
			System.out.println(it.next());
		}


		System.out.println(" ");
		System.out.println("The Peek is: "+queue.peek());
		queue.remove();
		System.out.println("Removed First Peek");
		System.out.println("New Peek is: " + queue.peek());
		System.out.println(" ");

		System.out.println("_________________New Queue___________________");

		for (String data:queue) {
			System.out.println(data);
		}
		System.out.println("The last element is: "+((LinkedList<String>) queue).getLast());





	}

}
