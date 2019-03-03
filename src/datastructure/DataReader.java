//Verify if the unsorted array is sorted by the selection sort algorithm.
package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		FileReader fr = null;
		BufferedReader br = null;
		String st = "";
		String storedStValue = "";

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		try {
			fr = new FileReader(textFile);
			br = new BufferedReader(fr);
		} catch (Exception e) {
			System.out.println("File cannot be found");
			e.printStackTrace();
		}

		try {
			while ((st = br.readLine()) != null) {
				System.out.println(st);
				storedStValue += st; //
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				fr = null;
			}
			if (br != null) {
				br = null;
			}
		}

		System.out.println("-------------------------------------------------------");

		String[] storeArr = storedStValue.split(" ");


		Stack<String> stack = new Stack<String>();
		List<String> list = new LinkedList<String>();

		for (String vals : storeArr) {
			stack.push(vals);
			list.add(vals);
		}
		System.out.println(" ");
		System.out.println("Peek: " + stack.peek());
		System.out.println(" ");
		System.out.println("Push: " + stack.push("Bye!"));
		System.out.println("");
		System.out.println("New Peek: " + stack.peek());
		System.out.println("");
		System.out.println("Search Index for Google: " + stack.search("Google"));
		System.out.println("");
		System.out.println("Pop: " + stack.pop());
		System.out.println("");


		System.out.println("--------------FIFO order--------------");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println(" ");
		System.out.println("--------------LIFO order-------------------");
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}



