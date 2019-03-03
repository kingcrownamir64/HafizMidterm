package datastructure;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.*;
import java.lang.String;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 */

			List<Number> list = new ArrayList<Number>();                    //list array allocates spacxe as needed

			list.add(14);
			list.add(153);
			list.add(123);
			list.add(578);
			list.add(786);


		Iterator it = list.iterator();

		System.out.println("__________________Original List__________________");
		System.out.println("LinkedList elements:");
		while(it.hasNext()){
			System.out.println(it.next());
		}

				list.remove(1);

		System.out.println("__________________After Removing First Element__________________");

				for (Number data : list) {
					System.out.println(data);
				}
			}


		}


